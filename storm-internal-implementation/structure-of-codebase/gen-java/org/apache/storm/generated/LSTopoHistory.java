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

public class LSTopoHistory implements org.apache.thrift.TBase<LSTopoHistory, LSTopoHistory._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LSTopoHistory");

  private static final org.apache.thrift.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("topology_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIME_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("time_stamp", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("users", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField GROUPS_FIELD_DESC = new org.apache.thrift.protocol.TField("groups", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LSTopoHistoryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LSTopoHistoryTupleSchemeFactory());
  }

  public String topology_id; // required
  public long time_stamp; // required
  public List<String> users; // required
  public List<String> groups; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPOLOGY_ID((short)1, "topology_id"),
    TIME_STAMP((short)2, "time_stamp"),
    USERS((short)3, "users"),
    GROUPS((short)4, "groups");

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
        case 1: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 2: // TIME_STAMP
          return TIME_STAMP;
        case 3: // USERS
          return USERS;
        case 4: // GROUPS
          return GROUPS;
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
  private static final int __TIME_STAMP_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.thrift.meta_data.FieldMetaData("topology_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_STAMP, new org.apache.thrift.meta_data.FieldMetaData("time_stamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USERS, new org.apache.thrift.meta_data.FieldMetaData("users", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.GROUPS, new org.apache.thrift.meta_data.FieldMetaData("groups", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LSTopoHistory.class, metaDataMap);
  }

  public LSTopoHistory() {
  }

  public LSTopoHistory(
    String topology_id,
    long time_stamp,
    List<String> users,
    List<String> groups)
  {
    this();
    this.topology_id = topology_id;
    this.time_stamp = time_stamp;
    setTime_stampIsSet(true);
    this.users = users;
    this.groups = groups;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LSTopoHistory(LSTopoHistory other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTopology_id()) {
      this.topology_id = other.topology_id;
    }
    this.time_stamp = other.time_stamp;
    if (other.isSetUsers()) {
      List<String> __this__users = new ArrayList<String>();
      for (String other_element : other.users) {
        __this__users.add(other_element);
      }
      this.users = __this__users;
    }
    if (other.isSetGroups()) {
      List<String> __this__groups = new ArrayList<String>();
      for (String other_element : other.groups) {
        __this__groups.add(other_element);
      }
      this.groups = __this__groups;
    }
  }

  public LSTopoHistory deepCopy() {
    return new LSTopoHistory(this);
  }

  @Override
  public void clear() {
    this.topology_id = null;
    setTime_stampIsSet(false);
    this.time_stamp = 0;
    this.users = null;
    this.groups = null;
  }

  public String getTopology_id() {
    return this.topology_id;
  }

  public LSTopoHistory setTopology_id(String topology_id) {
    this.topology_id = topology_id;
    return this;
  }

  public void unsetTopology_id() {
    this.topology_id = null;
  }

  /** Returns true if field topology_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTopology_id() {
    return this.topology_id != null;
  }

  public void setTopology_idIsSet(boolean value) {
    if (!value) {
      this.topology_id = null;
    }
  }

  public long getTime_stamp() {
    return this.time_stamp;
  }

  public LSTopoHistory setTime_stamp(long time_stamp) {
    this.time_stamp = time_stamp;
    setTime_stampIsSet(true);
    return this;
  }

  public void unsetTime_stamp() {
    __isset_bit_vector.clear(__TIME_STAMP_ISSET_ID);
  }

  /** Returns true if field time_stamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTime_stamp() {
    return __isset_bit_vector.get(__TIME_STAMP_ISSET_ID);
  }

  public void setTime_stampIsSet(boolean value) {
    __isset_bit_vector.set(__TIME_STAMP_ISSET_ID, value);
  }

  public int getUsersSize() {
    return (this.users == null) ? 0 : this.users.size();
  }

  public java.util.Iterator<String> getUsersIterator() {
    return (this.users == null) ? null : this.users.iterator();
  }

  public void addToUsers(String elem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(elem);
  }

  public List<String> getUsers() {
    return this.users;
  }

  public LSTopoHistory setUsers(List<String> users) {
    this.users = users;
    return this;
  }

  public void unsetUsers() {
    this.users = null;
  }

  /** Returns true if field users is set (has been assigned a value) and false otherwise */
  public boolean isSetUsers() {
    return this.users != null;
  }

  public void setUsersIsSet(boolean value) {
    if (!value) {
      this.users = null;
    }
  }

  public int getGroupsSize() {
    return (this.groups == null) ? 0 : this.groups.size();
  }

  public java.util.Iterator<String> getGroupsIterator() {
    return (this.groups == null) ? null : this.groups.iterator();
  }

  public void addToGroups(String elem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(elem);
  }

  public List<String> getGroups() {
    return this.groups;
  }

  public LSTopoHistory setGroups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public void unsetGroups() {
    this.groups = null;
  }

  /** Returns true if field groups is set (has been assigned a value) and false otherwise */
  public boolean isSetGroups() {
    return this.groups != null;
  }

  public void setGroupsIsSet(boolean value) {
    if (!value) {
      this.groups = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY_ID:
      if (value == null) {
        unsetTopology_id();
      } else {
        setTopology_id((String)value);
      }
      break;

    case TIME_STAMP:
      if (value == null) {
        unsetTime_stamp();
      } else {
        setTime_stamp((Long)value);
      }
      break;

    case USERS:
      if (value == null) {
        unsetUsers();
      } else {
        setUsers((List<String>)value);
      }
      break;

    case GROUPS:
      if (value == null) {
        unsetGroups();
      } else {
        setGroups((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_ID:
      return getTopology_id();

    case TIME_STAMP:
      return Long.valueOf(getTime_stamp());

    case USERS:
      return getUsers();

    case GROUPS:
      return getGroups();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY_ID:
      return isSetTopology_id();
    case TIME_STAMP:
      return isSetTime_stamp();
    case USERS:
      return isSetUsers();
    case GROUPS:
      return isSetGroups();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LSTopoHistory)
      return this.equals((LSTopoHistory)that);
    return false;
  }

  public boolean equals(LSTopoHistory that) {
    if (that == null)
      return false;

    boolean this_present_topology_id = true && this.isSetTopology_id();
    boolean that_present_topology_id = true && that.isSetTopology_id();
    if (this_present_topology_id || that_present_topology_id) {
      if (!(this_present_topology_id && that_present_topology_id))
        return false;
      if (!this.topology_id.equals(that.topology_id))
        return false;
    }

    boolean this_present_time_stamp = true;
    boolean that_present_time_stamp = true;
    if (this_present_time_stamp || that_present_time_stamp) {
      if (!(this_present_time_stamp && that_present_time_stamp))
        return false;
      if (this.time_stamp != that.time_stamp)
        return false;
    }

    boolean this_present_users = true && this.isSetUsers();
    boolean that_present_users = true && that.isSetUsers();
    if (this_present_users || that_present_users) {
      if (!(this_present_users && that_present_users))
        return false;
      if (!this.users.equals(that.users))
        return false;
    }

    boolean this_present_groups = true && this.isSetGroups();
    boolean that_present_groups = true && that.isSetGroups();
    if (this_present_groups || that_present_groups) {
      if (!(this_present_groups && that_present_groups))
        return false;
      if (!this.groups.equals(that.groups))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LSTopoHistory other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LSTopoHistory typedOther = (LSTopoHistory)other;

    lastComparison = Boolean.valueOf(isSetTopology_id()).compareTo(typedOther.isSetTopology_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopology_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topology_id, typedOther.topology_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime_stamp()).compareTo(typedOther.isSetTime_stamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime_stamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_stamp, typedOther.time_stamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsers()).compareTo(typedOther.isSetUsers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.users, typedOther.users);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroups()).compareTo(typedOther.isSetGroups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroups()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groups, typedOther.groups);
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
    StringBuilder sb = new StringBuilder("LSTopoHistory(");
    boolean first = true;

    sb.append("topology_id:");
    if (this.topology_id == null) {
      sb.append("null");
    } else {
      sb.append(this.topology_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time_stamp:");
    sb.append(this.time_stamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("users:");
    if (this.users == null) {
      sb.append("null");
    } else {
      sb.append(this.users);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groups:");
    if (this.groups == null) {
      sb.append("null");
    } else {
      sb.append(this.groups);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (topology_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topology_id' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'time_stamp' because it's a primitive and you chose the non-beans generator.
    if (users == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'users' was not present! Struct: " + toString());
    }
    if (groups == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'groups' was not present! Struct: " + toString());
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

  private static class LSTopoHistoryStandardSchemeFactory implements SchemeFactory {
    public LSTopoHistoryStandardScheme getScheme() {
      return new LSTopoHistoryStandardScheme();
    }
  }

  private static class LSTopoHistoryStandardScheme extends StandardScheme<LSTopoHistory> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LSTopoHistory struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topology_id = iprot.readString();
              struct.setTopology_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIME_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time_stamp = iprot.readI64();
              struct.setTime_stampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list750 = iprot.readListBegin();
                struct.users = new ArrayList<String>(_list750.size);
                for (int _i751 = 0; _i751 < _list750.size; ++_i751)
                {
                  String _elem752; // required
                  _elem752 = iprot.readString();
                  struct.users.add(_elem752);
                }
                iprot.readListEnd();
              }
              struct.setUsersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GROUPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list753 = iprot.readListBegin();
                struct.groups = new ArrayList<String>(_list753.size);
                for (int _i754 = 0; _i754 < _list753.size; ++_i754)
                {
                  String _elem755; // required
                  _elem755 = iprot.readString();
                  struct.groups.add(_elem755);
                }
                iprot.readListEnd();
              }
              struct.setGroupsIsSet(true);
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
      if (!struct.isSetTime_stamp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_stamp' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LSTopoHistory struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topology_id != null) {
        oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
        oprot.writeString(struct.topology_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_STAMP_FIELD_DESC);
      oprot.writeI64(struct.time_stamp);
      oprot.writeFieldEnd();
      if (struct.users != null) {
        oprot.writeFieldBegin(USERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.users.size()));
          for (String _iter756 : struct.users)
          {
            oprot.writeString(_iter756);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.groups != null) {
        oprot.writeFieldBegin(GROUPS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.groups.size()));
          for (String _iter757 : struct.groups)
          {
            oprot.writeString(_iter757);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LSTopoHistoryTupleSchemeFactory implements SchemeFactory {
    public LSTopoHistoryTupleScheme getScheme() {
      return new LSTopoHistoryTupleScheme();
    }
  }

  private static class LSTopoHistoryTupleScheme extends TupleScheme<LSTopoHistory> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LSTopoHistory struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topology_id);
      oprot.writeI64(struct.time_stamp);
      {
        oprot.writeI32(struct.users.size());
        for (String _iter758 : struct.users)
        {
          oprot.writeString(_iter758);
        }
      }
      {
        oprot.writeI32(struct.groups.size());
        for (String _iter759 : struct.groups)
        {
          oprot.writeString(_iter759);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LSTopoHistory struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topology_id = iprot.readString();
      struct.setTopology_idIsSet(true);
      struct.time_stamp = iprot.readI64();
      struct.setTime_stampIsSet(true);
      {
        org.apache.thrift.protocol.TList _list760 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.users = new ArrayList<String>(_list760.size);
        for (int _i761 = 0; _i761 < _list760.size; ++_i761)
        {
          String _elem762; // required
          _elem762 = iprot.readString();
          struct.users.add(_elem762);
        }
      }
      struct.setUsersIsSet(true);
      {
        org.apache.thrift.protocol.TList _list763 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.groups = new ArrayList<String>(_list763.size);
        for (int _i764 = 0; _i764 < _list763.size; ++_i764)
        {
          String _elem765; // required
          _elem765 = iprot.readString();
          struct.groups.add(_elem765);
        }
      }
      struct.setGroupsIsSet(true);
    }
  }

}

