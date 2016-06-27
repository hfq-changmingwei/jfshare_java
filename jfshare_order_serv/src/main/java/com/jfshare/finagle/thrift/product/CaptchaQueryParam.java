/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.product;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.*;

import java.util.*;

// No additional import required for struct/union.

public class CaptchaQueryParam implements TBase<CaptchaQueryParam, CaptchaQueryParam._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CaptchaQueryParam");

  private static final TField SELLER_ID_FIELD_DESC = new TField("sellerId", TType.I32, (short)1);
  private static final TField PAGINATION_FIELD_DESC = new TField("pagination", TType.STRUCT, (short)2);
  private static final TField MONTH_QUERY_FIELD_DESC = new TField("monthQuery", TType.STRING, (short)3);
  private static final TField PRODUCT_ID_FIELD_DESC = new TField("productId", TType.STRING, (short)4);


  public int sellerId;
  public com.jfshare.finagle.thrift.pagination.Pagination pagination;
  public String monthQuery;
  public String productId;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SELLER_ID((short)1, "sellerId"),
    PAGINATION((short)2, "pagination"),
    MONTH_QUERY((short)3, "monthQuery"),
    PRODUCT_ID((short)4, "productId");
  
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
        case 1: // SELLER_ID
  	return SELLER_ID;
        case 2: // PAGINATION
  	return PAGINATION;
        case 3: // MONTH_QUERY
  	return MONTH_QUERY;
        case 4: // PRODUCT_ID
  	return PRODUCT_ID;
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
  private static final int __SELLERID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SELLER_ID, new FieldMetaData("sellerId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.PAGINATION, new FieldMetaData("pagination", TFieldRequirementType.DEFAULT,
      new StructMetaData(TType.STRUCT, com.jfshare.finagle.thrift.pagination.Pagination.class)));
    tmpMap.put(_Fields.MONTH_QUERY, new FieldMetaData("monthQuery", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PRODUCT_ID, new FieldMetaData("productId", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(CaptchaQueryParam.class, metaDataMap);
  }


  public CaptchaQueryParam() {
  }

  public CaptchaQueryParam(
    int sellerId,
    com.jfshare.finagle.thrift.pagination.Pagination pagination)
  {
    this();
    this.sellerId = sellerId;
    setSellerIdIsSet(true);
    this.pagination = pagination;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CaptchaQueryParam(CaptchaQueryParam other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.sellerId = other.sellerId;
    if (other.isSetPagination()) {
      this.pagination = new com.jfshare.finagle.thrift.pagination.Pagination(other.pagination);
    }
    if (other.isSetMonthQuery()) {
      this.monthQuery = other.monthQuery;
    }
    if (other.isSetProductId()) {
      this.productId = other.productId;
    }
  }

  public CaptchaQueryParam deepCopy() {
    return new CaptchaQueryParam(this);
  }

  @Override
  public void clear() {
    setSellerIdIsSet(false);
    this.sellerId = 0;
    this.pagination = null;
    this.monthQuery = null;
    this.productId = null;
  }

  public int getSellerId() {
    return this.sellerId;
  }

  public CaptchaQueryParam setSellerId(int sellerId) {
    this.sellerId = sellerId;
    setSellerIdIsSet(true);

    return this;
  }

  public void unsetSellerId() {
  __isset_bit_vector.clear(__SELLERID_ISSET_ID);
  }

  /** Returns true if field sellerId is set (has been asigned a value) and false otherwise */
  public boolean isSetSellerId() {
    return __isset_bit_vector.get(__SELLERID_ISSET_ID);
  }

  public void setSellerIdIsSet(boolean value) {
    __isset_bit_vector.set(__SELLERID_ISSET_ID, value);
  }

  public com.jfshare.finagle.thrift.pagination.Pagination getPagination() {
    return this.pagination;
  }

  public CaptchaQueryParam setPagination(com.jfshare.finagle.thrift.pagination.Pagination pagination) {
    this.pagination = pagination;
    
    return this;
  }

  public void unsetPagination() {
    this.pagination = null;
  }

  /** Returns true if field pagination is set (has been asigned a value) and false otherwise */
  public boolean isSetPagination() {
    return this.pagination != null;
  }

  public void setPaginationIsSet(boolean value) {
    if (!value) {
      this.pagination = null;
    }
  }

  public String getMonthQuery() {
    return this.monthQuery;
  }

  public CaptchaQueryParam setMonthQuery(String monthQuery) {
    this.monthQuery = monthQuery;
    
    return this;
  }

  public void unsetMonthQuery() {
    this.monthQuery = null;
  }

  /** Returns true if field monthQuery is set (has been asigned a value) and false otherwise */
  public boolean isSetMonthQuery() {
    return this.monthQuery != null;
  }

  public void setMonthQueryIsSet(boolean value) {
    if (!value) {
      this.monthQuery = null;
    }
  }

  public String getProductId() {
    return this.productId;
  }

  public CaptchaQueryParam setProductId(String productId) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SELLER_ID:
      if (value == null) {
        unsetSellerId();
      } else {
        setSellerId((Integer)value);
      }
      break;
    case PAGINATION:
      if (value == null) {
        unsetPagination();
      } else {
        setPagination((com.jfshare.finagle.thrift.pagination.Pagination)value);
      }
      break;
    case MONTH_QUERY:
      if (value == null) {
        unsetMonthQuery();
      } else {
        setMonthQuery((String)value);
      }
      break;
    case PRODUCT_ID:
      if (value == null) {
        unsetProductId();
      } else {
        setProductId((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SELLER_ID:
      return new Integer(getSellerId());
    case PAGINATION:
      return getPagination();
    case MONTH_QUERY:
      return getMonthQuery();
    case PRODUCT_ID:
      return getProductId();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SELLER_ID:
      return isSetSellerId();
    case PAGINATION:
      return isSetPagination();
    case MONTH_QUERY:
      return isSetMonthQuery();
    case PRODUCT_ID:
      return isSetProductId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CaptchaQueryParam)
      return this.equals((CaptchaQueryParam)that);
    return false;
  }

  public boolean equals(CaptchaQueryParam that) {
    if (that == null)
      return false;
    boolean this_present_sellerId = true;
    boolean that_present_sellerId = true;
    if (this_present_sellerId || that_present_sellerId) {
      if (!(this_present_sellerId && that_present_sellerId))
        return false;
      if (this.sellerId != that.sellerId)
        return false;
    }
    boolean this_present_pagination = true && this.isSetPagination();
    boolean that_present_pagination = true && that.isSetPagination();
    if (this_present_pagination || that_present_pagination) {
      if (!(this_present_pagination && that_present_pagination))
        return false;
      if (!this.pagination.equals(that.pagination))
        return false;
    }
    boolean this_present_monthQuery = true && this.isSetMonthQuery();
    boolean that_present_monthQuery = true && that.isSetMonthQuery();
    if (this_present_monthQuery || that_present_monthQuery) {
      if (!(this_present_monthQuery && that_present_monthQuery))
        return false;
      if (!this.monthQuery.equals(that.monthQuery))
        return false;
    }
    boolean this_present_productId = true && this.isSetProductId();
    boolean that_present_productId = true && that.isSetProductId();
    if (this_present_productId || that_present_productId) {
      if (!(this_present_productId && that_present_productId))
        return false;
      if (!this.productId.equals(that.productId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_sellerId = true;
    builder.append(present_sellerId);
    if (present_sellerId)
      builder.append(sellerId);
    boolean present_pagination = true && (isSetPagination());
    builder.append(present_pagination);
    if (present_pagination)
      builder.append(pagination);
    boolean present_monthQuery = true && (isSetMonthQuery());
    builder.append(present_monthQuery);
    if (present_monthQuery)
      builder.append(monthQuery);
    boolean present_productId = true && (isSetProductId());
    builder.append(present_productId);
    if (present_productId)
      builder.append(productId);
    return builder.toHashCode();
  }

  public int compareTo(CaptchaQueryParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CaptchaQueryParam typedOther = (CaptchaQueryParam)other;

    lastComparison = Boolean.valueOf(isSetSellerId()).compareTo(typedOther.isSetSellerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSellerId()) {
      lastComparison = TBaseHelper.compareTo(this.sellerId, typedOther.sellerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPagination()).compareTo(typedOther.isSetPagination());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPagination()) {
      lastComparison = TBaseHelper.compareTo(this.pagination, typedOther.pagination);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMonthQuery()).compareTo(typedOther.isSetMonthQuery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonthQuery()) {
      lastComparison = TBaseHelper.compareTo(this.monthQuery, typedOther.monthQuery);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
        case 1: // SELLER_ID
          if (field.type == TType.I32) {
            this.sellerId = iprot.readI32();
            setSellerIdIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PAGINATION
          if (field.type == TType.STRUCT) {
            this.pagination = new com.jfshare.finagle.thrift.pagination.Pagination();
            this.pagination.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MONTH_QUERY
          if (field.type == TType.STRING) {
            this.monthQuery = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PRODUCT_ID
          if (field.type == TType.STRING) {
            this.productId = iprot.readString();
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
    oprot.writeFieldBegin(SELLER_ID_FIELD_DESC);
    oprot.writeI32(this.sellerId);
    oprot.writeFieldEnd();
    if (this.pagination != null) {
      oprot.writeFieldBegin(PAGINATION_FIELD_DESC);
      this.pagination.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.monthQuery != null) {
      if (isSetMonthQuery()) {
        oprot.writeFieldBegin(MONTH_QUERY_FIELD_DESC);
        oprot.writeString(this.monthQuery);
        oprot.writeFieldEnd();
      }
    }
    if (this.productId != null) {
      if (isSetProductId()) {
        oprot.writeFieldBegin(PRODUCT_ID_FIELD_DESC);
        oprot.writeString(this.productId);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CaptchaQueryParam(");
    boolean first = true;
    sb.append("sellerId:");
    sb.append(this.sellerId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pagination:");
    if (this.pagination == null) {
      sb.append("null");
    } else {
      sb.append(this.pagination);
    }
    first = false;
    if (isSetMonthQuery()) {
      if (!first) sb.append(", ");
      sb.append("monthQuery:");
      if (this.monthQuery == null) {
        sb.append("null");
      } else {
        sb.append(this.monthQuery);
      }
      first = false;
      }
    if (isSetProductId()) {
      if (!first) sb.append(", ");
      sb.append("productId:");
      if (this.productId == null) {
        sb.append("null");
      } else {
        sb.append(this.productId);
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
