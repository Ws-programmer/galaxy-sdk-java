/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.metrics.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-3-2")
public class ListDashboardsRequest implements libthrift091.TBase<ListDashboardsRequest, ListDashboardsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ListDashboardsRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListDashboardsRequest");

  private static final libthrift091.protocol.TField START_DASHBOARD_FIELD_DESC = new libthrift091.protocol.TField("startDashboard", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField NUMBER_FIELD_DESC = new libthrift091.protocol.TField("number", libthrift091.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListDashboardsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListDashboardsRequestTupleSchemeFactory());
  }

  public String startDashboard; // optional
  public int number; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    START_DASHBOARD((short)1, "startDashboard"),
    NUMBER((short)2, "number");

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
        case 1: // START_DASHBOARD
          return START_DASHBOARD;
        case 2: // NUMBER
          return NUMBER;
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
  private static final int __NUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_DASHBOARD,_Fields.NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_DASHBOARD, new libthrift091.meta_data.FieldMetaData("startDashboard", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER, new libthrift091.meta_data.FieldMetaData("number", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListDashboardsRequest.class, metaDataMap);
  }

  public ListDashboardsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListDashboardsRequest(ListDashboardsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStartDashboard()) {
      this.startDashboard = other.startDashboard;
    }
    this.number = other.number;
  }

  public ListDashboardsRequest deepCopy() {
    return new ListDashboardsRequest(this);
  }

  @Override
  public void clear() {
    this.startDashboard = null;
    setNumberIsSet(false);
    this.number = 0;
  }

  public String getStartDashboard() {
    return this.startDashboard;
  }

  public ListDashboardsRequest setStartDashboard(String startDashboard) {
    this.startDashboard = startDashboard;
    return this;
  }

  public void unsetStartDashboard() {
    this.startDashboard = null;
  }

  /** Returns true if field startDashboard is set (has been assigned a value) and false otherwise */
  public boolean isSetStartDashboard() {
    return this.startDashboard != null;
  }

  public void setStartDashboardIsSet(boolean value) {
    if (!value) {
      this.startDashboard = null;
    }
  }

  public int getNumber() {
    return this.number;
  }

  public ListDashboardsRequest setNumber(int number) {
    this.number = number;
    setNumberIsSet(true);
    return this;
  }

  public void unsetNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMBER_ISSET_ID);
  }

  /** Returns true if field number is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMBER_ISSET_ID);
  }

  public void setNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_DASHBOARD:
      if (value == null) {
        unsetStartDashboard();
      } else {
        setStartDashboard((String)value);
      }
      break;

    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_DASHBOARD:
      return getStartDashboard();

    case NUMBER:
      return Integer.valueOf(getNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_DASHBOARD:
      return isSetStartDashboard();
    case NUMBER:
      return isSetNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListDashboardsRequest)
      return this.equals((ListDashboardsRequest)that);
    return false;
  }

  public boolean equals(ListDashboardsRequest that) {
    if (that == null)
      return false;

    boolean this_present_startDashboard = true && this.isSetStartDashboard();
    boolean that_present_startDashboard = true && that.isSetStartDashboard();
    if (this_present_startDashboard || that_present_startDashboard) {
      if (!(this_present_startDashboard && that_present_startDashboard))
        return false;
      if (!this.startDashboard.equals(that.startDashboard))
        return false;
    }

    boolean this_present_number = true && this.isSetNumber();
    boolean that_present_number = true && that.isSetNumber();
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (this.number != that.number)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startDashboard = true && (isSetStartDashboard());
    list.add(present_startDashboard);
    if (present_startDashboard)
      list.add(startDashboard);

    boolean present_number = true && (isSetNumber());
    list.add(present_number);
    if (present_number)
      list.add(number);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListDashboardsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartDashboard()).compareTo(other.isSetStartDashboard());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartDashboard()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startDashboard, other.startDashboard);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumber()).compareTo(other.isSetNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.number, other.number);
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
    StringBuilder sb = new StringBuilder("ListDashboardsRequest(");
    boolean first = true;

    if (isSetStartDashboard()) {
      sb.append("startDashboard:");
      if (this.startDashboard == null) {
        sb.append("null");
      } else {
        sb.append(this.startDashboard);
      }
      first = false;
    }
    if (isSetNumber()) {
      if (!first) sb.append(", ");
      sb.append("number:");
      sb.append(this.number);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ListDashboardsRequestStandardSchemeFactory implements SchemeFactory {
    public ListDashboardsRequestStandardScheme getScheme() {
      return new ListDashboardsRequestStandardScheme();
    }
  }

  private static class ListDashboardsRequestStandardScheme extends StandardScheme<ListDashboardsRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, ListDashboardsRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_DASHBOARD
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.startDashboard = iprot.readString();
              struct.setStartDashboardIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.number = iprot.readI32();
              struct.setNumberIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListDashboardsRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.startDashboard != null) {
        if (struct.isSetStartDashboard()) {
          oprot.writeFieldBegin(START_DASHBOARD_FIELD_DESC);
          oprot.writeString(struct.startDashboard);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNumber()) {
        oprot.writeFieldBegin(NUMBER_FIELD_DESC);
        oprot.writeI32(struct.number);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListDashboardsRequestTupleSchemeFactory implements SchemeFactory {
    public ListDashboardsRequestTupleScheme getScheme() {
      return new ListDashboardsRequestTupleScheme();
    }
  }

  private static class ListDashboardsRequestTupleScheme extends TupleScheme<ListDashboardsRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListDashboardsRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStartDashboard()) {
        optionals.set(0);
      }
      if (struct.isSetNumber()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStartDashboard()) {
        oprot.writeString(struct.startDashboard);
      }
      if (struct.isSetNumber()) {
        oprot.writeI32(struct.number);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListDashboardsRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.startDashboard = iprot.readString();
        struct.setStartDashboardIsSet(true);
      }
      if (incoming.get(1)) {
        struct.number = iprot.readI32();
        struct.setNumberIsSet(true);
      }
    }
  }

}

