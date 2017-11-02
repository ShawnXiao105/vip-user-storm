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

public class LogLevel implements org.apache.thrift.TBase<LogLevel, LogLevel._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LogLevel");

  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_LOG_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("target_log_level", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESET_LOG_LEVEL_TIMEOUT_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("reset_log_level_timeout_secs", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RESET_LOG_LEVEL_TIMEOUT_EPOCH_FIELD_DESC = new org.apache.thrift.protocol.TField("reset_log_level_timeout_epoch", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField RESET_LOG_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("reset_log_level", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LogLevelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LogLevelTupleSchemeFactory());
  }

  /**
   * 
   * @see LogLevelAction
   */
  public LogLevelAction action; // required
  public String target_log_level; // required
  public int reset_log_level_timeout_secs; // required
  public long reset_log_level_timeout_epoch; // required
  public String reset_log_level; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see LogLevelAction
     */
    ACTION((short)1, "action"),
    TARGET_LOG_LEVEL((short)2, "target_log_level"),
    RESET_LOG_LEVEL_TIMEOUT_SECS((short)3, "reset_log_level_timeout_secs"),
    RESET_LOG_LEVEL_TIMEOUT_EPOCH((short)4, "reset_log_level_timeout_epoch"),
    RESET_LOG_LEVEL((short)5, "reset_log_level");

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
        case 1: // ACTION
          return ACTION;
        case 2: // TARGET_LOG_LEVEL
          return TARGET_LOG_LEVEL;
        case 3: // RESET_LOG_LEVEL_TIMEOUT_SECS
          return RESET_LOG_LEVEL_TIMEOUT_SECS;
        case 4: // RESET_LOG_LEVEL_TIMEOUT_EPOCH
          return RESET_LOG_LEVEL_TIMEOUT_EPOCH;
        case 5: // RESET_LOG_LEVEL
          return RESET_LOG_LEVEL;
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
  private static final int __RESET_LOG_LEVEL_TIMEOUT_SECS_ISSET_ID = 0;
  private static final int __RESET_LOG_LEVEL_TIMEOUT_EPOCH_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.TARGET_LOG_LEVEL,_Fields.RESET_LOG_LEVEL_TIMEOUT_SECS,_Fields.RESET_LOG_LEVEL_TIMEOUT_EPOCH,_Fields.RESET_LOG_LEVEL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, LogLevelAction.class)));
    tmpMap.put(_Fields.TARGET_LOG_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("target_log_level", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESET_LOG_LEVEL_TIMEOUT_SECS, new org.apache.thrift.meta_data.FieldMetaData("reset_log_level_timeout_secs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RESET_LOG_LEVEL_TIMEOUT_EPOCH, new org.apache.thrift.meta_data.FieldMetaData("reset_log_level_timeout_epoch", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RESET_LOG_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("reset_log_level", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LogLevel.class, metaDataMap);
  }

  public LogLevel() {
  }

  public LogLevel(
    LogLevelAction action)
  {
    this();
    this.action = action;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogLevel(LogLevel other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAction()) {
      this.action = other.action;
    }
    if (other.isSetTarget_log_level()) {
      this.target_log_level = other.target_log_level;
    }
    this.reset_log_level_timeout_secs = other.reset_log_level_timeout_secs;
    this.reset_log_level_timeout_epoch = other.reset_log_level_timeout_epoch;
    if (other.isSetReset_log_level()) {
      this.reset_log_level = other.reset_log_level;
    }
  }

  public LogLevel deepCopy() {
    return new LogLevel(this);
  }

  @Override
  public void clear() {
    this.action = null;
    this.target_log_level = null;
    setReset_log_level_timeout_secsIsSet(false);
    this.reset_log_level_timeout_secs = 0;
    setReset_log_level_timeout_epochIsSet(false);
    this.reset_log_level_timeout_epoch = 0;
    this.reset_log_level = null;
  }

  /**
   * 
   * @see LogLevelAction
   */
  public LogLevelAction getAction() {
    return this.action;
  }

  /**
   * 
   * @see LogLevelAction
   */
  public LogLevel setAction(LogLevelAction action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public String getTarget_log_level() {
    return this.target_log_level;
  }

  public LogLevel setTarget_log_level(String target_log_level) {
    this.target_log_level = target_log_level;
    return this;
  }

  public void unsetTarget_log_level() {
    this.target_log_level = null;
  }

  /** Returns true if field target_log_level is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget_log_level() {
    return this.target_log_level != null;
  }

  public void setTarget_log_levelIsSet(boolean value) {
    if (!value) {
      this.target_log_level = null;
    }
  }

  public int getReset_log_level_timeout_secs() {
    return this.reset_log_level_timeout_secs;
  }

  public LogLevel setReset_log_level_timeout_secs(int reset_log_level_timeout_secs) {
    this.reset_log_level_timeout_secs = reset_log_level_timeout_secs;
    setReset_log_level_timeout_secsIsSet(true);
    return this;
  }

  public void unsetReset_log_level_timeout_secs() {
    __isset_bit_vector.clear(__RESET_LOG_LEVEL_TIMEOUT_SECS_ISSET_ID);
  }

  /** Returns true if field reset_log_level_timeout_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetReset_log_level_timeout_secs() {
    return __isset_bit_vector.get(__RESET_LOG_LEVEL_TIMEOUT_SECS_ISSET_ID);
  }

  public void setReset_log_level_timeout_secsIsSet(boolean value) {
    __isset_bit_vector.set(__RESET_LOG_LEVEL_TIMEOUT_SECS_ISSET_ID, value);
  }

  public long getReset_log_level_timeout_epoch() {
    return this.reset_log_level_timeout_epoch;
  }

  public LogLevel setReset_log_level_timeout_epoch(long reset_log_level_timeout_epoch) {
    this.reset_log_level_timeout_epoch = reset_log_level_timeout_epoch;
    setReset_log_level_timeout_epochIsSet(true);
    return this;
  }

  public void unsetReset_log_level_timeout_epoch() {
    __isset_bit_vector.clear(__RESET_LOG_LEVEL_TIMEOUT_EPOCH_ISSET_ID);
  }

  /** Returns true if field reset_log_level_timeout_epoch is set (has been assigned a value) and false otherwise */
  public boolean isSetReset_log_level_timeout_epoch() {
    return __isset_bit_vector.get(__RESET_LOG_LEVEL_TIMEOUT_EPOCH_ISSET_ID);
  }

  public void setReset_log_level_timeout_epochIsSet(boolean value) {
    __isset_bit_vector.set(__RESET_LOG_LEVEL_TIMEOUT_EPOCH_ISSET_ID, value);
  }

  public String getReset_log_level() {
    return this.reset_log_level;
  }

  public LogLevel setReset_log_level(String reset_log_level) {
    this.reset_log_level = reset_log_level;
    return this;
  }

  public void unsetReset_log_level() {
    this.reset_log_level = null;
  }

  /** Returns true if field reset_log_level is set (has been assigned a value) and false otherwise */
  public boolean isSetReset_log_level() {
    return this.reset_log_level != null;
  }

  public void setReset_log_levelIsSet(boolean value) {
    if (!value) {
      this.reset_log_level = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((LogLevelAction)value);
      }
      break;

    case TARGET_LOG_LEVEL:
      if (value == null) {
        unsetTarget_log_level();
      } else {
        setTarget_log_level((String)value);
      }
      break;

    case RESET_LOG_LEVEL_TIMEOUT_SECS:
      if (value == null) {
        unsetReset_log_level_timeout_secs();
      } else {
        setReset_log_level_timeout_secs((Integer)value);
      }
      break;

    case RESET_LOG_LEVEL_TIMEOUT_EPOCH:
      if (value == null) {
        unsetReset_log_level_timeout_epoch();
      } else {
        setReset_log_level_timeout_epoch((Long)value);
      }
      break;

    case RESET_LOG_LEVEL:
      if (value == null) {
        unsetReset_log_level();
      } else {
        setReset_log_level((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION:
      return getAction();

    case TARGET_LOG_LEVEL:
      return getTarget_log_level();

    case RESET_LOG_LEVEL_TIMEOUT_SECS:
      return Integer.valueOf(getReset_log_level_timeout_secs());

    case RESET_LOG_LEVEL_TIMEOUT_EPOCH:
      return Long.valueOf(getReset_log_level_timeout_epoch());

    case RESET_LOG_LEVEL:
      return getReset_log_level();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION:
      return isSetAction();
    case TARGET_LOG_LEVEL:
      return isSetTarget_log_level();
    case RESET_LOG_LEVEL_TIMEOUT_SECS:
      return isSetReset_log_level_timeout_secs();
    case RESET_LOG_LEVEL_TIMEOUT_EPOCH:
      return isSetReset_log_level_timeout_epoch();
    case RESET_LOG_LEVEL:
      return isSetReset_log_level();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LogLevel)
      return this.equals((LogLevel)that);
    return false;
  }

  public boolean equals(LogLevel that) {
    if (that == null)
      return false;

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_target_log_level = true && this.isSetTarget_log_level();
    boolean that_present_target_log_level = true && that.isSetTarget_log_level();
    if (this_present_target_log_level || that_present_target_log_level) {
      if (!(this_present_target_log_level && that_present_target_log_level))
        return false;
      if (!this.target_log_level.equals(that.target_log_level))
        return false;
    }

    boolean this_present_reset_log_level_timeout_secs = true && this.isSetReset_log_level_timeout_secs();
    boolean that_present_reset_log_level_timeout_secs = true && that.isSetReset_log_level_timeout_secs();
    if (this_present_reset_log_level_timeout_secs || that_present_reset_log_level_timeout_secs) {
      if (!(this_present_reset_log_level_timeout_secs && that_present_reset_log_level_timeout_secs))
        return false;
      if (this.reset_log_level_timeout_secs != that.reset_log_level_timeout_secs)
        return false;
    }

    boolean this_present_reset_log_level_timeout_epoch = true && this.isSetReset_log_level_timeout_epoch();
    boolean that_present_reset_log_level_timeout_epoch = true && that.isSetReset_log_level_timeout_epoch();
    if (this_present_reset_log_level_timeout_epoch || that_present_reset_log_level_timeout_epoch) {
      if (!(this_present_reset_log_level_timeout_epoch && that_present_reset_log_level_timeout_epoch))
        return false;
      if (this.reset_log_level_timeout_epoch != that.reset_log_level_timeout_epoch)
        return false;
    }

    boolean this_present_reset_log_level = true && this.isSetReset_log_level();
    boolean that_present_reset_log_level = true && that.isSetReset_log_level();
    if (this_present_reset_log_level || that_present_reset_log_level) {
      if (!(this_present_reset_log_level && that_present_reset_log_level))
        return false;
      if (!this.reset_log_level.equals(that.reset_log_level))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LogLevel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LogLevel typedOther = (LogLevel)other;

    lastComparison = Boolean.valueOf(isSetAction()).compareTo(typedOther.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, typedOther.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTarget_log_level()).compareTo(typedOther.isSetTarget_log_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget_log_level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target_log_level, typedOther.target_log_level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReset_log_level_timeout_secs()).compareTo(typedOther.isSetReset_log_level_timeout_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReset_log_level_timeout_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reset_log_level_timeout_secs, typedOther.reset_log_level_timeout_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReset_log_level_timeout_epoch()).compareTo(typedOther.isSetReset_log_level_timeout_epoch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReset_log_level_timeout_epoch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reset_log_level_timeout_epoch, typedOther.reset_log_level_timeout_epoch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReset_log_level()).compareTo(typedOther.isSetReset_log_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReset_log_level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reset_log_level, typedOther.reset_log_level);
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
    StringBuilder sb = new StringBuilder("LogLevel(");
    boolean first = true;

    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    if (isSetTarget_log_level()) {
      if (!first) sb.append(", ");
      sb.append("target_log_level:");
      if (this.target_log_level == null) {
        sb.append("null");
      } else {
        sb.append(this.target_log_level);
      }
      first = false;
    }
    if (isSetReset_log_level_timeout_secs()) {
      if (!first) sb.append(", ");
      sb.append("reset_log_level_timeout_secs:");
      sb.append(this.reset_log_level_timeout_secs);
      first = false;
    }
    if (isSetReset_log_level_timeout_epoch()) {
      if (!first) sb.append(", ");
      sb.append("reset_log_level_timeout_epoch:");
      sb.append(this.reset_log_level_timeout_epoch);
      first = false;
    }
    if (isSetReset_log_level()) {
      if (!first) sb.append(", ");
      sb.append("reset_log_level:");
      if (this.reset_log_level == null) {
        sb.append("null");
      } else {
        sb.append(this.reset_log_level);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (action == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'action' was not present! Struct: " + toString());
    }
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

  private static class LogLevelStandardSchemeFactory implements SchemeFactory {
    public LogLevelStandardScheme getScheme() {
      return new LogLevelStandardScheme();
    }
  }

  private static class LogLevelStandardScheme extends StandardScheme<LogLevel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LogLevel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = LogLevelAction.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET_LOG_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.target_log_level = iprot.readString();
              struct.setTarget_log_levelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESET_LOG_LEVEL_TIMEOUT_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reset_log_level_timeout_secs = iprot.readI32();
              struct.setReset_log_level_timeout_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RESET_LOG_LEVEL_TIMEOUT_EPOCH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.reset_log_level_timeout_epoch = iprot.readI64();
              struct.setReset_log_level_timeout_epochIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RESET_LOG_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reset_log_level = iprot.readString();
              struct.setReset_log_levelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LogLevel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action != null) {
        oprot.writeFieldBegin(ACTION_FIELD_DESC);
        oprot.writeI32(struct.action.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.target_log_level != null) {
        if (struct.isSetTarget_log_level()) {
          oprot.writeFieldBegin(TARGET_LOG_LEVEL_FIELD_DESC);
          oprot.writeString(struct.target_log_level);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetReset_log_level_timeout_secs()) {
        oprot.writeFieldBegin(RESET_LOG_LEVEL_TIMEOUT_SECS_FIELD_DESC);
        oprot.writeI32(struct.reset_log_level_timeout_secs);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReset_log_level_timeout_epoch()) {
        oprot.writeFieldBegin(RESET_LOG_LEVEL_TIMEOUT_EPOCH_FIELD_DESC);
        oprot.writeI64(struct.reset_log_level_timeout_epoch);
        oprot.writeFieldEnd();
      }
      if (struct.reset_log_level != null) {
        if (struct.isSetReset_log_level()) {
          oprot.writeFieldBegin(RESET_LOG_LEVEL_FIELD_DESC);
          oprot.writeString(struct.reset_log_level);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LogLevelTupleSchemeFactory implements SchemeFactory {
    public LogLevelTupleScheme getScheme() {
      return new LogLevelTupleScheme();
    }
  }

  private static class LogLevelTupleScheme extends TupleScheme<LogLevel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LogLevel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.action.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetTarget_log_level()) {
        optionals.set(0);
      }
      if (struct.isSetReset_log_level_timeout_secs()) {
        optionals.set(1);
      }
      if (struct.isSetReset_log_level_timeout_epoch()) {
        optionals.set(2);
      }
      if (struct.isSetReset_log_level()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTarget_log_level()) {
        oprot.writeString(struct.target_log_level);
      }
      if (struct.isSetReset_log_level_timeout_secs()) {
        oprot.writeI32(struct.reset_log_level_timeout_secs);
      }
      if (struct.isSetReset_log_level_timeout_epoch()) {
        oprot.writeI64(struct.reset_log_level_timeout_epoch);
      }
      if (struct.isSetReset_log_level()) {
        oprot.writeString(struct.reset_log_level);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LogLevel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.action = LogLevelAction.findByValue(iprot.readI32());
      struct.setActionIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.target_log_level = iprot.readString();
        struct.setTarget_log_levelIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reset_log_level_timeout_secs = iprot.readI32();
        struct.setReset_log_level_timeout_secsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.reset_log_level_timeout_epoch = iprot.readI64();
        struct.setReset_log_level_timeout_epochIsSet(true);
      }
      if (incoming.get(3)) {
        struct.reset_log_level = iprot.readString();
        struct.setReset_log_levelIsSet(true);
      }
    }
  }

}

