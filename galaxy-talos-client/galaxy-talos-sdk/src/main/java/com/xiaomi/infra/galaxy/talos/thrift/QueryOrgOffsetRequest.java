/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-12-23")
public class QueryOrgOffsetRequest implements libthrift091.TBase<QueryOrgOffsetRequest, QueryOrgOffsetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<QueryOrgOffsetRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryOrgOffsetRequest");

  private static final libthrift091.protocol.TField CONSUMER_GROUP_PREFIX_FIELD_DESC = new libthrift091.protocol.TField("consumerGroupPrefix", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField ORG_ID_FIELD_DESC = new libthrift091.protocol.TField("orgId", libthrift091.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryOrgOffsetRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryOrgOffsetRequestTupleSchemeFactory());
  }

  /**
   * ConsumerGroupPrefix
   * 
   */
  public String consumerGroupPrefix; // required
  /**
   * OrgId
   * 
   */
  public String orgId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * ConsumerGroupPrefix
     * 
     */
    CONSUMER_GROUP_PREFIX((short)1, "consumerGroupPrefix"),
    /**
     * OrgId
     * 
     */
    ORG_ID((short)2, "orgId");

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
        case 1: // CONSUMER_GROUP_PREFIX
          return CONSUMER_GROUP_PREFIX;
        case 2: // ORG_ID
          return ORG_ID;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONSUMER_GROUP_PREFIX, new libthrift091.meta_data.FieldMetaData("consumerGroupPrefix", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORG_ID, new libthrift091.meta_data.FieldMetaData("orgId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryOrgOffsetRequest.class, metaDataMap);
  }

  public QueryOrgOffsetRequest() {
  }

  public QueryOrgOffsetRequest(
    String consumerGroupPrefix,
    String orgId)
  {
    this();
    this.consumerGroupPrefix = consumerGroupPrefix;
    this.orgId = orgId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryOrgOffsetRequest(QueryOrgOffsetRequest other) {
    if (other.isSetConsumerGroupPrefix()) {
      this.consumerGroupPrefix = other.consumerGroupPrefix;
    }
    if (other.isSetOrgId()) {
      this.orgId = other.orgId;
    }
  }

  public QueryOrgOffsetRequest deepCopy() {
    return new QueryOrgOffsetRequest(this);
  }

  @Override
  public void clear() {
    this.consumerGroupPrefix = null;
    this.orgId = null;
  }

  /**
   * ConsumerGroupPrefix
   * 
   */
  public String getConsumerGroupPrefix() {
    return this.consumerGroupPrefix;
  }

  /**
   * ConsumerGroupPrefix
   * 
   */
  public QueryOrgOffsetRequest setConsumerGroupPrefix(String consumerGroupPrefix) {
    this.consumerGroupPrefix = consumerGroupPrefix;
    return this;
  }

  public void unsetConsumerGroupPrefix() {
    this.consumerGroupPrefix = null;
  }

  /** Returns true if field consumerGroupPrefix is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumerGroupPrefix() {
    return this.consumerGroupPrefix != null;
  }

  public void setConsumerGroupPrefixIsSet(boolean value) {
    if (!value) {
      this.consumerGroupPrefix = null;
    }
  }

  /**
   * OrgId
   * 
   */
  public String getOrgId() {
    return this.orgId;
  }

  /**
   * OrgId
   * 
   */
  public QueryOrgOffsetRequest setOrgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  public void unsetOrgId() {
    this.orgId = null;
  }

  /** Returns true if field orgId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgId() {
    return this.orgId != null;
  }

  public void setOrgIdIsSet(boolean value) {
    if (!value) {
      this.orgId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONSUMER_GROUP_PREFIX:
      if (value == null) {
        unsetConsumerGroupPrefix();
      } else {
        setConsumerGroupPrefix((String)value);
      }
      break;

    case ORG_ID:
      if (value == null) {
        unsetOrgId();
      } else {
        setOrgId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONSUMER_GROUP_PREFIX:
      return getConsumerGroupPrefix();

    case ORG_ID:
      return getOrgId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONSUMER_GROUP_PREFIX:
      return isSetConsumerGroupPrefix();
    case ORG_ID:
      return isSetOrgId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryOrgOffsetRequest)
      return this.equals((QueryOrgOffsetRequest)that);
    return false;
  }

  public boolean equals(QueryOrgOffsetRequest that) {
    if (that == null)
      return false;

    boolean this_present_consumerGroupPrefix = true && this.isSetConsumerGroupPrefix();
    boolean that_present_consumerGroupPrefix = true && that.isSetConsumerGroupPrefix();
    if (this_present_consumerGroupPrefix || that_present_consumerGroupPrefix) {
      if (!(this_present_consumerGroupPrefix && that_present_consumerGroupPrefix))
        return false;
      if (!this.consumerGroupPrefix.equals(that.consumerGroupPrefix))
        return false;
    }

    boolean this_present_orgId = true && this.isSetOrgId();
    boolean that_present_orgId = true && that.isSetOrgId();
    if (this_present_orgId || that_present_orgId) {
      if (!(this_present_orgId && that_present_orgId))
        return false;
      if (!this.orgId.equals(that.orgId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_consumerGroupPrefix = true && (isSetConsumerGroupPrefix());
    list.add(present_consumerGroupPrefix);
    if (present_consumerGroupPrefix)
      list.add(consumerGroupPrefix);

    boolean present_orgId = true && (isSetOrgId());
    list.add(present_orgId);
    if (present_orgId)
      list.add(orgId);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryOrgOffsetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConsumerGroupPrefix()).compareTo(other.isSetConsumerGroupPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumerGroupPrefix()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumerGroupPrefix, other.consumerGroupPrefix);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrgId()).compareTo(other.isSetOrgId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.orgId, other.orgId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueryOrgOffsetRequest(");
    boolean first = true;

    sb.append("consumerGroupPrefix:");
    if (this.consumerGroupPrefix == null) {
      sb.append("null");
    } else {
      sb.append(this.consumerGroupPrefix);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orgId:");
    if (this.orgId == null) {
      sb.append("null");
    } else {
      sb.append(this.orgId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (consumerGroupPrefix == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'consumerGroupPrefix' was not present! Struct: " + toString());
    }
    if (orgId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'orgId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryOrgOffsetRequestStandardSchemeFactory implements SchemeFactory {
    public QueryOrgOffsetRequestStandardScheme getScheme() {
      return new QueryOrgOffsetRequestStandardScheme();
    }
  }

  private static class QueryOrgOffsetRequestStandardScheme extends StandardScheme<QueryOrgOffsetRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryOrgOffsetRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONSUMER_GROUP_PREFIX
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.consumerGroupPrefix = iprot.readString();
              struct.setConsumerGroupPrefixIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORG_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.orgId = iprot.readString();
              struct.setOrgIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, QueryOrgOffsetRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.consumerGroupPrefix != null) {
        oprot.writeFieldBegin(CONSUMER_GROUP_PREFIX_FIELD_DESC);
        oprot.writeString(struct.consumerGroupPrefix);
        oprot.writeFieldEnd();
      }
      if (struct.orgId != null) {
        oprot.writeFieldBegin(ORG_ID_FIELD_DESC);
        oprot.writeString(struct.orgId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryOrgOffsetRequestTupleSchemeFactory implements SchemeFactory {
    public QueryOrgOffsetRequestTupleScheme getScheme() {
      return new QueryOrgOffsetRequestTupleScheme();
    }
  }

  private static class QueryOrgOffsetRequestTupleScheme extends TupleScheme<QueryOrgOffsetRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryOrgOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.consumerGroupPrefix);
      oprot.writeString(struct.orgId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryOrgOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.consumerGroupPrefix = iprot.readString();
      struct.setConsumerGroupPrefixIsSet(true);
      struct.orgId = iprot.readString();
      struct.setOrgIdIsSet(true);
    }
  }

}

