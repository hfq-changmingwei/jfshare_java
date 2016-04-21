/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.express;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.*;

import java.util.*;

// No additional import required for struct/union.

public class TraceItem implements TBase<TraceItem, TraceItem._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TraceItem");

  private static final TField TIME_FIELD_DESC = new TField("time", TType.STRING, (short)1);
  private static final TField CONTEXT_FIELD_DESC = new TField("context", TType.STRING, (short)2);
  private static final TField FTIME_FIELD_DESC = new TField("ftime", TType.STRING, (short)3);


  public String time;
  public String context;
  public String ftime;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TIME((short)1, "time"),
    CONTEXT((short)2, "context"),
    FTIME((short)3, "ftime");
  
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
        case 1: // TIME
  	return TIME;
        case 2: // CONTEXT
  	return CONTEXT;
        case 3: // FTIME
  	return FTIME;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIME, new FieldMetaData("time", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CONTEXT, new FieldMetaData("context", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FTIME, new FieldMetaData("ftime", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TraceItem.class, metaDataMap);
  }


  public TraceItem() {
  }

  public TraceItem(
    String time,
    String context,
    String ftime)
  {
    this();
    this.time = time;
    this.context = context;
    this.ftime = ftime;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TraceItem(TraceItem other) {
    if (other.isSetTime()) {
      this.time = other.time;
    }
    if (other.isSetContext()) {
      this.context = other.context;
    }
    if (other.isSetFtime()) {
      this.ftime = other.ftime;
    }
  }

  public TraceItem deepCopy() {
    return new TraceItem(this);
  }

  @Override
  public void clear() {
    this.time = null;
    this.context = null;
    this.ftime = null;
  }

  public String getTime() {
    return this.time;
  }

  public TraceItem setTime(String time) {
    this.time = time;
    
    return this;
  }

  public void unsetTime() {
    this.time = null;
  }

  /** Returns true if field time is set (has been asigned a value) and false otherwise */
  public boolean isSetTime() {
    return this.time != null;
  }

  public void setTimeIsSet(boolean value) {
    if (!value) {
      this.time = null;
    }
  }

  public String getContext() {
    return this.context;
  }

  public TraceItem setContext(String context) {
    this.context = context;
    
    return this;
  }

  public void unsetContext() {
    this.context = null;
  }

  /** Returns true if field context is set (has been asigned a value) and false otherwise */
  public boolean isSetContext() {
    return this.context != null;
  }

  public void setContextIsSet(boolean value) {
    if (!value) {
      this.context = null;
    }
  }

  public String getFtime() {
    return this.ftime;
  }

  public TraceItem setFtime(String ftime) {
    this.ftime = ftime;
    
    return this;
  }

  public void unsetFtime() {
    this.ftime = null;
  }

  /** Returns true if field ftime is set (has been asigned a value) and false otherwise */
  public boolean isSetFtime() {
    return this.ftime != null;
  }

  public void setFtimeIsSet(boolean value) {
    if (!value) {
      this.ftime = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((String)value);
      }
      break;
    case CONTEXT:
      if (value == null) {
        unsetContext();
      } else {
        setContext((String)value);
      }
      break;
    case FTIME:
      if (value == null) {
        unsetFtime();
      } else {
        setFtime((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIME:
      return getTime();
    case CONTEXT:
      return getContext();
    case FTIME:
      return getFtime();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIME:
      return isSetTime();
    case CONTEXT:
      return isSetContext();
    case FTIME:
      return isSetFtime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TraceItem)
      return this.equals((TraceItem)that);
    return false;
  }

  public boolean equals(TraceItem that) {
    if (that == null)
      return false;
    boolean this_present_time = true && this.isSetTime();
    boolean that_present_time = true && that.isSetTime();
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (!this.time.equals(that.time))
        return false;
    }
    boolean this_present_context = true && this.isSetContext();
    boolean that_present_context = true && that.isSetContext();
    if (this_present_context || that_present_context) {
      if (!(this_present_context && that_present_context))
        return false;
      if (!this.context.equals(that.context))
        return false;
    }
    boolean this_present_ftime = true && this.isSetFtime();
    boolean that_present_ftime = true && that.isSetFtime();
    if (this_present_ftime || that_present_ftime) {
      if (!(this_present_ftime && that_present_ftime))
        return false;
      if (!this.ftime.equals(that.ftime))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_time = true && (isSetTime());
    builder.append(present_time);
    if (present_time)
      builder.append(time);
    boolean present_context = true && (isSetContext());
    builder.append(present_context);
    if (present_context)
      builder.append(context);
    boolean present_ftime = true && (isSetFtime());
    builder.append(present_ftime);
    if (present_ftime)
      builder.append(ftime);
    return builder.toHashCode();
  }

  public int compareTo(TraceItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TraceItem typedOther = (TraceItem)other;

    lastComparison = Boolean.valueOf(isSetTime()).compareTo(typedOther.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = TBaseHelper.compareTo(this.time, typedOther.time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContext()).compareTo(typedOther.isSetContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContext()) {
      lastComparison = TBaseHelper.compareTo(this.context, typedOther.context);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFtime()).compareTo(typedOther.isSetFtime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFtime()) {
      lastComparison = TBaseHelper.compareTo(this.ftime, typedOther.ftime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // TIME
          if (field.type == TType.STRING) {
            this.time = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CONTEXT
          if (field.type == TType.STRING) {
            this.context = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FTIME
          if (field.type == TType.STRING) {
            this.ftime = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    if (this.time != null) {
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeString(this.time);
      oprot.writeFieldEnd();
    }
    if (this.context != null) {
      oprot.writeFieldBegin(CONTEXT_FIELD_DESC);
      oprot.writeString(this.context);
      oprot.writeFieldEnd();
    }
    if (this.ftime != null) {
      oprot.writeFieldBegin(FTIME_FIELD_DESC);
      oprot.writeString(this.ftime);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TraceItem(");
    boolean first = true;
    sb.append("time:");
    if (this.time == null) {
      sb.append("null");
    } else {
      sb.append(this.time);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("context:");
    if (this.context == null) {
      sb.append("null");
    } else {
      sb.append(this.context);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ftime:");
    if (this.ftime == null) {
      sb.append("null");
    } else {
      sb.append(this.ftime);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
