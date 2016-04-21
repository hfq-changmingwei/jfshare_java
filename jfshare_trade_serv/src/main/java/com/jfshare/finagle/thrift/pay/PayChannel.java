/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.pay;

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

public class PayChannel implements TBase<PayChannel, PayChannel._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("PayChannel");

  private static final TField PAY_CHANNEL_FIELD_DESC = new TField("payChannel", TType.I32, (short)1);
  private static final TField PAY_IP_FIELD_DESC = new TField("payIp", TType.STRING, (short)2);
  private static final TField RETURN_URL_FIELD_DESC = new TField("returnUrl", TType.STRING, (short)3);


  public int payChannel;
  public String payIp;
  public String returnUrl;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PAY_CHANNEL((short)1, "payChannel"),
    PAY_IP((short)2, "payIp"),
    RETURN_URL((short)3, "returnUrl");
  
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
        case 1: // PAY_CHANNEL
  	return PAY_CHANNEL;
        case 2: // PAY_IP
  	return PAY_IP;
        case 3: // RETURN_URL
  	return RETURN_URL;
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
  private static final int __PAYCHANNEL_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAY_CHANNEL, new FieldMetaData("payChannel", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.PAY_IP, new FieldMetaData("payIp", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.RETURN_URL, new FieldMetaData("returnUrl", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(PayChannel.class, metaDataMap);
  }


  public PayChannel() {
  }

  public PayChannel(
    int payChannel,
    String payIp,
    String returnUrl)
  {
    this();
    this.payChannel = payChannel;
    setPayChannelIsSet(true);
    this.payIp = payIp;
    this.returnUrl = returnUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PayChannel(PayChannel other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.payChannel = other.payChannel;
    if (other.isSetPayIp()) {
      this.payIp = other.payIp;
    }
    if (other.isSetReturnUrl()) {
      this.returnUrl = other.returnUrl;
    }
  }

  public PayChannel deepCopy() {
    return new PayChannel(this);
  }

  @Override
  public void clear() {
    setPayChannelIsSet(false);
    this.payChannel = 0;
    this.payIp = null;
    this.returnUrl = null;
  }

  public int getPayChannel() {
    return this.payChannel;
  }

  public PayChannel setPayChannel(int payChannel) {
    this.payChannel = payChannel;
    setPayChannelIsSet(true);

    return this;
  }

  public void unsetPayChannel() {
  __isset_bit_vector.clear(__PAYCHANNEL_ISSET_ID);
  }

  /** Returns true if field payChannel is set (has been asigned a value) and false otherwise */
  public boolean isSetPayChannel() {
    return __isset_bit_vector.get(__PAYCHANNEL_ISSET_ID);
  }

  public void setPayChannelIsSet(boolean value) {
    __isset_bit_vector.set(__PAYCHANNEL_ISSET_ID, value);
  }

  public String getPayIp() {
    return this.payIp;
  }

  public PayChannel setPayIp(String payIp) {
    this.payIp = payIp;
    
    return this;
  }

  public void unsetPayIp() {
    this.payIp = null;
  }

  /** Returns true if field payIp is set (has been asigned a value) and false otherwise */
  public boolean isSetPayIp() {
    return this.payIp != null;
  }

  public void setPayIpIsSet(boolean value) {
    if (!value) {
      this.payIp = null;
    }
  }

  public String getReturnUrl() {
    return this.returnUrl;
  }

  public PayChannel setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    
    return this;
  }

  public void unsetReturnUrl() {
    this.returnUrl = null;
  }

  /** Returns true if field returnUrl is set (has been asigned a value) and false otherwise */
  public boolean isSetReturnUrl() {
    return this.returnUrl != null;
  }

  public void setReturnUrlIsSet(boolean value) {
    if (!value) {
      this.returnUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAY_CHANNEL:
      if (value == null) {
        unsetPayChannel();
      } else {
        setPayChannel((Integer)value);
      }
      break;
    case PAY_IP:
      if (value == null) {
        unsetPayIp();
      } else {
        setPayIp((String)value);
      }
      break;
    case RETURN_URL:
      if (value == null) {
        unsetReturnUrl();
      } else {
        setReturnUrl((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAY_CHANNEL:
      return new Integer(getPayChannel());
    case PAY_IP:
      return getPayIp();
    case RETURN_URL:
      return getReturnUrl();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAY_CHANNEL:
      return isSetPayChannel();
    case PAY_IP:
      return isSetPayIp();
    case RETURN_URL:
      return isSetReturnUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PayChannel)
      return this.equals((PayChannel)that);
    return false;
  }

  public boolean equals(PayChannel that) {
    if (that == null)
      return false;
    boolean this_present_payChannel = true;
    boolean that_present_payChannel = true;
    if (this_present_payChannel || that_present_payChannel) {
      if (!(this_present_payChannel && that_present_payChannel))
        return false;
      if (this.payChannel != that.payChannel)
        return false;
    }
    boolean this_present_payIp = true && this.isSetPayIp();
    boolean that_present_payIp = true && that.isSetPayIp();
    if (this_present_payIp || that_present_payIp) {
      if (!(this_present_payIp && that_present_payIp))
        return false;
      if (!this.payIp.equals(that.payIp))
        return false;
    }
    boolean this_present_returnUrl = true && this.isSetReturnUrl();
    boolean that_present_returnUrl = true && that.isSetReturnUrl();
    if (this_present_returnUrl || that_present_returnUrl) {
      if (!(this_present_returnUrl && that_present_returnUrl))
        return false;
      if (!this.returnUrl.equals(that.returnUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_payChannel = true;
    builder.append(present_payChannel);
    if (present_payChannel)
      builder.append(payChannel);
    boolean present_payIp = true && (isSetPayIp());
    builder.append(present_payIp);
    if (present_payIp)
      builder.append(payIp);
    boolean present_returnUrl = true && (isSetReturnUrl());
    builder.append(present_returnUrl);
    if (present_returnUrl)
      builder.append(returnUrl);
    return builder.toHashCode();
  }

  public int compareTo(PayChannel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PayChannel typedOther = (PayChannel)other;

    lastComparison = Boolean.valueOf(isSetPayChannel()).compareTo(typedOther.isSetPayChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayChannel()) {
      lastComparison = TBaseHelper.compareTo(this.payChannel, typedOther.payChannel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPayIp()).compareTo(typedOther.isSetPayIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayIp()) {
      lastComparison = TBaseHelper.compareTo(this.payIp, typedOther.payIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReturnUrl()).compareTo(typedOther.isSetReturnUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnUrl()) {
      lastComparison = TBaseHelper.compareTo(this.returnUrl, typedOther.returnUrl);
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
        case 1: // PAY_CHANNEL
          if (field.type == TType.I32) {
            this.payChannel = iprot.readI32();
            setPayChannelIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PAY_IP
          if (field.type == TType.STRING) {
            this.payIp = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // RETURN_URL
          if (field.type == TType.STRING) {
            this.returnUrl = iprot.readString();
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
    oprot.writeFieldBegin(PAY_CHANNEL_FIELD_DESC);
    oprot.writeI32(this.payChannel);
    oprot.writeFieldEnd();
    if (this.payIp != null) {
      oprot.writeFieldBegin(PAY_IP_FIELD_DESC);
      oprot.writeString(this.payIp);
      oprot.writeFieldEnd();
    }
    if (this.returnUrl != null) {
      oprot.writeFieldBegin(RETURN_URL_FIELD_DESC);
      oprot.writeString(this.returnUrl);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PayChannel(");
    boolean first = true;
    sb.append("payChannel:");
    sb.append(this.payChannel);
    first = false;
    if (!first) sb.append(", ");
    sb.append("payIp:");
    if (this.payIp == null) {
      sb.append("null");
    } else {
      sb.append(this.payIp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("returnUrl:");
    if (this.returnUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.returnUrl);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
