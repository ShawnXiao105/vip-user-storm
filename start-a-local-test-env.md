    #start zookeeper 
    bin/zkServer.sh start &    

    #start kafka
    bin/kafka-server-start.sh config/server.properties &    

    #start storm
    bin/storm nimbus &
    bin/storm supervisor &
    bin/storm ui &
    bin/storm drpc &    

    #start a console kafka producer
    bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test