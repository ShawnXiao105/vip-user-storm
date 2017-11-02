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

public class ClusterSummary implements org.apache.thrift.TBase<ClusterSummary, ClusterSummary._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClusterSummary");

  private static final org.apache.thrift.protocol.TField SUPERVISORS_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisors", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField NIMBUS_UPTIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("nimbus_uptime_secs", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TOPOLOGIES_FIELD_DESC = new org.apache.thrift.protocol.TField("topologies", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField NIMBUSES_FIELD_DESC = new org.apache.thrift.protocol.TField("nimbuses", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterSummaryTupleSchemeFactory());
  }

  public List<SupervisorSummary> supervisors; // required
  public int nimbus_uptime_secs; // required
  public List<TopologySummary> topologies; // required
  public List<NimbusSummary> nimbuses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUPERVISORS((short)1, "supervisors"),
    NIMBUS_UPTIME_SECS((short)2, "nimbus_uptime_secs"),
    TOPOLOGIES((short)3, "topologies"),
    NIMBUSES((short)4, "nimbuses");

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
        case 1: // SUPERVISORS
          return SUPERVISORS;
        case 2: // NIMBUS_UPTIME_SECS
          return NIMBUS_UPTIME_SECS;
        case 3: // TOPOLOGIES
          return TOPOLOGIES;
        case 4: // NIMBUSES
          return NIMBUSES;
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
  private static final int __NIMBUS_UPTIME_SECS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.NIMBUS_UPTIME_SECS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUPERVISORS, new org.apache.thrift.meta_data.FieldMetaData("supervisors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SupervisorSummary.class))));
    tmpMap.put(_Fields.NIMBUS_UPTIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("nimbus_uptime_secs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOPOLOGIES, new org.apache.thrift.meta_data.FieldMetaData("topologies", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TopologySummary.class))));
    tmpMap.put(_Fields.NIMBUSES, new org.apache.thrift.meta_data.FieldMetaData("nimbuses", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NimbusSummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterSummary.class, metaDataMap);
  }

  public ClusterSummary() {
    this.nimbus_uptime_secs = 0;

  }

  public ClusterSummary(
    List<SupervisorSummary> supervisors,
    List<TopologySummary> topologies,
    List<NimbusSummary> nimbuses)
  {
    this();
    this.supervisors = supervisors;
    this.topologies = topologies;
    this.nimbuses = nimbuses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterSummary(ClusterSummary other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSupervisors()) {
      List<SupervisorSummary> __this__supervisors = new ArrayList<SupervisorSummary>();
      for (SupervisorSummary other_element : other.supervisors) {
        __this__supervisors.add(new SupervisorSummary(other_element));
      }
      this.supervisors = __this__supervisors;
    }
    this.nimbus_uptime_secs = other.nimbus_uptime_secs;
    if (other.isSetTopologies()) {
      List<TopologySummary> __this__topologies = new ArrayList<TopologySummary>();
      for (TopologySummary other_element : other.topologies) {
        __this__topologies.add(new TopologySummary(other_element));
      }
      this.topologies = __this__topologies;
    }
    if (other.isSetNimbuses()) {
      List<NimbusSummary> __this__nimbuses = new ArrayList<NimbusSummary>();
      for (NimbusSummary other_element : other.nimbuses) {
        __this__nimbuses.add(new NimbusSummary(other_element));
      }
      this.nimbuses = __this__nimbuses;
    }
  }

  public ClusterSummary deepCopy() {
    return new ClusterSummary(this);
  }

  @Override
  public void clear() {
    this.supervisors = null;
    this.nimbus_uptime_secs = 0;

    this.topologies = null;
    this.nimbuses = null;
  }

  public int getSupervisorsSize() {
    return (this.supervisors == null) ? 0 : this.supervisors.size();
  }

  public java.util.Iterator<SupervisorSummary> getSupervisorsIterator() {
    return (this.supervisors == null) ? null : this.supervisors.iterator();
  }

  public void addToSupervisors(SupervisorSummary elem) {
    if (this.supervisors == null) {
      this.supervisors = new ArrayList<SupervisorSummary>();
    }
    this.supervisors.add(elem);
  }

  public List<SupervisorSummary> getSupervisors() {
    return this.supervisors;
  }

  public ClusterSummary setSupervisors(List<SupervisorSummary> supervisors) {
    this.supervisors = supervisors;
    return this;
  }

  public void unsetSupervisors() {
    this.supervisors = null;
  }

  /** Returns true if field supervisors is set (has been assigned a value) and false otherwise */
  public boolean isSetSupervisors() {
    return this.supervisors != null;
  }

  public void setSupervisorsIsSet(boolean value) {
    if (!value) {
      this.supervisors = null;
    }
  }

  public int getNimbus_uptime_secs() {
    return this.nimbus_uptime_secs;
  }

  public ClusterSummary setNimbus_uptime_secs(int nimbus_uptime_secs) {
    this.nimbus_uptime_secs = nimbus_uptime_secs;
    setNimbus_uptime_secsIsSet(true);
    return this;
  }

  public void unsetNimbus_uptime_secs() {
    __isset_bit_vector.clear(__NIMBUS_UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field nimbus_uptime_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetNimbus_uptime_secs() {
    return __isset_bit_vector.get(__NIMBUS_UPTIME_SECS_ISSET_ID);
  }

  public void setNimbus_uptime_secsIsSet(boolean value) {
    __isset_bit_vector.set(__NIMBUS_UPTIME_SECS_ISSET_ID, value);
  }

  public int getTopologiesSize() {
    return (this.topologies == null) ? 0 : this.topologies.size();
  }

  public java.util.Iterator<TopologySummary> getTopologiesIterator() {
    return (this.topologies == null) ? null : this.topologies.iterator();
  }

  public void addToTopologies(TopologySummary elem) {
    if (this.topologies == null) {
      this.topologies = new ArrayList<TopologySummary>();
    }
    this.topologies.add(elem);
  }

  public List<TopologySummary> getTopologies() {
    return this.topologies;
  }

  public ClusterSummary setTopologies(List<TopologySummary> topologies) {
    this.topologies = topologies;
    return this;
  }

  public void unsetTopologies() {
    this.topologies = null;
  }

  /** Returns true if field topologies is set (has been assigned a value) and false otherwise */
  public boolean isSetTopologies() {
    return this.topologies != null;
  }

  public void setTopologiesIsSet(boolean value) {
    if (!value) {
      this.topologies = null;
    }
  }

  public int getNimbusesSize() {
    return (this.nimbuses == null) ? 0 : this.nimbuses.size();
  }

  public java.util.Iterator<NimbusSummary> getNimbusesIterator() {
    return (this.nimbuses == null) ? null : this.nimbuses.iterator();
  }

  public void addToNimbuses(NimbusSummary elem) {
    if (this.nimbuses == null) {
      this.nimbuses = new ArrayList<NimbusSummary>();
    }
    this.nimbuses.add(elem);
  }

  public List<NimbusSummary> getNimbuses() {
    return this.nimbuses;
  }

  public ClusterSummary setNimbuses(List<NimbusSummary> nimbuses) {
    this.nimbuses = nimbuses;
    return this;
  }

  public void unsetNimbuses() {
    this.nimbuses = null;
  }

  /** Returns true if field nimbuses is set (has been assigned a value) and false otherwise */
  public boolean isSetNimbuses() {
    return this.nimbuses != null;
  }

  public void setNimbusesIsSet(boolean value) {
    if (!value) {
      this.nimbuses = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUPERVISORS:
      if (value == null) {
        unsetSupervisors();
      } else {
        setSupervisors((List<SupervisorSummary>)value);
      }
      break;

    case NIMBUS_UPTIME_SECS:
      if (value == null) {
        unsetNimbus_uptime_secs();
      } else {
        setNimbus_uptime_secs((Integer)value);
      }
      break;

    case TOPOLOGIES:
      if (value == null) {
        unsetTopologies();
      } else {
        setTopologies((List<TopologySummary>)value);
      }
      break;

    case NIMBUSES:
      if (value == null) {
        unsetNimbuses();
      } else {
        setNimbuses((List<NimbusSummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUPERVISORS:
      return getSupervisors();

    case NIMBUS_UPTIME_SECS:
      return Integer.valueOf(getNimbus_uptime_secs());

    case TOPOLOGIES:
      return getTopologies();

    case NIMBUSES:
      return getNimbuses();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUPERVISORS:
      return isSetSupervisors();
    case NIMBUS_UPTIME_SECS:
      return isSetNimbus_uptime_secs();
    case TOPOLOGIES:
      return isSetTopologies();
    case NIMBUSES:
      return isSetNimbuses();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClusterSummary)
      return this.equals((ClusterSummary)that);
    return false;
  }

  public boolean equals(ClusterSummary that) {
    if (that == null)
      return false;

    boolean this_present_supervisors = true && this.isSetSupervisors();
    boolean that_present_supervisors = true && that.isSetSupervisors();
    if (this_present_supervisors || that_present_supervisors) {
      if (!(this_present_supervisors && that_present_supervisors))
        return false;
      if (!this.supervisors.equals(that.supervisors))
        return false;
    }

    boolean this_present_nimbus_uptime_secs = true && this.isSetNimbus_uptime_secs();
    boolean that_present_nimbus_uptime_secs = true && that.isSetNimbus_uptime_secs();
    if (this_present_nimbus_uptime_secs || that_present_nimbus_uptime_secs) {
      if (!(this_present_nimbus_uptime_secs && that_present_nimbus_uptime_secs))
        return false;
      if (this.nimbus_uptime_secs != that.nimbus_uptime_secs)
        return false;
    }

    boolean this_present_topologies = true && this.isSetTopologies();
    boolean that_present_topologies = true && that.isSetTopologies();
    if (this_present_topologies || that_present_topologies) {
      if (!(this_present_topologies && that_present_topologies))
        return false;
      if (!this.topologies.equals(that.topologies))
        return false;
    }

    boolean this_present_nimbuses = true && this.isSetNimbuses();
    boolean that_present_nimbuses = true && that.isSetNimbuses();
    if (this_present_nimbuses || that_present_nimbuses) {
      if (!(this_present_nimbuses && that_present_nimbuses))
        return false;
      if (!this.nimbuses.equals(that.nimbuses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ClusterSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClusterSummary typedOther = (ClusterSummary)other;

    lastComparison = Boolean.valueOf(isSetSupervisors()).compareTo(typedOther.isSetSupervisors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSupervisors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisors, typedOther.supervisors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNimbus_uptime_secs()).compareTo(typedOther.isSetNimbus_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNimbus_uptime_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nimbus_uptime_secs, typedOther.nimbus_uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopologies()).compareTo(typedOther.isSetTopologies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopologies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topologies, typedOther.topologies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNimbuses()).compareTo(typedOther.isSetNimbuses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNimbuses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nimbuses, typedOther.nimbuses);
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
    StringBuilder sb = new StringBuilder("ClusterSummary(");
    boolean first = true;

    sb.append("supervisors:");
    if (this.supervisors == null) {
      sb.append("null");
    } else {
      sb.append(this.supervisors);
    }
    first = false;
    if (isSetNimbus_uptime_secs()) {
      if (!first) sb.append(", ");
      sb.append("nimbus_uptime_secs:");
      sb.append(this.nimbus_uptime_secs);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("topologies:");
    if (this.topologies == null) {
      sb.append("null");
    } else {
      sb.append(this.topologies);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nimbuses:");
    if (this.nimbuses == null) {
      sb.append("null");
    } else {
      sb.append(this.nimbuses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (supervisors == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'supervisors' was not present! Struct: " + toString());
    }
    if (topologies == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topologies' was not present! Struct: " + toString());
    }
    if (nimbuses == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nimbuses' was not present! Struct: " + toString());
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

  private static class ClusterSummaryStandardSchemeFactory implements SchemeFactory {
    public ClusterSummaryStandardScheme getScheme() {
      return new ClusterSummaryStandardScheme();
    }
  }

  private static class ClusterSummaryStandardScheme extends StandardScheme<ClusterSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClusterSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUPERVISORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list108 = iprot.readListBegin();
                struct.supervisors = new ArrayList<SupervisorSummary>(_list108.size);
                for (int _i109 = 0; _i109 < _list108.size; ++_i109)
                {
                  SupervisorSummary _elem110; // required
                  _elem110 = new SupervisorSummary();
                  _elem110.read(iprot);
                  struct.supervisors.add(_elem110);
                }
                iprot.readListEnd();
              }
              struct.setSupervisorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NIMBUS_UPTIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nimbus_uptime_secs = iprot.readI32();
              struct.setNimbus_uptime_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOPOLOGIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list111 = iprot.readListBegin();
                struct.topologies = new ArrayList<TopologySummary>(_list111.size);
                for (int _i112 = 0; _i112 < _list111.size; ++_i112)
                {
                  TopologySummary _elem113; // required
                  _elem113 = new TopologySummary();
                  _elem113.read(iprot);
                  struct.topologies.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setTopologiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NIMBUSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list114 = iprot.readListBegin();
                struct.nimbuses = new ArrayList<NimbusSummary>(_list114.size);
                for (int _i115 = 0; _i115 < _list114.size; ++_i115)
                {
                  NimbusSummary _elem116; // required
                  _elem116 = new NimbusSummary();
                  _elem116.read(iprot);
                  struct.nimbuses.add(_elem116);
                }
                iprot.readListEnd();
              }
              struct.setNimbusesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClusterSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.supervisors != null) {
        oprot.writeFieldBegin(SUPERVISORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.supervisors.size()));
          for (SupervisorSummary _iter117 : struct.supervisors)
          {
            _iter117.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetNimbus_uptime_secs()) {
        oprot.writeFieldBegin(NIMBUS_UPTIME_SECS_FIELD_DESC);
        oprot.writeI32(struct.nimbus_uptime_secs);
        oprot.writeFieldEnd();
      }
      if (struct.topologies != null) {
        oprot.writeFieldBegin(TOPOLOGIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.topologies.size()));
          for (TopologySummary _iter118 : struct.topologies)
          {
            _iter118.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.nimbuses != null) {
        oprot.writeFieldBegin(NIMBUSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nimbuses.size()));
          for (NimbusSummary _iter119 : struct.nimbuses)
          {
            _iter119.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterSummaryTupleSchemeFactory implements SchemeFactory {
    public ClusterSummaryTupleScheme getScheme() {
      return new ClusterSummaryTupleScheme();
    }
  }

  private static class ClusterSummaryTupleScheme extends TupleScheme<ClusterSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClusterSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.supervisors.size());
        for (SupervisorSummary _iter120 : struct.supervisors)
        {
          _iter120.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.topologies.size());
        for (TopologySummary _iter121 : struct.topologies)
        {
          _iter121.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.nimbuses.size());
        for (NimbusSummary _iter122 : struct.nimbuses)
        {
          _iter122.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetNimbus_uptime_secs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNimbus_uptime_secs()) {
        oprot.writeI32(struct.nimbus_uptime_secs);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClusterSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list123 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.supervisors = new ArrayList<SupervisorSummary>(_list123.size);
        for (int _i124 = 0; _i124 < _list123.size; ++_i124)
        {
          SupervisorSummary _elem125; // required
          _elem125 = new SupervisorSummary();
          _elem125.read(iprot);
          struct.supervisors.add(_elem125);
        }
      }
      struct.setSupervisorsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list126 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.topologies = new ArrayList<TopologySummary>(_list126.size);
        for (int _i127 = 0; _i127 < _list126.size; ++_i127)
        {
          TopologySummary _elem128; // required
          _elem128 = new TopologySummary();
          _elem128.read(iprot);
          struct.topologies.add(_elem128);
        }
      }
      struct.setTopologiesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list129 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.nimbuses = new ArrayList<NimbusSummary>(_list129.size);
        for (int _i130 = 0; _i130 < _list129.size; ++_i130)
        {
          NimbusSummary _elem131; // required
          _elem131 = new NimbusSummary();
          _elem131.read(iprot);
          struct.nimbuses.add(_elem131);
        }
      }
      struct.setNimbusesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.nimbus_uptime_secs = iprot.readI32();
        struct.setNimbus_uptime_secsIsSet(true);
      }
    }
  }

}
