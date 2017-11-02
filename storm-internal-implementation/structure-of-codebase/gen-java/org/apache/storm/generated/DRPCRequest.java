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

public class DRPCRequest implements org.apache.thrift.TBase<DRPCRequest, DRPCRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DRPCRequest");

  private static final org.apache.thrift.protocol.TField FUNC_ARGS_FIELD_DESC = new org.apache.thrift.protocol.TField("func_args", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("request_id", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DRPCRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DRPCRequestTupleSchemeFactory());
  }

  public String func_args; // required
  public String request_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FUNC_ARGS((short)1, "func_args"),
    REQUEST_ID((short)2, "request_id");

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
        case 1: // FUNC_ARGS
          return FUNC_ARGS;
        case 2: // REQUEST_ID
          return REQUEST_ID;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FUNC_ARGS, new org.apache.thrift.meta_data.FieldMetaData("func_args", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("request_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DRPCRequest.class, metaDataMap);
  }

  public DRPCRequest() {
  }

  public DRPCRequest(
    String func_args,
    String request_id)
  {
    this();
    this.func_args = func_args;
    this.request_id = request_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DRPCRequest(DRPCRequest other) {
    if (other.isSetFunc_args()) {
      this.func_args = other.func_args;
    }
    if (other.isSetRequest_id()) {
      this.request_id = other.request_id;
    }
  }

  public DRPCRequest deepCopy() {
    return new DRPCRequest(this);
  }

  @Override
  public void clear() {
    this.func_args = null;
    this.request_id = null;
  }

  public String getFunc_args() {
    return this.func_args;
  }

  public DRPCRequest setFunc_args(String func_args) {
    this.func_args = func_args;
    return this;
  }

  public void unsetFunc_args() {
    this.func_args = null;
  }

  /** Returns true if field func_args is set (has been assigned a value) and false otherwise */
  public boolean isSetFunc_args() {
    return this.func_args != null;
  }

  public void setFunc_argsIsSet(boolean value) {
    if (!value) {
      this.func_args = null;
    }
  }

  public String getRequest_id() {
    return this.request_id;
  }

  public DRPCRequest setRequest_id(String request_id) {
    this.request_id = request_id;
    return this;
  }

  public void unsetRequest_id() {
    this.request_id = null;
  }

  /** Returns true if field request_id is set (has been assigned a value) and false otherwise */
  public boolean isSetRequest_id() {
    return this.request_id != null;
  }

  public void setRequest_idIsSet(boolean value) {
    if (!value) {
      this.request_id = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FUNC_ARGS:
      if (value == null) {
        unsetFunc_args();
      } else {
        setFunc_args((String)value);
      }
      break;

    case REQUEST_ID:
      if (value == null) {
        unsetRequest_id();
      } else {
        setRequest_id((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FUNC_ARGS:
      return getFunc_args();

    case REQUEST_ID:
      return getRequest_id();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FUNC_ARGS:
      return isSetFunc_args();
    case REQUEST_ID:
      return isSetRequest_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DRPCRequest)
      return this.equals((DRPCRequest)that);
    return false;
  }

  public boolean equals(DRPCRequest that) {
    if (that == null)
      return false;

    boolean this_present_func_args = true && this.isSetFunc_args();
    boolean that_present_func_args = true && that.isSetFunc_args();
    if (this_present_func_args || that_present_func_args) {
      if (!(this_present_func_args && that_present_func_args))
        return false;
      if (!this.func_args.equals(that.func_args))
        return false;
    }

    boolean this_present_request_id = true && this.isSetRequest_id();
    boolean that_present_request_id = true && that.isSetRequest_id();
    if (this_present_request_id || that_present_request_id) {
      if (!(this_present_request_id && that_present_request_id))
        return false;
      if (!this.request_id.equals(that.request_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(DRPCRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DRPCRequest typedOther = (DRPCRequest)other;

    lastComparison = Boolean.valueOf(isSetFunc_args()).compareTo(typedOther.isSetFunc_args());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunc_args()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.func_args, typedOther.func_args);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequest_id()).compareTo(typedOther.isSetRequest_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequest_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.request_id, typedOther.request_id);
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
    StringBuilder sb = new StringBuilder("DRPCRequest(");
    boolean first = true;

    sb.append("func_args:");
    if (this.func_args == null) {
      sb.append("null");
    } else {
      sb.append(this.func_args);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("request_id:");
    if (this.request_id == null) {
      sb.append("null");
    } else {
      sb.append(this.request_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (func_args == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'func_args' was not present! Struct: " + toString());
    }
    if (request_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'request_id' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DRPCRequestStandardSchemeFactory implements SchemeFactory {
    public DRPCRequestStandardScheme getScheme() {
      return new DRPCRequestStandardScheme();
    }
  }

  private static class DRPCRequestStandardScheme extends StandardScheme<DRPCRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DRPCRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FUNC_ARGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.func_args = iprot.readString();
              struct.setFunc_argsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.request_id = iprot.readString();
              struct.setRequest_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DRPCRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.func_args != null) {
        oprot.writeFieldBegin(FUNC_ARGS_FIELD_DESC);
        oprot.writeString(struct.func_args);
        oprot.writeFieldEnd();
      }
      if (struct.request_id != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(struct.request_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DRPCRequestTupleSchemeFactory implements SchemeFactory {
    public DRPCRequestTupleScheme getScheme() {
      return new DRPCRequestTupleScheme();
    }
  }

  private static class DRPCRequestTupleScheme extends TupleScheme<DRPCRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DRPCRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.func_args);
      oprot.writeString(struct.request_id);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DRPCRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.func_args = iprot.readString();
      struct.setFunc_argsIsSet(true);
      struct.request_id = iprot.readString();
      struct.setRequest_idIsSet(true);
    }
  }

}

