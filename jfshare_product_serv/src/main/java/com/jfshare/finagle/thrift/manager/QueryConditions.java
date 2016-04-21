/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.manager;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.*;

import java.util.*;

// No additional import required for struct/union.

public class QueryConditions implements TBase<QueryConditions, QueryConditions._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("QueryConditions");

  private static final TField PRODUCT_ID_FIELD_DESC = new TField("productId", TType.STRING, (short)1);
  private static final TField RECORD_COUNT_FIELD_DESC = new TField("recordCount", TType.I32, (short)2);
  private static final TField STATE_FIELD_DESC = new TField("state", TType.I32, (short)3);


  public String productId;
  public int recordCount;
  public int state;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PRODUCT_ID((short)1, "productId"),
    RECORD_COUNT((short)2, "recordCount"),
    STATE((short)3, "state");
  
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
        case 2: // RECORD_COUNT
  	return RECORD_COUNT;
        case 3: // STATE
  	return STATE;
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
  private static final int __RECORDCOUNT_ISSET_ID = 0;
  private static final int __STATE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRODUCT_ID, new FieldMetaData("productId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.RECORD_COUNT, new FieldMetaData("recordCount", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.STATE, new FieldMetaData("state", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(QueryConditions.class, metaDataMap);
  }


  public QueryConditions() {
  }

  public QueryConditions(
    String productId,
    int recordCount,
    int state)
  {
    this();
    this.productId = productId;
    this.recordCount = recordCount;
    setRecordCountIsSet(true);
    this.state = state;
    setStateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryConditions(QueryConditions other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetProductId()) {
      this.productId = other.productId;
    }
    this.recordCount = other.recordCount;
    this.state = other.state;
  }

  public QueryConditions deepCopy() {
    return new QueryConditions(this);
  }

  @Override
  public void clear() {
    this.productId = null;
    setRecordCountIsSet(false);
    this.recordCount = 0;
    setStateIsSet(false);
    this.state = 0;
  }

  public String getProductId() {
    return this.productId;
  }

  public QueryConditions setProductId(String productId) {
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

  public int getRecordCount() {
    return this.recordCount;
  }

  public QueryConditions setRecordCount(int recordCount) {
    this.recordCount = recordCount;
    setRecordCountIsSet(true);

    return this;
  }

  public void unsetRecordCount() {
  __isset_bit_vector.clear(__RECORDCOUNT_ISSET_ID);
  }

  /** Returns true if field recordCount is set (has been asigned a value) and false otherwise */
  public boolean isSetRecordCount() {
    return __isset_bit_vector.get(__RECORDCOUNT_ISSET_ID);
  }

  public void setRecordCountIsSet(boolean value) {
    __isset_bit_vector.set(__RECORDCOUNT_ISSET_ID, value);
  }

  public int getState() {
    return this.state;
  }

  public QueryConditions setState(int state) {
    this.state = state;
    setStateIsSet(true);

    return this;
  }

  public void unsetState() {
  __isset_bit_vector.clear(__STATE_ISSET_ID);
  }

  /** Returns true if field state is set (has been asigned a value) and false otherwise */
  public boolean isSetState() {
    return __isset_bit_vector.get(__STATE_ISSET_ID);
  }

  public void setStateIsSet(boolean value) {
    __isset_bit_vector.set(__STATE_ISSET_ID, value);
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
    case RECORD_COUNT:
      if (value == null) {
        unsetRecordCount();
      } else {
        setRecordCount((Integer)value);
      }
      break;
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT_ID:
      return getProductId();
    case RECORD_COUNT:
      return new Integer(getRecordCount());
    case STATE:
      return new Integer(getState());
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
    case RECORD_COUNT:
      return isSetRecordCount();
    case STATE:
      return isSetState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryConditions)
      return this.equals((QueryConditions)that);
    return false;
  }

  public boolean equals(QueryConditions that) {
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
    boolean this_present_recordCount = true;
    boolean that_present_recordCount = true;
    if (this_present_recordCount || that_present_recordCount) {
      if (!(this_present_recordCount && that_present_recordCount))
        return false;
      if (this.recordCount != that.recordCount)
        return false;
    }
    boolean this_present_state = true;
    boolean that_present_state = true;
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (this.state != that.state)
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
    boolean present_recordCount = true;
    builder.append(present_recordCount);
    if (present_recordCount)
      builder.append(recordCount);
    boolean present_state = true;
    builder.append(present_state);
    if (present_state)
      builder.append(state);
    return builder.toHashCode();
  }

  public int compareTo(QueryConditions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryConditions typedOther = (QueryConditions)other;

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
    lastComparison = Boolean.valueOf(isSetRecordCount()).compareTo(typedOther.isSetRecordCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecordCount()) {
      lastComparison = TBaseHelper.compareTo(this.recordCount, typedOther.recordCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = TBaseHelper.compareTo(this.state, typedOther.state);
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
        case 2: // RECORD_COUNT
          if (field.type == TType.I32) {
            this.recordCount = iprot.readI32();
            setRecordCountIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // STATE
          if (field.type == TType.I32) {
            this.state = iprot.readI32();
            setStateIsSet(true);
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
    oprot.writeFieldBegin(RECORD_COUNT_FIELD_DESC);
    oprot.writeI32(this.recordCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STATE_FIELD_DESC);
    oprot.writeI32(this.state);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueryConditions(");
    boolean first = true;
    sb.append("productId:");
    if (this.productId == null) {
      sb.append("null");
    } else {
      sb.append(this.productId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recordCount:");
    sb.append(this.recordCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    sb.append(this.state);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
