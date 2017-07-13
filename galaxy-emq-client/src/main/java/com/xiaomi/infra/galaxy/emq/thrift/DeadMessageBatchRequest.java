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
public class DeadMessageBatchRequest implements libthrift091.TBase<DeadMessageBatchRequest, DeadMessageBatchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeadMessageBatchRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeadMessageBatchRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST_FIELD_DESC = new libthrift091.protocol.TField("deadMessageBatchRequestEntryList", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeadMessageBatchRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeadMessageBatchRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * List of DeadMessageBatchRequestEntry;
   * 
   */
  public List<DeadMessageBatchRequestEntry> deadMessageBatchRequestEntryList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * List of DeadMessageBatchRequestEntry;
     * 
     */
    DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST((short)2, "deadMessageBatchRequestEntryList");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST
          return DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST;
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
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST, new libthrift091.meta_data.FieldMetaData("deadMessageBatchRequestEntryList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, DeadMessageBatchRequestEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeadMessageBatchRequest.class, metaDataMap);
  }

  public DeadMessageBatchRequest() {
  }

  public DeadMessageBatchRequest(
    String queueName,
    List<DeadMessageBatchRequestEntry> deadMessageBatchRequestEntryList)
  {
    this();
    this.queueName = queueName;
    this.deadMessageBatchRequestEntryList = deadMessageBatchRequestEntryList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeadMessageBatchRequest(DeadMessageBatchRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetDeadMessageBatchRequestEntryList()) {
      List<DeadMessageBatchRequestEntry> __this__deadMessageBatchRequestEntryList = new ArrayList<DeadMessageBatchRequestEntry>(other.deadMessageBatchRequestEntryList.size());
      for (DeadMessageBatchRequestEntry other_element : other.deadMessageBatchRequestEntryList) {
        __this__deadMessageBatchRequestEntryList.add(new DeadMessageBatchRequestEntry(other_element));
      }
      this.deadMessageBatchRequestEntryList = __this__deadMessageBatchRequestEntryList;
    }
  }

  public DeadMessageBatchRequest deepCopy() {
    return new DeadMessageBatchRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.deadMessageBatchRequestEntryList = null;
  }

  /**
   * Queue name;
   * 
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   * 
   */
  public DeadMessageBatchRequest setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public int getDeadMessageBatchRequestEntryListSize() {
    return (this.deadMessageBatchRequestEntryList == null) ? 0 : this.deadMessageBatchRequestEntryList.size();
  }

  public java.util.Iterator<DeadMessageBatchRequestEntry> getDeadMessageBatchRequestEntryListIterator() {
    return (this.deadMessageBatchRequestEntryList == null) ? null : this.deadMessageBatchRequestEntryList.iterator();
  }

  public void addToDeadMessageBatchRequestEntryList(DeadMessageBatchRequestEntry elem) {
    if (this.deadMessageBatchRequestEntryList == null) {
      this.deadMessageBatchRequestEntryList = new ArrayList<DeadMessageBatchRequestEntry>();
    }
    this.deadMessageBatchRequestEntryList.add(elem);
  }

  /**
   * List of DeadMessageBatchRequestEntry;
   * 
   */
  public List<DeadMessageBatchRequestEntry> getDeadMessageBatchRequestEntryList() {
    return this.deadMessageBatchRequestEntryList;
  }

  /**
   * List of DeadMessageBatchRequestEntry;
   * 
   */
  public DeadMessageBatchRequest setDeadMessageBatchRequestEntryList(List<DeadMessageBatchRequestEntry> deadMessageBatchRequestEntryList) {
    this.deadMessageBatchRequestEntryList = deadMessageBatchRequestEntryList;
    return this;
  }

  public void unsetDeadMessageBatchRequestEntryList() {
    this.deadMessageBatchRequestEntryList = null;
  }

  /** Returns true if field deadMessageBatchRequestEntryList is set (has been assigned a value) and false otherwise */
  public boolean isSetDeadMessageBatchRequestEntryList() {
    return this.deadMessageBatchRequestEntryList != null;
  }

  public void setDeadMessageBatchRequestEntryListIsSet(boolean value) {
    if (!value) {
      this.deadMessageBatchRequestEntryList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      if (value == null) {
        unsetDeadMessageBatchRequestEntryList();
      } else {
        setDeadMessageBatchRequestEntryList((List<DeadMessageBatchRequestEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      return getDeadMessageBatchRequestEntryList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      return isSetDeadMessageBatchRequestEntryList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeadMessageBatchRequest)
      return this.equals((DeadMessageBatchRequest)that);
    return false;
  }

  public boolean equals(DeadMessageBatchRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_deadMessageBatchRequestEntryList = true && this.isSetDeadMessageBatchRequestEntryList();
    boolean that_present_deadMessageBatchRequestEntryList = true && that.isSetDeadMessageBatchRequestEntryList();
    if (this_present_deadMessageBatchRequestEntryList || that_present_deadMessageBatchRequestEntryList) {
      if (!(this_present_deadMessageBatchRequestEntryList && that_present_deadMessageBatchRequestEntryList))
        return false;
      if (!this.deadMessageBatchRequestEntryList.equals(that.deadMessageBatchRequestEntryList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_deadMessageBatchRequestEntryList = true && (isSetDeadMessageBatchRequestEntryList());
    list.add(present_deadMessageBatchRequestEntryList);
    if (present_deadMessageBatchRequestEntryList)
      list.add(deadMessageBatchRequestEntryList);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeadMessageBatchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeadMessageBatchRequestEntryList()).compareTo(other.isSetDeadMessageBatchRequestEntryList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeadMessageBatchRequestEntryList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.deadMessageBatchRequestEntryList, other.deadMessageBatchRequestEntryList);
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
    StringBuilder sb = new StringBuilder("DeadMessageBatchRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deadMessageBatchRequestEntryList:");
    if (this.deadMessageBatchRequestEntryList == null) {
      sb.append("null");
    } else {
      sb.append(this.deadMessageBatchRequestEntryList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (deadMessageBatchRequestEntryList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'deadMessageBatchRequestEntryList' was not present! Struct: " + toString());
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

  private static class DeadMessageBatchRequestStandardSchemeFactory implements SchemeFactory {
    public DeadMessageBatchRequestStandardScheme getScheme() {
      return new DeadMessageBatchRequestStandardScheme();
    }
  }

  private static class DeadMessageBatchRequestStandardScheme extends StandardScheme<DeadMessageBatchRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, DeadMessageBatchRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list112 = iprot.readListBegin();
                struct.deadMessageBatchRequestEntryList = new ArrayList<DeadMessageBatchRequestEntry>(_list112.size);
                DeadMessageBatchRequestEntry _elem113;
                for (int _i114 = 0; _i114 < _list112.size; ++_i114)
                {
                  _elem113 = new DeadMessageBatchRequestEntry();
                  _elem113.read(iprot);
                  struct.deadMessageBatchRequestEntryList.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setDeadMessageBatchRequestEntryListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DeadMessageBatchRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.deadMessageBatchRequestEntryList != null) {
        oprot.writeFieldBegin(DEAD_MESSAGE_BATCH_REQUEST_ENTRY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.deadMessageBatchRequestEntryList.size()));
          for (DeadMessageBatchRequestEntry _iter115 : struct.deadMessageBatchRequestEntryList)
          {
            _iter115.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeadMessageBatchRequestTupleSchemeFactory implements SchemeFactory {
    public DeadMessageBatchRequestTupleScheme getScheme() {
      return new DeadMessageBatchRequestTupleScheme();
    }
  }

  private static class DeadMessageBatchRequestTupleScheme extends TupleScheme<DeadMessageBatchRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeadMessageBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      {
        oprot.writeI32(struct.deadMessageBatchRequestEntryList.size());
        for (DeadMessageBatchRequestEntry _iter116 : struct.deadMessageBatchRequestEntryList)
        {
          _iter116.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeadMessageBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      {
        libthrift091.protocol.TList _list117 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.deadMessageBatchRequestEntryList = new ArrayList<DeadMessageBatchRequestEntry>(_list117.size);
        DeadMessageBatchRequestEntry _elem118;
        for (int _i119 = 0; _i119 < _list117.size; ++_i119)
        {
          _elem118 = new DeadMessageBatchRequestEntry();
          _elem118.read(iprot);
          struct.deadMessageBatchRequestEntryList.add(_elem118);
        }
      }
      struct.setDeadMessageBatchRequestEntryListIsSet(true);
    }
  }

}

