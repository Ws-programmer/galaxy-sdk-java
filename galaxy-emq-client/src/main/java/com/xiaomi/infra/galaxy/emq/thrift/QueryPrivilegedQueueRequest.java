/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-13")
public class QueryPrivilegedQueueRequest implements libthrift091.TBase<QueryPrivilegedQueueRequest, QueryPrivilegedQueueRequest._Fields>, java.io.Serializable, Cloneable, Comparable<QueryPrivilegedQueueRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryPrivilegedQueueRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_PREFIX_FIELD_DESC = new libthrift091.protocol.TField("queueNamePrefix", libthrift091.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryPrivilegedQueueRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryPrivilegedQueueRequestTupleSchemeFactory());
  }

  /**
   * The queue name prefix;
   * 
   */
  public String queueNamePrefix; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The queue name prefix;
     * 
     */
    QUEUE_NAME_PREFIX((short)1, "queueNamePrefix");

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
        case 1: // QUEUE_NAME_PREFIX
          return QUEUE_NAME_PREFIX;
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
  private static final _Fields optionals[] = {_Fields.QUEUE_NAME_PREFIX};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME_PREFIX, new libthrift091.meta_data.FieldMetaData("queueNamePrefix", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryPrivilegedQueueRequest.class, metaDataMap);
  }

  public QueryPrivilegedQueueRequest() {
    this.queueNamePrefix = "";

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryPrivilegedQueueRequest(QueryPrivilegedQueueRequest other) {
    if (other.isSetQueueNamePrefix()) {
      this.queueNamePrefix = other.queueNamePrefix;
    }
  }

  public QueryPrivilegedQueueRequest deepCopy() {
    return new QueryPrivilegedQueueRequest(this);
  }

  @Override
  public void clear() {
    this.queueNamePrefix = "";

  }

  /**
   * The queue name prefix;
   * 
   */
  public String getQueueNamePrefix() {
    return this.queueNamePrefix;
  }

  /**
   * The queue name prefix;
   * 
   */
  public QueryPrivilegedQueueRequest setQueueNamePrefix(String queueNamePrefix) {
    this.queueNamePrefix = queueNamePrefix;
    return this;
  }

  public void unsetQueueNamePrefix() {
    this.queueNamePrefix = null;
  }

  /** Returns true if field queueNamePrefix is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueNamePrefix() {
    return this.queueNamePrefix != null;
  }

  public void setQueueNamePrefixIsSet(boolean value) {
    if (!value) {
      this.queueNamePrefix = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME_PREFIX:
      if (value == null) {
        unsetQueueNamePrefix();
      } else {
        setQueueNamePrefix((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME_PREFIX:
      return getQueueNamePrefix();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME_PREFIX:
      return isSetQueueNamePrefix();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryPrivilegedQueueRequest)
      return this.equals((QueryPrivilegedQueueRequest)that);
    return false;
  }

  public boolean equals(QueryPrivilegedQueueRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueNamePrefix = true && this.isSetQueueNamePrefix();
    boolean that_present_queueNamePrefix = true && that.isSetQueueNamePrefix();
    if (this_present_queueNamePrefix || that_present_queueNamePrefix) {
      if (!(this_present_queueNamePrefix && that_present_queueNamePrefix))
        return false;
      if (!this.queueNamePrefix.equals(that.queueNamePrefix))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueNamePrefix = true && (isSetQueueNamePrefix());
    list.add(present_queueNamePrefix);
    if (present_queueNamePrefix)
      list.add(queueNamePrefix);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryPrivilegedQueueRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueNamePrefix()).compareTo(other.isSetQueueNamePrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueNamePrefix()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueNamePrefix, other.queueNamePrefix);
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
    StringBuilder sb = new StringBuilder("QueryPrivilegedQueueRequest(");
    boolean first = true;

    if (isSetQueueNamePrefix()) {
      sb.append("queueNamePrefix:");
      if (this.queueNamePrefix == null) {
        sb.append("null");
      } else {
        sb.append(this.queueNamePrefix);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class QueryPrivilegedQueueRequestStandardSchemeFactory implements SchemeFactory {
    public QueryPrivilegedQueueRequestStandardScheme getScheme() {
      return new QueryPrivilegedQueueRequestStandardScheme();
    }
  }

  private static class QueryPrivilegedQueueRequestStandardScheme extends StandardScheme<QueryPrivilegedQueueRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryPrivilegedQueueRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME_PREFIX
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueNamePrefix = iprot.readString();
              struct.setQueueNamePrefixIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueryPrivilegedQueueRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueNamePrefix != null) {
        if (struct.isSetQueueNamePrefix()) {
          oprot.writeFieldBegin(QUEUE_NAME_PREFIX_FIELD_DESC);
          oprot.writeString(struct.queueNamePrefix);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryPrivilegedQueueRequestTupleSchemeFactory implements SchemeFactory {
    public QueryPrivilegedQueueRequestTupleScheme getScheme() {
      return new QueryPrivilegedQueueRequestTupleScheme();
    }
  }

  private static class QueryPrivilegedQueueRequestTupleScheme extends TupleScheme<QueryPrivilegedQueueRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryPrivilegedQueueRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQueueNamePrefix()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetQueueNamePrefix()) {
        oprot.writeString(struct.queueNamePrefix);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryPrivilegedQueueRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.queueNamePrefix = iprot.readString();
        struct.setQueueNamePrefixIsSet(true);
      }
    }
  }

}

