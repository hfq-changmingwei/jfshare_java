/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.seller;

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

public class LoginLog implements TBase<LoginLog, LoginLog._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LoginLog");

  private static final TField SELLER_ID_FIELD_DESC = new TField("sellerId", TType.I32, (short)1);
  private static final TField TOKEN_ID_FIELD_DESC = new TField("tokenId", TType.STRING, (short)2);
  private static final TField IP_FIELD_DESC = new TField("ip", TType.STRING, (short)3);
  private static final TField BROWSER_FIELD_DESC = new TField("browser", TType.STRING, (short)4);
  private static final TField FROM_SOURCE_FIELD_DESC = new TField("fromSource", TType.I32, (short)5);
  private static final TField LOGIN_AUTO_FIELD_DESC = new TField("loginAuto", TType.I32, (short)6);
  private static final TField LOGIN_TIME_FIELD_DESC = new TField("loginTime", TType.STRING, (short)7);
  private static final TField LOGOUT_TIME_FIELD_DESC = new TField("logoutTime", TType.STRING, (short)8);


  public int sellerId;
  public String tokenId;
  public String ip;
  public String browser;
  public int fromSource;
  public int loginAuto;
  public String loginTime;
  public String logoutTime;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SELLER_ID((short)1, "sellerId"),
    TOKEN_ID((short)2, "tokenId"),
    IP((short)3, "ip"),
    BROWSER((short)4, "browser"),
    FROM_SOURCE((short)5, "fromSource"),
    LOGIN_AUTO((short)6, "loginAuto"),
    LOGIN_TIME((short)7, "loginTime"),
    LOGOUT_TIME((short)8, "logoutTime");
  
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
        case 2: // TOKEN_ID
  	return TOKEN_ID;
        case 3: // IP
  	return IP;
        case 4: // BROWSER
  	return BROWSER;
        case 5: // FROM_SOURCE
  	return FROM_SOURCE;
        case 6: // LOGIN_AUTO
  	return LOGIN_AUTO;
        case 7: // LOGIN_TIME
  	return LOGIN_TIME;
        case 8: // LOGOUT_TIME
  	return LOGOUT_TIME;
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
  private static final int __FROMSOURCE_ISSET_ID = 1;
  private static final int __LOGINAUTO_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SELLER_ID, new FieldMetaData("sellerId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.TOKEN_ID, new FieldMetaData("tokenId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.IP, new FieldMetaData("ip", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BROWSER, new FieldMetaData("browser", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FROM_SOURCE, new FieldMetaData("fromSource", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.LOGIN_AUTO, new FieldMetaData("loginAuto", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.LOGIN_TIME, new FieldMetaData("loginTime", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.LOGOUT_TIME, new FieldMetaData("logoutTime", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(LoginLog.class, metaDataMap);
  }


  public LoginLog() {
  }

  public LoginLog(
    int sellerId,
    String tokenId,
    String ip,
    String browser,
    int fromSource,
    int loginAuto,
    String loginTime,
    String logoutTime)
  {
    this();
    this.sellerId = sellerId;
    setSellerIdIsSet(true);
    this.tokenId = tokenId;
    this.ip = ip;
    this.browser = browser;
    this.fromSource = fromSource;
    setFromSourceIsSet(true);
    this.loginAuto = loginAuto;
    setLoginAutoIsSet(true);
    this.loginTime = loginTime;
    this.logoutTime = logoutTime;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LoginLog(LoginLog other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.sellerId = other.sellerId;
    if (other.isSetTokenId()) {
      this.tokenId = other.tokenId;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
    if (other.isSetBrowser()) {
      this.browser = other.browser;
    }
    this.fromSource = other.fromSource;
    this.loginAuto = other.loginAuto;
    if (other.isSetLoginTime()) {
      this.loginTime = other.loginTime;
    }
    if (other.isSetLogoutTime()) {
      this.logoutTime = other.logoutTime;
    }
  }

  public LoginLog deepCopy() {
    return new LoginLog(this);
  }

  @Override
  public void clear() {
    setSellerIdIsSet(false);
    this.sellerId = 0;
    this.tokenId = null;
    this.ip = null;
    this.browser = null;
    setFromSourceIsSet(false);
    this.fromSource = 0;
    setLoginAutoIsSet(false);
    this.loginAuto = 0;
    this.loginTime = null;
    this.logoutTime = null;
  }

  public int getSellerId() {
    return this.sellerId;
  }

  public LoginLog setSellerId(int sellerId) {
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

  public String getTokenId() {
    return this.tokenId;
  }

  public LoginLog setTokenId(String tokenId) {
    this.tokenId = tokenId;
    
    return this;
  }

  public void unsetTokenId() {
    this.tokenId = null;
  }

  /** Returns true if field tokenId is set (has been asigned a value) and false otherwise */
  public boolean isSetTokenId() {
    return this.tokenId != null;
  }

  public void setTokenIdIsSet(boolean value) {
    if (!value) {
      this.tokenId = null;
    }
  }

  public String getIp() {
    return this.ip;
  }

  public LoginLog setIp(String ip) {
    this.ip = ip;
    
    return this;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been asigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  public String getBrowser() {
    return this.browser;
  }

  public LoginLog setBrowser(String browser) {
    this.browser = browser;
    
    return this;
  }

  public void unsetBrowser() {
    this.browser = null;
  }

  /** Returns true if field browser is set (has been asigned a value) and false otherwise */
  public boolean isSetBrowser() {
    return this.browser != null;
  }

  public void setBrowserIsSet(boolean value) {
    if (!value) {
      this.browser = null;
    }
  }

  public int getFromSource() {
    return this.fromSource;
  }

  public LoginLog setFromSource(int fromSource) {
    this.fromSource = fromSource;
    setFromSourceIsSet(true);

    return this;
  }

  public void unsetFromSource() {
  __isset_bit_vector.clear(__FROMSOURCE_ISSET_ID);
  }

  /** Returns true if field fromSource is set (has been asigned a value) and false otherwise */
  public boolean isSetFromSource() {
    return __isset_bit_vector.get(__FROMSOURCE_ISSET_ID);
  }

  public void setFromSourceIsSet(boolean value) {
    __isset_bit_vector.set(__FROMSOURCE_ISSET_ID, value);
  }

  public int getLoginAuto() {
    return this.loginAuto;
  }

  public LoginLog setLoginAuto(int loginAuto) {
    this.loginAuto = loginAuto;
    setLoginAutoIsSet(true);

    return this;
  }

  public void unsetLoginAuto() {
  __isset_bit_vector.clear(__LOGINAUTO_ISSET_ID);
  }

  /** Returns true if field loginAuto is set (has been asigned a value) and false otherwise */
  public boolean isSetLoginAuto() {
    return __isset_bit_vector.get(__LOGINAUTO_ISSET_ID);
  }

  public void setLoginAutoIsSet(boolean value) {
    __isset_bit_vector.set(__LOGINAUTO_ISSET_ID, value);
  }

  public String getLoginTime() {
    return this.loginTime;
  }

  public LoginLog setLoginTime(String loginTime) {
    this.loginTime = loginTime;
    
    return this;
  }

  public void unsetLoginTime() {
    this.loginTime = null;
  }

  /** Returns true if field loginTime is set (has been asigned a value) and false otherwise */
  public boolean isSetLoginTime() {
    return this.loginTime != null;
  }

  public void setLoginTimeIsSet(boolean value) {
    if (!value) {
      this.loginTime = null;
    }
  }

  public String getLogoutTime() {
    return this.logoutTime;
  }

  public LoginLog setLogoutTime(String logoutTime) {
    this.logoutTime = logoutTime;
    
    return this;
  }

  public void unsetLogoutTime() {
    this.logoutTime = null;
  }

  /** Returns true if field logoutTime is set (has been asigned a value) and false otherwise */
  public boolean isSetLogoutTime() {
    return this.logoutTime != null;
  }

  public void setLogoutTimeIsSet(boolean value) {
    if (!value) {
      this.logoutTime = null;
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
    case TOKEN_ID:
      if (value == null) {
        unsetTokenId();
      } else {
        setTokenId((String)value);
      }
      break;
    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((String)value);
      }
      break;
    case BROWSER:
      if (value == null) {
        unsetBrowser();
      } else {
        setBrowser((String)value);
      }
      break;
    case FROM_SOURCE:
      if (value == null) {
        unsetFromSource();
      } else {
        setFromSource((Integer)value);
      }
      break;
    case LOGIN_AUTO:
      if (value == null) {
        unsetLoginAuto();
      } else {
        setLoginAuto((Integer)value);
      }
      break;
    case LOGIN_TIME:
      if (value == null) {
        unsetLoginTime();
      } else {
        setLoginTime((String)value);
      }
      break;
    case LOGOUT_TIME:
      if (value == null) {
        unsetLogoutTime();
      } else {
        setLogoutTime((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SELLER_ID:
      return new Integer(getSellerId());
    case TOKEN_ID:
      return getTokenId();
    case IP:
      return getIp();
    case BROWSER:
      return getBrowser();
    case FROM_SOURCE:
      return new Integer(getFromSource());
    case LOGIN_AUTO:
      return new Integer(getLoginAuto());
    case LOGIN_TIME:
      return getLoginTime();
    case LOGOUT_TIME:
      return getLogoutTime();
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
    case TOKEN_ID:
      return isSetTokenId();
    case IP:
      return isSetIp();
    case BROWSER:
      return isSetBrowser();
    case FROM_SOURCE:
      return isSetFromSource();
    case LOGIN_AUTO:
      return isSetLoginAuto();
    case LOGIN_TIME:
      return isSetLoginTime();
    case LOGOUT_TIME:
      return isSetLogoutTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LoginLog)
      return this.equals((LoginLog)that);
    return false;
  }

  public boolean equals(LoginLog that) {
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
    boolean this_present_tokenId = true && this.isSetTokenId();
    boolean that_present_tokenId = true && that.isSetTokenId();
    if (this_present_tokenId || that_present_tokenId) {
      if (!(this_present_tokenId && that_present_tokenId))
        return false;
      if (!this.tokenId.equals(that.tokenId))
        return false;
    }
    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }
    boolean this_present_browser = true && this.isSetBrowser();
    boolean that_present_browser = true && that.isSetBrowser();
    if (this_present_browser || that_present_browser) {
      if (!(this_present_browser && that_present_browser))
        return false;
      if (!this.browser.equals(that.browser))
        return false;
    }
    boolean this_present_fromSource = true;
    boolean that_present_fromSource = true;
    if (this_present_fromSource || that_present_fromSource) {
      if (!(this_present_fromSource && that_present_fromSource))
        return false;
      if (this.fromSource != that.fromSource)
        return false;
    }
    boolean this_present_loginAuto = true;
    boolean that_present_loginAuto = true;
    if (this_present_loginAuto || that_present_loginAuto) {
      if (!(this_present_loginAuto && that_present_loginAuto))
        return false;
      if (this.loginAuto != that.loginAuto)
        return false;
    }
    boolean this_present_loginTime = true && this.isSetLoginTime();
    boolean that_present_loginTime = true && that.isSetLoginTime();
    if (this_present_loginTime || that_present_loginTime) {
      if (!(this_present_loginTime && that_present_loginTime))
        return false;
      if (!this.loginTime.equals(that.loginTime))
        return false;
    }
    boolean this_present_logoutTime = true && this.isSetLogoutTime();
    boolean that_present_logoutTime = true && that.isSetLogoutTime();
    if (this_present_logoutTime || that_present_logoutTime) {
      if (!(this_present_logoutTime && that_present_logoutTime))
        return false;
      if (!this.logoutTime.equals(that.logoutTime))
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
    boolean present_tokenId = true && (isSetTokenId());
    builder.append(present_tokenId);
    if (present_tokenId)
      builder.append(tokenId);
    boolean present_ip = true && (isSetIp());
    builder.append(present_ip);
    if (present_ip)
      builder.append(ip);
    boolean present_browser = true && (isSetBrowser());
    builder.append(present_browser);
    if (present_browser)
      builder.append(browser);
    boolean present_fromSource = true;
    builder.append(present_fromSource);
    if (present_fromSource)
      builder.append(fromSource);
    boolean present_loginAuto = true;
    builder.append(present_loginAuto);
    if (present_loginAuto)
      builder.append(loginAuto);
    boolean present_loginTime = true && (isSetLoginTime());
    builder.append(present_loginTime);
    if (present_loginTime)
      builder.append(loginTime);
    boolean present_logoutTime = true && (isSetLogoutTime());
    builder.append(present_logoutTime);
    if (present_logoutTime)
      builder.append(logoutTime);
    return builder.toHashCode();
  }

  public int compareTo(LoginLog other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LoginLog typedOther = (LoginLog)other;

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
    lastComparison = Boolean.valueOf(isSetTokenId()).compareTo(typedOther.isSetTokenId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenId()) {
      lastComparison = TBaseHelper.compareTo(this.tokenId, typedOther.tokenId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIp()).compareTo(typedOther.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = TBaseHelper.compareTo(this.ip, typedOther.ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBrowser()).compareTo(typedOther.isSetBrowser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrowser()) {
      lastComparison = TBaseHelper.compareTo(this.browser, typedOther.browser);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFromSource()).compareTo(typedOther.isSetFromSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromSource()) {
      lastComparison = TBaseHelper.compareTo(this.fromSource, typedOther.fromSource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoginAuto()).compareTo(typedOther.isSetLoginAuto());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoginAuto()) {
      lastComparison = TBaseHelper.compareTo(this.loginAuto, typedOther.loginAuto);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoginTime()).compareTo(typedOther.isSetLoginTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoginTime()) {
      lastComparison = TBaseHelper.compareTo(this.loginTime, typedOther.loginTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLogoutTime()).compareTo(typedOther.isSetLogoutTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogoutTime()) {
      lastComparison = TBaseHelper.compareTo(this.logoutTime, typedOther.logoutTime);
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
        case 2: // TOKEN_ID
          if (field.type == TType.STRING) {
            this.tokenId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // IP
          if (field.type == TType.STRING) {
            this.ip = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // BROWSER
          if (field.type == TType.STRING) {
            this.browser = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // FROM_SOURCE
          if (field.type == TType.I32) {
            this.fromSource = iprot.readI32();
            setFromSourceIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // LOGIN_AUTO
          if (field.type == TType.I32) {
            this.loginAuto = iprot.readI32();
            setLoginAutoIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // LOGIN_TIME
          if (field.type == TType.STRING) {
            this.loginTime = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // LOGOUT_TIME
          if (field.type == TType.STRING) {
            this.logoutTime = iprot.readString();
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
    if (this.tokenId != null) {
      oprot.writeFieldBegin(TOKEN_ID_FIELD_DESC);
      oprot.writeString(this.tokenId);
      oprot.writeFieldEnd();
    }
    if (this.ip != null) {
      oprot.writeFieldBegin(IP_FIELD_DESC);
      oprot.writeString(this.ip);
      oprot.writeFieldEnd();
    }
    if (this.browser != null) {
      oprot.writeFieldBegin(BROWSER_FIELD_DESC);
      oprot.writeString(this.browser);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(FROM_SOURCE_FIELD_DESC);
    oprot.writeI32(this.fromSource);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LOGIN_AUTO_FIELD_DESC);
    oprot.writeI32(this.loginAuto);
    oprot.writeFieldEnd();
    if (this.loginTime != null) {
      oprot.writeFieldBegin(LOGIN_TIME_FIELD_DESC);
      oprot.writeString(this.loginTime);
      oprot.writeFieldEnd();
    }
    if (this.logoutTime != null) {
      oprot.writeFieldBegin(LOGOUT_TIME_FIELD_DESC);
      oprot.writeString(this.logoutTime);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LoginLog(");
    boolean first = true;
    sb.append("sellerId:");
    sb.append(this.sellerId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tokenId:");
    if (this.tokenId == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("browser:");
    if (this.browser == null) {
      sb.append("null");
    } else {
      sb.append(this.browser);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fromSource:");
    sb.append(this.fromSource);
    first = false;
    if (!first) sb.append(", ");
    sb.append("loginAuto:");
    sb.append(this.loginAuto);
    first = false;
    if (!first) sb.append(", ");
    sb.append("loginTime:");
    if (this.loginTime == null) {
      sb.append("null");
    } else {
      sb.append(this.loginTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("logoutTime:");
    if (this.logoutTime == null) {
      sb.append("null");
    } else {
      sb.append(this.logoutTime);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
