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

public class ProductRetParam implements TBase<ProductRetParam, ProductRetParam._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ProductRetParam");

  private static final TField BASE_TAG_FIELD_DESC = new TField("baseTag", TType.I32, (short)1);
  private static final TField SKU_TEMPLATE_TAG_FIELD_DESC = new TField("skuTemplateTag", TType.I32, (short)2);
  private static final TField SKU_TAG_FIELD_DESC = new TField("skuTag", TType.I32, (short)3);
  private static final TField ATTRIBUTE_TAG_FIELD_DESC = new TField("attributeTag", TType.I32, (short)4);


  public int baseTag;
  public int skuTemplateTag;
  public int skuTag;
  public int attributeTag;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    BASE_TAG((short)1, "baseTag"),
    SKU_TEMPLATE_TAG((short)2, "skuTemplateTag"),
    SKU_TAG((short)3, "skuTag"),
    ATTRIBUTE_TAG((short)4, "attributeTag");
  
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
        case 2: // SKU_TEMPLATE_TAG
  	return SKU_TEMPLATE_TAG;
        case 3: // SKU_TAG
  	return SKU_TAG;
        case 4: // ATTRIBUTE_TAG
  	return ATTRIBUTE_TAG;
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
  private static final int __SKUTEMPLATETAG_ISSET_ID = 1;
  private static final int __SKUTAG_ISSET_ID = 2;
  private static final int __ATTRIBUTETAG_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_TAG, new FieldMetaData("baseTag", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.SKU_TEMPLATE_TAG, new FieldMetaData("skuTemplateTag", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.SKU_TAG, new FieldMetaData("skuTag", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.ATTRIBUTE_TAG, new FieldMetaData("attributeTag", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ProductRetParam.class, metaDataMap);
  }


  public ProductRetParam() {
  }

  public ProductRetParam(
    int baseTag,
    int skuTemplateTag,
    int skuTag,
    int attributeTag)
  {
    this();
    this.baseTag = baseTag;
    setBaseTagIsSet(true);
    this.skuTemplateTag = skuTemplateTag;
    setSkuTemplateTagIsSet(true);
    this.skuTag = skuTag;
    setSkuTagIsSet(true);
    this.attributeTag = attributeTag;
    setAttributeTagIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductRetParam(ProductRetParam other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.baseTag = other.baseTag;
    this.skuTemplateTag = other.skuTemplateTag;
    this.skuTag = other.skuTag;
    this.attributeTag = other.attributeTag;
  }

  public ProductRetParam deepCopy() {
    return new ProductRetParam(this);
  }

  @Override
  public void clear() {
    setBaseTagIsSet(false);
    this.baseTag = 0;
    setSkuTemplateTagIsSet(false);
    this.skuTemplateTag = 0;
    setSkuTagIsSet(false);
    this.skuTag = 0;
    setAttributeTagIsSet(false);
    this.attributeTag = 0;
  }

  public int getBaseTag() {
    return this.baseTag;
  }

  public ProductRetParam setBaseTag(int baseTag) {
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

  public int getSkuTemplateTag() {
    return this.skuTemplateTag;
  }

  public ProductRetParam setSkuTemplateTag(int skuTemplateTag) {
    this.skuTemplateTag = skuTemplateTag;
    setSkuTemplateTagIsSet(true);

    return this;
  }

  public void unsetSkuTemplateTag() {
  __isset_bit_vector.clear(__SKUTEMPLATETAG_ISSET_ID);
  }

  /** Returns true if field skuTemplateTag is set (has been asigned a value) and false otherwise */
  public boolean isSetSkuTemplateTag() {
    return __isset_bit_vector.get(__SKUTEMPLATETAG_ISSET_ID);
  }

  public void setSkuTemplateTagIsSet(boolean value) {
    __isset_bit_vector.set(__SKUTEMPLATETAG_ISSET_ID, value);
  }

  public int getSkuTag() {
    return this.skuTag;
  }

  public ProductRetParam setSkuTag(int skuTag) {
    this.skuTag = skuTag;
    setSkuTagIsSet(true);

    return this;
  }

  public void unsetSkuTag() {
  __isset_bit_vector.clear(__SKUTAG_ISSET_ID);
  }

  /** Returns true if field skuTag is set (has been asigned a value) and false otherwise */
  public boolean isSetSkuTag() {
    return __isset_bit_vector.get(__SKUTAG_ISSET_ID);
  }

  public void setSkuTagIsSet(boolean value) {
    __isset_bit_vector.set(__SKUTAG_ISSET_ID, value);
  }

  public int getAttributeTag() {
    return this.attributeTag;
  }

  public ProductRetParam setAttributeTag(int attributeTag) {
    this.attributeTag = attributeTag;
    setAttributeTagIsSet(true);

    return this;
  }

  public void unsetAttributeTag() {
  __isset_bit_vector.clear(__ATTRIBUTETAG_ISSET_ID);
  }

  /** Returns true if field attributeTag is set (has been asigned a value) and false otherwise */
  public boolean isSetAttributeTag() {
    return __isset_bit_vector.get(__ATTRIBUTETAG_ISSET_ID);
  }

  public void setAttributeTagIsSet(boolean value) {
    __isset_bit_vector.set(__ATTRIBUTETAG_ISSET_ID, value);
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
    case SKU_TEMPLATE_TAG:
      if (value == null) {
        unsetSkuTemplateTag();
      } else {
        setSkuTemplateTag((Integer)value);
      }
      break;
    case SKU_TAG:
      if (value == null) {
        unsetSkuTag();
      } else {
        setSkuTag((Integer)value);
      }
      break;
    case ATTRIBUTE_TAG:
      if (value == null) {
        unsetAttributeTag();
      } else {
        setAttributeTag((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_TAG:
      return new Integer(getBaseTag());
    case SKU_TEMPLATE_TAG:
      return new Integer(getSkuTemplateTag());
    case SKU_TAG:
      return new Integer(getSkuTag());
    case ATTRIBUTE_TAG:
      return new Integer(getAttributeTag());
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
    case SKU_TEMPLATE_TAG:
      return isSetSkuTemplateTag();
    case SKU_TAG:
      return isSetSkuTag();
    case ATTRIBUTE_TAG:
      return isSetAttributeTag();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductRetParam)
      return this.equals((ProductRetParam)that);
    return false;
  }

  public boolean equals(ProductRetParam that) {
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
    boolean this_present_skuTemplateTag = true;
    boolean that_present_skuTemplateTag = true;
    if (this_present_skuTemplateTag || that_present_skuTemplateTag) {
      if (!(this_present_skuTemplateTag && that_present_skuTemplateTag))
        return false;
      if (this.skuTemplateTag != that.skuTemplateTag)
        return false;
    }
    boolean this_present_skuTag = true;
    boolean that_present_skuTag = true;
    if (this_present_skuTag || that_present_skuTag) {
      if (!(this_present_skuTag && that_present_skuTag))
        return false;
      if (this.skuTag != that.skuTag)
        return false;
    }
    boolean this_present_attributeTag = true;
    boolean that_present_attributeTag = true;
    if (this_present_attributeTag || that_present_attributeTag) {
      if (!(this_present_attributeTag && that_present_attributeTag))
        return false;
      if (this.attributeTag != that.attributeTag)
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
    boolean present_skuTemplateTag = true;
    builder.append(present_skuTemplateTag);
    if (present_skuTemplateTag)
      builder.append(skuTemplateTag);
    boolean present_skuTag = true;
    builder.append(present_skuTag);
    if (present_skuTag)
      builder.append(skuTag);
    boolean present_attributeTag = true;
    builder.append(present_attributeTag);
    if (present_attributeTag)
      builder.append(attributeTag);
    return builder.toHashCode();
  }

  public int compareTo(ProductRetParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ProductRetParam typedOther = (ProductRetParam)other;

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
    lastComparison = Boolean.valueOf(isSetSkuTemplateTag()).compareTo(typedOther.isSetSkuTemplateTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkuTemplateTag()) {
      lastComparison = TBaseHelper.compareTo(this.skuTemplateTag, typedOther.skuTemplateTag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSkuTag()).compareTo(typedOther.isSetSkuTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkuTag()) {
      lastComparison = TBaseHelper.compareTo(this.skuTag, typedOther.skuTag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributeTag()).compareTo(typedOther.isSetAttributeTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributeTag()) {
      lastComparison = TBaseHelper.compareTo(this.attributeTag, typedOther.attributeTag);
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
        case 2: // SKU_TEMPLATE_TAG
          if (field.type == TType.I32) {
            this.skuTemplateTag = iprot.readI32();
            setSkuTemplateTagIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SKU_TAG
          if (field.type == TType.I32) {
            this.skuTag = iprot.readI32();
            setSkuTagIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ATTRIBUTE_TAG
          if (field.type == TType.I32) {
            this.attributeTag = iprot.readI32();
            setAttributeTagIsSet(true);
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
    oprot.writeFieldBegin(SKU_TEMPLATE_TAG_FIELD_DESC);
    oprot.writeI32(this.skuTemplateTag);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SKU_TAG_FIELD_DESC);
    oprot.writeI32(this.skuTag);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ATTRIBUTE_TAG_FIELD_DESC);
    oprot.writeI32(this.attributeTag);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ProductRetParam(");
    boolean first = true;
    sb.append("baseTag:");
    sb.append(this.baseTag);
    first = false;
    if (!first) sb.append(", ");
    sb.append("skuTemplateTag:");
    sb.append(this.skuTemplateTag);
    first = false;
    if (!first) sb.append(", ");
    sb.append("skuTag:");
    sb.append(this.skuTag);
    first = false;
    if (!first) sb.append(", ");
    sb.append("attributeTag:");
    sb.append(this.attributeTag);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
