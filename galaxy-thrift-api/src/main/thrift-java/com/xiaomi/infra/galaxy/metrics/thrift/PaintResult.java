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
public class PaintResult implements libthrift091.TBase<PaintResult, PaintResult._Fields>, java.io.Serializable, Cloneable, Comparable<PaintResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PaintResult");

  private static final libthrift091.protocol.TField DASHBOARD_NAME_FIELD_DESC = new libthrift091.protocol.TField("dashboardName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField PANEL_RESULTS_FIELD_DESC = new libthrift091.protocol.TField("panelResults", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PaintResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PaintResultTupleSchemeFactory());
  }

  public String dashboardName; // optional
  public List<PanelResult> panelResults; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    DASHBOARD_NAME((short)1, "dashboardName"),
    PANEL_RESULTS((short)2, "panelResults");

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
        case 1: // DASHBOARD_NAME
          return DASHBOARD_NAME;
        case 2: // PANEL_RESULTS
          return PANEL_RESULTS;
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
  private static final _Fields optionals[] = {_Fields.DASHBOARD_NAME,_Fields.PANEL_RESULTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DASHBOARD_NAME, new libthrift091.meta_data.FieldMetaData("dashboardName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PANEL_RESULTS, new libthrift091.meta_data.FieldMetaData("panelResults", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, PanelResult.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PaintResult.class, metaDataMap);
  }

  public PaintResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaintResult(PaintResult other) {
    if (other.isSetDashboardName()) {
      this.dashboardName = other.dashboardName;
    }
    if (other.isSetPanelResults()) {
      List<PanelResult> __this__panelResults = new ArrayList<PanelResult>(other.panelResults.size());
      for (PanelResult other_element : other.panelResults) {
        __this__panelResults.add(new PanelResult(other_element));
      }
      this.panelResults = __this__panelResults;
    }
  }

  public PaintResult deepCopy() {
    return new PaintResult(this);
  }

  @Override
  public void clear() {
    this.dashboardName = null;
    this.panelResults = null;
  }

  public String getDashboardName() {
    return this.dashboardName;
  }

  public PaintResult setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

  public void unsetDashboardName() {
    this.dashboardName = null;
  }

  /** Returns true if field dashboardName is set (has been assigned a value) and false otherwise */
  public boolean isSetDashboardName() {
    return this.dashboardName != null;
  }

  public void setDashboardNameIsSet(boolean value) {
    if (!value) {
      this.dashboardName = null;
    }
  }

  public int getPanelResultsSize() {
    return (this.panelResults == null) ? 0 : this.panelResults.size();
  }

  public java.util.Iterator<PanelResult> getPanelResultsIterator() {
    return (this.panelResults == null) ? null : this.panelResults.iterator();
  }

  public void addToPanelResults(PanelResult elem) {
    if (this.panelResults == null) {
      this.panelResults = new ArrayList<PanelResult>();
    }
    this.panelResults.add(elem);
  }

  public List<PanelResult> getPanelResults() {
    return this.panelResults;
  }

  public PaintResult setPanelResults(List<PanelResult> panelResults) {
    this.panelResults = panelResults;
    return this;
  }

  public void unsetPanelResults() {
    this.panelResults = null;
  }

  /** Returns true if field panelResults is set (has been assigned a value) and false otherwise */
  public boolean isSetPanelResults() {
    return this.panelResults != null;
  }

  public void setPanelResultsIsSet(boolean value) {
    if (!value) {
      this.panelResults = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DASHBOARD_NAME:
      if (value == null) {
        unsetDashboardName();
      } else {
        setDashboardName((String)value);
      }
      break;

    case PANEL_RESULTS:
      if (value == null) {
        unsetPanelResults();
      } else {
        setPanelResults((List<PanelResult>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DASHBOARD_NAME:
      return getDashboardName();

    case PANEL_RESULTS:
      return getPanelResults();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DASHBOARD_NAME:
      return isSetDashboardName();
    case PANEL_RESULTS:
      return isSetPanelResults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaintResult)
      return this.equals((PaintResult)that);
    return false;
  }

  public boolean equals(PaintResult that) {
    if (that == null)
      return false;

    boolean this_present_dashboardName = true && this.isSetDashboardName();
    boolean that_present_dashboardName = true && that.isSetDashboardName();
    if (this_present_dashboardName || that_present_dashboardName) {
      if (!(this_present_dashboardName && that_present_dashboardName))
        return false;
      if (!this.dashboardName.equals(that.dashboardName))
        return false;
    }

    boolean this_present_panelResults = true && this.isSetPanelResults();
    boolean that_present_panelResults = true && that.isSetPanelResults();
    if (this_present_panelResults || that_present_panelResults) {
      if (!(this_present_panelResults && that_present_panelResults))
        return false;
      if (!this.panelResults.equals(that.panelResults))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dashboardName = true && (isSetDashboardName());
    list.add(present_dashboardName);
    if (present_dashboardName)
      list.add(dashboardName);

    boolean present_panelResults = true && (isSetPanelResults());
    list.add(present_panelResults);
    if (present_panelResults)
      list.add(panelResults);

    return list.hashCode();
  }

  @Override
  public int compareTo(PaintResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDashboardName()).compareTo(other.isSetDashboardName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDashboardName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.dashboardName, other.dashboardName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPanelResults()).compareTo(other.isSetPanelResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPanelResults()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.panelResults, other.panelResults);
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
    StringBuilder sb = new StringBuilder("PaintResult(");
    boolean first = true;

    if (isSetDashboardName()) {
      sb.append("dashboardName:");
      if (this.dashboardName == null) {
        sb.append("null");
      } else {
        sb.append(this.dashboardName);
      }
      first = false;
    }
    if (isSetPanelResults()) {
      if (!first) sb.append(", ");
      sb.append("panelResults:");
      if (this.panelResults == null) {
        sb.append("null");
      } else {
        sb.append(this.panelResults);
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

  private static class PaintResultStandardSchemeFactory implements SchemeFactory {
    public PaintResultStandardScheme getScheme() {
      return new PaintResultStandardScheme();
    }
  }

  private static class PaintResultStandardScheme extends StandardScheme<PaintResult> {

    public void read(libthrift091.protocol.TProtocol iprot, PaintResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DASHBOARD_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.dashboardName = iprot.readString();
              struct.setDashboardNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PANEL_RESULTS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list50 = iprot.readListBegin();
                struct.panelResults = new ArrayList<PanelResult>(_list50.size);
                PanelResult _elem51;
                for (int _i52 = 0; _i52 < _list50.size; ++_i52)
                {
                  _elem51 = new PanelResult();
                  _elem51.read(iprot);
                  struct.panelResults.add(_elem51);
                }
                iprot.readListEnd();
              }
              struct.setPanelResultsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, PaintResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dashboardName != null) {
        if (struct.isSetDashboardName()) {
          oprot.writeFieldBegin(DASHBOARD_NAME_FIELD_DESC);
          oprot.writeString(struct.dashboardName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.panelResults != null) {
        if (struct.isSetPanelResults()) {
          oprot.writeFieldBegin(PANEL_RESULTS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.panelResults.size()));
            for (PanelResult _iter53 : struct.panelResults)
            {
              _iter53.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PaintResultTupleSchemeFactory implements SchemeFactory {
    public PaintResultTupleScheme getScheme() {
      return new PaintResultTupleScheme();
    }
  }

  private static class PaintResultTupleScheme extends TupleScheme<PaintResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PaintResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDashboardName()) {
        optionals.set(0);
      }
      if (struct.isSetPanelResults()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDashboardName()) {
        oprot.writeString(struct.dashboardName);
      }
      if (struct.isSetPanelResults()) {
        {
          oprot.writeI32(struct.panelResults.size());
          for (PanelResult _iter54 : struct.panelResults)
          {
            _iter54.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PaintResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.dashboardName = iprot.readString();
        struct.setDashboardNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list55 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.panelResults = new ArrayList<PanelResult>(_list55.size);
          PanelResult _elem56;
          for (int _i57 = 0; _i57 < _list55.size; ++_i57)
          {
            _elem56 = new PanelResult();
            _elem56.read(iprot);
            struct.panelResults.add(_elem56);
          }
        }
        struct.setPanelResultsIsSet(true);
      }
    }
  }

}

