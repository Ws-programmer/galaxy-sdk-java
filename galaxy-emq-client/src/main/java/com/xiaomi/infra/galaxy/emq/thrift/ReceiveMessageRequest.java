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
public class ReceiveMessageRequest implements libthrift091.TBase<ReceiveMessageRequest, ReceiveMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ReceiveMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ReceiveMessageRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField MAX_RECEIVE_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("maxReceiveMessageNumber", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField MAX_RECEIVE_MESSAGE_WAIT_SECONDS_FIELD_DESC = new libthrift091.protocol.TField("maxReceiveMessageWaitSeconds", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField ATTRIBUTE_NAME_FIELD_DESC = new libthrift091.protocol.TField("attributeName", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField ATTRIBUTE_VALUE_FIELD_DESC = new libthrift091.protocol.TField("attributeValue", libthrift091.protocol.TType.STRUCT, (short)5);
  private static final libthrift091.protocol.TField TAG_NAME_FIELD_DESC = new libthrift091.protocol.TField("tagName", libthrift091.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReceiveMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReceiveMessageRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * Max receive message number, default 100 (1 ~ 100);
   * 
   */
  public int maxReceiveMessageNumber; // optional
  /**
   * Max receive message wait seconds, default 20s (0 ~ 20), 0s means no wait;
   * 
   */
  public int maxReceiveMessageWaitSeconds; // optional
  /**
   * Attribute name to match
   * case-sensitive
   * 
   */
  public String attributeName; // optional
  /**
   * Attribute value to match, corresponding to attributeName
   * case-sensitive
   * 
   */
  public MessageAttribute attributeValue; // optional
  /**
   * If this field is not_set/null/empty, default queue tag will be used
   * 
   */
  public String tagName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * Max receive message number, default 100 (1 ~ 100);
     * 
     */
    MAX_RECEIVE_MESSAGE_NUMBER((short)2, "maxReceiveMessageNumber"),
    /**
     * Max receive message wait seconds, default 20s (0 ~ 20), 0s means no wait;
     * 
     */
    MAX_RECEIVE_MESSAGE_WAIT_SECONDS((short)3, "maxReceiveMessageWaitSeconds"),
    /**
     * Attribute name to match
     * case-sensitive
     * 
     */
    ATTRIBUTE_NAME((short)4, "attributeName"),
    /**
     * Attribute value to match, corresponding to attributeName
     * case-sensitive
     * 
     */
    ATTRIBUTE_VALUE((short)5, "attributeValue"),
    /**
     * If this field is not_set/null/empty, default queue tag will be used
     * 
     */
    TAG_NAME((short)6, "tagName");

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
        case 2: // MAX_RECEIVE_MESSAGE_NUMBER
          return MAX_RECEIVE_MESSAGE_NUMBER;
        case 3: // MAX_RECEIVE_MESSAGE_WAIT_SECONDS
          return MAX_RECEIVE_MESSAGE_WAIT_SECONDS;
        case 4: // ATTRIBUTE_NAME
          return ATTRIBUTE_NAME;
        case 5: // ATTRIBUTE_VALUE
          return ATTRIBUTE_VALUE;
        case 6: // TAG_NAME
          return TAG_NAME;
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
  private static final int __MAXRECEIVEMESSAGENUMBER_ISSET_ID = 0;
  private static final int __MAXRECEIVEMESSAGEWAITSECONDS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX_RECEIVE_MESSAGE_NUMBER,_Fields.MAX_RECEIVE_MESSAGE_WAIT_SECONDS,_Fields.ATTRIBUTE_NAME,_Fields.ATTRIBUTE_VALUE,_Fields.TAG_NAME};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAX_RECEIVE_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("maxReceiveMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_RECEIVE_MESSAGE_WAIT_SECONDS, new libthrift091.meta_data.FieldMetaData("maxReceiveMessageWaitSeconds", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.ATTRIBUTE_NAME, new libthrift091.meta_data.FieldMetaData("attributeName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ATTRIBUTE_VALUE, new libthrift091.meta_data.FieldMetaData("attributeValue", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MessageAttribute.class)));
    tmpMap.put(_Fields.TAG_NAME, new libthrift091.meta_data.FieldMetaData("tagName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ReceiveMessageRequest.class, metaDataMap);
  }

  public ReceiveMessageRequest() {
    this.maxReceiveMessageNumber = 100;

    this.maxReceiveMessageWaitSeconds = 0;

  }

  public ReceiveMessageRequest(
    String queueName)
  {
    this();
    this.queueName = queueName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReceiveMessageRequest(ReceiveMessageRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    this.maxReceiveMessageNumber = other.maxReceiveMessageNumber;
    this.maxReceiveMessageWaitSeconds = other.maxReceiveMessageWaitSeconds;
    if (other.isSetAttributeName()) {
      this.attributeName = other.attributeName;
    }
    if (other.isSetAttributeValue()) {
      this.attributeValue = new MessageAttribute(other.attributeValue);
    }
    if (other.isSetTagName()) {
      this.tagName = other.tagName;
    }
  }

  public ReceiveMessageRequest deepCopy() {
    return new ReceiveMessageRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.maxReceiveMessageNumber = 100;

    this.maxReceiveMessageWaitSeconds = 0;

    this.attributeName = null;
    this.attributeValue = null;
    this.tagName = null;
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
  public ReceiveMessageRequest setQueueName(String queueName) {
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

  /**
   * Max receive message number, default 100 (1 ~ 100);
   * 
   */
  public int getMaxReceiveMessageNumber() {
    return this.maxReceiveMessageNumber;
  }

  /**
   * Max receive message number, default 100 (1 ~ 100);
   * 
   */
  public ReceiveMessageRequest setMaxReceiveMessageNumber(int maxReceiveMessageNumber) {
    this.maxReceiveMessageNumber = maxReceiveMessageNumber;
    setMaxReceiveMessageNumberIsSet(true);
    return this;
  }

  public void unsetMaxReceiveMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXRECEIVEMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field maxReceiveMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxReceiveMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXRECEIVEMESSAGENUMBER_ISSET_ID);
  }

  public void setMaxReceiveMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXRECEIVEMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * Max receive message wait seconds, default 20s (0 ~ 20), 0s means no wait;
   * 
   */
  public int getMaxReceiveMessageWaitSeconds() {
    return this.maxReceiveMessageWaitSeconds;
  }

  /**
   * Max receive message wait seconds, default 20s (0 ~ 20), 0s means no wait;
   * 
   */
  public ReceiveMessageRequest setMaxReceiveMessageWaitSeconds(int maxReceiveMessageWaitSeconds) {
    this.maxReceiveMessageWaitSeconds = maxReceiveMessageWaitSeconds;
    setMaxReceiveMessageWaitSecondsIsSet(true);
    return this;
  }

  public void unsetMaxReceiveMessageWaitSeconds() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXRECEIVEMESSAGEWAITSECONDS_ISSET_ID);
  }

  /** Returns true if field maxReceiveMessageWaitSeconds is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxReceiveMessageWaitSeconds() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXRECEIVEMESSAGEWAITSECONDS_ISSET_ID);
  }

  public void setMaxReceiveMessageWaitSecondsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXRECEIVEMESSAGEWAITSECONDS_ISSET_ID, value);
  }

  /**
   * Attribute name to match
   * case-sensitive
   * 
   */
  public String getAttributeName() {
    return this.attributeName;
  }

  /**
   * Attribute name to match
   * case-sensitive
   * 
   */
  public ReceiveMessageRequest setAttributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  public void unsetAttributeName() {
    this.attributeName = null;
  }

  /** Returns true if field attributeName is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributeName() {
    return this.attributeName != null;
  }

  public void setAttributeNameIsSet(boolean value) {
    if (!value) {
      this.attributeName = null;
    }
  }

  /**
   * Attribute value to match, corresponding to attributeName
   * case-sensitive
   * 
   */
  public MessageAttribute getAttributeValue() {
    return this.attributeValue;
  }

  /**
   * Attribute value to match, corresponding to attributeName
   * case-sensitive
   * 
   */
  public ReceiveMessageRequest setAttributeValue(MessageAttribute attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  public void unsetAttributeValue() {
    this.attributeValue = null;
  }

  /** Returns true if field attributeValue is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributeValue() {
    return this.attributeValue != null;
  }

  public void setAttributeValueIsSet(boolean value) {
    if (!value) {
      this.attributeValue = null;
    }
  }

  /**
   * If this field is not_set/null/empty, default queue tag will be used
   * 
   */
  public String getTagName() {
    return this.tagName;
  }

  /**
   * If this field is not_set/null/empty, default queue tag will be used
   * 
   */
  public ReceiveMessageRequest setTagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  public void unsetTagName() {
    this.tagName = null;
  }

  /** Returns true if field tagName is set (has been assigned a value) and false otherwise */
  public boolean isSetTagName() {
    return this.tagName != null;
  }

  public void setTagNameIsSet(boolean value) {
    if (!value) {
      this.tagName = null;
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

    case MAX_RECEIVE_MESSAGE_NUMBER:
      if (value == null) {
        unsetMaxReceiveMessageNumber();
      } else {
        setMaxReceiveMessageNumber((Integer)value);
      }
      break;

    case MAX_RECEIVE_MESSAGE_WAIT_SECONDS:
      if (value == null) {
        unsetMaxReceiveMessageWaitSeconds();
      } else {
        setMaxReceiveMessageWaitSeconds((Integer)value);
      }
      break;

    case ATTRIBUTE_NAME:
      if (value == null) {
        unsetAttributeName();
      } else {
        setAttributeName((String)value);
      }
      break;

    case ATTRIBUTE_VALUE:
      if (value == null) {
        unsetAttributeValue();
      } else {
        setAttributeValue((MessageAttribute)value);
      }
      break;

    case TAG_NAME:
      if (value == null) {
        unsetTagName();
      } else {
        setTagName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case MAX_RECEIVE_MESSAGE_NUMBER:
      return Integer.valueOf(getMaxReceiveMessageNumber());

    case MAX_RECEIVE_MESSAGE_WAIT_SECONDS:
      return Integer.valueOf(getMaxReceiveMessageWaitSeconds());

    case ATTRIBUTE_NAME:
      return getAttributeName();

    case ATTRIBUTE_VALUE:
      return getAttributeValue();

    case TAG_NAME:
      return getTagName();

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
    case MAX_RECEIVE_MESSAGE_NUMBER:
      return isSetMaxReceiveMessageNumber();
    case MAX_RECEIVE_MESSAGE_WAIT_SECONDS:
      return isSetMaxReceiveMessageWaitSeconds();
    case ATTRIBUTE_NAME:
      return isSetAttributeName();
    case ATTRIBUTE_VALUE:
      return isSetAttributeValue();
    case TAG_NAME:
      return isSetTagName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReceiveMessageRequest)
      return this.equals((ReceiveMessageRequest)that);
    return false;
  }

  public boolean equals(ReceiveMessageRequest that) {
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

    boolean this_present_maxReceiveMessageNumber = true && this.isSetMaxReceiveMessageNumber();
    boolean that_present_maxReceiveMessageNumber = true && that.isSetMaxReceiveMessageNumber();
    if (this_present_maxReceiveMessageNumber || that_present_maxReceiveMessageNumber) {
      if (!(this_present_maxReceiveMessageNumber && that_present_maxReceiveMessageNumber))
        return false;
      if (this.maxReceiveMessageNumber != that.maxReceiveMessageNumber)
        return false;
    }

    boolean this_present_maxReceiveMessageWaitSeconds = true && this.isSetMaxReceiveMessageWaitSeconds();
    boolean that_present_maxReceiveMessageWaitSeconds = true && that.isSetMaxReceiveMessageWaitSeconds();
    if (this_present_maxReceiveMessageWaitSeconds || that_present_maxReceiveMessageWaitSeconds) {
      if (!(this_present_maxReceiveMessageWaitSeconds && that_present_maxReceiveMessageWaitSeconds))
        return false;
      if (this.maxReceiveMessageWaitSeconds != that.maxReceiveMessageWaitSeconds)
        return false;
    }

    boolean this_present_attributeName = true && this.isSetAttributeName();
    boolean that_present_attributeName = true && that.isSetAttributeName();
    if (this_present_attributeName || that_present_attributeName) {
      if (!(this_present_attributeName && that_present_attributeName))
        return false;
      if (!this.attributeName.equals(that.attributeName))
        return false;
    }

    boolean this_present_attributeValue = true && this.isSetAttributeValue();
    boolean that_present_attributeValue = true && that.isSetAttributeValue();
    if (this_present_attributeValue || that_present_attributeValue) {
      if (!(this_present_attributeValue && that_present_attributeValue))
        return false;
      if (!this.attributeValue.equals(that.attributeValue))
        return false;
    }

    boolean this_present_tagName = true && this.isSetTagName();
    boolean that_present_tagName = true && that.isSetTagName();
    if (this_present_tagName || that_present_tagName) {
      if (!(this_present_tagName && that_present_tagName))
        return false;
      if (!this.tagName.equals(that.tagName))
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

    boolean present_maxReceiveMessageNumber = true && (isSetMaxReceiveMessageNumber());
    list.add(present_maxReceiveMessageNumber);
    if (present_maxReceiveMessageNumber)
      list.add(maxReceiveMessageNumber);

    boolean present_maxReceiveMessageWaitSeconds = true && (isSetMaxReceiveMessageWaitSeconds());
    list.add(present_maxReceiveMessageWaitSeconds);
    if (present_maxReceiveMessageWaitSeconds)
      list.add(maxReceiveMessageWaitSeconds);

    boolean present_attributeName = true && (isSetAttributeName());
    list.add(present_attributeName);
    if (present_attributeName)
      list.add(attributeName);

    boolean present_attributeValue = true && (isSetAttributeValue());
    list.add(present_attributeValue);
    if (present_attributeValue)
      list.add(attributeValue);

    boolean present_tagName = true && (isSetTagName());
    list.add(present_tagName);
    if (present_tagName)
      list.add(tagName);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReceiveMessageRequest other) {
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
    lastComparison = Boolean.valueOf(isSetMaxReceiveMessageNumber()).compareTo(other.isSetMaxReceiveMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxReceiveMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxReceiveMessageNumber, other.maxReceiveMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxReceiveMessageWaitSeconds()).compareTo(other.isSetMaxReceiveMessageWaitSeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxReceiveMessageWaitSeconds()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxReceiveMessageWaitSeconds, other.maxReceiveMessageWaitSeconds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributeName()).compareTo(other.isSetAttributeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributeName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributeName, other.attributeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributeValue()).compareTo(other.isSetAttributeValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributeValue()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributeValue, other.attributeValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTagName()).compareTo(other.isSetTagName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tagName, other.tagName);
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
    StringBuilder sb = new StringBuilder("ReceiveMessageRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (isSetMaxReceiveMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("maxReceiveMessageNumber:");
      sb.append(this.maxReceiveMessageNumber);
      first = false;
    }
    if (isSetMaxReceiveMessageWaitSeconds()) {
      if (!first) sb.append(", ");
      sb.append("maxReceiveMessageWaitSeconds:");
      sb.append(this.maxReceiveMessageWaitSeconds);
      first = false;
    }
    if (isSetAttributeName()) {
      if (!first) sb.append(", ");
      sb.append("attributeName:");
      if (this.attributeName == null) {
        sb.append("null");
      } else {
        sb.append(this.attributeName);
      }
      first = false;
    }
    if (isSetAttributeValue()) {
      if (!first) sb.append(", ");
      sb.append("attributeValue:");
      if (this.attributeValue == null) {
        sb.append("null");
      } else {
        sb.append(this.attributeValue);
      }
      first = false;
    }
    if (isSetTagName()) {
      if (!first) sb.append(", ");
      sb.append("tagName:");
      if (this.tagName == null) {
        sb.append("null");
      } else {
        sb.append(this.tagName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (attributeValue != null) {
      attributeValue.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReceiveMessageRequestStandardSchemeFactory implements SchemeFactory {
    public ReceiveMessageRequestStandardScheme getScheme() {
      return new ReceiveMessageRequestStandardScheme();
    }
  }

  private static class ReceiveMessageRequestStandardScheme extends StandardScheme<ReceiveMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, ReceiveMessageRequest struct) throws libthrift091.TException {
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
          case 2: // MAX_RECEIVE_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxReceiveMessageNumber = iprot.readI32();
              struct.setMaxReceiveMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX_RECEIVE_MESSAGE_WAIT_SECONDS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxReceiveMessageWaitSeconds = iprot.readI32();
              struct.setMaxReceiveMessageWaitSecondsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ATTRIBUTE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.attributeName = iprot.readString();
              struct.setAttributeNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ATTRIBUTE_VALUE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.attributeValue = new MessageAttribute();
              struct.attributeValue.read(iprot);
              struct.setAttributeValueIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TAG_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tagName = iprot.readString();
              struct.setTagNameIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ReceiveMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxReceiveMessageNumber()) {
        oprot.writeFieldBegin(MAX_RECEIVE_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.maxReceiveMessageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxReceiveMessageWaitSeconds()) {
        oprot.writeFieldBegin(MAX_RECEIVE_MESSAGE_WAIT_SECONDS_FIELD_DESC);
        oprot.writeI32(struct.maxReceiveMessageWaitSeconds);
        oprot.writeFieldEnd();
      }
      if (struct.attributeName != null) {
        if (struct.isSetAttributeName()) {
          oprot.writeFieldBegin(ATTRIBUTE_NAME_FIELD_DESC);
          oprot.writeString(struct.attributeName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.attributeValue != null) {
        if (struct.isSetAttributeValue()) {
          oprot.writeFieldBegin(ATTRIBUTE_VALUE_FIELD_DESC);
          struct.attributeValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tagName != null) {
        if (struct.isSetTagName()) {
          oprot.writeFieldBegin(TAG_NAME_FIELD_DESC);
          oprot.writeString(struct.tagName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReceiveMessageRequestTupleSchemeFactory implements SchemeFactory {
    public ReceiveMessageRequestTupleScheme getScheme() {
      return new ReceiveMessageRequestTupleScheme();
    }
  }

  private static class ReceiveMessageRequestTupleScheme extends TupleScheme<ReceiveMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ReceiveMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      BitSet optionals = new BitSet();
      if (struct.isSetMaxReceiveMessageNumber()) {
        optionals.set(0);
      }
      if (struct.isSetMaxReceiveMessageWaitSeconds()) {
        optionals.set(1);
      }
      if (struct.isSetAttributeName()) {
        optionals.set(2);
      }
      if (struct.isSetAttributeValue()) {
        optionals.set(3);
      }
      if (struct.isSetTagName()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMaxReceiveMessageNumber()) {
        oprot.writeI32(struct.maxReceiveMessageNumber);
      }
      if (struct.isSetMaxReceiveMessageWaitSeconds()) {
        oprot.writeI32(struct.maxReceiveMessageWaitSeconds);
      }
      if (struct.isSetAttributeName()) {
        oprot.writeString(struct.attributeName);
      }
      if (struct.isSetAttributeValue()) {
        struct.attributeValue.write(oprot);
      }
      if (struct.isSetTagName()) {
        oprot.writeString(struct.tagName);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ReceiveMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.maxReceiveMessageNumber = iprot.readI32();
        struct.setMaxReceiveMessageNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxReceiveMessageWaitSeconds = iprot.readI32();
        struct.setMaxReceiveMessageWaitSecondsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.attributeName = iprot.readString();
        struct.setAttributeNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.attributeValue = new MessageAttribute();
        struct.attributeValue.read(iprot);
        struct.setAttributeValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.tagName = iprot.readString();
        struct.setTagNameIsSet(true);
      }
    }
  }

}

