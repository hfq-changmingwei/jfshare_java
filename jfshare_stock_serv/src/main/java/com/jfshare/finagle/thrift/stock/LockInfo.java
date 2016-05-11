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

public class LockInfo implements TBase<LockInfo, LockInfo._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LockInfo");

  private static final TField PRODUCT_ID_FIELD_DESC = new TField("productId", TType.STRING, (short)1);
  private static final TField SKU_NUM_FIELD_DESC = new TField("skuNum", TType.STRING, (short)2);
  private static final TField APPLY_COUNT_FIELD_DESC = new TField("applyCount", TType.I32, (short)3);
  private static final TField LOCK_COUNT_FIELD_DESC = new TField("lockCount", TType.I32, (short)4);
  private static final TField STOREHOUSE_ID_FIELD_DESC = new TField("storehouseId", TType.I32, (short)5);


  public String productId;
  public String skuNum;
  public int applyCount;
  public int lockCount;
  public int storehouseId;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PRODUCT_ID((short)1, "productId"),
    SKU_NUM((short)2, "skuNum"),
    APPLY_COUNT((short)3, "applyCount"),
    LOCK_COUNT((short)4, "lockCount"),
    STOREHOUSE_ID((short)5, "storehouseId");
  
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
        case 1: // PRODUCT_ID
  	return PRODUCT_ID;
        case 2: // SKU_NUM
  	return SKU_NUM;
        case 3: // APPLY_COUNT
  	return APPLY_COUNT;
        case 4: // LOCK_COUNT
  	return LOCK_COUNT;
        case 5: // STOREHOUSE_ID
  	return STOREHOUSE_ID;
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
  private static final int __APPLYCOUNT_ISSET_ID = 0;
  private static final int __LOCKCOUNT_ISSET_ID = 1;
  private static final int __STOREHOUSEID_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRODUCT_ID, new FieldMetaData("productId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SKU_NUM, new FieldMetaData("skuNum", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.APPLY_COUNT, new FieldMetaData("applyCount", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.LOCK_COUNT, new FieldMetaData("lockCount", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.STOREHOUSE_ID, new FieldMetaData("storehouseId", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(LockInfo.class, metaDataMap);
  }


  public LockInfo() {
  }

  public LockInfo(
    String productId,
    String skuNum,
    int applyCount,
    int lockCount)
  {
    this();
    this.productId = productId;
    this.skuNum = skuNum;
    this.applyCount = applyCount;
    setApplyCountIsSet(true);
    this.lockCount = lockCount;
    setLockCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LockInfo(LockInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetProductId()) {
      this.productId = other.productId;
    }
    if (other.isSetSkuNum()) {
      this.skuNum = other.skuNum;
    }
    this.applyCount = other.applyCount;
    this.lockCount = other.lockCount;
    this.storehouseId = other.storehouseId;
  }

  public LockInfo deepCopy() {
    return new LockInfo(this);
  }

  @Override
  public void clear() {
    this.productId = null;
    this.skuNum = null;
    setApplyCountIsSet(false);
    this.applyCount = 0;
    setLockCountIsSet(false);
    this.lockCount = 0;
    setStorehouseIdIsSet(false);
    this.storehouseId = 0;
  }

  public String getProductId() {
    return this.productId;
  }

  public LockInfo setProductId(String productId) {
    this.productId = productId;
    
    return this;
  }

  public void unsetProductId() {
    this.productId = null;
  }

  /** Returns true if field productId is set (has been asigned a value) and false otherwise */
  public boolean isSetProductId() {
    return this.productId != null;
  }

  public void setProductIdIsSet(boolean value) {
    if (!value) {
      this.productId = null;
    }
  }

  public String getSkuNum() {
    return this.skuNum;
  }

  public LockInfo setSkuNum(String skuNum) {
    this.skuNum = skuNum;
    
    return this;
  }

  public void unsetSkuNum() {
    this.skuNum = null;
  }

  /** Returns true if field skuNum is set (has been asigned a value) and false otherwise */
  public boolean isSetSkuNum() {
    return this.skuNum != null;
  }

  public void setSkuNumIsSet(boolean value) {
    if (!value) {
      this.skuNum = null;
    }
  }

  public int getApplyCount() {
    return this.applyCount;
  }

  public LockInfo setApplyCount(int applyCount) {
    this.applyCount = applyCount;
    setApplyCountIsSet(true);

    return this;
  }

  public void unsetApplyCount() {
  __isset_bit_vector.clear(__APPLYCOUNT_ISSET_ID);
  }

  /** Returns true if field applyCount is set (has been asigned a value) and false otherwise */
  public boolean isSetApplyCount() {
    return __isset_bit_vector.get(__APPLYCOUNT_ISSET_ID);
  }

  public void setApplyCountIsSet(boolean value) {
    __isset_bit_vector.set(__APPLYCOUNT_ISSET_ID, value);
  }

  public int getLockCount() {
    return this.lockCount;
  }

  public LockInfo setLockCount(int lockCount) {
    this.lockCount = lockCount;
    setLockCountIsSet(true);

    return this;
  }

  public void unsetLockCount() {
  __isset_bit_vector.clear(__LOCKCOUNT_ISSET_ID);
  }

  /** Returns true if field lockCount is set (has been asigned a value) and false otherwise */
  public boolean isSetLockCount() {
    return __isset_bit_vector.get(__LOCKCOUNT_ISSET_ID);
  }

  public void setLockCountIsSet(boolean value) {
    __isset_bit_vector.set(__LOCKCOUNT_ISSET_ID, value);
  }

  public int getStorehouseId() {
    return this.storehouseId;
  }

  public LockInfo setStorehouseId(int storehouseId) {
    this.storehouseId = storehouseId;
    setStorehouseIdIsSet(true);

    return this;
  }

  public void unsetStorehouseId() {
  __isset_bit_vector.clear(__STOREHOUSEID_ISSET_ID);
  }

  /** Returns true if field storehouseId is set (has been asigned a value) and false otherwise */
  public boolean isSetStorehouseId() {
    return __isset_bit_vector.get(__STOREHOUSEID_ISSET_ID);
  }

  public void setStorehouseIdIsSet(boolean value) {
    __isset_bit_vector.set(__STOREHOUSEID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRODUCT_ID:
      if (value == null) {
        unsetProductId();
      } else {
        setProductId((String)value);
      }
      break;
    case SKU_NUM:
      if (value == null) {
        unsetSkuNum();
      } else {
        setSkuNum((String)value);
      }
      break;
    case APPLY_COUNT:
      if (value == null) {
        unsetApplyCount();
      } else {
        setApplyCount((Integer)value);
      }
      break;
    case LOCK_COUNT:
      if (value == null) {
        unsetLockCount();
      } else {
        setLockCount((Integer)value);
      }
      break;
    case STOREHOUSE_ID:
      if (value == null) {
        unsetStorehouseId();
      } else {
        setStorehouseId((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT_ID:
      return getProductId();
    case SKU_NUM:
      return getSkuNum();
    case APPLY_COUNT:
      return new Integer(getApplyCount());
    case LOCK_COUNT:
      return new Integer(getLockCount());
    case STOREHOUSE_ID:
      return new Integer(getStorehouseId());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRODUCT_ID:
      return isSetProductId();
    case SKU_NUM:
      return isSetSkuNum();
    case APPLY_COUNT:
      return isSetApplyCount();
    case LOCK_COUNT:
      return isSetLockCount();
    case STOREHOUSE_ID:
      return isSetStorehouseId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LockInfo)
      return this.equals((LockInfo)that);
    return false;
  }

  public boolean equals(LockInfo that) {
    if (that == null)
      return false;
    boolean this_present_productId = true && this.isSetProductId();
    boolean that_present_productId = true && that.isSetProductId();
    if (this_present_productId || that_present_productId) {
      if (!(this_present_productId && that_present_productId))
        return false;
      if (!this.productId.equals(that.productId))
        return false;
    }
    boolean this_present_skuNum = true && this.isSetSkuNum();
    boolean that_present_skuNum = true && that.isSetSkuNum();
    if (this_present_skuNum || that_present_skuNum) {
      if (!(this_present_skuNum && that_present_skuNum))
        return false;
      if (!this.skuNum.equals(that.skuNum))
        return false;
    }
    boolean this_present_applyCount = true;
    boolean that_present_applyCount = true;
    if (this_present_applyCount || that_present_applyCount) {
      if (!(this_present_applyCount && that_present_applyCount))
        return false;
      if (this.applyCount != that.applyCount)
        return false;
    }
    boolean this_present_lockCount = true;
    boolean that_present_lockCount = true;
    if (this_present_lockCount || that_present_lockCount) {
      if (!(this_present_lockCount && that_present_lockCount))
        return false;
      if (this.lockCount != that.lockCount)
        return false;
    }
    boolean this_present_storehouseId = true && this.isSetStorehouseId();
    boolean that_present_storehouseId = true && that.isSetStorehouseId();
    if (this_present_storehouseId || that_present_storehouseId) {
      if (!(this_present_storehouseId && that_present_storehouseId))
        return false;
      if (this.storehouseId != that.storehouseId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_productId = true && (isSetProductId());
    builder.append(present_productId);
    if (present_productId)
      builder.append(productId);
    boolean present_skuNum = true && (isSetSkuNum());
    builder.append(present_skuNum);
    if (present_skuNum)
      builder.append(skuNum);
    boolean present_applyCount = true;
    builder.append(present_applyCount);
    if (present_applyCount)
      builder.append(applyCount);
    boolean present_lockCount = true;
    builder.append(present_lockCount);
    if (present_lockCount)
      builder.append(lockCount);
    boolean present_storehouseId = true && (isSetStorehouseId());
    builder.append(present_storehouseId);
    if (present_storehouseId)
      builder.append(storehouseId);
    return builder.toHashCode();
  }

  public int compareTo(LockInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LockInfo typedOther = (LockInfo)other;

    lastComparison = Boolean.valueOf(isSetProductId()).compareTo(typedOther.isSetProductId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductId()) {
      lastComparison = TBaseHelper.compareTo(this.productId, typedOther.productId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSkuNum()).compareTo(typedOther.isSetSkuNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkuNum()) {
      lastComparison = TBaseHelper.compareTo(this.skuNum, typedOther.skuNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplyCount()).compareTo(typedOther.isSetApplyCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplyCount()) {
      lastComparison = TBaseHelper.compareTo(this.applyCount, typedOther.applyCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLockCount()).compareTo(typedOther.isSetLockCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLockCount()) {
      lastComparison = TBaseHelper.compareTo(this.lockCount, typedOther.lockCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStorehouseId()).compareTo(typedOther.isSetStorehouseId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStorehouseId()) {
      lastComparison = TBaseHelper.compareTo(this.storehouseId, typedOther.storehouseId);
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
        case 1: // PRODUCT_ID
          if (field.type == TType.STRING) {
            this.productId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SKU_NUM
          if (field.type == TType.STRING) {
            this.skuNum = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // APPLY_COUNT
          if (field.type == TType.I32) {
            this.applyCount = iprot.readI32();
            setApplyCountIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LOCK_COUNT
          if (field.type == TType.I32) {
            this.lockCount = iprot.readI32();
            setLockCountIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // STOREHOUSE_ID
          if (field.type == TType.I32) {
            this.storehouseId = iprot.readI32();
            setStorehouseIdIsSet(true);
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
    if (this.productId != null) {
      oprot.writeFieldBegin(PRODUCT_ID_FIELD_DESC);
      oprot.writeString(this.productId);
      oprot.writeFieldEnd();
    }
    if (this.skuNum != null) {
      oprot.writeFieldBegin(SKU_NUM_FIELD_DESC);
      oprot.writeString(this.skuNum);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(APPLY_COUNT_FIELD_DESC);
    oprot.writeI32(this.applyCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LOCK_COUNT_FIELD_DESC);
    oprot.writeI32(this.lockCount);
    oprot.writeFieldEnd();
    if (isSetStorehouseId()) {
      oprot.writeFieldBegin(STOREHOUSE_ID_FIELD_DESC);
      oprot.writeI32(this.storehouseId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LockInfo(");
    boolean first = true;
    sb.append("productId:");
    if (this.productId == null) {
      sb.append("null");
    } else {
      sb.append(this.productId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("skuNum:");
    if (this.skuNum == null) {
      sb.append("null");
    } else {
      sb.append(this.skuNum);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applyCount:");
    sb.append(this.applyCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lockCount:");
    sb.append(this.lockCount);
    first = false;
    if (isSetStorehouseId()) {
      if (!first) sb.append(", ");
      sb.append("storehouseId:");
      sb.append(this.storehouseId);
      first = false;
      }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
