/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonAggregateStats implements org.apache.thrift.TBase<CommonAggregateStats, CommonAggregateStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommonAggregateStats");

  private static final org.apache.thrift.protocol.TField NUM_EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_executors", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_tasks", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EMITTED_FIELD_DESC = new org.apache.thrift.protocol.TField("emitted", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TRANSFERRED_FIELD_DESC = new org.apache.thrift.protocol.TField("transferred", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ACKED_FIELD_DESC = new org.apache.thrift.protocol.TField("acked", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField FAILED_FIELD_DESC = new org.apache.thrift.protocol.TField("failed", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField RESOURCES_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("resources_map", org.apache.thrift.protocol.TType.MAP, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommonAggregateStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommonAggregateStatsTupleSchemeFactory());
  }

  public int num_executors; // required
  public int num_tasks; // required
  public long emitted; // required
  public long transferred; // required
  public long acked; // required
  public long failed; // required
  public Map<String,Double> resources_map; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_EXECUTORS((short)1, "num_executors"),
    NUM_TASKS((short)2, "num_tasks"),
    EMITTED((short)3, "emitted"),
    TRANSFERRED((short)4, "transferred"),
    ACKED((short)5, "acked"),
    FAILED((short)6, "failed"),
    RESOURCES_MAP((short)7, "resources_map");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUM_EXECUTORS
          return NUM_EXECUTORS;
        case 2: // NUM_TASKS
          return NUM_TASKS;
        case 3: // EMITTED
          return EMITTED;
        case 4: // TRANSFERRED
          return TRANSFERRED;
        case 5: // ACKED
          return ACKED;
        case 6: // FAILED
          return FAILED;
        case 7: // RESOURCES_MAP
          return RESOURCES_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_EXECUTORS_ISSET_ID = 0;
  private static final int __NUM_TASKS_ISSET_ID = 1;
  private static final int __EMITTED_ISSET_ID = 2;
  private static final int __TRANSFERRED_ISSET_ID = 3;
  private static final int __ACKED_ISSET_ID = 4;
  private static final int __FAILED_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);
  private _Fields optionals[] = {_Fields.NUM_EXECUTORS,_Fields.NUM_TASKS,_Fields.EMITTED,_Fields.TRANSFERRED,_Fields.ACKED,_Fields.FAILED,_Fields.RESOURCES_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("num_executors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_TASKS, new org.apache.thrift.meta_data.FieldMetaData("num_tasks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMITTED, new org.apache.thrift.meta_data.FieldMetaData("emitted", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TRANSFERRED, new org.apache.thrift.meta_data.FieldMetaData("transferred", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ACKED, new org.apache.thrift.meta_data.FieldMetaData("acked", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FAILED, new org.apache.thrift.meta_data.FieldMetaData("failed", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RESOURCES_MAP, new org.apache.thrift.meta_data.FieldMetaData("resources_map", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommonAggregateStats.class, metaDataMap);
  }

  public CommonAggregateStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommonAggregateStats(CommonAggregateStats other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.num_executors = other.num_executors;
    this.num_tasks = other.num_tasks;
    this.emitted = other.emitted;
    this.transferred = other.transferred;
    this.acked = other.acked;
    this.failed = other.failed;
    if (other.isSetResources_map()) {
      Map<String,Double> __this__resources_map = new HashMap<String,Double>();
      for (Map.Entry<String, Double> other_element : other.resources_map.entrySet()) {

        String other_element_key = other_element.getKey();
        Double other_element_value = other_element.getValue();

        String __this__resources_map_copy_key = other_element_key;

        Double __this__resources_map_copy_value = other_element_value;

        __this__resources_map.put(__this__resources_map_copy_key, __this__resources_map_copy_value);
      }
      this.resources_map = __this__resources_map;
    }
  }

  public CommonAggregateStats deepCopy() {
    return new CommonAggregateStats(this);
  }

  @Override
  public void clear() {
    setNum_executorsIsSet(false);
    this.num_executors = 0;
    setNum_tasksIsSet(false);
    this.num_tasks = 0;
    setEmittedIsSet(false);
    this.emitted = 0;
    setTransferredIsSet(false);
    this.transferred = 0;
    setAckedIsSet(false);
    this.acked = 0;
    setFailedIsSet(false);
    this.failed = 0;
    this.resources_map = null;
  }

  public int getNum_executors() {
    return this.num_executors;
  }

  public CommonAggregateStats setNum_executors(int num_executors) {
    this.num_executors = num_executors;
    setNum_executorsIsSet(true);
    return this;
  }

  public void unsetNum_executors() {
    __isset_bit_vector.clear(__NUM_EXECUTORS_ISSET_ID);
  }

  /** Returns true if field num_executors is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_executors() {
    return __isset_bit_vector.get(__NUM_EXECUTORS_ISSET_ID);
  }

  public void setNum_executorsIsSet(boolean value) {
    __isset_bit_vector.set(__NUM_EXECUTORS_ISSET_ID, value);
  }

  public int getNum_tasks() {
    return this.num_tasks;
  }

  public CommonAggregateStats setNum_tasks(int num_tasks) {
    this.num_tasks = num_tasks;
    setNum_tasksIsSet(true);
    return this;
  }

  public void unsetNum_tasks() {
    __isset_bit_vector.clear(__NUM_TASKS_ISSET_ID);
  }

  /** Returns true if field num_tasks is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_tasks() {
    return __isset_bit_vector.get(__NUM_TASKS_ISSET_ID);
  }

  public void setNum_tasksIsSet(boolean value) {
    __isset_bit_vector.set(__NUM_TASKS_ISSET_ID, value);
  }

  public long getEmitted() {
    return this.emitted;
  }

  public CommonAggregateStats setEmitted(long emitted) {
    this.emitted = emitted;
    setEmittedIsSet(true);
    return this;
  }

  public void unsetEmitted() {
    __isset_bit_vector.clear(__EMITTED_ISSET_ID);
  }

  /** Returns true if field emitted is set (has been assigned a value) and false otherwise */
  public boolean isSetEmitted() {
    return __isset_bit_vector.get(__EMITTED_ISSET_ID);
  }

  public void setEmittedIsSet(boolean value) {
    __isset_bit_vector.set(__EMITTED_ISSET_ID, value);
  }

  public long getTransferred() {
    return this.transferred;
  }

  public CommonAggregateStats setTransferred(long transferred) {
    this.transferred = transferred;
    setTransferredIsSet(true);
    return this;
  }

  public void unsetTransferred() {
    __isset_bit_vector.clear(__TRANSFERRED_ISSET_ID);
  }

  /** Returns true if field transferred is set (has been assigned a value) and false otherwise */
  public boolean isSetTransferred() {
    return __isset_bit_vector.get(__TRANSFERRED_ISSET_ID);
  }

  public void setTransferredIsSet(boolean value) {
    __isset_bit_vector.set(__TRANSFERRED_ISSET_ID, value);
  }

  public long getAcked() {
    return this.acked;
  }

  public CommonAggregateStats setAcked(long acked) {
    this.acked = acked;
    setAckedIsSet(true);
    return this;
  }

  public void unsetAcked() {
    __isset_bit_vector.clear(__ACKED_ISSET_ID);
  }

  /** Returns true if field acked is set (has been assigned a value) and false otherwise */
  public boolean isSetAcked() {
    return __isset_bit_vector.get(__ACKED_ISSET_ID);
  }

  public void setAckedIsSet(boolean value) {
    __isset_bit_vector.set(__ACKED_ISSET_ID, value);
  }

  public long getFailed() {
    return this.failed;
  }

  public CommonAggregateStats setFailed(long failed) {
    this.failed = failed;
    setFailedIsSet(true);
    return this;
  }

  public void unsetFailed() {
    __isset_bit_vector.clear(__FAILED_ISSET_ID);
  }

  /** Returns true if field failed is set (has been assigned a value) and false otherwise */
  public boolean isSetFailed() {
    return __isset_bit_vector.get(__FAILED_ISSET_ID);
  }

  public void setFailedIsSet(boolean value) {
    __isset_bit_vector.set(__FAILED_ISSET_ID, value);
  }

  public int getResources_mapSize() {
    return (this.resources_map == null) ? 0 : this.resources_map.size();
  }

  public void putToResources_map(String key, double val) {
    if (this.resources_map == null) {
      this.resources_map = new HashMap<String,Double>();
    }
    this.resources_map.put(key, val);
  }

  public Map<String,Double> getResources_map() {
    return this.resources_map;
  }

  public CommonAggregateStats setResources_map(Map<String,Double> resources_map) {
    this.resources_map = resources_map;
    return this;
  }

  public void unsetResources_map() {
    this.resources_map = null;
  }

  /** Returns true if field resources_map is set (has been assigned a value) and false otherwise */
  public boolean isSetResources_map() {
    return this.resources_map != null;
  }

  public void setResources_mapIsSet(boolean value) {
    if (!value) {
      this.resources_map = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM_EXECUTORS:
      if (value == null) {
        unsetNum_executors();
      } else {
        setNum_executors((Integer)value);
      }
      break;

    case NUM_TASKS:
      if (value == null) {
        unsetNum_tasks();
      } else {
        setNum_tasks((Integer)value);
      }
      break;

    case EMITTED:
      if (value == null) {
        unsetEmitted();
      } else {
        setEmitted((Long)value);
      }
      break;

    case TRANSFERRED:
      if (value == null) {
        unsetTransferred();
      } else {
        setTransferred((Long)value);
      }
      break;

    case ACKED:
      if (value == null) {
        unsetAcked();
      } else {
        setAcked((Long)value);
      }
      break;

    case FAILED:
      if (value == null) {
        unsetFailed();
      } else {
        setFailed((Long)value);
      }
      break;

    case RESOURCES_MAP:
      if (value == null) {
        unsetResources_map();
      } else {
        setResources_map((Map<String,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_EXECUTORS:
      return Integer.valueOf(getNum_executors());

    case NUM_TASKS:
      return Integer.valueOf(getNum_tasks());

    case EMITTED:
      return Long.valueOf(getEmitted());

    case TRANSFERRED:
      return Long.valueOf(getTransferred());

    case ACKED:
      return Long.valueOf(getAcked());

    case FAILED:
      return Long.valueOf(getFailed());

    case RESOURCES_MAP:
      return getResources_map();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM_EXECUTORS:
      return isSetNum_executors();
    case NUM_TASKS:
      return isSetNum_tasks();
    case EMITTED:
      return isSetEmitted();
    case TRANSFERRED:
      return isSetTransferred();
    case ACKED:
      return isSetAcked();
    case FAILED:
      return isSetFailed();
    case RESOURCES_MAP:
      return isSetResources_map();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommonAggregateStats)
      return this.equals((CommonAggregateStats)that);
    return false;
  }

  public boolean equals(CommonAggregateStats that) {
    if (that == null)
      return false;

    boolean this_present_num_executors = true && this.isSetNum_executors();
    boolean that_present_num_executors = true && that.isSetNum_executors();
    if (this_present_num_executors || that_present_num_executors) {
      if (!(this_present_num_executors && that_present_num_executors))
        return false;
      if (this.num_executors != that.num_executors)
        return false;
    }

    boolean this_present_num_tasks = true && this.isSetNum_tasks();
    boolean that_present_num_tasks = true && that.isSetNum_tasks();
    if (this_present_num_tasks || that_present_num_tasks) {
      if (!(this_present_num_tasks && that_present_num_tasks))
        return false;
      if (this.num_tasks != that.num_tasks)
        return false;
    }

    boolean this_present_emitted = true && this.isSetEmitted();
    boolean that_present_emitted = true && that.isSetEmitted();
    if (this_present_emitted || that_present_emitted) {
      if (!(this_present_emitted && that_present_emitted))
        return false;
      if (this.emitted != that.emitted)
        return false;
    }

    boolean this_present_transferred = true && this.isSetTransferred();
    boolean that_present_transferred = true && that.isSetTransferred();
    if (this_present_transferred || that_present_transferred) {
      if (!(this_present_transferred && that_present_transferred))
        return false;
      if (this.transferred != that.transferred)
        return false;
    }

    boolean this_present_acked = true && this.isSetAcked();
    boolean that_present_acked = true && that.isSetAcked();
    if (this_present_acked || that_present_acked) {
      if (!(this_present_acked && that_present_acked))
        return false;
      if (this.acked != that.acked)
        return false;
    }

    boolean this_present_failed = true && this.isSetFailed();
    boolean that_present_failed = true && that.isSetFailed();
    if (this_present_failed || that_present_failed) {
      if (!(this_present_failed && that_present_failed))
        return false;
      if (this.failed != that.failed)
        return false;
    }

    boolean this_present_resources_map = true && this.isSetResources_map();
    boolean that_present_resources_map = true && that.isSetResources_map();
    if (this_present_resources_map || that_present_resources_map) {
      if (!(this_present_resources_map && that_present_resources_map))
        return false;
      if (!this.resources_map.equals(that.resources_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CommonAggregateStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CommonAggregateStats typedOther = (CommonAggregateStats)other;

    lastComparison = Boolean.valueOf(isSetNum_executors()).compareTo(typedOther.isSetNum_executors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_executors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_executors, typedOther.num_executors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_tasks()).compareTo(typedOther.isSetNum_tasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_tasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_tasks, typedOther.num_tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmitted()).compareTo(typedOther.isSetEmitted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmitted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emitted, typedOther.emitted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransferred()).compareTo(typedOther.isSetTransferred());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransferred()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transferred, typedOther.transferred);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAcked()).compareTo(typedOther.isSetAcked());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcked()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acked, typedOther.acked);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailed()).compareTo(typedOther.isSetFailed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failed, typedOther.failed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResources_map()).compareTo(typedOther.isSetResources_map());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResources_map()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resources_map, typedOther.resources_map);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CommonAggregateStats(");
    boolean first = true;

    if (isSetNum_executors()) {
      sb.append("num_executors:");
      sb.append(this.num_executors);
      first = false;
    }
    if (isSetNum_tasks()) {
      if (!first) sb.append(", ");
      sb.append("num_tasks:");
      sb.append(this.num_tasks);
      first = false;
    }
    if (isSetEmitted()) {
      if (!first) sb.append(", ");
      sb.append("emitted:");
      sb.append(this.emitted);
      first = false;
    }
    if (isSetTransferred()) {
      if (!first) sb.append(", ");
      sb.append("transferred:");
      sb.append(this.transferred);
      first = false;
    }
    if (isSetAcked()) {
      if (!first) sb.append(", ");
      sb.append("acked:");
      sb.append(this.acked);
      first = false;
    }
    if (isSetFailed()) {
      if (!first) sb.append(", ");
      sb.append("failed:");
      sb.append(this.failed);
      first = false;
    }
    if (isSetResources_map()) {
      if (!first) sb.append(", ");
      sb.append("resources_map:");
      if (this.resources_map == null) {
        sb.append("null");
      } else {
        sb.append(this.resources_map);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CommonAggregateStatsStandardSchemeFactory implements SchemeFactory {
    public CommonAggregateStatsStandardScheme getScheme() {
      return new CommonAggregateStatsStandardScheme();
    }
  }

  private static class CommonAggregateStatsStandardScheme extends StandardScheme<CommonAggregateStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CommonAggregateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_executors = iprot.readI32();
              struct.setNum_executorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_TASKS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_tasks = iprot.readI32();
              struct.setNum_tasksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EMITTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.emitted = iprot.readI64();
              struct.setEmittedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRANSFERRED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.transferred = iprot.readI64();
              struct.setTransferredIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ACKED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.acked = iprot.readI64();
              struct.setAckedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FAILED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.failed = iprot.readI64();
              struct.setFailedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // RESOURCES_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map368 = iprot.readMapBegin();
                struct.resources_map = new HashMap<String,Double>(2*_map368.size);
                for (int _i369 = 0; _i369 < _map368.size; ++_i369)
                {
                  String _key370; // required
                  double _val371; // required
                  _key370 = iprot.readString();
                  _val371 = iprot.readDouble();
                  struct.resources_map.put(_key370, _val371);
                }
                iprot.readMapEnd();
              }
              struct.setResources_mapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CommonAggregateStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetNum_executors()) {
        oprot.writeFieldBegin(NUM_EXECUTORS_FIELD_DESC);
        oprot.writeI32(struct.num_executors);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNum_tasks()) {
        oprot.writeFieldBegin(NUM_TASKS_FIELD_DESC);
        oprot.writeI32(struct.num_tasks);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEmitted()) {
        oprot.writeFieldBegin(EMITTED_FIELD_DESC);
        oprot.writeI64(struct.emitted);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTransferred()) {
        oprot.writeFieldBegin(TRANSFERRED_FIELD_DESC);
        oprot.writeI64(struct.transferred);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAcked()) {
        oprot.writeFieldBegin(ACKED_FIELD_DESC);
        oprot.writeI64(struct.acked);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFailed()) {
        oprot.writeFieldBegin(FAILED_FIELD_DESC);
        oprot.writeI64(struct.failed);
        oprot.writeFieldEnd();
      }
      if (struct.resources_map != null) {
        if (struct.isSetResources_map()) {
          oprot.writeFieldBegin(RESOURCES_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, struct.resources_map.size()));
            for (Map.Entry<String, Double> _iter372 : struct.resources_map.entrySet())
            {
              oprot.writeString(_iter372.getKey());
              oprot.writeDouble(_iter372.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommonAggregateStatsTupleSchemeFactory implements SchemeFactory {
    public CommonAggregateStatsTupleScheme getScheme() {
      return new CommonAggregateStatsTupleScheme();
    }
  }

  private static class CommonAggregateStatsTupleScheme extends TupleScheme<CommonAggregateStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CommonAggregateStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNum_executors()) {
        optionals.set(0);
      }
      if (struct.isSetNum_tasks()) {
        optionals.set(1);
      }
      if (struct.isSetEmitted()) {
        optionals.set(2);
      }
      if (struct.isSetTransferred()) {
        optionals.set(3);
      }
      if (struct.isSetAcked()) {
        optionals.set(4);
      }
      if (struct.isSetFailed()) {
        optionals.set(5);
      }
      if (struct.isSetResources_map()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetNum_executors()) {
        oprot.writeI32(struct.num_executors);
      }
      if (struct.isSetNum_tasks()) {
        oprot.writeI32(struct.num_tasks);
      }
      if (struct.isSetEmitted()) {
        oprot.writeI64(struct.emitted);
      }
      if (struct.isSetTransferred()) {
        oprot.writeI64(struct.transferred);
      }
      if (struct.isSetAcked()) {
        oprot.writeI64(struct.acked);
      }
      if (struct.isSetFailed()) {
        oprot.writeI64(struct.failed);
      }
      if (struct.isSetResources_map()) {
        {
          oprot.writeI32(struct.resources_map.size());
          for (Map.Entry<String, Double> _iter373 : struct.resources_map.entrySet())
          {
            oprot.writeString(_iter373.getKey());
            oprot.writeDouble(_iter373.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CommonAggregateStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.num_executors = iprot.readI32();
        struct.setNum_executorsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.num_tasks = iprot.readI32();
        struct.setNum_tasksIsSet(true);
      }
      if (incoming.get(2)) {
        struct.emitted = iprot.readI64();
        struct.setEmittedIsSet(true);
      }
      if (incoming.get(3)) {
        struct.transferred = iprot.readI64();
        struct.setTransferredIsSet(true);
      }
      if (incoming.get(4)) {
        struct.acked = iprot.readI64();
        struct.setAckedIsSet(true);
      }
      if (incoming.get(5)) {
        struct.failed = iprot.readI64();
        struct.setFailedIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TMap _map374 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.resources_map = new HashMap<String,Double>(2*_map374.size);
          for (int _i375 = 0; _i375 < _map374.size; ++_i375)
          {
            String _key376; // required
            double _val377; // required
            _key376 = iprot.readString();
            _val377 = iprot.readDouble();
            struct.resources_map.put(_key376, _val377);
          }
        }
        struct.setResources_mapIsSet(true);
      }
    }
  }

}

