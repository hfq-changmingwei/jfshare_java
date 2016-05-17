/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.product;

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

public class ProductSurveyQueryBatchParam implements TBase<ProductSurveyQueryBatchParam, ProductSurveyQueryBatchParam._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ProductSurveyQueryBatchParam");

  private static final TField PRODUCT_IDS_FIELD_DESC = new TField("productIds", TType.LIST, (short)1);
  private static final TField FROM_TYPE_FIELD_DESC = new TField("fromType", TType.I32, (short)2);


  public List<String> productIds;
  public int fromType;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PRODUCT_IDS((short)1, "productIds"),
    FROM_TYPE((short)2, "fromType");
  
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
        case 1: // PRODUCT_IDS
  	return PRODUCT_IDS;
        case 2: // FROM_TYPE
  	return FROM_TYPE;
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
  private static final int __FROMTYPE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRODUCT_IDS, new FieldMetaData("productIds", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.FROM_TYPE, new FieldMetaData("fromType", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ProductSurveyQueryBatchParam.class, metaDataMap);
  }


  public ProductSurveyQueryBatchParam() {
  }

  public ProductSurveyQueryBatchParam(
    List<String> productIds,
    int fromType)
  {
    this();
    this.productIds = productIds;
    this.fromType = fromType;
    setFromTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductSurveyQueryBatchParam(ProductSurveyQueryBatchParam other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetProductIds()) {
      List<String> __this__productIds = new ArrayList<String>();
      for (String other_element : other.productIds) {
        __this__productIds.add(other_element);
      }
      this.productIds = __this__productIds;
    }
    this.fromType = other.fromType;
  }

  public ProductSurveyQueryBatchParam deepCopy() {
    return new ProductSurveyQueryBatchParam(this);
  }

  @Override
  public void clear() {
    this.productIds = null;
    setFromTypeIsSet(false);
    this.fromType = 0;
  }

  public int getProductIdsSize() {
    return (this.productIds == null) ? 0 : this.productIds.size();
  }

  public java.util.Iterator<String> getProductIdsIterator() {
    return (this.productIds == null) ? null : this.productIds.iterator();
  }

  public void addToProductIds(String elem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<String>();
    }
    this.productIds.add(elem);
  }

  public List<String> getProductIds() {
    return this.productIds;
  }

  public ProductSurveyQueryBatchParam setProductIds(List<String> productIds) {
    this.productIds = productIds;
    
    return this;
  }

  public void unsetProductIds() {
    this.productIds = null;
  }

  /** Returns true if field productIds is set (has been asigned a value) and false otherwise */
  public boolean isSetProductIds() {
    return this.productIds != null;
  }

  public void setProductIdsIsSet(boolean value) {
    if (!value) {
      this.productIds = null;
    }
  }

  public int getFromType() {
    return this.fromType;
  }

  public ProductSurveyQueryBatchParam setFromType(int fromType) {
    this.fromType = fromType;
    setFromTypeIsSet(true);

    return this;
  }

  public void unsetFromType() {
  __isset_bit_vector.clear(__FROMTYPE_ISSET_ID);
  }

  /** Returns true if field fromType is set (has been asigned a value) and false otherwise */
  public boolean isSetFromType() {
    return __isset_bit_vector.get(__FROMTYPE_ISSET_ID);
  }

  public void setFromTypeIsSet(boolean value) {
    __isset_bit_vector.set(__FROMTYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRODUCT_IDS:
      if (value == null) {
        unsetProductIds();
      } else {
        setProductIds((List<String>)value);
      }
      break;
    case FROM_TYPE:
      if (value == null) {
        unsetFromType();
      } else {
        setFromType((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT_IDS:
      return getProductIds();
    case FROM_TYPE:
      return new Integer(getFromType());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRODUCT_IDS:
      return isSetProductIds();
    case FROM_TYPE:
      return isSetFromType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductSurveyQueryBatchParam)
      return this.equals((ProductSurveyQueryBatchParam)that);
    return false;
  }

  public boolean equals(ProductSurveyQueryBatchParam that) {
    if (that == null)
      return false;
    boolean this_present_productIds = true && this.isSetProductIds();
    boolean that_present_productIds = true && that.isSetProductIds();
    if (this_present_productIds || that_present_productIds) {
      if (!(this_present_productIds && that_present_productIds))
        return false;
      if (!this.productIds.equals(that.productIds))
        return false;
    }
    boolean this_present_fromType = true;
    boolean that_present_fromType = true;
    if (this_present_fromType || that_present_fromType) {
      if (!(this_present_fromType && that_present_fromType))
        return false;
      if (this.fromType != that.fromType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_productIds = true && (isSetProductIds());
    builder.append(present_productIds);
    if (present_productIds)
      builder.append(productIds);
    boolean present_fromType = true;
    builder.append(present_fromType);
    if (present_fromType)
      builder.append(fromType);
    return builder.toHashCode();
  }

  public int compareTo(ProductSurveyQueryBatchParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ProductSurveyQueryBatchParam typedOther = (ProductSurveyQueryBatchParam)other;

    lastComparison = Boolean.valueOf(isSetProductIds()).compareTo(typedOther.isSetProductIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductIds()) {
      lastComparison = TBaseHelper.compareTo(this.productIds, typedOther.productIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromType()).compareTo(typedOther.isSetFromType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromType()) {
      lastComparison = TBaseHelper.compareTo(this.fromType, typedOther.fromType);
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
        case 1: // PRODUCT_IDS
          if (field.type == TType.LIST) {
            {
            TList _list16 = iprot.readListBegin();
            this.productIds = new ArrayList<String>(_list16.size);
            for (int _i17 = 0; _i17 < _list16.size; ++_i17)
            {
              String _elem18;
              _elem18 = iprot.readString();
              this.productIds.add(_elem18);
            }
            iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FROM_TYPE
          if (field.type == TType.I32) {
            this.fromType = iprot.readI32();
            setFromTypeIsSet(true);
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
    if (this.productIds != null) {
      oprot.writeFieldBegin(PRODUCT_IDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.productIds.size()));
        for (String _iter19 : this.productIds)
        {
          oprot.writeString(_iter19);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(FROM_TYPE_FIELD_DESC);
    oprot.writeI32(this.fromType);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ProductSurveyQueryBatchParam(");
    boolean first = true;
    sb.append("productIds:");
    if (this.productIds == null) {
      sb.append("null");
    } else {
      sb.append(this.productIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fromType:");
    sb.append(this.fromType);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
