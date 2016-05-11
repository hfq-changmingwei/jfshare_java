/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.stock;

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

public class LockStockResult implements TBase<LockStockResult, LockStockResult._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LockStockResult");

  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField LOCK_INFO_LIST_FIELD_DESC = new TField("lockInfoList", TType.LIST, (short)2);


  public com.jfshare.finagle.thrift.result.Result result;
  public List<LockInfo> lockInfoList;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RESULT((short)1, "result"),
    LOCK_INFO_LIST((short)2, "lockInfoList");
  
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
        case 2: // LOCK_INFO_LIST
  	return LOCK_INFO_LIST;
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
    tmpMap.put(_Fields.LOCK_INFO_LIST, new FieldMetaData("lockInfoList", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, LockInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(LockStockResult.class, metaDataMap);
  }


  public LockStockResult() {
  }

  public LockStockResult(
    com.jfshare.finagle.thrift.result.Result result,
    List<LockInfo> lockInfoList)
  {
    this();
    this.result = result;
    this.lockInfoList = lockInfoList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LockStockResult(LockStockResult other) {
    if (other.isSetResult()) {
      this.result = new com.jfshare.finagle.thrift.result.Result(other.result);
    }
    if (other.isSetLockInfoList()) {
      List<LockInfo> __this__lockInfoList = new ArrayList<LockInfo>();
      for (LockInfo other_element : other.lockInfoList) {
        __this__lockInfoList.add(new LockInfo(other_element));
      }
      this.lockInfoList = __this__lockInfoList;
    }
  }

  public LockStockResult deepCopy() {
    return new LockStockResult(this);
  }

  @Override
  public void clear() {
    this.result = null;
    this.lockInfoList = null;
  }

  public com.jfshare.finagle.thrift.result.Result getResult() {
    return this.result;
  }

  public LockStockResult setResult(com.jfshare.finagle.thrift.result.Result result) {
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

  public int getLockInfoListSize() {
    return (this.lockInfoList == null) ? 0 : this.lockInfoList.size();
  }

  public java.util.Iterator<LockInfo> getLockInfoListIterator() {
    return (this.lockInfoList == null) ? null : this.lockInfoList.iterator();
  }

  public void addToLockInfoList(LockInfo elem) {
    if (this.lockInfoList == null) {
      this.lockInfoList = new ArrayList<LockInfo>();
    }
    this.lockInfoList.add(elem);
  }

  public List<LockInfo> getLockInfoList() {
    return this.lockInfoList;
  }

  public LockStockResult setLockInfoList(List<LockInfo> lockInfoList) {
    this.lockInfoList = lockInfoList;
    
    return this;
  }

  public void unsetLockInfoList() {
    this.lockInfoList = null;
  }

  /** Returns true if field lockInfoList is set (has been asigned a value) and false otherwise */
  public boolean isSetLockInfoList() {
    return this.lockInfoList != null;
  }

  public void setLockInfoListIsSet(boolean value) {
    if (!value) {
      this.lockInfoList = null;
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
    case LOCK_INFO_LIST:
      if (value == null) {
        unsetLockInfoList();
      } else {
        setLockInfoList((List<LockInfo>)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();
    case LOCK_INFO_LIST:
      return getLockInfoList();
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
    case LOCK_INFO_LIST:
      return isSetLockInfoList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LockStockResult)
      return this.equals((LockStockResult)that);
    return false;
  }

  public boolean equals(LockStockResult that) {
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
    boolean this_present_lockInfoList = true && this.isSetLockInfoList();
    boolean that_present_lockInfoList = true && that.isSetLockInfoList();
    if (this_present_lockInfoList || that_present_lockInfoList) {
      if (!(this_present_lockInfoList && that_present_lockInfoList))
        return false;
      if (!this.lockInfoList.equals(that.lockInfoList))
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
    boolean present_lockInfoList = true && (isSetLockInfoList());
    builder.append(present_lockInfoList);
    if (present_lockInfoList)
      builder.append(lockInfoList);
    return builder.toHashCode();
  }

  public int compareTo(LockStockResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LockStockResult typedOther = (LockStockResult)other;

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
    lastComparison = Boolean.valueOf(isSetLockInfoList()).compareTo(typedOther.isSetLockInfoList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLockInfoList()) {
      lastComparison = TBaseHelper.compareTo(this.lockInfoList, typedOther.lockInfoList);
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
        case 2: // LOCK_INFO_LIST
          if (field.type == TType.LIST) {
            {
            TList _list8 = iprot.readListBegin();
            this.lockInfoList = new ArrayList<LockInfo>(_list8.size);
            for (int _i9 = 0; _i9 < _list8.size; ++_i9)
            {
              LockInfo _elem10;
              _elem10 = new LockInfo();
              _elem10.read(iprot);
              this.lockInfoList.add(_elem10);
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
    if (this.lockInfoList != null) {
      oprot.writeFieldBegin(LOCK_INFO_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.lockInfoList.size()));
        for (LockInfo _iter11 : this.lockInfoList)
        {
          _iter11.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LockStockResult(");
    boolean first = true;
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lockInfoList:");
    if (this.lockInfoList == null) {
      sb.append("null");
    } else {
      sb.append(this.lockInfoList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
