/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.trade;

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

public class ExchangeParam implements TBase<ExchangeParam, ExchangeParam._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ExchangeParam");

  private static final TField USER_ID_FIELD_DESC = new TField("userId", TType.I32, (short)1);
  private static final TField PRODUCT_LIST_FIELD_DESC = new TField("productList", TType.LIST, (short)2);
  private static final TField AMOUNT_FIELD_DESC = new TField("amount", TType.STRING, (short)3);
  private static final TField SCORE_FIELD_DESC = new TField("score", TType.STRING, (short)4);
  private static final TField TRADE_CODE_FIELD_DESC = new TField("tradeCode", TType.STRING, (short)5);


  public int userId;
  public List<ExchangeProduct> productList;
  public String amount;
  public String score;
  public String tradeCode;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    USER_ID((short)1, "userId"),
    PRODUCT_LIST((short)2, "productList"),
    AMOUNT((short)3, "amount"),
    SCORE((short)4, "score"),
    TRADE_CODE((short)5, "tradeCode");
  
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
        case 1: // USER_ID
  	return USER_ID;
        case 2: // PRODUCT_LIST
  	return PRODUCT_LIST;
        case 3: // AMOUNT
  	return AMOUNT;
        case 4: // SCORE
  	return SCORE;
        case 5: // TRADE_CODE
  	return TRADE_CODE;
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
  private static final int __USERID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new FieldMetaData("userId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.PRODUCT_LIST, new FieldMetaData("productList", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, ExchangeProduct.class))));
    tmpMap.put(_Fields.AMOUNT, new FieldMetaData("amount", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SCORE, new FieldMetaData("score", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.TRADE_CODE, new FieldMetaData("tradeCode", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ExchangeParam.class, metaDataMap);
  }


  public ExchangeParam() {
  }

  public ExchangeParam(
    int userId,
    List<ExchangeProduct> productList,
    String amount,
    String score)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.productList = productList;
    this.amount = amount;
    this.score = score;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExchangeParam(ExchangeParam other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.userId = other.userId;
    if (other.isSetProductList()) {
      List<ExchangeProduct> __this__productList = new ArrayList<ExchangeProduct>();
      for (ExchangeProduct other_element : other.productList) {
        __this__productList.add(new ExchangeProduct(other_element));
      }
      this.productList = __this__productList;
    }
    if (other.isSetAmount()) {
      this.amount = other.amount;
    }
    if (other.isSetScore()) {
      this.score = other.score;
    }
    if (other.isSetTradeCode()) {
      this.tradeCode = other.tradeCode;
    }
  }

  public ExchangeParam deepCopy() {
    return new ExchangeParam(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.productList = null;
    this.amount = null;
    this.score = null;
    this.tradeCode = null;
  }

  public int getUserId() {
    return this.userId;
  }

  public ExchangeParam setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);

    return this;
  }

  public void unsetUserId() {
  __isset_bit_vector.clear(__USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been asigned a value) and false otherwise */
  public boolean isSetUserId() {
    return __isset_bit_vector.get(__USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bit_vector.set(__USERID_ISSET_ID, value);
  }

  public int getProductListSize() {
    return (this.productList == null) ? 0 : this.productList.size();
  }

  public java.util.Iterator<ExchangeProduct> getProductListIterator() {
    return (this.productList == null) ? null : this.productList.iterator();
  }

  public void addToProductList(ExchangeProduct elem) {
    if (this.productList == null) {
      this.productList = new ArrayList<ExchangeProduct>();
    }
    this.productList.add(elem);
  }

  public List<ExchangeProduct> getProductList() {
    return this.productList;
  }

  public ExchangeParam setProductList(List<ExchangeProduct> productList) {
    this.productList = productList;
    
    return this;
  }

  public void unsetProductList() {
    this.productList = null;
  }

  /** Returns true if field productList is set (has been asigned a value) and false otherwise */
  public boolean isSetProductList() {
    return this.productList != null;
  }

  public void setProductListIsSet(boolean value) {
    if (!value) {
      this.productList = null;
    }
  }

  public String getAmount() {
    return this.amount;
  }

  public ExchangeParam setAmount(String amount) {
    this.amount = amount;
    
    return this;
  }

  public void unsetAmount() {
    this.amount = null;
  }

  /** Returns true if field amount is set (has been asigned a value) and false otherwise */
  public boolean isSetAmount() {
    return this.amount != null;
  }

  public void setAmountIsSet(boolean value) {
    if (!value) {
      this.amount = null;
    }
  }

  public String getScore() {
    return this.score;
  }

  public ExchangeParam setScore(String score) {
    this.score = score;
    
    return this;
  }

  public void unsetScore() {
    this.score = null;
  }

  /** Returns true if field score is set (has been asigned a value) and false otherwise */
  public boolean isSetScore() {
    return this.score != null;
  }

  public void setScoreIsSet(boolean value) {
    if (!value) {
      this.score = null;
    }
  }

  public String getTradeCode() {
    return this.tradeCode;
  }

  public ExchangeParam setTradeCode(String tradeCode) {
    this.tradeCode = tradeCode;
    
    return this;
  }

  public void unsetTradeCode() {
    this.tradeCode = null;
  }

  /** Returns true if field tradeCode is set (has been asigned a value) and false otherwise */
  public boolean isSetTradeCode() {
    return this.tradeCode != null;
  }

  public void setTradeCodeIsSet(boolean value) {
    if (!value) {
      this.tradeCode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Integer)value);
      }
      break;
    case PRODUCT_LIST:
      if (value == null) {
        unsetProductList();
      } else {
        setProductList((List<ExchangeProduct>)value);
      }
      break;
    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((String)value);
      }
      break;
    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((String)value);
      }
      break;
    case TRADE_CODE:
      if (value == null) {
        unsetTradeCode();
      } else {
        setTradeCode((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return new Integer(getUserId());
    case PRODUCT_LIST:
      return getProductList();
    case AMOUNT:
      return getAmount();
    case SCORE:
      return getScore();
    case TRADE_CODE:
      return getTradeCode();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case PRODUCT_LIST:
      return isSetProductList();
    case AMOUNT:
      return isSetAmount();
    case SCORE:
      return isSetScore();
    case TRADE_CODE:
      return isSetTradeCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExchangeParam)
      return this.equals((ExchangeParam)that);
    return false;
  }

  public boolean equals(ExchangeParam that) {
    if (that == null)
      return false;
    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }
    boolean this_present_productList = true && this.isSetProductList();
    boolean that_present_productList = true && that.isSetProductList();
    if (this_present_productList || that_present_productList) {
      if (!(this_present_productList && that_present_productList))
        return false;
      if (!this.productList.equals(that.productList))
        return false;
    }
    boolean this_present_amount = true && this.isSetAmount();
    boolean that_present_amount = true && that.isSetAmount();
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (!this.amount.equals(that.amount))
        return false;
    }
    boolean this_present_score = true && this.isSetScore();
    boolean that_present_score = true && that.isSetScore();
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (!this.score.equals(that.score))
        return false;
    }
    boolean this_present_tradeCode = true && this.isSetTradeCode();
    boolean that_present_tradeCode = true && that.isSetTradeCode();
    if (this_present_tradeCode || that_present_tradeCode) {
      if (!(this_present_tradeCode && that_present_tradeCode))
        return false;
      if (!this.tradeCode.equals(that.tradeCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_userId = true;
    builder.append(present_userId);
    if (present_userId)
      builder.append(userId);
    boolean present_productList = true && (isSetProductList());
    builder.append(present_productList);
    if (present_productList)
      builder.append(productList);
    boolean present_amount = true && (isSetAmount());
    builder.append(present_amount);
    if (present_amount)
      builder.append(amount);
    boolean present_score = true && (isSetScore());
    builder.append(present_score);
    if (present_score)
      builder.append(score);
    boolean present_tradeCode = true && (isSetTradeCode());
    builder.append(present_tradeCode);
    if (present_tradeCode)
      builder.append(tradeCode);
    return builder.toHashCode();
  }

  public int compareTo(ExchangeParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExchangeParam typedOther = (ExchangeParam)other;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(typedOther.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = TBaseHelper.compareTo(this.userId, typedOther.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProductList()).compareTo(typedOther.isSetProductList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductList()) {
      lastComparison = TBaseHelper.compareTo(this.productList, typedOther.productList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmount()).compareTo(typedOther.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = TBaseHelper.compareTo(this.amount, typedOther.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScore()).compareTo(typedOther.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = TBaseHelper.compareTo(this.score, typedOther.score);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTradeCode()).compareTo(typedOther.isSetTradeCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTradeCode()) {
      lastComparison = TBaseHelper.compareTo(this.tradeCode, typedOther.tradeCode);
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
        case 1: // USER_ID
          if (field.type == TType.I32) {
            this.userId = iprot.readI32();
            setUserIdIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PRODUCT_LIST
          if (field.type == TType.LIST) {
            {
            TList _list12 = iprot.readListBegin();
            this.productList = new ArrayList<ExchangeProduct>(_list12.size);
            for (int _i13 = 0; _i13 < _list12.size; ++_i13)
            {
              ExchangeProduct _elem14;
              _elem14 = new ExchangeProduct();
              _elem14.read(iprot);
              this.productList.add(_elem14);
            }
            iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // AMOUNT
          if (field.type == TType.STRING) {
            this.amount = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SCORE
          if (field.type == TType.STRING) {
            this.score = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // TRADE_CODE
          if (field.type == TType.STRING) {
            this.tradeCode = iprot.readString();
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
    oprot.writeFieldBegin(USER_ID_FIELD_DESC);
    oprot.writeI32(this.userId);
    oprot.writeFieldEnd();
    if (this.productList != null) {
      oprot.writeFieldBegin(PRODUCT_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.productList.size()));
        for (ExchangeProduct _iter15 : this.productList)
        {
          _iter15.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.amount != null) {
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeString(this.amount);
      oprot.writeFieldEnd();
    }
    if (this.score != null) {
      oprot.writeFieldBegin(SCORE_FIELD_DESC);
      oprot.writeString(this.score);
      oprot.writeFieldEnd();
    }
    if (this.tradeCode != null) {
      if (isSetTradeCode()) {
        oprot.writeFieldBegin(TRADE_CODE_FIELD_DESC);
        oprot.writeString(this.tradeCode);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExchangeParam(");
    boolean first = true;
    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("productList:");
    if (this.productList == null) {
      sb.append("null");
    } else {
      sb.append(this.productList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    if (this.amount == null) {
      sb.append("null");
    } else {
      sb.append(this.amount);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("score:");
    if (this.score == null) {
      sb.append("null");
    } else {
      sb.append(this.score);
    }
    first = false;
    if (isSetTradeCode()) {
      if (!first) sb.append(", ");
      sb.append("tradeCode:");
      if (this.tradeCode == null) {
        sb.append("null");
      } else {
        sb.append(this.tradeCode);
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
