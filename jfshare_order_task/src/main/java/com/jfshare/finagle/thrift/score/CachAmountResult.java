/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.score;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.*;

import java.util.*;

// No additional import required for struct/union.

public class CachAmountResult implements TBase<CachAmountResult, CachAmountResult._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CachAmountResult");

  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField CACH_AMOUNT_FIELD_DESC = new TField("cachAmount", TType.STRUCT, (short)2);


  public com.jfshare.finagle.thrift.result.Result result;
  public CachAmount cachAmount;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RESULT((short)1, "result"),
    CACH_AMOUNT((short)2, "cachAmount");
  
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
        case 1: // RESULT
  	return RESULT;
        case 2: // CACH_AMOUNT
  	return CACH_AMOUNT;
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
    tmpMap.put(_Fields.RESULT, new FieldMetaData("result", TFieldRequirementType.DEFAULT,
      new StructMetaData(TType.STRUCT, com.jfshare.finagle.thrift.result.Result.class)));
    tmpMap.put(_Fields.CACH_AMOUNT, new FieldMetaData("cachAmount", TFieldRequirementType.DEFAULT,
      new StructMetaData(TType.STRUCT, CachAmount.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(CachAmountResult.class, metaDataMap);
  }


  public CachAmountResult() {
  }

  public CachAmountResult(
    com.jfshare.finagle.thrift.result.Result result,
    CachAmount cachAmount)
  {
    this();
    this.result = result;
    this.cachAmount = cachAmount;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CachAmountResult(CachAmountResult other) {
    if (other.isSetResult()) {
      this.result = new com.jfshare.finagle.thrift.result.Result(other.result);
    }
    if (other.isSetCachAmount()) {
      this.cachAmount = new CachAmount(other.cachAmount);
    }
  }

  public CachAmountResult deepCopy() {
    return new CachAmountResult(this);
  }

  @Override
  public void clear() {
    this.result = null;
    this.cachAmount = null;
  }

  public com.jfshare.finagle.thrift.result.Result getResult() {
    return this.result;
  }

  public CachAmountResult setResult(com.jfshare.finagle.thrift.result.Result result) {
    this.result = result;
    
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been asigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public CachAmount getCachAmount() {
    return this.cachAmount;
  }

  public CachAmountResult setCachAmount(CachAmount cachAmount) {
    this.cachAmount = cachAmount;
    
    return this;
  }

  public void unsetCachAmount() {
    this.cachAmount = null;
  }

  /** Returns true if field cachAmount is set (has been asigned a value) and false otherwise */
  public boolean isSetCachAmount() {
    return this.cachAmount != null;
  }

  public void setCachAmountIsSet(boolean value) {
    if (!value) {
      this.cachAmount = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((com.jfshare.finagle.thrift.result.Result)value);
      }
      break;
    case CACH_AMOUNT:
      if (value == null) {
        unsetCachAmount();
      } else {
        setCachAmount((CachAmount)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();
    case CACH_AMOUNT:
      return getCachAmount();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case CACH_AMOUNT:
      return isSetCachAmount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CachAmountResult)
      return this.equals((CachAmountResult)that);
    return false;
  }

  public boolean equals(CachAmountResult that) {
    if (that == null)
      return false;
    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }
    boolean this_present_cachAmount = true && this.isSetCachAmount();
    boolean that_present_cachAmount = true && that.isSetCachAmount();
    if (this_present_cachAmount || that_present_cachAmount) {
      if (!(this_present_cachAmount && that_present_cachAmount))
        return false;
      if (!this.cachAmount.equals(that.cachAmount))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_result = true && (isSetResult());
    builder.append(present_result);
    if (present_result)
      builder.append(result);
    boolean present_cachAmount = true && (isSetCachAmount());
    builder.append(present_cachAmount);
    if (present_cachAmount)
      builder.append(cachAmount);
    return builder.toHashCode();
  }

  public int compareTo(CachAmountResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CachAmountResult typedOther = (CachAmountResult)other;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCachAmount()).compareTo(typedOther.isSetCachAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCachAmount()) {
      lastComparison = TBaseHelper.compareTo(this.cachAmount, typedOther.cachAmount);
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
        case 1: // RESULT
          if (field.type == TType.STRUCT) {
            this.result = new com.jfshare.finagle.thrift.result.Result();
            this.result.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CACH_AMOUNT
          if (field.type == TType.STRUCT) {
            this.cachAmount = new CachAmount();
            this.cachAmount.read(iprot);
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
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.cachAmount != null) {
      oprot.writeFieldBegin(CACH_AMOUNT_FIELD_DESC);
      this.cachAmount.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CachAmountResult(");
    boolean first = true;
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cachAmount:");
    if (this.cachAmount == null) {
      sb.append("null");
    } else {
      sb.append(this.cachAmount);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
