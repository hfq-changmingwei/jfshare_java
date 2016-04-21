/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.express;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class SubscribeRes implements TBase<SubscribeRes, SubscribeRes._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SubscribeRes");

  private static final TField STATUS_FIELD_DESC = new TField("status", TType.STRING, (short)1);
  private static final TField NU_FIELD_DESC = new TField("nu", TType.STRING, (short)2);
  private static final TField ISCHECK_FIELD_DESC = new TField("ischeck", TType.STRING, (short)3);
  private static final TField COM_FIELD_DESC = new TField("com", TType.STRING, (short)4);
  private static final TField TRACE_JSON_FIELD_DESC = new TField("traceJSON", TType.STRING, (short)5);
  private static final TField STATE_FIELD_DESC = new TField("state", TType.STRING, (short)6);


  public String status;
  public String nu;
  public String ischeck;
  public String com;
  public String traceJSON;
  public String state;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    STATUS((short)1, "status"),
    NU((short)2, "nu"),
    ISCHECK((short)3, "ischeck"),
    COM((short)4, "com"),
    TRACE_JSON((short)5, "traceJSON"),
    STATE((short)6, "state");
  
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
        case 1: // STATUS
  	return STATUS;
        case 2: // NU
  	return NU;
        case 3: // ISCHECK
  	return ISCHECK;
        case 4: // COM
  	return COM;
        case 5: // TRACE_JSON
  	return TRACE_JSON;
        case 6: // STATE
  	return STATE;
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
    tmpMap.put(_Fields.STATUS, new FieldMetaData("status", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NU, new FieldMetaData("nu", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ISCHECK, new FieldMetaData("ischeck", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.COM, new FieldMetaData("com", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.TRACE_JSON, new FieldMetaData("traceJSON", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.STATE, new FieldMetaData("state", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(SubscribeRes.class, metaDataMap);
  }


  public SubscribeRes() {
  }

  public SubscribeRes(
    String status,
    String nu,
    String ischeck,
    String com,
    String traceJSON,
    String state)
  {
    this();
    this.status = status;
    this.nu = nu;
    this.ischeck = ischeck;
    this.com = com;
    this.traceJSON = traceJSON;
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubscribeRes(SubscribeRes other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetNu()) {
      this.nu = other.nu;
    }
    if (other.isSetIscheck()) {
      this.ischeck = other.ischeck;
    }
    if (other.isSetCom()) {
      this.com = other.com;
    }
    if (other.isSetTraceJSON()) {
      this.traceJSON = other.traceJSON;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
  }

  public SubscribeRes deepCopy() {
    return new SubscribeRes(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.nu = null;
    this.ischeck = null;
    this.com = null;
    this.traceJSON = null;
    this.state = null;
  }

  public String getStatus() {
    return this.status;
  }

  public SubscribeRes setStatus(String status) {
    this.status = status;
    
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been asigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public String getNu() {
    return this.nu;
  }

  public SubscribeRes setNu(String nu) {
    this.nu = nu;
    
    return this;
  }

  public void unsetNu() {
    this.nu = null;
  }

  /** Returns true if field nu is set (has been asigned a value) and false otherwise */
  public boolean isSetNu() {
    return this.nu != null;
  }

  public void setNuIsSet(boolean value) {
    if (!value) {
      this.nu = null;
    }
  }

  public String getIscheck() {
    return this.ischeck;
  }

  public SubscribeRes setIscheck(String ischeck) {
    this.ischeck = ischeck;
    
    return this;
  }

  public void unsetIscheck() {
    this.ischeck = null;
  }

  /** Returns true if field ischeck is set (has been asigned a value) and false otherwise */
  public boolean isSetIscheck() {
    return this.ischeck != null;
  }

  public void setIscheckIsSet(boolean value) {
    if (!value) {
      this.ischeck = null;
    }
  }

  public String getCom() {
    return this.com;
  }

  public SubscribeRes setCom(String com) {
    this.com = com;
    
    return this;
  }

  public void unsetCom() {
    this.com = null;
  }

  /** Returns true if field com is set (has been asigned a value) and false otherwise */
  public boolean isSetCom() {
    return this.com != null;
  }

  public void setComIsSet(boolean value) {
    if (!value) {
      this.com = null;
    }
  }

  public String getTraceJSON() {
    return this.traceJSON;
  }

  public SubscribeRes setTraceJSON(String traceJSON) {
    this.traceJSON = traceJSON;
    
    return this;
  }

  public void unsetTraceJSON() {
    this.traceJSON = null;
  }

  /** Returns true if field traceJSON is set (has been asigned a value) and false otherwise */
  public boolean isSetTraceJSON() {
    return this.traceJSON != null;
  }

  public void setTraceJSONIsSet(boolean value) {
    if (!value) {
      this.traceJSON = null;
    }
  }

  public String getState() {
    return this.state;
  }

  public SubscribeRes setState(String state) {
    this.state = state;
    
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been asigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((String)value);
      }
      break;
    case NU:
      if (value == null) {
        unsetNu();
      } else {
        setNu((String)value);
      }
      break;
    case ISCHECK:
      if (value == null) {
        unsetIscheck();
      } else {
        setIscheck((String)value);
      }
      break;
    case COM:
      if (value == null) {
        unsetCom();
      } else {
        setCom((String)value);
      }
      break;
    case TRACE_JSON:
      if (value == null) {
        unsetTraceJSON();
      } else {
        setTraceJSON((String)value);
      }
      break;
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();
    case NU:
      return getNu();
    case ISCHECK:
      return getIscheck();
    case COM:
      return getCom();
    case TRACE_JSON:
      return getTraceJSON();
    case STATE:
      return getState();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case NU:
      return isSetNu();
    case ISCHECK:
      return isSetIscheck();
    case COM:
      return isSetCom();
    case TRACE_JSON:
      return isSetTraceJSON();
    case STATE:
      return isSetState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubscribeRes)
      return this.equals((SubscribeRes)that);
    return false;
  }

  public boolean equals(SubscribeRes that) {
    if (that == null)
      return false;
    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }
    boolean this_present_nu = true && this.isSetNu();
    boolean that_present_nu = true && that.isSetNu();
    if (this_present_nu || that_present_nu) {
      if (!(this_present_nu && that_present_nu))
        return false;
      if (!this.nu.equals(that.nu))
        return false;
    }
    boolean this_present_ischeck = true && this.isSetIscheck();
    boolean that_present_ischeck = true && that.isSetIscheck();
    if (this_present_ischeck || that_present_ischeck) {
      if (!(this_present_ischeck && that_present_ischeck))
        return false;
      if (!this.ischeck.equals(that.ischeck))
        return false;
    }
    boolean this_present_com = true && this.isSetCom();
    boolean that_present_com = true && that.isSetCom();
    if (this_present_com || that_present_com) {
      if (!(this_present_com && that_present_com))
        return false;
      if (!this.com.equals(that.com))
        return false;
    }
    boolean this_present_traceJSON = true && this.isSetTraceJSON();
    boolean that_present_traceJSON = true && that.isSetTraceJSON();
    if (this_present_traceJSON || that_present_traceJSON) {
      if (!(this_present_traceJSON && that_present_traceJSON))
        return false;
      if (!this.traceJSON.equals(that.traceJSON))
        return false;
    }
    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);
    boolean present_nu = true && (isSetNu());
    builder.append(present_nu);
    if (present_nu)
      builder.append(nu);
    boolean present_ischeck = true && (isSetIscheck());
    builder.append(present_ischeck);
    if (present_ischeck)
      builder.append(ischeck);
    boolean present_com = true && (isSetCom());
    builder.append(present_com);
    if (present_com)
      builder.append(com);
    boolean present_traceJSON = true && (isSetTraceJSON());
    builder.append(present_traceJSON);
    if (present_traceJSON)
      builder.append(traceJSON);
    boolean present_state = true && (isSetState());
    builder.append(present_state);
    if (present_state)
      builder.append(state);
    return builder.toHashCode();
  }

  public int compareTo(SubscribeRes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SubscribeRes typedOther = (SubscribeRes)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNu()).compareTo(typedOther.isSetNu());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNu()) {
      lastComparison = TBaseHelper.compareTo(this.nu, typedOther.nu);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIscheck()).compareTo(typedOther.isSetIscheck());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIscheck()) {
      lastComparison = TBaseHelper.compareTo(this.ischeck, typedOther.ischeck);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCom()).compareTo(typedOther.isSetCom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCom()) {
      lastComparison = TBaseHelper.compareTo(this.com, typedOther.com);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceJSON()).compareTo(typedOther.isSetTraceJSON());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceJSON()) {
      lastComparison = TBaseHelper.compareTo(this.traceJSON, typedOther.traceJSON);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = TBaseHelper.compareTo(this.state, typedOther.state);
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
        case 1: // STATUS
          if (field.type == TType.STRING) {
            this.status = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NU
          if (field.type == TType.STRING) {
            this.nu = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ISCHECK
          if (field.type == TType.STRING) {
            this.ischeck = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // COM
          if (field.type == TType.STRING) {
            this.com = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // TRACE_JSON
          if (field.type == TType.STRING) {
            this.traceJSON = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // STATE
          if (field.type == TType.STRING) {
            this.state = iprot.readString();
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
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeString(this.status);
      oprot.writeFieldEnd();
    }
    if (this.nu != null) {
      oprot.writeFieldBegin(NU_FIELD_DESC);
      oprot.writeString(this.nu);
      oprot.writeFieldEnd();
    }
    if (this.ischeck != null) {
      oprot.writeFieldBegin(ISCHECK_FIELD_DESC);
      oprot.writeString(this.ischeck);
      oprot.writeFieldEnd();
    }
    if (this.com != null) {
      oprot.writeFieldBegin(COM_FIELD_DESC);
      oprot.writeString(this.com);
      oprot.writeFieldEnd();
    }
    if (this.traceJSON != null) {
      oprot.writeFieldBegin(TRACE_JSON_FIELD_DESC);
      oprot.writeString(this.traceJSON);
      oprot.writeFieldEnd();
    }
    if (this.state != null) {
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeString(this.state);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SubscribeRes(");
    boolean first = true;
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nu:");
    if (this.nu == null) {
      sb.append("null");
    } else {
      sb.append(this.nu);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ischeck:");
    if (this.ischeck == null) {
      sb.append("null");
    } else {
      sb.append(this.ischeck);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("com:");
    if (this.com == null) {
      sb.append("null");
    } else {
      sb.append(this.com);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("traceJSON:");
    if (this.traceJSON == null) {
      sb.append("null");
    } else {
      sb.append(this.traceJSON);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
