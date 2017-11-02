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

public class HBRecords implements org.apache.thrift.TBase<HBRecords, HBRecords._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HBRecords");

  private static final org.apache.thrift.protocol.TField PULSES_FIELD_DESC = new org.apache.thrift.protocol.TField("pulses", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HBRecordsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HBRecordsTupleSchemeFactory());
  }

  public List<HBPulse> pulses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PULSES((short)1, "pulses");

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
        case 1: // PULSES
          return PULSES;
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
    tmpMap.put(_Fields.PULSES, new org.apache.thrift.meta_data.FieldMetaData("pulses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HBPulse.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HBRecords.class, metaDataMap);
  }

  public HBRecords() {
  }

  public HBRecords(
    List<HBPulse> pulses)
  {
    this();
    this.pulses = pulses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HBRecords(HBRecords other) {
    if (other.isSetPulses()) {
      List<HBPulse> __this__pulses = new ArrayList<HBPulse>();
      for (HBPulse other_element : other.pulses) {
        __this__pulses.add(new HBPulse(other_element));
      }
      this.pulses = __this__pulses;
    }
  }

  public HBRecords deepCopy() {
    return new HBRecords(this);
  }

  @Override
  public void clear() {
    this.pulses = null;
  }

  public int getPulsesSize() {
    return (this.pulses == null) ? 0 : this.pulses.size();
  }

  public java.util.Iterator<HBPulse> getPulsesIterator() {
    return (this.pulses == null) ? null : this.pulses.iterator();
  }

  public void addToPulses(HBPulse elem) {
    if (this.pulses == null) {
      this.pulses = new ArrayList<HBPulse>();
    }
    this.pulses.add(elem);
  }

  public List<HBPulse> getPulses() {
    return this.pulses;
  }

  public HBRecords setPulses(List<HBPulse> pulses) {
    this.pulses = pulses;
    return this;
  }

  public void unsetPulses() {
    this.pulses = null;
  }

  /** Returns true if field pulses is set (has been assigned a value) and false otherwise */
  public boolean isSetPulses() {
    return this.pulses != null;
  }

  public void setPulsesIsSet(boolean value) {
    if (!value) {
      this.pulses = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PULSES:
      if (value == null) {
        unsetPulses();
      } else {
        setPulses((List<HBPulse>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PULSES:
      return getPulses();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PULSES:
      return isSetPulses();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HBRecords)
      return this.equals((HBRecords)that);
    return false;
  }

  public boolean equals(HBRecords that) {
    if (that == null)
      return false;

    boolean this_present_pulses = true && this.isSetPulses();
    boolean that_present_pulses = true && that.isSetPulses();
    if (this_present_pulses || that_present_pulses) {
      if (!(this_present_pulses && that_present_pulses))
        return false;
      if (!this.pulses.equals(that.pulses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(HBRecords other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HBRecords typedOther = (HBRecords)other;

    lastComparison = Boolean.valueOf(isSetPulses()).compareTo(typedOther.isSetPulses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPulses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pulses, typedOther.pulses);
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
    StringBuilder sb = new StringBuilder("HBRecords(");
    boolean first = true;

    sb.append("pulses:");
    if (this.pulses == null) {
      sb.append("null");
    } else {
      sb.append(this.pulses);
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

  private static class HBRecordsStandardSchemeFactory implements SchemeFactory {
    public HBRecordsStandardScheme getScheme() {
      return new HBRecordsStandardScheme();
    }
  }

  private static class HBRecordsStandardScheme extends StandardScheme<HBRecords> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HBRecords struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PULSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list792 = iprot.readListBegin();
                struct.pulses = new ArrayList<HBPulse>(_list792.size);
                for (int _i793 = 0; _i793 < _list792.size; ++_i793)
                {
                  HBPulse _elem794; // required
                  _elem794 = new HBPulse();
                  _elem794.read(iprot);
                  struct.pulses.add(_elem794);
                }
                iprot.readListEnd();
              }
              struct.setPulsesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HBRecords struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pulses != null) {
        oprot.writeFieldBegin(PULSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.pulses.size()));
          for (HBPulse _iter795 : struct.pulses)
          {
            _iter795.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HBRecordsTupleSchemeFactory implements SchemeFactory {
    public HBRecordsTupleScheme getScheme() {
      return new HBRecordsTupleScheme();
    }
  }

  private static class HBRecordsTupleScheme extends TupleScheme<HBRecords> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HBRecords struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPulses()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPulses()) {
        {
          oprot.writeI32(struct.pulses.size());
          for (HBPulse _iter796 : struct.pulses)
          {
            _iter796.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HBRecords struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list797 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.pulses = new ArrayList<HBPulse>(_list797.size);
          for (int _i798 = 0; _i798 < _list797.size; ++_i798)
          {
            HBPulse _elem799; // required
            _elem799 = new HBPulse();
            _elem799.read(iprot);
            struct.pulses.add(_elem799);
          }
        }
        struct.setPulsesIsSet(true);
      }
    }
  }

}
