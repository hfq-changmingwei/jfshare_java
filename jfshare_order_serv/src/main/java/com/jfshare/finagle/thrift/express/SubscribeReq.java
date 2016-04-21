/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.express;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.*;

import java.util.*;

// No additional import required for struct/union.

public class SubscribeReq implements TBase<SubscribeReq, SubscribeReq._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SubscribeReq");

  private static final TField COMPANY_FIELD_DESC = new TField("company", TType.STRING, (short)1);
  private static final TField NUMBER_FIELD_DESC = new TField("number", TType.STRING, (short)2);
  private static final TField FROM_FIELD_DESC = new TField("from", TType.STRING, (short)3);
  private static final TField TO_FIELD_DESC = new TField("to", TType.STRING, (short)4);
  private static final TField ORDER_ID_FIELD_DESC = new TField("orderId", TType.STRING, (short)5);
  private static final TField COM_ID_FIELD_DESC = new TField("comId", TType.I32, (short)6);


  public String company;
  public String number;
  public String from;
  public String to;
  public String orderId;
  public int comId;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    COMPANY((short)1, "company"),
    NUMBER((short)2, "number"),
    FROM((short)3, "from"),
    TO((short)4, "to"),
    ORDER_ID((short)5, "orderId"),
    COM_ID((short)6, "comId");
  
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
        case 1: // COMPANY
  	return COMPANY;
        case 2: // NUMBER
  	return NUMBER;
        case 3: // FROM
  	return FROM;
        case 4: // TO
  	return TO;
        case 5: // ORDER_ID
  	return ORDER_ID;
        case 6: // COM_ID
  	return COM_ID;
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
  private static final int __COMID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMPANY, new FieldMetaData("company", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NUMBER, new FieldMetaData("number", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FROM, new FieldMetaData("from", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.TO, new FieldMetaData("to", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ORDER_ID, new FieldMetaData("orderId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.COM_ID, new FieldMetaData("comId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(SubscribeReq.class, metaDataMap);
  }


  public SubscribeReq() {
  }

  public SubscribeReq(
    String company,
    String number,
    String from,
    String to,
    String orderId,
    int comId)
  {
    this();
    this.company = company;
    this.number = number;
    this.from = from;
    this.to = to;
    this.orderId = orderId;
    this.comId = comId;
    setComIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubscribeReq(SubscribeReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetCompany()) {
      this.company = other.company;
    }
    if (other.isSetNumber()) {
      this.number = other.number;
    }
    if (other.isSetFrom()) {
      this.from = other.from;
    }
    if (other.isSetTo()) {
      this.to = other.to;
    }
    if (other.isSetOrderId()) {
      this.orderId = other.orderId;
    }
    this.comId = other.comId;
  }

  public SubscribeReq deepCopy() {
    return new SubscribeReq(this);
  }

  @Override
  public void clear() {
    this.company = null;
    this.number = null;
    this.from = null;
    this.to = null;
    this.orderId = null;
    setComIdIsSet(false);
    this.comId = 0;
  }

  public String getCompany() {
    return this.company;
  }

  public SubscribeReq setCompany(String company) {
    this.company = company;
    
    return this;
  }

  public void unsetCompany() {
    this.company = null;
  }

  /** Returns true if field company is set (has been asigned a value) and false otherwise */
  public boolean isSetCompany() {
    return this.company != null;
  }

  public void setCompanyIsSet(boolean value) {
    if (!value) {
      this.company = null;
    }
  }

  public String getNumber() {
    return this.number;
  }

  public SubscribeReq setNumber(String number) {
    this.number = number;
    
    return this;
  }

  public void unsetNumber() {
    this.number = null;
  }

  /** Returns true if field number is set (has been asigned a value) and false otherwise */
  public boolean isSetNumber() {
    return this.number != null;
  }

  public void setNumberIsSet(boolean value) {
    if (!value) {
      this.number = null;
    }
  }

  public String getFrom() {
    return this.from;
  }

  public SubscribeReq setFrom(String from) {
    this.from = from;
    
    return this;
  }

  public void unsetFrom() {
    this.from = null;
  }

  /** Returns true if field from is set (has been asigned a value) and false otherwise */
  public boolean isSetFrom() {
    return this.from != null;
  }

  public void setFromIsSet(boolean value) {
    if (!value) {
      this.from = null;
    }
  }

  public String getTo() {
    return this.to;
  }

  public SubscribeReq setTo(String to) {
    this.to = to;
    
    return this;
  }

  public void unsetTo() {
    this.to = null;
  }

  /** Returns true if field to is set (has been asigned a value) and false otherwise */
  public boolean isSetTo() {
    return this.to != null;
  }

  public void setToIsSet(boolean value) {
    if (!value) {
      this.to = null;
    }
  }

  public String getOrderId() {
    return this.orderId;
  }

  public SubscribeReq setOrderId(String orderId) {
    this.orderId = orderId;
    
    return this;
  }

  public void unsetOrderId() {
    this.orderId = null;
  }

  /** Returns true if field orderId is set (has been asigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return this.orderId != null;
  }

  public void setOrderIdIsSet(boolean value) {
    if (!value) {
      this.orderId = null;
    }
  }

  public int getComId() {
    return this.comId;
  }

  public SubscribeReq setComId(int comId) {
    this.comId = comId;
    setComIdIsSet(true);

    return this;
  }

  public void unsetComId() {
  __isset_bit_vector.clear(__COMID_ISSET_ID);
  }

  /** Returns true if field comId is set (has been asigned a value) and false otherwise */
  public boolean isSetComId() {
    return __isset_bit_vector.get(__COMID_ISSET_ID);
  }

  public void setComIdIsSet(boolean value) {
    __isset_bit_vector.set(__COMID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMPANY:
      if (value == null) {
        unsetCompany();
      } else {
        setCompany((String)value);
      }
      break;
    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((String)value);
      }
      break;
    case FROM:
      if (value == null) {
        unsetFrom();
      } else {
        setFrom((String)value);
      }
      break;
    case TO:
      if (value == null) {
        unsetTo();
      } else {
        setTo((String)value);
      }
      break;
    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((String)value);
      }
      break;
    case COM_ID:
      if (value == null) {
        unsetComId();
      } else {
        setComId((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPANY:
      return getCompany();
    case NUMBER:
      return getNumber();
    case FROM:
      return getFrom();
    case TO:
      return getTo();
    case ORDER_ID:
      return getOrderId();
    case COM_ID:
      return new Integer(getComId());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMPANY:
      return isSetCompany();
    case NUMBER:
      return isSetNumber();
    case FROM:
      return isSetFrom();
    case TO:
      return isSetTo();
    case ORDER_ID:
      return isSetOrderId();
    case COM_ID:
      return isSetComId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubscribeReq)
      return this.equals((SubscribeReq)that);
    return false;
  }

  public boolean equals(SubscribeReq that) {
    if (that == null)
      return false;
    boolean this_present_company = true && this.isSetCompany();
    boolean that_present_company = true && that.isSetCompany();
    if (this_present_company || that_present_company) {
      if (!(this_present_company && that_present_company))
        return false;
      if (!this.company.equals(that.company))
        return false;
    }
    boolean this_present_number = true && this.isSetNumber();
    boolean that_present_number = true && that.isSetNumber();
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (!this.number.equals(that.number))
        return false;
    }
    boolean this_present_from = true && this.isSetFrom();
    boolean that_present_from = true && that.isSetFrom();
    if (this_present_from || that_present_from) {
      if (!(this_present_from && that_present_from))
        return false;
      if (!this.from.equals(that.from))
        return false;
    }
    boolean this_present_to = true && this.isSetTo();
    boolean that_present_to = true && that.isSetTo();
    if (this_present_to || that_present_to) {
      if (!(this_present_to && that_present_to))
        return false;
      if (!this.to.equals(that.to))
        return false;
    }
    boolean this_present_orderId = true && this.isSetOrderId();
    boolean that_present_orderId = true && that.isSetOrderId();
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (!this.orderId.equals(that.orderId))
        return false;
    }
    boolean this_present_comId = true;
    boolean that_present_comId = true;
    if (this_present_comId || that_present_comId) {
      if (!(this_present_comId && that_present_comId))
        return false;
      if (this.comId != that.comId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_company = true && (isSetCompany());
    builder.append(present_company);
    if (present_company)
      builder.append(company);
    boolean present_number = true && (isSetNumber());
    builder.append(present_number);
    if (present_number)
      builder.append(number);
    boolean present_from = true && (isSetFrom());
    builder.append(present_from);
    if (present_from)
      builder.append(from);
    boolean present_to = true && (isSetTo());
    builder.append(present_to);
    if (present_to)
      builder.append(to);
    boolean present_orderId = true && (isSetOrderId());
    builder.append(present_orderId);
    if (present_orderId)
      builder.append(orderId);
    boolean present_comId = true;
    builder.append(present_comId);
    if (present_comId)
      builder.append(comId);
    return builder.toHashCode();
  }

  public int compareTo(SubscribeReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SubscribeReq typedOther = (SubscribeReq)other;

    lastComparison = Boolean.valueOf(isSetCompany()).compareTo(typedOther.isSetCompany());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompany()) {
      lastComparison = TBaseHelper.compareTo(this.company, typedOther.company);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumber()).compareTo(typedOther.isSetNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber()) {
      lastComparison = TBaseHelper.compareTo(this.number, typedOther.number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFrom()).compareTo(typedOther.isSetFrom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrom()) {
      lastComparison = TBaseHelper.compareTo(this.from, typedOther.from);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTo()).compareTo(typedOther.isSetTo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTo()) {
      lastComparison = TBaseHelper.compareTo(this.to, typedOther.to);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(typedOther.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = TBaseHelper.compareTo(this.orderId, typedOther.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComId()).compareTo(typedOther.isSetComId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComId()) {
      lastComparison = TBaseHelper.compareTo(this.comId, typedOther.comId);
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
        case 1: // COMPANY
          if (field.type == TType.STRING) {
            this.company = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NUMBER
          if (field.type == TType.STRING) {
            this.number = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FROM
          if (field.type == TType.STRING) {
            this.from = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TO
          if (field.type == TType.STRING) {
            this.to = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // ORDER_ID
          if (field.type == TType.STRING) {
            this.orderId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // COM_ID
          if (field.type == TType.I32) {
            this.comId = iprot.readI32();
            setComIdIsSet(true);
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
    if (this.company != null) {
      oprot.writeFieldBegin(COMPANY_FIELD_DESC);
      oprot.writeString(this.company);
      oprot.writeFieldEnd();
    }
    if (this.number != null) {
      oprot.writeFieldBegin(NUMBER_FIELD_DESC);
      oprot.writeString(this.number);
      oprot.writeFieldEnd();
    }
    if (this.from != null) {
      oprot.writeFieldBegin(FROM_FIELD_DESC);
      oprot.writeString(this.from);
      oprot.writeFieldEnd();
    }
    if (this.to != null) {
      oprot.writeFieldBegin(TO_FIELD_DESC);
      oprot.writeString(this.to);
      oprot.writeFieldEnd();
    }
    if (this.orderId != null) {
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeString(this.orderId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(COM_ID_FIELD_DESC);
    oprot.writeI32(this.comId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SubscribeReq(");
    boolean first = true;
    sb.append("company:");
    if (this.company == null) {
      sb.append("null");
    } else {
      sb.append(this.company);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("number:");
    if (this.number == null) {
      sb.append("null");
    } else {
      sb.append(this.number);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("from:");
    if (this.from == null) {
      sb.append("null");
    } else {
      sb.append(this.from);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("to:");
    if (this.to == null) {
      sb.append("null");
    } else {
      sb.append(this.to);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderId:");
    if (this.orderId == null) {
      sb.append("null");
    } else {
      sb.append(this.orderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("comId:");
    sb.append(this.comId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
