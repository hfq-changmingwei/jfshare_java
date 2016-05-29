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

public class PayOrderInfo implements TBase<PayOrderInfo, PayOrderInfo._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("PayOrderInfo");

  private static final TField USER_ID_FIELD_DESC = new TField("userId", TType.I32, (short)1);
  private static final TField USER_NAME_FIELD_DESC = new TField("userName", TType.STRING, (short)2);
  private static final TField SELLER_ID_FIELD_DESC = new TField("sellerId", TType.I32, (short)3);
  private static final TField SELLER_NAME_FIELD_DESC = new TField("sellerName", TType.STRING, (short)4);
  private static final TField AMOUNT_FIELD_DESC = new TField("amount", TType.STRING, (short)5);
  private static final TField TRADE_CODE_FIELD_DESC = new TField("tradeCode", TType.STRING, (short)6);


  public int userId;
  public String userName;
  public int sellerId;
  public String sellerName;
  public String amount;
  public String tradeCode;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USER_NAME((short)2, "userName"),
    SELLER_ID((short)3, "sellerId"),
    SELLER_NAME((short)4, "sellerName"),
    AMOUNT((short)5, "amount"),
    TRADE_CODE((short)6, "tradeCode");
  
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
        case 2: // USER_NAME
  	return USER_NAME;
        case 3: // SELLER_ID
  	return SELLER_ID;
        case 4: // SELLER_NAME
  	return SELLER_NAME;
        case 5: // AMOUNT
  	return AMOUNT;
        case 6: // TRADE_CODE
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
  private static final int __SELLERID_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new FieldMetaData("userId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.USER_NAME, new FieldMetaData("userName", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SELLER_ID, new FieldMetaData("sellerId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.SELLER_NAME, new FieldMetaData("sellerName", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.AMOUNT, new FieldMetaData("amount", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.TRADE_CODE, new FieldMetaData("tradeCode", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(PayOrderInfo.class, metaDataMap);
  }


  public PayOrderInfo() {
  }

  public PayOrderInfo(
    int userId,
    String userName,
    int sellerId,
    String sellerName,
    String amount,
    String tradeCode)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.userName = userName;
    this.sellerId = sellerId;
    setSellerIdIsSet(true);
    this.sellerName = sellerName;
    this.amount = amount;
    this.tradeCode = tradeCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PayOrderInfo(PayOrderInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.userId = other.userId;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    this.sellerId = other.sellerId;
    if (other.isSetSellerName()) {
      this.sellerName = other.sellerName;
    }
    if (other.isSetAmount()) {
      this.amount = other.amount;
    }
    if (other.isSetTradeCode()) {
      this.tradeCode = other.tradeCode;
    }
  }

  public PayOrderInfo deepCopy() {
    return new PayOrderInfo(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.userName = null;
    setSellerIdIsSet(false);
    this.sellerId = 0;
    this.sellerName = null;
    this.amount = null;
    this.tradeCode = null;
  }

  public int getUserId() {
    return this.userId;
  }

  public PayOrderInfo setUserId(int userId) {
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

  public String getUserName() {
    return this.userName;
  }

  public PayOrderInfo setUserName(String userName) {
    this.userName = userName;
    
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been asigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public int getSellerId() {
    return this.sellerId;
  }

  public PayOrderInfo setSellerId(int sellerId) {
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

  public String getSellerName() {
    return this.sellerName;
  }

  public PayOrderInfo setSellerName(String sellerName) {
    this.sellerName = sellerName;
    
    return this;
  }

  public void unsetSellerName() {
    this.sellerName = null;
  }

  /** Returns true if field sellerName is set (has been asigned a value) and false otherwise */
  public boolean isSetSellerName() {
    return this.sellerName != null;
  }

  public void setSellerNameIsSet(boolean value) {
    if (!value) {
      this.sellerName = null;
    }
  }

  public String getAmount() {
    return this.amount;
  }

  public PayOrderInfo setAmount(String amount) {
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

  public String getTradeCode() {
    return this.tradeCode;
  }

  public PayOrderInfo setTradeCode(String tradeCode) {
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
    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;
    case SELLER_ID:
      if (value == null) {
        unsetSellerId();
      } else {
        setSellerId((Integer)value);
      }
      break;
    case SELLER_NAME:
      if (value == null) {
        unsetSellerName();
      } else {
        setSellerName((String)value);
      }
      break;
    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((String)value);
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
    case USER_NAME:
      return getUserName();
    case SELLER_ID:
      return new Integer(getSellerId());
    case SELLER_NAME:
      return getSellerName();
    case AMOUNT:
      return getAmount();
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
    case USER_NAME:
      return isSetUserName();
    case SELLER_ID:
      return isSetSellerId();
    case SELLER_NAME:
      return isSetSellerName();
    case AMOUNT:
      return isSetAmount();
    case TRADE_CODE:
      return isSetTradeCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PayOrderInfo)
      return this.equals((PayOrderInfo)that);
    return false;
  }

  public boolean equals(PayOrderInfo that) {
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
    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }
    boolean this_present_sellerId = true;
    boolean that_present_sellerId = true;
    if (this_present_sellerId || that_present_sellerId) {
      if (!(this_present_sellerId && that_present_sellerId))
        return false;
      if (this.sellerId != that.sellerId)
        return false;
    }
    boolean this_present_sellerName = true && this.isSetSellerName();
    boolean that_present_sellerName = true && that.isSetSellerName();
    if (this_present_sellerName || that_present_sellerName) {
      if (!(this_present_sellerName && that_present_sellerName))
        return false;
      if (!this.sellerName.equals(that.sellerName))
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
    boolean present_userName = true && (isSetUserName());
    builder.append(present_userName);
    if (present_userName)
      builder.append(userName);
    boolean present_sellerId = true;
    builder.append(present_sellerId);
    if (present_sellerId)
      builder.append(sellerId);
    boolean present_sellerName = true && (isSetSellerName());
    builder.append(present_sellerName);
    if (present_sellerName)
      builder.append(sellerName);
    boolean present_amount = true && (isSetAmount());
    builder.append(present_amount);
    if (present_amount)
      builder.append(amount);
    boolean present_tradeCode = true && (isSetTradeCode());
    builder.append(present_tradeCode);
    if (present_tradeCode)
      builder.append(tradeCode);
    return builder.toHashCode();
  }

  public int compareTo(PayOrderInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PayOrderInfo typedOther = (PayOrderInfo)other;

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
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(typedOther.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = TBaseHelper.compareTo(this.userName, typedOther.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetSellerName()).compareTo(typedOther.isSetSellerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSellerName()) {
      lastComparison = TBaseHelper.compareTo(this.sellerName, typedOther.sellerName);
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
        case 2: // USER_NAME
          if (field.type == TType.STRING) {
            this.userName = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SELLER_ID
          if (field.type == TType.I32) {
            this.sellerId = iprot.readI32();
            setSellerIdIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SELLER_NAME
          if (field.type == TType.STRING) {
            this.sellerName = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // AMOUNT
          if (field.type == TType.STRING) {
            this.amount = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // TRADE_CODE
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
    if (this.userName != null) {
      oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
      oprot.writeString(this.userName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SELLER_ID_FIELD_DESC);
    oprot.writeI32(this.sellerId);
    oprot.writeFieldEnd();
    if (this.sellerName != null) {
      oprot.writeFieldBegin(SELLER_NAME_FIELD_DESC);
      oprot.writeString(this.sellerName);
      oprot.writeFieldEnd();
    }
    if (this.amount != null) {
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeString(this.amount);
      oprot.writeFieldEnd();
    }
    if (this.tradeCode != null) {
      oprot.writeFieldBegin(TRADE_CODE_FIELD_DESC);
      oprot.writeString(this.tradeCode);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PayOrderInfo(");
    boolean first = true;
    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sellerId:");
    sb.append(this.sellerId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sellerName:");
    if (this.sellerName == null) {
      sb.append("null");
    } else {
      sb.append(this.sellerName);
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
    sb.append("tradeCode:");
    if (this.tradeCode == null) {
      sb.append("null");
    } else {
      sb.append(this.tradeCode);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}