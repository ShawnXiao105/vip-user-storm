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

public class BeginDownloadResult implements org.apache.thrift.TBase<BeginDownloadResult, BeginDownloadResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BeginDownloadResult");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("session", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("data_size", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BeginDownloadResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BeginDownloadResultTupleSchemeFactory());
  }

  public long version; // required
  public String session; // required
  public long data_size; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION((short)1, "version"),
    SESSION((short)2, "session"),
    DATA_SIZE((short)3, "data_size");

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
        case 1: // VERSION
          return VERSION;
        case 2: // SESSION
          return SESSION;
        case 3: // DATA_SIZE
          return DATA_SIZE;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __DATA_SIZE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.DATA_SIZE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SESSION, new org.apache.thrift.meta_data.FieldMetaData("session", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA_SIZE, new org.apache.thrift.meta_data.FieldMetaData("data_size", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BeginDownloadResult.class, metaDataMap);
  }

  public BeginDownloadResult() {
  }

  public BeginDownloadResult(
    long version,
    String session)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.session = session;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BeginDownloadResult(BeginDownloadResult other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.version = other.version;
    if (other.isSetSession()) {
      this.session = other.session;
    }
    this.data_size = other.data_size;
  }

  public BeginDownloadResult deepCopy() {
    return new BeginDownloadResult(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    this.session = null;
    setData_sizeIsSet(false);
    this.data_size = 0;
  }

  public long getVersion() {
    return this.version;
  }

  public BeginDownloadResult setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bit_vector.clear(__VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return __isset_bit_vector.get(__VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bit_vector.set(__VERSION_ISSET_ID, value);
  }

  public String getSession() {
    return this.session;
  }

  public BeginDownloadResult setSession(String session) {
    this.session = session;
    return this;
  }

  public void unsetSession() {
    this.session = null;
  }

  /** Returns true if field session is set (has been assigned a value) and false otherwise */
  public boolean isSetSession() {
    return this.session != null;
  }

  public void setSessionIsSet(boolean value) {
    if (!value) {
      this.session = null;
    }
  }

  public long getData_size() {
    return this.data_size;
  }

  public BeginDownloadResult setData_size(long data_size) {
    this.data_size = data_size;
    setData_sizeIsSet(true);
    return this;
  }

  public void unsetData_size() {
    __isset_bit_vector.clear(__DATA_SIZE_ISSET_ID);
  }

  /** Returns true if field data_size is set (has been assigned a value) and false otherwise */
  public boolean isSetData_size() {
    return __isset_bit_vector.get(__DATA_SIZE_ISSET_ID);
  }

  public void setData_sizeIsSet(boolean value) {
    __isset_bit_vector.set(__DATA_SIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Long)value);
      }
      break;

    case SESSION:
      if (value == null) {
        unsetSession();
      } else {
        setSession((String)value);
      }
      break;

    case DATA_SIZE:
      if (value == null) {
        unsetData_size();
      } else {
        setData_size((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Long.valueOf(getVersion());

    case SESSION:
      return getSession();

    case DATA_SIZE:
      return Long.valueOf(getData_size());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case SESSION:
      return isSetSession();
    case DATA_SIZE:
      return isSetData_size();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BeginDownloadResult)
      return this.equals((BeginDownloadResult)that);
    return false;
  }

  public boolean equals(BeginDownloadResult that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_session = true && this.isSetSession();
    boolean that_present_session = true && that.isSetSession();
    if (this_present_session || that_present_session) {
      if (!(this_present_session && that_present_session))
        return false;
      if (!this.session.equals(that.session))
        return false;
    }

    boolean this_present_data_size = true && this.isSetData_size();
    boolean that_present_data_size = true && that.isSetData_size();
    if (this_present_data_size || that_present_data_size) {
      if (!(this_present_data_size && that_present_data_size))
        return false;
      if (this.data_size != that.data_size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BeginDownloadResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BeginDownloadResult typedOther = (BeginDownloadResult)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSession()).compareTo(typedOther.isSetSession());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSession()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.session, typedOther.session);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData_size()).compareTo(typedOther.isSetData_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_size, typedOther.data_size);
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
    StringBuilder sb = new StringBuilder("BeginDownloadResult(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("session:");
    if (this.session == null) {
      sb.append("null");
    } else {
      sb.append(this.session);
    }
    first = false;
    if (isSetData_size()) {
      if (!first) sb.append(", ");
      sb.append("data_size:");
      sb.append(this.data_size);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'version' because it's a primitive and you chose the non-beans generator.
    if (session == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'session' was not present! Struct: " + toString());
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

  private static class BeginDownloadResultStandardSchemeFactory implements SchemeFactory {
    public BeginDownloadResultStandardScheme getScheme() {
      return new BeginDownloadResultStandardScheme();
    }
  }

  private static class BeginDownloadResultStandardScheme extends StandardScheme<BeginDownloadResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.session = iprot.readString();
              struct.setSessionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.data_size = iprot.readI64();
              struct.setData_sizeIsSet(true);
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
      if (!struct.isSetVersion()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      if (struct.session != null) {
        oprot.writeFieldBegin(SESSION_FIELD_DESC);
        oprot.writeString(struct.session);
        oprot.writeFieldEnd();
      }
      if (struct.isSetData_size()) {
        oprot.writeFieldBegin(DATA_SIZE_FIELD_DESC);
        oprot.writeI64(struct.data_size);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BeginDownloadResultTupleSchemeFactory implements SchemeFactory {
    public BeginDownloadResultTupleScheme getScheme() {
      return new BeginDownloadResultTupleScheme();
    }
  }

  private static class BeginDownloadResultTupleScheme extends TupleScheme<BeginDownloadResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.version);
      oprot.writeString(struct.session);
      BitSet optionals = new BitSet();
      if (struct.isSetData_size()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetData_size()) {
        oprot.writeI64(struct.data_size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BeginDownloadResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.version = iprot.readI64();
      struct.setVersionIsSet(true);
      struct.session = iprot.readString();
      struct.setSessionIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.data_size = iprot.readI64();
        struct.setData_sizeIsSet(true);
      }
    }
  }

}

