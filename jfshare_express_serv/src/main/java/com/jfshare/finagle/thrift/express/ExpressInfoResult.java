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

public class ExpressInfoResult implements TBase<ExpressInfoResult, ExpressInfoResult._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ExpressInfoResult");

  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField EXPRESS_INFO_LIST_FIELD_DESC = new TField("expressInfoList", TType.LIST, (short)2);


  public com.jfshare.finagle.thrift.result.Result result;
  public List<ExpressInfo> expressInfoList;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RESULT((short)1, "result"),
    EXPRESS_INFO_LIST((short)2, "expressInfoList");
  
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
        case 2: // EXPRESS_INFO_LIST
  	return EXPRESS_INFO_LIST;
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
    tmpMap.put(_Fields.EXPRESS_INFO_LIST, new FieldMetaData("expressInfoList", TFieldRequirementType.OPTIONAL,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, ExpressInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ExpressInfoResult.class, metaDataMap);
  }


  public ExpressInfoResult() {
  }

  public ExpressInfoResult(
    com.jfshare.finagle.thrift.result.Result result)
  {
    this();
    this.result = result;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExpressInfoResult(ExpressInfoResult other) {
    if (other.isSetResult()) {
      this.result = new com.jfshare.finagle.thrift.result.Result(other.result);
    }
    if (other.isSetExpressInfoList()) {
      List<ExpressInfo> __this__expressInfoList = new ArrayList<ExpressInfo>();
      for (ExpressInfo other_element : other.expressInfoList) {
        __this__expressInfoList.add(new ExpressInfo(other_element));
      }
      this.expressInfoList = __this__expressInfoList;
    }
  }

  public ExpressInfoResult deepCopy() {
    return new ExpressInfoResult(this);
  }

  @Override
  public void clear() {
    this.result = null;
    this.expressInfoList = null;
  }

  public com.jfshare.finagle.thrift.result.Result getResult() {
    return this.result;
  }

  public ExpressInfoResult setResult(com.jfshare.finagle.thrift.result.Result result) {
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

  public int getExpressInfoListSize() {
    return (this.expressInfoList == null) ? 0 : this.expressInfoList.size();
  }

  public java.util.Iterator<ExpressInfo> getExpressInfoListIterator() {
    return (this.expressInfoList == null) ? null : this.expressInfoList.iterator();
  }

  public void addToExpressInfoList(ExpressInfo elem) {
    if (this.expressInfoList == null) {
      this.expressInfoList = new ArrayList<ExpressInfo>();
    }
    this.expressInfoList.add(elem);
  }

  public List<ExpressInfo> getExpressInfoList() {
    return this.expressInfoList;
  }

  public ExpressInfoResult setExpressInfoList(List<ExpressInfo> expressInfoList) {
    this.expressInfoList = expressInfoList;
    
    return this;
  }

  public void unsetExpressInfoList() {
    this.expressInfoList = null;
  }

  /** Returns true if field expressInfoList is set (has been asigned a value) and false otherwise */
  public boolean isSetExpressInfoList() {
    return this.expressInfoList != null;
  }

  public void setExpressInfoListIsSet(boolean value) {
    if (!value) {
      this.expressInfoList = null;
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
    case EXPRESS_INFO_LIST:
      if (value == null) {
        unsetExpressInfoList();
      } else {
        setExpressInfoList((List<ExpressInfo>)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();
    case EXPRESS_INFO_LIST:
      return getExpressInfoList();
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
    case EXPRESS_INFO_LIST:
      return isSetExpressInfoList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExpressInfoResult)
      return this.equals((ExpressInfoResult)that);
    return false;
  }

  public boolean equals(ExpressInfoResult that) {
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
    boolean this_present_expressInfoList = true && this.isSetExpressInfoList();
    boolean that_present_expressInfoList = true && that.isSetExpressInfoList();
    if (this_present_expressInfoList || that_present_expressInfoList) {
      if (!(this_present_expressInfoList && that_present_expressInfoList))
        return false;
      if (!this.expressInfoList.equals(that.expressInfoList))
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
    boolean present_expressInfoList = true && (isSetExpressInfoList());
    builder.append(present_expressInfoList);
    if (present_expressInfoList)
      builder.append(expressInfoList);
    return builder.toHashCode();
  }

  public int compareTo(ExpressInfoResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExpressInfoResult typedOther = (ExpressInfoResult)other;

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
    lastComparison = Boolean.valueOf(isSetExpressInfoList()).compareTo(typedOther.isSetExpressInfoList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpressInfoList()) {
      lastComparison = TBaseHelper.compareTo(this.expressInfoList, typedOther.expressInfoList);
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
        case 2: // EXPRESS_INFO_LIST
          if (field.type == TType.LIST) {
            {
            TList _list4 = iprot.readListBegin();
            this.expressInfoList = new ArrayList<ExpressInfo>(_list4.size);
            for (int _i5 = 0; _i5 < _list4.size; ++_i5)
            {
              ExpressInfo _elem6;
              _elem6 = new ExpressInfo();
              _elem6.read(iprot);
              this.expressInfoList.add(_elem6);
            }
            iprot.readListEnd();
            }
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
    if (this.expressInfoList != null) {
      if (isSetExpressInfoList()) {
        oprot.writeFieldBegin(EXPRESS_INFO_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.expressInfoList.size()));
          for (ExpressInfo _iter7 : this.expressInfoList)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExpressInfoResult(");
    boolean first = true;
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    if (isSetExpressInfoList()) {
      if (!first) sb.append(", ");
      sb.append("expressInfoList:");
      if (this.expressInfoList == null) {
        sb.append("null");
      } else {
        sb.append(this.expressInfoList);
      }
      first = false;
      }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
