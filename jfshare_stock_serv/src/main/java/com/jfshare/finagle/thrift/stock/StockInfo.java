/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.stock;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class StockInfo implements TBase<StockInfo, StockInfo._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("StockInfo");

  private static final TField TOTAL_FIELD_DESC = new TField("total", TType.I32, (short)1);
  private static final TField LOCK_TOTAL_FIELD_DESC = new TField("lockTotal", TType.I32, (short)2);
  private static final TField PRODUCT_ID_FIELD_DESC = new TField("productId", TType.STRING, (short)3);
  private static final TField STOCK_ITEM_MAP_FIELD_DESC = new TField("stockItemMap", TType.MAP, (short)4);
  private static final TField STOCK_ITEMS_FIELD_DESC = new TField("stockItems", TType.LIST, (short)5);


  public int total;
  public int lockTotal;
  public String productId;
  public Map<String,StockItem> stockItemMap;
  public List<StockItem> stockItems;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TOTAL((short)1, "total"),
    LOCK_TOTAL((short)2, "lockTotal"),
    PRODUCT_ID((short)3, "productId"),
    STOCK_ITEM_MAP((short)4, "stockItemMap"),
    STOCK_ITEMS((short)5, "stockItems");
  
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
        case 1: // TOTAL
  	return TOTAL;
        case 2: // LOCK_TOTAL
  	return LOCK_TOTAL;
        case 3: // PRODUCT_ID
  	return PRODUCT_ID;
        case 4: // STOCK_ITEM_MAP
  	return STOCK_ITEM_MAP;
        case 5: // STOCK_ITEMS
  	return STOCK_ITEMS;
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
  private static final int __TOTAL_ISSET_ID = 0;
  private static final int __LOCKTOTAL_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL, new FieldMetaData("total", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.LOCK_TOTAL, new FieldMetaData("lockTotal", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.PRODUCT_ID, new FieldMetaData("productId", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.STOCK_ITEM_MAP, new FieldMetaData("stockItemMap", TFieldRequirementType.DEFAULT,
      new MapMetaData(TType.MAP,
            new FieldValueMetaData(TType.STRING),
            new StructMetaData(TType.STRUCT, StockItem.class))));
    tmpMap.put(_Fields.STOCK_ITEMS, new FieldMetaData("stockItems", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, StockItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(StockInfo.class, metaDataMap);
  }


  public StockInfo() {
  }

  public StockInfo(
    int total,
    int lockTotal,
    String productId,
    Map<String,StockItem> stockItemMap,
    List<StockItem> stockItems)
  {
    this();
    this.total = total;
    setTotalIsSet(true);
    this.lockTotal = lockTotal;
    setLockTotalIsSet(true);
    this.productId = productId;
    this.stockItemMap = stockItemMap;
    this.stockItems = stockItems;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StockInfo(StockInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.total = other.total;
    this.lockTotal = other.lockTotal;
    if (other.isSetProductId()) {
      this.productId = other.productId;
    }
    if (other.isSetStockItemMap()) {
      Map<String,StockItem> __this__stockItemMap = new HashMap<String,StockItem>();
      for (Map.Entry<String, StockItem> other_element : other.stockItemMap.entrySet()) {
        String other_element_key = other_element.getKey();
        StockItem other_element_value = other_element.getValue();
        String __this__stockItemMap_copy_key = other_element_key;
        StockItem __this__stockItemMap_copy_value = new StockItem(other_element_value);
        __this__stockItemMap.put(__this__stockItemMap_copy_key, __this__stockItemMap_copy_value);
      }
      this.stockItemMap = __this__stockItemMap;
    }
    if (other.isSetStockItems()) {
      List<StockItem> __this__stockItems = new ArrayList<StockItem>();
      for (StockItem other_element : other.stockItems) {
        __this__stockItems.add(new StockItem(other_element));
      }
      this.stockItems = __this__stockItems;
    }
  }

  public StockInfo deepCopy() {
    return new StockInfo(this);
  }

  @Override
  public void clear() {
    setTotalIsSet(false);
    this.total = 0;
    setLockTotalIsSet(false);
    this.lockTotal = 0;
    this.productId = null;
    this.stockItemMap = null;
    this.stockItems = null;
  }

  public int getTotal() {
    return this.total;
  }

  public StockInfo setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);

    return this;
  }

  public void unsetTotal() {
  __isset_bit_vector.clear(__TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been asigned a value) and false otherwise */
  public boolean isSetTotal() {
    return __isset_bit_vector.get(__TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bit_vector.set(__TOTAL_ISSET_ID, value);
  }

  public int getLockTotal() {
    return this.lockTotal;
  }

  public StockInfo setLockTotal(int lockTotal) {
    this.lockTotal = lockTotal;
    setLockTotalIsSet(true);

    return this;
  }

  public void unsetLockTotal() {
  __isset_bit_vector.clear(__LOCKTOTAL_ISSET_ID);
  }

  /** Returns true if field lockTotal is set (has been asigned a value) and false otherwise */
  public boolean isSetLockTotal() {
    return __isset_bit_vector.get(__LOCKTOTAL_ISSET_ID);
  }

  public void setLockTotalIsSet(boolean value) {
    __isset_bit_vector.set(__LOCKTOTAL_ISSET_ID, value);
  }

  public String getProductId() {
    return this.productId;
  }

  public StockInfo setProductId(String productId) {
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

  public int getStockItemMapSize() {
    return (this.stockItemMap == null) ? 0 : this.stockItemMap.size();
  }

  public void putToStockItemMap(String key, StockItem val) {
    if (this.stockItemMap == null) {
      this.stockItemMap = new HashMap<String,StockItem>();
    }
    this.stockItemMap.put(key, val);
  }

  public Map<String,StockItem> getStockItemMap() {
    return this.stockItemMap;
  }

  public StockInfo setStockItemMap(Map<String,StockItem> stockItemMap) {
    this.stockItemMap = stockItemMap;
    
    return this;
  }

  public void unsetStockItemMap() {
    this.stockItemMap = null;
  }

  /** Returns true if field stockItemMap is set (has been asigned a value) and false otherwise */
  public boolean isSetStockItemMap() {
    return this.stockItemMap != null;
  }

  public void setStockItemMapIsSet(boolean value) {
    if (!value) {
      this.stockItemMap = null;
    }
  }

  public int getStockItemsSize() {
    return (this.stockItems == null) ? 0 : this.stockItems.size();
  }

  public java.util.Iterator<StockItem> getStockItemsIterator() {
    return (this.stockItems == null) ? null : this.stockItems.iterator();
  }

  public void addToStockItems(StockItem elem) {
    if (this.stockItems == null) {
      this.stockItems = new ArrayList<StockItem>();
    }
    this.stockItems.add(elem);
  }

  public List<StockItem> getStockItems() {
    return this.stockItems;
  }

  public StockInfo setStockItems(List<StockItem> stockItems) {
    this.stockItems = stockItems;
    
    return this;
  }

  public void unsetStockItems() {
    this.stockItems = null;
  }

  /** Returns true if field stockItems is set (has been asigned a value) and false otherwise */
  public boolean isSetStockItems() {
    return this.stockItems != null;
  }

  public void setStockItemsIsSet(boolean value) {
    if (!value) {
      this.stockItems = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Integer)value);
      }
      break;
    case LOCK_TOTAL:
      if (value == null) {
        unsetLockTotal();
      } else {
        setLockTotal((Integer)value);
      }
      break;
    case PRODUCT_ID:
      if (value == null) {
        unsetProductId();
      } else {
        setProductId((String)value);
      }
      break;
    case STOCK_ITEM_MAP:
      if (value == null) {
        unsetStockItemMap();
      } else {
        setStockItemMap((Map<String,StockItem>)value);
      }
      break;
    case STOCK_ITEMS:
      if (value == null) {
        unsetStockItems();
      } else {
        setStockItems((List<StockItem>)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL:
      return new Integer(getTotal());
    case LOCK_TOTAL:
      return new Integer(getLockTotal());
    case PRODUCT_ID:
      return getProductId();
    case STOCK_ITEM_MAP:
      return getStockItemMap();
    case STOCK_ITEMS:
      return getStockItems();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL:
      return isSetTotal();
    case LOCK_TOTAL:
      return isSetLockTotal();
    case PRODUCT_ID:
      return isSetProductId();
    case STOCK_ITEM_MAP:
      return isSetStockItemMap();
    case STOCK_ITEMS:
      return isSetStockItems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StockInfo)
      return this.equals((StockInfo)that);
    return false;
  }

  public boolean equals(StockInfo that) {
    if (that == null)
      return false;
    boolean this_present_total = true;
    boolean that_present_total = true;
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }
    boolean this_present_lockTotal = true;
    boolean that_present_lockTotal = true;
    if (this_present_lockTotal || that_present_lockTotal) {
      if (!(this_present_lockTotal && that_present_lockTotal))
        return false;
      if (this.lockTotal != that.lockTotal)
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
    boolean this_present_stockItemMap = true && this.isSetStockItemMap();
    boolean that_present_stockItemMap = true && that.isSetStockItemMap();
    if (this_present_stockItemMap || that_present_stockItemMap) {
      if (!(this_present_stockItemMap && that_present_stockItemMap))
        return false;
      if (!this.stockItemMap.equals(that.stockItemMap))
        return false;
    }
    boolean this_present_stockItems = true && this.isSetStockItems();
    boolean that_present_stockItems = true && that.isSetStockItems();
    if (this_present_stockItems || that_present_stockItems) {
      if (!(this_present_stockItems && that_present_stockItems))
        return false;
      if (!this.stockItems.equals(that.stockItems))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_total = true;
    builder.append(present_total);
    if (present_total)
      builder.append(total);
    boolean present_lockTotal = true;
    builder.append(present_lockTotal);
    if (present_lockTotal)
      builder.append(lockTotal);
    boolean present_productId = true && (isSetProductId());
    builder.append(present_productId);
    if (present_productId)
      builder.append(productId);
    boolean present_stockItemMap = true && (isSetStockItemMap());
    builder.append(present_stockItemMap);
    if (present_stockItemMap)
      builder.append(stockItemMap);
    boolean present_stockItems = true && (isSetStockItems());
    builder.append(present_stockItems);
    if (present_stockItems)
      builder.append(stockItems);
    return builder.toHashCode();
  }

  public int compareTo(StockInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StockInfo typedOther = (StockInfo)other;

    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(typedOther.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = TBaseHelper.compareTo(this.total, typedOther.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLockTotal()).compareTo(typedOther.isSetLockTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLockTotal()) {
      lastComparison = TBaseHelper.compareTo(this.lockTotal, typedOther.lockTotal);
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
    lastComparison = Boolean.valueOf(isSetStockItemMap()).compareTo(typedOther.isSetStockItemMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStockItemMap()) {
      lastComparison = TBaseHelper.compareTo(this.stockItemMap, typedOther.stockItemMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStockItems()).compareTo(typedOther.isSetStockItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStockItems()) {
      lastComparison = TBaseHelper.compareTo(this.stockItems, typedOther.stockItems);
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
        case 1: // TOTAL
          if (field.type == TType.I32) {
            this.total = iprot.readI32();
            setTotalIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LOCK_TOTAL
          if (field.type == TType.I32) {
            this.lockTotal = iprot.readI32();
            setLockTotalIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PRODUCT_ID
          if (field.type == TType.STRING) {
            this.productId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // STOCK_ITEM_MAP
          if (field.type == TType.MAP) {
            {
            TMap _map0 = iprot.readMapBegin();
            this.stockItemMap = new HashMap<String,StockItem>(2*_map0.size);
            for (int _i1 = 0; _i1 < _map0.size; ++_i1)
            {
              String _key2;
              StockItem _val3;
              _key2 = iprot.readString();
              _val3 = new StockItem();
              _val3.read(iprot);
              this.stockItemMap.put(_key2, _val3);
            }
            iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // STOCK_ITEMS
          if (field.type == TType.LIST) {
            {
            TList _list4 = iprot.readListBegin();
            this.stockItems = new ArrayList<StockItem>(_list4.size);
            for (int _i5 = 0; _i5 < _list4.size; ++_i5)
            {
              StockItem _elem6;
              _elem6 = new StockItem();
              _elem6.read(iprot);
              this.stockItems.add(_elem6);
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
    oprot.writeFieldBegin(TOTAL_FIELD_DESC);
    oprot.writeI32(this.total);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LOCK_TOTAL_FIELD_DESC);
    oprot.writeI32(this.lockTotal);
    oprot.writeFieldEnd();
    if (this.productId != null) {
      oprot.writeFieldBegin(PRODUCT_ID_FIELD_DESC);
      oprot.writeString(this.productId);
      oprot.writeFieldEnd();
    }
    if (this.stockItemMap != null) {
      oprot.writeFieldBegin(STOCK_ITEM_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.stockItemMap.size()));
        for (Map.Entry<String, StockItem> _iter7 : this.stockItemMap.entrySet())
        {
          oprot.writeString(_iter7.getKey());
          _iter7.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.stockItems != null) {
      oprot.writeFieldBegin(STOCK_ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.stockItems.size()));
        for (StockItem _iter8 : this.stockItems)
        {
          _iter8.write(oprot);
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
    StringBuilder sb = new StringBuilder("StockInfo(");
    boolean first = true;
    sb.append("total:");
    sb.append(this.total);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lockTotal:");
    sb.append(this.lockTotal);
    first = false;
    if (!first) sb.append(", ");
    sb.append("productId:");
    if (this.productId == null) {
      sb.append("null");
    } else {
      sb.append(this.productId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stockItemMap:");
    if (this.stockItemMap == null) {
      sb.append("null");
    } else {
      sb.append(this.stockItemMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stockItems:");
    if (this.stockItems == null) {
      sb.append("null");
    } else {
      sb.append(this.stockItems);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
