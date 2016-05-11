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

public class QueryParam implements TBase<QueryParam, QueryParam._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("QueryParam");

  private static final TField PRODUCT_ID_FIELD_DESC = new TField("productId", TType.STRING, (short)1);
  private static final TField STOREHOUSE_ID_FIELD_DESC = new TField("storehouseId", TType.STRING, (short)2);
  private static final TField SKU_NUM_FIELD_DESC = new TField("skuNum", TType.STRING, (short)3);
  private static final TField QUERY_TYPE_FIELD_DESC = new TField("queryType", TType.STRING, (short)4);


  public String productId;
  public String storehouseId;
  public String skuNum;
  public String queryType;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PRODUCT_ID((short)1, "productId"),
    STOREHOUSE_ID((short)2, "storehouseId"),
    SKU_NUM((short)3, "skuNum"),
    QUERY_TYPE((short)4, "queryType");
  
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
        case 2: // STOREHOUSE_ID
  	return STOREHOUSE_ID;
        case 3: // SKU_NUM
  	return SKU_NUM;
        case 4: // QUERY_TYPE
  	return QUERY_TYPE;
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
    tmpMap.put(_Fields.PRODUCT_ID, new FieldMetaData("productId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.STOREHOUSE_ID, new FieldMetaData("storehouseId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SKU_NUM, new FieldMetaData("skuNum", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.QUERY_TYPE, new FieldMetaData("queryType", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(QueryParam.class, metaDataMap);
  }


  public QueryParam() {
  }

  public QueryParam(
    String productId,
    String storehouseId,
    String skuNum,
    String queryType)
  {
    this();
    this.productId = productId;
    this.storehouseId = storehouseId;
    this.skuNum = skuNum;
    this.queryType = queryType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryParam(QueryParam other) {
    if (other.isSetProductId()) {
      this.productId = other.productId;
    }
    if (other.isSetStorehouseId()) {
      this.storehouseId = other.storehouseId;
    }
    if (other.isSetSkuNum()) {
      this.skuNum = other.skuNum;
    }
    if (other.isSetQueryType()) {
      this.queryType = other.queryType;
    }
  }

  public QueryParam deepCopy() {
    return new QueryParam(this);
  }

  @Override
  public void clear() {
    this.productId = null;
    this.storehouseId = null;
    this.skuNum = null;
    this.queryType = null;
  }

  public String getProductId() {
    return this.productId;
  }

  public QueryParam setProductId(String productId) {
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

  public String getStorehouseId() {
    return this.storehouseId;
  }

  public QueryParam setStorehouseId(String storehouseId) {
    this.storehouseId = storehouseId;
    
    return this;
  }

  public void unsetStorehouseId() {
    this.storehouseId = null;
  }

  /** Returns true if field storehouseId is set (has been asigned a value) and false otherwise */
  public boolean isSetStorehouseId() {
    return this.storehouseId != null;
  }

  public void setStorehouseIdIsSet(boolean value) {
    if (!value) {
      this.storehouseId = null;
    }
  }

  public String getSkuNum() {
    return this.skuNum;
  }

  public QueryParam setSkuNum(String skuNum) {
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

  public String getQueryType() {
    return this.queryType;
  }

  public QueryParam setQueryType(String queryType) {
    this.queryType = queryType;
    
    return this;
  }

  public void unsetQueryType() {
    this.queryType = null;
  }

  /** Returns true if field queryType is set (has been asigned a value) and false otherwise */
  public boolean isSetQueryType() {
    return this.queryType != null;
  }

  public void setQueryTypeIsSet(boolean value) {
    if (!value) {
      this.queryType = null;
    }
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
    case STOREHOUSE_ID:
      if (value == null) {
        unsetStorehouseId();
      } else {
        setStorehouseId((String)value);
      }
      break;
    case SKU_NUM:
      if (value == null) {
        unsetSkuNum();
      } else {
        setSkuNum((String)value);
      }
      break;
    case QUERY_TYPE:
      if (value == null) {
        unsetQueryType();
      } else {
        setQueryType((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT_ID:
      return getProductId();
    case STOREHOUSE_ID:
      return getStorehouseId();
    case SKU_NUM:
      return getSkuNum();
    case QUERY_TYPE:
      return getQueryType();
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
    case STOREHOUSE_ID:
      return isSetStorehouseId();
    case SKU_NUM:
      return isSetSkuNum();
    case QUERY_TYPE:
      return isSetQueryType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryParam)
      return this.equals((QueryParam)that);
    return false;
  }

  public boolean equals(QueryParam that) {
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
    boolean this_present_storehouseId = true && this.isSetStorehouseId();
    boolean that_present_storehouseId = true && that.isSetStorehouseId();
    if (this_present_storehouseId || that_present_storehouseId) {
      if (!(this_present_storehouseId && that_present_storehouseId))
        return false;
      if (!this.storehouseId.equals(that.storehouseId))
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
    boolean this_present_queryType = true && this.isSetQueryType();
    boolean that_present_queryType = true && that.isSetQueryType();
    if (this_present_queryType || that_present_queryType) {
      if (!(this_present_queryType && that_present_queryType))
        return false;
      if (!this.queryType.equals(that.queryType))
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
    boolean present_storehouseId = true && (isSetStorehouseId());
    builder.append(present_storehouseId);
    if (present_storehouseId)
      builder.append(storehouseId);
    boolean present_skuNum = true && (isSetSkuNum());
    builder.append(present_skuNum);
    if (present_skuNum)
      builder.append(skuNum);
    boolean present_queryType = true && (isSetQueryType());
    builder.append(present_queryType);
    if (present_queryType)
      builder.append(queryType);
    return builder.toHashCode();
  }

  public int compareTo(QueryParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryParam typedOther = (QueryParam)other;

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
    lastComparison = Boolean.valueOf(isSetQueryType()).compareTo(typedOther.isSetQueryType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryType()) {
      lastComparison = TBaseHelper.compareTo(this.queryType, typedOther.queryType);
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
        case 2: // STOREHOUSE_ID
          if (field.type == TType.STRING) {
            this.storehouseId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SKU_NUM
          if (field.type == TType.STRING) {
            this.skuNum = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // QUERY_TYPE
          if (field.type == TType.STRING) {
            this.queryType = iprot.readString();
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
    if (this.storehouseId != null) {
      oprot.writeFieldBegin(STOREHOUSE_ID_FIELD_DESC);
      oprot.writeString(this.storehouseId);
      oprot.writeFieldEnd();
    }
    if (this.skuNum != null) {
      oprot.writeFieldBegin(SKU_NUM_FIELD_DESC);
      oprot.writeString(this.skuNum);
      oprot.writeFieldEnd();
    }
    if (this.queryType != null) {
      oprot.writeFieldBegin(QUERY_TYPE_FIELD_DESC);
      oprot.writeString(this.queryType);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueryParam(");
    boolean first = true;
    sb.append("productId:");
    if (this.productId == null) {
      sb.append("null");
    } else {
      sb.append(this.productId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("storehouseId:");
    if (this.storehouseId == null) {
      sb.append("null");
    } else {
      sb.append(this.storehouseId);
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
    sb.append("queryType:");
    if (this.queryType == null) {
      sb.append("null");
    } else {
      sb.append(this.queryType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}