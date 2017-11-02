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

public class TopologyHistoryInfo implements org.apache.thrift.TBase<TopologyHistoryInfo, TopologyHistoryInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TopologyHistoryInfo");

  private static final org.apache.thrift.protocol.TField TOPO_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("topo_ids", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopologyHistoryInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopologyHistoryInfoTupleSchemeFactory());
  }

  public List<String> topo_ids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPO_IDS((short)1, "topo_ids");

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
        case 1: // TOPO_IDS
          return TOPO_IDS;
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
    tmpMap.put(_Fields.TOPO_IDS, new org.apache.thrift.meta_data.FieldMetaData("topo_ids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TopologyHistoryInfo.class, metaDataMap);
  }

  public TopologyHistoryInfo() {
  }

  public TopologyHistoryInfo(
    List<String> topo_ids)
  {
    this();
    this.topo_ids = topo_ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyHistoryInfo(TopologyHistoryInfo other) {
    if (other.isSetTopo_ids()) {
      List<String> __this__topo_ids = new ArrayList<String>();
      for (String other_element : other.topo_ids) {
        __this__topo_ids.add(other_element);
      }
      this.topo_ids = __this__topo_ids;
    }
  }

  public TopologyHistoryInfo deepCopy() {
    return new TopologyHistoryInfo(this);
  }

  @Override
  public void clear() {
    this.topo_ids = null;
  }

  public int getTopo_idsSize() {
    return (this.topo_ids == null) ? 0 : this.topo_ids.size();
  }

  public java.util.Iterator<String> getTopo_idsIterator() {
    return (this.topo_ids == null) ? null : this.topo_ids.iterator();
  }

  public void addToTopo_ids(String elem) {
    if (this.topo_ids == null) {
      this.topo_ids = new ArrayList<String>();
    }
    this.topo_ids.add(elem);
  }

  public List<String> getTopo_ids() {
    return this.topo_ids;
  }

  public TopologyHistoryInfo setTopo_ids(List<String> topo_ids) {
    this.topo_ids = topo_ids;
    return this;
  }

  public void unsetTopo_ids() {
    this.topo_ids = null;
  }

  /** Returns true if field topo_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetTopo_ids() {
    return this.topo_ids != null;
  }

  public void setTopo_idsIsSet(boolean value) {
    if (!value) {
      this.topo_ids = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPO_IDS:
      if (value == null) {
        unsetTopo_ids();
      } else {
        setTopo_ids((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPO_IDS:
      return getTopo_ids();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPO_IDS:
      return isSetTopo_ids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyHistoryInfo)
      return this.equals((TopologyHistoryInfo)that);
    return false;
  }

  public boolean equals(TopologyHistoryInfo that) {
    if (that == null)
      return false;

    boolean this_present_topo_ids = true && this.isSetTopo_ids();
    boolean that_present_topo_ids = true && that.isSetTopo_ids();
    if (this_present_topo_ids || that_present_topo_ids) {
      if (!(this_present_topo_ids && that_present_topo_ids))
        return false;
      if (!this.topo_ids.equals(that.topo_ids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TopologyHistoryInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TopologyHistoryInfo typedOther = (TopologyHistoryInfo)other;

    lastComparison = Boolean.valueOf(isSetTopo_ids()).compareTo(typedOther.isSetTopo_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopo_ids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topo_ids, typedOther.topo_ids);
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
    StringBuilder sb = new StringBuilder("TopologyHistoryInfo(");
    boolean first = true;

    sb.append("topo_ids:");
    if (this.topo_ids == null) {
      sb.append("null");
    } else {
      sb.append(this.topo_ids);
    }
    first = false;
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopologyHistoryInfoStandardSchemeFactory implements SchemeFactory {
    public TopologyHistoryInfoStandardScheme getScheme() {
      return new TopologyHistoryInfoStandardScheme();
    }
  }

  private static class TopologyHistoryInfoStandardScheme extends StandardScheme<TopologyHistoryInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TopologyHistoryInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPO_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list784 = iprot.readListBegin();
                struct.topo_ids = new ArrayList<String>(_list784.size);
                for (int _i785 = 0; _i785 < _list784.size; ++_i785)
                {
                  String _elem786; // required
                  _elem786 = iprot.readString();
                  struct.topo_ids.add(_elem786);
                }
                iprot.readListEnd();
              }
              struct.setTopo_idsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TopologyHistoryInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topo_ids != null) {
        oprot.writeFieldBegin(TOPO_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.topo_ids.size()));
          for (String _iter787 : struct.topo_ids)
          {
            oprot.writeString(_iter787);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopologyHistoryInfoTupleSchemeFactory implements SchemeFactory {
    public TopologyHistoryInfoTupleScheme getScheme() {
      return new TopologyHistoryInfoTupleScheme();
    }
  }

  private static class TopologyHistoryInfoTupleScheme extends TupleScheme<TopologyHistoryInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TopologyHistoryInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTopo_ids()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTopo_ids()) {
        {
          oprot.writeI32(struct.topo_ids.size());
          for (String _iter788 : struct.topo_ids)
          {
            oprot.writeString(_iter788);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TopologyHistoryInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list789 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.topo_ids = new ArrayList<String>(_list789.size);
          for (int _i790 = 0; _i790 < _list789.size; ++_i790)
          {
            String _elem791; // required
            _elem791 = iprot.readString();
            struct.topo_ids.add(_elem791);
          }
        }
        struct.setTopo_idsIsSet(true);
      }
    }
  }

}
