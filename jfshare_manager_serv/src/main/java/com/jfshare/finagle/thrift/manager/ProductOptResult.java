/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.manager;

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

public class ProductOptResult implements TBase<ProductOptResult, ProductOptResult._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ProductOptResult");

  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField PRODUCT_OPT_RECORDS_FIELD_DESC = new TField("productOptRecords", TType.LIST, (short)2);


  public com.jfshare.finagle.thrift.result.Result result;
  public List<ProductOpt> productOptRecords;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RESULT((short)1, "result"),
    PRODUCT_OPT_RECORDS((short)2, "productOptRecords");
  
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
        case 1: // RESULT
  	return RESULT;
        case 2: // PRODUCT_OPT_RECORDS
  	return PRODUCT_OPT_RECORDS;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new FieldMetaData("result", TFieldRequirementType.DEFAULT,
      new StructMetaData(TType.STRUCT, com.jfshare.finagle.thrift.result.Result.class)));
    tmpMap.put(_Fields.PRODUCT_OPT_RECORDS, new FieldMetaData("productOptRecords", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, ProductOpt.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ProductOptResult.class, metaDataMap);
  }


  public ProductOptResult() {
  }

  public ProductOptResult(
    com.jfshare.finagle.thrift.result.Result result,
    List<ProductOpt> productOptRecords)
  {
    this();
    this.result = result;
    this.productOptRecords = productOptRecords;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductOptResult(ProductOptResult other) {
    if (other.isSetResult()) {
      this.result = new com.jfshare.finagle.thrift.result.Result(other.result);
    }
    if (other.isSetProductOptRecords()) {
      List<ProductOpt> __this__productOptRecords = new ArrayList<ProductOpt>();
      for (ProductOpt other_element : other.productOptRecords) {
        __this__productOptRecords.add(new ProductOpt(other_element));
      }
      this.productOptRecords = __this__productOptRecords;
    }
  }

  public ProductOptResult deepCopy() {
    return new ProductOptResult(this);
  }

  @Override
  public void clear() {
    this.result = null;
    this.productOptRecords = null;
  }

  public com.jfshare.finagle.thrift.result.Result getResult() {
    return this.result;
  }

  public ProductOptResult setResult(com.jfshare.finagle.thrift.result.Result result) {
    this.result = result;
    
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been asigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public int getProductOptRecordsSize() {
    return (this.productOptRecords == null) ? 0 : this.productOptRecords.size();
  }

  public java.util.Iterator<ProductOpt> getProductOptRecordsIterator() {
    return (this.productOptRecords == null) ? null : this.productOptRecords.iterator();
  }

  public void addToProductOptRecords(ProductOpt elem) {
    if (this.productOptRecords == null) {
      this.productOptRecords = new ArrayList<ProductOpt>();
    }
    this.productOptRecords.add(elem);
  }

  public List<ProductOpt> getProductOptRecords() {
    return this.productOptRecords;
  }

  public ProductOptResult setProductOptRecords(List<ProductOpt> productOptRecords) {
    this.productOptRecords = productOptRecords;
    
    return this;
  }

  public void unsetProductOptRecords() {
    this.productOptRecords = null;
  }

  /** Returns true if field productOptRecords is set (has been asigned a value) and false otherwise */
  public boolean isSetProductOptRecords() {
    return this.productOptRecords != null;
  }

  public void setProductOptRecordsIsSet(boolean value) {
    if (!value) {
      this.productOptRecords = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((com.jfshare.finagle.thrift.result.Result)value);
      }
      break;
    case PRODUCT_OPT_RECORDS:
      if (value == null) {
        unsetProductOptRecords();
      } else {
        setProductOptRecords((List<ProductOpt>)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();
    case PRODUCT_OPT_RECORDS:
      return getProductOptRecords();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case PRODUCT_OPT_RECORDS:
      return isSetProductOptRecords();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductOptResult)
      return this.equals((ProductOptResult)that);
    return false;
  }

  public boolean equals(ProductOptResult that) {
    if (that == null)
      return false;
    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }
    boolean this_present_productOptRecords = true && this.isSetProductOptRecords();
    boolean that_present_productOptRecords = true && that.isSetProductOptRecords();
    if (this_present_productOptRecords || that_present_productOptRecords) {
      if (!(this_present_productOptRecords && that_present_productOptRecords))
        return false;
      if (!this.productOptRecords.equals(that.productOptRecords))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_result = true && (isSetResult());
    builder.append(present_result);
    if (present_result)
      builder.append(result);
    boolean present_productOptRecords = true && (isSetProductOptRecords());
    builder.append(present_productOptRecords);
    if (present_productOptRecords)
      builder.append(productOptRecords);
    return builder.toHashCode();
  }

  public int compareTo(ProductOptResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ProductOptResult typedOther = (ProductOptResult)other;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProductOptRecords()).compareTo(typedOther.isSetProductOptRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductOptRecords()) {
      lastComparison = TBaseHelper.compareTo(this.productOptRecords, typedOther.productOptRecords);
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
        case 1: // RESULT
          if (field.type == TType.STRUCT) {
            this.result = new com.jfshare.finagle.thrift.result.Result();
            this.result.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PRODUCT_OPT_RECORDS
          if (field.type == TType.LIST) {
            {
            TList _list0 = iprot.readListBegin();
            this.productOptRecords = new ArrayList<ProductOpt>(_list0.size);
            for (int _i1 = 0; _i1 < _list0.size; ++_i1)
            {
              ProductOpt _elem2;
              _elem2 = new ProductOpt();
              _elem2.read(iprot);
              this.productOptRecords.add(_elem2);
            }
            iprot.readListEnd();
            }
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
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.productOptRecords != null) {
      oprot.writeFieldBegin(PRODUCT_OPT_RECORDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.productOptRecords.size()));
        for (ProductOpt _iter3 : this.productOptRecords)
        {
          _iter3.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ProductOptResult(");
    boolean first = true;
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("productOptRecords:");
    if (this.productOptRecords == null) {
      sb.append("null");
    } else {
      sb.append(this.productOptRecords);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
