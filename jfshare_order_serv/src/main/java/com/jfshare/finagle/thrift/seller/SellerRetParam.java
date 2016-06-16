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

public class SellerRetParam implements TBase<SellerRetParam, SellerRetParam._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SellerRetParam");

  private static final TField BASE_TAG_FIELD_DESC = new TField("baseTag", TType.I32, (short)1);


  public int baseTag;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    BASE_TAG((short)1, "baseTag");
  
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
        case 1: // BASE_TAG
  	return BASE_TAG;
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
  private static final int __BASETAG_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_TAG, new FieldMetaData("baseTag", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(SellerRetParam.class, metaDataMap);
  }


  public SellerRetParam() {
  }

  public SellerRetParam(
    int baseTag)
  {
    this();
    this.baseTag = baseTag;
    setBaseTagIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SellerRetParam(SellerRetParam other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.baseTag = other.baseTag;
  }

  public SellerRetParam deepCopy() {
    return new SellerRetParam(this);
  }

  @Override
  public void clear() {
    setBaseTagIsSet(false);
    this.baseTag = 0;
  }

  public int getBaseTag() {
    return this.baseTag;
  }

  public SellerRetParam setBaseTag(int baseTag) {
    this.baseTag = baseTag;
    setBaseTagIsSet(true);

    return this;
  }

  public void unsetBaseTag() {
  __isset_bit_vector.clear(__BASETAG_ISSET_ID);
  }

  /** Returns true if field baseTag is set (has been asigned a value) and false otherwise */
  public boolean isSetBaseTag() {
    return __isset_bit_vector.get(__BASETAG_ISSET_ID);
  }

  public void setBaseTagIsSet(boolean value) {
    __isset_bit_vector.set(__BASETAG_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE_TAG:
      if (value == null) {
        unsetBaseTag();
      } else {
        setBaseTag((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_TAG:
      return new Integer(getBaseTag());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE_TAG:
      return isSetBaseTag();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SellerRetParam)
      return this.equals((SellerRetParam)that);
    return false;
  }

  public boolean equals(SellerRetParam that) {
    if (that == null)
      return false;
    boolean this_present_baseTag = true;
    boolean that_present_baseTag = true;
    if (this_present_baseTag || that_present_baseTag) {
      if (!(this_present_baseTag && that_present_baseTag))
        return false;
      if (this.baseTag != that.baseTag)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_baseTag = true;
    builder.append(present_baseTag);
    if (present_baseTag)
      builder.append(baseTag);
    return builder.toHashCode();
  }

  public int compareTo(SellerRetParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SellerRetParam typedOther = (SellerRetParam)other;

    lastComparison = Boolean.valueOf(isSetBaseTag()).compareTo(typedOther.isSetBaseTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseTag()) {
      lastComparison = TBaseHelper.compareTo(this.baseTag, typedOther.baseTag);
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
        case 1: // BASE_TAG
          if (field.type == TType.I32) {
            this.baseTag = iprot.readI32();
            setBaseTagIsSet(true);
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
    oprot.writeFieldBegin(BASE_TAG_FIELD_DESC);
    oprot.writeI32(this.baseTag);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SellerRetParam(");
    boolean first = true;
    sb.append("baseTag:");
    sb.append(this.baseTag);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}