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
public class Dashboard implements libthrift091.TBase<Dashboard, Dashboard._Fields>, java.io.Serializable, Cloneable, Comparable<Dashboard> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Dashboard");

  private static final libthrift091.protocol.TField DASHBOARD_NAME_FIELD_DESC = new libthrift091.protocol.TField("dashboardName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField PANEL_REQUESTS_FIELD_DESC = new libthrift091.protocol.TField("panelRequests", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DashboardStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DashboardTupleSchemeFactory());
  }

  public String dashboardName; // optional
  public List<PanelRequest> panelRequests; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    DASHBOARD_NAME((short)1, "dashboardName"),
    PANEL_REQUESTS((short)2, "panelRequests");

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
        case 2: // PANEL_REQUESTS
          return PANEL_REQUESTS;
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
  private static final _Fields optionals[] = {_Fields.DASHBOARD_NAME,_Fields.PANEL_REQUESTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DASHBOARD_NAME, new libthrift091.meta_data.FieldMetaData("dashboardName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PANEL_REQUESTS, new libthrift091.meta_data.FieldMetaData("panelRequests", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, PanelRequest.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Dashboard.class, metaDataMap);
  }

  public Dashboard() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Dashboard(Dashboard other) {
    if (other.isSetDashboardName()) {
      this.dashboardName = other.dashboardName;
    }
    if (other.isSetPanelRequests()) {
      List<PanelRequest> __this__panelRequests = new ArrayList<PanelRequest>(other.panelRequests.size());
      for (PanelRequest other_element : other.panelRequests) {
        __this__panelRequests.add(new PanelRequest(other_element));
      }
      this.panelRequests = __this__panelRequests;
    }
  }

  public Dashboard deepCopy() {
    return new Dashboard(this);
  }

  @Override
  public void clear() {
    this.dashboardName = null;
    this.panelRequests = null;
  }

  public String getDashboardName() {
    return this.dashboardName;
  }

  public Dashboard setDashboardName(String dashboardName) {
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

  public int getPanelRequestsSize() {
    return (this.panelRequests == null) ? 0 : this.panelRequests.size();
  }

  public java.util.Iterator<PanelRequest> getPanelRequestsIterator() {
    return (this.panelRequests == null) ? null : this.panelRequests.iterator();
  }

  public void addToPanelRequests(PanelRequest elem) {
    if (this.panelRequests == null) {
      this.panelRequests = new ArrayList<PanelRequest>();
    }
    this.panelRequests.add(elem);
  }

  public List<PanelRequest> getPanelRequests() {
    return this.panelRequests;
  }

  public Dashboard setPanelRequests(List<PanelRequest> panelRequests) {
    this.panelRequests = panelRequests;
    return this;
  }

  public void unsetPanelRequests() {
    this.panelRequests = null;
  }

  /** Returns true if field panelRequests is set (has been assigned a value) and false otherwise */
  public boolean isSetPanelRequests() {
    return this.panelRequests != null;
  }

  public void setPanelRequestsIsSet(boolean value) {
    if (!value) {
      this.panelRequests = null;
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

    case PANEL_REQUESTS:
      if (value == null) {
        unsetPanelRequests();
      } else {
        setPanelRequests((List<PanelRequest>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DASHBOARD_NAME:
      return getDashboardName();

    case PANEL_REQUESTS:
      return getPanelRequests();

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
    case PANEL_REQUESTS:
      return isSetPanelRequests();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Dashboard)
      return this.equals((Dashboard)that);
    return false;
  }

  public boolean equals(Dashboard that) {
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

    boolean this_present_panelRequests = true && this.isSetPanelRequests();
    boolean that_present_panelRequests = true && that.isSetPanelRequests();
    if (this_present_panelRequests || that_present_panelRequests) {
      if (!(this_present_panelRequests && that_present_panelRequests))
        return false;
      if (!this.panelRequests.equals(that.panelRequests))
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

    boolean present_panelRequests = true && (isSetPanelRequests());
    list.add(present_panelRequests);
    if (present_panelRequests)
      list.add(panelRequests);

    return list.hashCode();
  }

  @Override
  public int compareTo(Dashboard other) {
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
    lastComparison = Boolean.valueOf(isSetPanelRequests()).compareTo(other.isSetPanelRequests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPanelRequests()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.panelRequests, other.panelRequests);
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
    StringBuilder sb = new StringBuilder("Dashboard(");
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
    if (isSetPanelRequests()) {
      if (!first) sb.append(", ");
      sb.append("panelRequests:");
      if (this.panelRequests == null) {
        sb.append("null");
      } else {
        sb.append(this.panelRequests);
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

  private static class DashboardStandardSchemeFactory implements SchemeFactory {
    public DashboardStandardScheme getScheme() {
      return new DashboardStandardScheme();
    }
  }

  private static class DashboardStandardScheme extends StandardScheme<Dashboard> {

    public void read(libthrift091.protocol.TProtocol iprot, Dashboard struct) throws libthrift091.TException {
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
          case 2: // PANEL_REQUESTS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list8 = iprot.readListBegin();
                struct.panelRequests = new ArrayList<PanelRequest>(_list8.size);
                PanelRequest _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new PanelRequest();
                  _elem9.read(iprot);
                  struct.panelRequests.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setPanelRequestsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Dashboard struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dashboardName != null) {
        if (struct.isSetDashboardName()) {
          oprot.writeFieldBegin(DASHBOARD_NAME_FIELD_DESC);
          oprot.writeString(struct.dashboardName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.panelRequests != null) {
        if (struct.isSetPanelRequests()) {
          oprot.writeFieldBegin(PANEL_REQUESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.panelRequests.size()));
            for (PanelRequest _iter11 : struct.panelRequests)
            {
              _iter11.write(oprot);
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

  private static class DashboardTupleSchemeFactory implements SchemeFactory {
    public DashboardTupleScheme getScheme() {
      return new DashboardTupleScheme();
    }
  }

  private static class DashboardTupleScheme extends TupleScheme<Dashboard> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Dashboard struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDashboardName()) {
        optionals.set(0);
      }
      if (struct.isSetPanelRequests()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDashboardName()) {
        oprot.writeString(struct.dashboardName);
      }
      if (struct.isSetPanelRequests()) {
        {
          oprot.writeI32(struct.panelRequests.size());
          for (PanelRequest _iter12 : struct.panelRequests)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Dashboard struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.dashboardName = iprot.readString();
        struct.setDashboardNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list13 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.panelRequests = new ArrayList<PanelRequest>(_list13.size);
          PanelRequest _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new PanelRequest();
            _elem14.read(iprot);
            struct.panelRequests.add(_elem14);
          }
        }
        struct.setPanelRequestsIsSet(true);
      }
    }
  }

}

