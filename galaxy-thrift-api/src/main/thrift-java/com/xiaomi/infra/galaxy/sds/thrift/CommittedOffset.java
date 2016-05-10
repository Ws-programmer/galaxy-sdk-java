/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-25")
public class CommittedOffset implements libthrift091.TBase<CommittedOffset, CommittedOffset._Fields>, java.io.Serializable, Cloneable, Comparable<CommittedOffset> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("CommittedOffset");

  private static final libthrift091.protocol.TField COMMITTED_DATA_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("committedDataOffset", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField DATA_COMMIT_FINISHED_FIELD_DESC = new libthrift091.protocol.TField("dataCommitFinished", libthrift091.protocol.TType.BOOL, (short)2);
  private static final libthrift091.protocol.TField COMMITTED_EDIT_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("committedEditOffset", libthrift091.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommittedOffsetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommittedOffsetTupleSchemeFactory());
  }

  /**
   * 当前存量数据已确认的消费偏移
   */
  public Map<String,Datum> committedDataOffset; // optional
  /**
   * 存量数据是否确认消费完毕
   */
  public boolean dataCommitFinished; // optional
  /**
   * 当前增量数据已确认的消费偏移
   */
  public long committedEditOffset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 当前存量数据已确认的消费偏移
     */
    COMMITTED_DATA_OFFSET((short)1, "committedDataOffset"),
    /**
     * 存量数据是否确认消费完毕
     */
    DATA_COMMIT_FINISHED((short)2, "dataCommitFinished"),
    /**
     * 当前增量数据已确认的消费偏移
     */
    COMMITTED_EDIT_OFFSET((short)3, "committedEditOffset");

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
        case 1: // COMMITTED_DATA_OFFSET
          return COMMITTED_DATA_OFFSET;
        case 2: // DATA_COMMIT_FINISHED
          return DATA_COMMIT_FINISHED;
        case 3: // COMMITTED_EDIT_OFFSET
          return COMMITTED_EDIT_OFFSET;
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
  private static final int __DATACOMMITFINISHED_ISSET_ID = 0;
  private static final int __COMMITTEDEDITOFFSET_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COMMITTED_DATA_OFFSET,_Fields.DATA_COMMIT_FINISHED,_Fields.COMMITTED_EDIT_OFFSET};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMITTED_DATA_OFFSET, new libthrift091.meta_data.FieldMetaData("committedDataOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.DATA_COMMIT_FINISHED, new libthrift091.meta_data.FieldMetaData("dataCommitFinished", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COMMITTED_EDIT_OFFSET, new libthrift091.meta_data.FieldMetaData("committedEditOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(CommittedOffset.class, metaDataMap);
  }

  public CommittedOffset() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommittedOffset(CommittedOffset other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCommittedDataOffset()) {
      this.committedDataOffset = other.committedDataOffset;
    }
    this.dataCommitFinished = other.dataCommitFinished;
    this.committedEditOffset = other.committedEditOffset;
  }

  public CommittedOffset deepCopy() {
    return new CommittedOffset(this);
  }

  @Override
  public void clear() {
    this.committedDataOffset = null;
    setDataCommitFinishedIsSet(false);
    this.dataCommitFinished = false;
    setCommittedEditOffsetIsSet(false);
    this.committedEditOffset = 0;
  }

  public int getCommittedDataOffsetSize() {
    return (this.committedDataOffset == null) ? 0 : this.committedDataOffset.size();
  }

  public void putToCommittedDataOffset(String key, Datum val) {
    if (this.committedDataOffset == null) {
      this.committedDataOffset = new HashMap<String,Datum>();
    }
    this.committedDataOffset.put(key, val);
  }

  /**
   * 当前存量数据已确认的消费偏移
   */
  public Map<String,Datum> getCommittedDataOffset() {
    return this.committedDataOffset;
  }

  /**
   * 当前存量数据已确认的消费偏移
   */
  public CommittedOffset setCommittedDataOffset(Map<String,Datum> committedDataOffset) {
    this.committedDataOffset = committedDataOffset;
    return this;
  }

  public void unsetCommittedDataOffset() {
    this.committedDataOffset = null;
  }

  /** Returns true if field committedDataOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetCommittedDataOffset() {
    return this.committedDataOffset != null;
  }

  public void setCommittedDataOffsetIsSet(boolean value) {
    if (!value) {
      this.committedDataOffset = null;
    }
  }

  /**
   * 存量数据是否确认消费完毕
   */
  public boolean isDataCommitFinished() {
    return this.dataCommitFinished;
  }

  /**
   * 存量数据是否确认消费完毕
   */
  public CommittedOffset setDataCommitFinished(boolean dataCommitFinished) {
    this.dataCommitFinished = dataCommitFinished;
    setDataCommitFinishedIsSet(true);
    return this;
  }

  public void unsetDataCommitFinished() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATACOMMITFINISHED_ISSET_ID);
  }

  /** Returns true if field dataCommitFinished is set (has been assigned a value) and false otherwise */
  public boolean isSetDataCommitFinished() {
    return EncodingUtils.testBit(__isset_bitfield, __DATACOMMITFINISHED_ISSET_ID);
  }

  public void setDataCommitFinishedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATACOMMITFINISHED_ISSET_ID, value);
  }

  /**
   * 当前增量数据已确认的消费偏移
   */
  public long getCommittedEditOffset() {
    return this.committedEditOffset;
  }

  /**
   * 当前增量数据已确认的消费偏移
   */
  public CommittedOffset setCommittedEditOffset(long committedEditOffset) {
    this.committedEditOffset = committedEditOffset;
    setCommittedEditOffsetIsSet(true);
    return this;
  }

  public void unsetCommittedEditOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMITTEDEDITOFFSET_ISSET_ID);
  }

  /** Returns true if field committedEditOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetCommittedEditOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMITTEDEDITOFFSET_ISSET_ID);
  }

  public void setCommittedEditOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMITTEDEDITOFFSET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMITTED_DATA_OFFSET:
      if (value == null) {
        unsetCommittedDataOffset();
      } else {
        setCommittedDataOffset((Map<String,Datum>)value);
      }
      break;

    case DATA_COMMIT_FINISHED:
      if (value == null) {
        unsetDataCommitFinished();
      } else {
        setDataCommitFinished((Boolean)value);
      }
      break;

    case COMMITTED_EDIT_OFFSET:
      if (value == null) {
        unsetCommittedEditOffset();
      } else {
        setCommittedEditOffset((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMITTED_DATA_OFFSET:
      return getCommittedDataOffset();

    case DATA_COMMIT_FINISHED:
      return Boolean.valueOf(isDataCommitFinished());

    case COMMITTED_EDIT_OFFSET:
      return Long.valueOf(getCommittedEditOffset());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMITTED_DATA_OFFSET:
      return isSetCommittedDataOffset();
    case DATA_COMMIT_FINISHED:
      return isSetDataCommitFinished();
    case COMMITTED_EDIT_OFFSET:
      return isSetCommittedEditOffset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommittedOffset)
      return this.equals((CommittedOffset)that);
    return false;
  }

  public boolean equals(CommittedOffset that) {
    if (that == null)
      return false;

    boolean this_present_committedDataOffset = true && this.isSetCommittedDataOffset();
    boolean that_present_committedDataOffset = true && that.isSetCommittedDataOffset();
    if (this_present_committedDataOffset || that_present_committedDataOffset) {
      if (!(this_present_committedDataOffset && that_present_committedDataOffset))
        return false;
      if (!this.committedDataOffset.equals(that.committedDataOffset))
        return false;
    }

    boolean this_present_dataCommitFinished = true && this.isSetDataCommitFinished();
    boolean that_present_dataCommitFinished = true && that.isSetDataCommitFinished();
    if (this_present_dataCommitFinished || that_present_dataCommitFinished) {
      if (!(this_present_dataCommitFinished && that_present_dataCommitFinished))
        return false;
      if (this.dataCommitFinished != that.dataCommitFinished)
        return false;
    }

    boolean this_present_committedEditOffset = true && this.isSetCommittedEditOffset();
    boolean that_present_committedEditOffset = true && that.isSetCommittedEditOffset();
    if (this_present_committedEditOffset || that_present_committedEditOffset) {
      if (!(this_present_committedEditOffset && that_present_committedEditOffset))
        return false;
      if (this.committedEditOffset != that.committedEditOffset)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_committedDataOffset = true && (isSetCommittedDataOffset());
    list.add(present_committedDataOffset);
    if (present_committedDataOffset)
      list.add(committedDataOffset);

    boolean present_dataCommitFinished = true && (isSetDataCommitFinished());
    list.add(present_dataCommitFinished);
    if (present_dataCommitFinished)
      list.add(dataCommitFinished);

    boolean present_committedEditOffset = true && (isSetCommittedEditOffset());
    list.add(present_committedEditOffset);
    if (present_committedEditOffset)
      list.add(committedEditOffset);

    return list.hashCode();
  }

  @Override
  public int compareTo(CommittedOffset other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommittedDataOffset()).compareTo(other.isSetCommittedDataOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommittedDataOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.committedDataOffset, other.committedDataOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataCommitFinished()).compareTo(other.isSetDataCommitFinished());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataCommitFinished()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.dataCommitFinished, other.dataCommitFinished);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommittedEditOffset()).compareTo(other.isSetCommittedEditOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommittedEditOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.committedEditOffset, other.committedEditOffset);
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
    StringBuilder sb = new StringBuilder("CommittedOffset(");
    boolean first = true;

    if (isSetCommittedDataOffset()) {
      sb.append("committedDataOffset:");
      if (this.committedDataOffset == null) {
        sb.append("null");
      } else {
        sb.append(this.committedDataOffset);
      }
      first = false;
    }
    if (isSetDataCommitFinished()) {
      if (!first) sb.append(", ");
      sb.append("dataCommitFinished:");
      sb.append(this.dataCommitFinished);
      first = false;
    }
    if (isSetCommittedEditOffset()) {
      if (!first) sb.append(", ");
      sb.append("committedEditOffset:");
      sb.append(this.committedEditOffset);
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

  private static class CommittedOffsetStandardSchemeFactory implements SchemeFactory {
    public CommittedOffsetStandardScheme getScheme() {
      return new CommittedOffsetStandardScheme();
    }
  }

  private static class CommittedOffsetStandardScheme extends StandardScheme<CommittedOffset> {

    public void read(libthrift091.protocol.TProtocol iprot, CommittedOffset struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMITTED_DATA_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map436 = iprot.readMapBegin();
                struct.committedDataOffset = new HashMap<String,Datum>(2*_map436.size);
                String _key437;
                Datum _val438;
                for (int _i439 = 0; _i439 < _map436.size; ++_i439)
                {
                  _key437 = iprot.readString();
                  _val438 = new Datum();
                  _val438.read(iprot);
                  struct.committedDataOffset.put(_key437, _val438);
                }
                iprot.readMapEnd();
              }
              struct.setCommittedDataOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA_COMMIT_FINISHED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.dataCommitFinished = iprot.readBool();
              struct.setDataCommitFinishedIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMMITTED_EDIT_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.committedEditOffset = iprot.readI64();
              struct.setCommittedEditOffsetIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, CommittedOffset struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.committedDataOffset != null) {
        if (struct.isSetCommittedDataOffset()) {
          oprot.writeFieldBegin(COMMITTED_DATA_OFFSET_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.committedDataOffset.size()));
            for (Map.Entry<String, Datum> _iter440 : struct.committedDataOffset.entrySet())
            {
              oprot.writeString(_iter440.getKey());
              _iter440.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDataCommitFinished()) {
        oprot.writeFieldBegin(DATA_COMMIT_FINISHED_FIELD_DESC);
        oprot.writeBool(struct.dataCommitFinished);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCommittedEditOffset()) {
        oprot.writeFieldBegin(COMMITTED_EDIT_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.committedEditOffset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommittedOffsetTupleSchemeFactory implements SchemeFactory {
    public CommittedOffsetTupleScheme getScheme() {
      return new CommittedOffsetTupleScheme();
    }
  }

  private static class CommittedOffsetTupleScheme extends TupleScheme<CommittedOffset> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, CommittedOffset struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCommittedDataOffset()) {
        optionals.set(0);
      }
      if (struct.isSetDataCommitFinished()) {
        optionals.set(1);
      }
      if (struct.isSetCommittedEditOffset()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCommittedDataOffset()) {
        {
          oprot.writeI32(struct.committedDataOffset.size());
          for (Map.Entry<String, Datum> _iter441 : struct.committedDataOffset.entrySet())
          {
            oprot.writeString(_iter441.getKey());
            _iter441.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetDataCommitFinished()) {
        oprot.writeBool(struct.dataCommitFinished);
      }
      if (struct.isSetCommittedEditOffset()) {
        oprot.writeI64(struct.committedEditOffset);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, CommittedOffset struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map442 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.committedDataOffset = new HashMap<String,Datum>(2*_map442.size);
          String _key443;
          Datum _val444;
          for (int _i445 = 0; _i445 < _map442.size; ++_i445)
          {
            _key443 = iprot.readString();
            _val444 = new Datum();
            _val444.read(iprot);
            struct.committedDataOffset.put(_key443, _val444);
          }
        }
        struct.setCommittedDataOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dataCommitFinished = iprot.readBool();
        struct.setDataCommitFinishedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.committedEditOffset = iprot.readI64();
        struct.setCommittedEditOffsetIsSet(true);
      }
    }
  }

}

