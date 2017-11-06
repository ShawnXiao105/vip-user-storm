package com.bigdata;

import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.topology.TopologyBuilder;

public class AckedTopology {
	private static final String SPOUT_ID = "monitoring_test_spout";
	  private static final String REPORT_BOLT_ID = "acking-report-bolt";
	  private static final String TOPOLOGY_NAME = "myFirstStormKafkaForVipUser";
	  private static final String KAFKA_LOCAL_BROKER = "localhost:9092";

	  
	  
	  public static void main(String[] args) throws Exception {
		    int numSpoutExecutors = 1;

		    
		    ReportBolt reportBolt = new ReportBolt();

		    TopologyBuilder tp = new TopologyBuilder();
		    tp.setSpout("kafka_spout", new KafkaSpout<>(KafkaSpoutConfig.builder(KAFKA_LOCAL_BROKER, "test")
		    		.setGroupId("kafkaSpoutTestGroup_" + System.nanoTime()).build()), 1);
		    tp.setBolt("bolt", reportBolt).shuffleGrouping("kafka_spout");
		    //builder.setSpout(SPOUT_ID, kspout, numSpoutExecutors);
		    //builder.setBolt(REPORT_BOLT_ID, reportBolt);

		    Config cfg = new Config();
		    StormSubmitter.submitTopology(TOPOLOGY_NAME, cfg, tp.createTopology());
		  }
}
