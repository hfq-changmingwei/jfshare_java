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

public class ExpressQueryConditions implements TBase<ExpressQueryConditions, ExpressQueryConditions._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ExpressQueryConditions");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField NAME_RULE_FIELD_DESC = new TField("nameRule", TType.STRING, (short)2);
  private static final TField PAGE_SIZE_FIELD_DESC = new TField("pageSize", TType.I32, (short)3);
  private static final TField CUR_PAGE_FIELD_DESC = new TField("curPage", TType.I32, (short)4);
  private static final TField ORDER_BY_CLAUSE_FIELD_DESC = new TField("orderByClause", TType.STRING, (short)5);
  private static final TField ID_FIELD_DESC = new TField("id", TType.I32, (short)6);
  private static final TField GRAB_STATE_FIELD_DESC = new TField("grabState", TType.I32, (short)7);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)8);
  private static final TField TYPE_STATE_FIELD_DESC = new TField("typeState", TType.I32, (short)9);
  private static final TField USER_TYPE_FIELD_DESC = new TField("userType", TType.I32, (short)10);


  public String name;
  public String nameRule;
  public int pageSize;
  public int curPage;
  public String orderByClause;
  public int id;
  public int grabState;
  public int status;
  public int typeState;
  public int userType;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    NAME_RULE((short)2, "nameRule"),
    PAGE_SIZE((short)3, "pageSize"),
    CUR_PAGE((short)4, "curPage"),
    ORDER_BY_CLAUSE((short)5, "orderByClause"),
    ID((short)6, "id"),
    GRAB_STATE((short)7, "grabState"),
    STATUS((short)8, "status"),
    TYPE_STATE((short)9, "typeState"),
    USER_TYPE((short)10, "userType");
  
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
        case 1: // NAME
  	return NAME;
        case 2: // NAME_RULE
  	return NAME_RULE;
        case 3: // PAGE_SIZE
  	return PAGE_SIZE;
        case 4: // CUR_PAGE
  	return CUR_PAGE;
        case 5: // ORDER_BY_CLAUSE
  	return ORDER_BY_CLAUSE;
        case 6: // ID
  	return ID;
        case 7: // GRAB_STATE
  	return GRAB_STATE;
        case 8: // STATUS
  	return STATUS;
        case 9: // TYPE_STATE
  	return TYPE_STATE;
        case 10: // USER_TYPE
  	return USER_TYPE;
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
  private static final int __PAGESIZE_ISSET_ID = 0;
  private static final int __CURPAGE_ISSET_ID = 1;
  private static final int __ID_ISSET_ID = 2;
  private static final int __GRABSTATE_ISSET_ID = 3;
  private static final int __STATUS_ISSET_ID = 4;
  private static final int __TYPESTATE_ISSET_ID = 5;
  private static final int __USERTYPE_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NAME_RULE, new FieldMetaData("nameRule", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PAGE_SIZE, new FieldMetaData("pageSize", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.CUR_PAGE, new FieldMetaData("curPage", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.ORDER_BY_CLAUSE, new FieldMetaData("orderByClause", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.GRAB_STATE, new FieldMetaData("grabState", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.STATUS, new FieldMetaData("status", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.TYPE_STATE, new FieldMetaData("typeState", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.USER_TYPE, new FieldMetaData("userType", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ExpressQueryConditions.class, metaDataMap);
  }


  public ExpressQueryConditions() {
  }

  public ExpressQueryConditions(
    String name,
    String nameRule,
    int pageSize,
    int curPage,
    String orderByClause,
    int id,
    int grabState)
  {
    this();
    this.name = name;
    this.nameRule = nameRule;
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    this.curPage = curPage;
    setCurPageIsSet(true);
    this.orderByClause = orderByClause;
    this.id = id;
    setIdIsSet(true);
    this.grabState = grabState;
    setGrabStateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExpressQueryConditions(ExpressQueryConditions other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetNameRule()) {
      this.nameRule = other.nameRule;
    }
    this.pageSize = other.pageSize;
    this.curPage = other.curPage;
    if (other.isSetOrderByClause()) {
      this.orderByClause = other.orderByClause;
    }
    this.id = other.id;
    this.grabState = other.grabState;
    this.status = other.status;
    this.typeState = other.typeState;
    this.userType = other.userType;
  }

  public ExpressQueryConditions deepCopy() {
    return new ExpressQueryConditions(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.nameRule = null;
    setPageSizeIsSet(false);
    this.pageSize = 0;
    setCurPageIsSet(false);
    this.curPage = 0;
    this.orderByClause = null;
    setIdIsSet(false);
    this.id = 0;
    setGrabStateIsSet(false);
    this.grabState = 0;
    setStatusIsSet(false);
    this.status = 0;
    setTypeStateIsSet(false);
    this.typeState = 0;
    setUserTypeIsSet(false);
    this.userType = 0;
  }

  public String getName() {
    return this.name;
  }

  public ExpressQueryConditions setName(String name) {
    this.name = name;
    
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getNameRule() {
    return this.nameRule;
  }

  public ExpressQueryConditions setNameRule(String nameRule) {
    this.nameRule = nameRule;
    
    return this;
  }

  public void unsetNameRule() {
    this.nameRule = null;
  }

  /** Returns true if field nameRule is set (has been asigned a value) and false otherwise */
  public boolean isSetNameRule() {
    return this.nameRule != null;
  }

  public void setNameRuleIsSet(boolean value) {
    if (!value) {
      this.nameRule = null;
    }
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public ExpressQueryConditions setPageSize(int pageSize) {
    this.pageSize = pageSize;
    setPageSizeIsSet(true);

    return this;
  }

  public void unsetPageSize() {
  __isset_bit_vector.clear(__PAGESIZE_ISSET_ID);
  }

  /** Returns true if field pageSize is set (has been asigned a value) and false otherwise */
  public boolean isSetPageSize() {
    return __isset_bit_vector.get(__PAGESIZE_ISSET_ID);
  }

  public void setPageSizeIsSet(boolean value) {
    __isset_bit_vector.set(__PAGESIZE_ISSET_ID, value);
  }

  public int getCurPage() {
    return this.curPage;
  }

  public ExpressQueryConditions setCurPage(int curPage) {
    this.curPage = curPage;
    setCurPageIsSet(true);

    return this;
  }

  public void unsetCurPage() {
  __isset_bit_vector.clear(__CURPAGE_ISSET_ID);
  }

  /** Returns true if field curPage is set (has been asigned a value) and false otherwise */
  public boolean isSetCurPage() {
    return __isset_bit_vector.get(__CURPAGE_ISSET_ID);
  }

  public void setCurPageIsSet(boolean value) {
    __isset_bit_vector.set(__CURPAGE_ISSET_ID, value);
  }

  public String getOrderByClause() {
    return this.orderByClause;
  }

  public ExpressQueryConditions setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
    
    return this;
  }

  public void unsetOrderByClause() {
    this.orderByClause = null;
  }

  /** Returns true if field orderByClause is set (has been asigned a value) and false otherwise */
  public boolean isSetOrderByClause() {
    return this.orderByClause != null;
  }

  public void setOrderByClauseIsSet(boolean value) {
    if (!value) {
      this.orderByClause = null;
    }
  }

  public int getId() {
    return this.id;
  }

  public ExpressQueryConditions setId(int id) {
    this.id = id;
    setIdIsSet(true);

    return this;
  }

  public void unsetId() {
  __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been asigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public int getGrabState() {
    return this.grabState;
  }

  public ExpressQueryConditions setGrabState(int grabState) {
    this.grabState = grabState;
    setGrabStateIsSet(true);

    return this;
  }

  public void unsetGrabState() {
  __isset_bit_vector.clear(__GRABSTATE_ISSET_ID);
  }

  /** Returns true if field grabState is set (has been asigned a value) and false otherwise */
  public boolean isSetGrabState() {
    return __isset_bit_vector.get(__GRABSTATE_ISSET_ID);
  }

  public void setGrabStateIsSet(boolean value) {
    __isset_bit_vector.set(__GRABSTATE_ISSET_ID, value);
  }

  public int getStatus() {
    return this.status;
  }

  public ExpressQueryConditions setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);

    return this;
  }

  public void unsetStatus() {
  __isset_bit_vector.clear(__STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been asigned a value) and false otherwise */
  public boolean isSetStatus() {
    return __isset_bit_vector.get(__STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bit_vector.set(__STATUS_ISSET_ID, value);
  }

  public int getTypeState() {
    return this.typeState;
  }

  public ExpressQueryConditions setTypeState(int typeState) {
    this.typeState = typeState;
    setTypeStateIsSet(true);

    return this;
  }

  public void unsetTypeState() {
  __isset_bit_vector.clear(__TYPESTATE_ISSET_ID);
  }

  /** Returns true if field typeState is set (has been asigned a value) and false otherwise */
  public boolean isSetTypeState() {
    return __isset_bit_vector.get(__TYPESTATE_ISSET_ID);
  }

  public void setTypeStateIsSet(boolean value) {
    __isset_bit_vector.set(__TYPESTATE_ISSET_ID, value);
  }

  public int getUserType() {
    return this.userType;
  }

  public ExpressQueryConditions setUserType(int userType) {
    this.userType = userType;
    setUserTypeIsSet(true);

    return this;
  }

  public void unsetUserType() {
  __isset_bit_vector.clear(__USERTYPE_ISSET_ID);
  }

  /** Returns true if field userType is set (has been asigned a value) and false otherwise */
  public boolean isSetUserType() {
    return __isset_bit_vector.get(__USERTYPE_ISSET_ID);
  }

  public void setUserTypeIsSet(boolean value) {
    __isset_bit_vector.set(__USERTYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;
    case NAME_RULE:
      if (value == null) {
        unsetNameRule();
      } else {
        setNameRule((String)value);
      }
      break;
    case PAGE_SIZE:
      if (value == null) {
        unsetPageSize();
      } else {
        setPageSize((Integer)value);
      }
      break;
    case CUR_PAGE:
      if (value == null) {
        unsetCurPage();
      } else {
        setCurPage((Integer)value);
      }
      break;
    case ORDER_BY_CLAUSE:
      if (value == null) {
        unsetOrderByClause();
      } else {
        setOrderByClause((String)value);
      }
      break;
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;
    case GRAB_STATE:
      if (value == null) {
        unsetGrabState();
      } else {
        setGrabState((Integer)value);
      }
      break;
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;
    case TYPE_STATE:
      if (value == null) {
        unsetTypeState();
      } else {
        setTypeState((Integer)value);
      }
      break;
    case USER_TYPE:
      if (value == null) {
        unsetUserType();
      } else {
        setUserType((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();
    case NAME_RULE:
      return getNameRule();
    case PAGE_SIZE:
      return new Integer(getPageSize());
    case CUR_PAGE:
      return new Integer(getCurPage());
    case ORDER_BY_CLAUSE:
      return getOrderByClause();
    case ID:
      return new Integer(getId());
    case GRAB_STATE:
      return new Integer(getGrabState());
    case STATUS:
      return new Integer(getStatus());
    case TYPE_STATE:
      return new Integer(getTypeState());
    case USER_TYPE:
      return new Integer(getUserType());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case NAME_RULE:
      return isSetNameRule();
    case PAGE_SIZE:
      return isSetPageSize();
    case CUR_PAGE:
      return isSetCurPage();
    case ORDER_BY_CLAUSE:
      return isSetOrderByClause();
    case ID:
      return isSetId();
    case GRAB_STATE:
      return isSetGrabState();
    case STATUS:
      return isSetStatus();
    case TYPE_STATE:
      return isSetTypeState();
    case USER_TYPE:
      return isSetUserType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExpressQueryConditions)
      return this.equals((ExpressQueryConditions)that);
    return false;
  }

  public boolean equals(ExpressQueryConditions that) {
    if (that == null)
      return false;
    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }
    boolean this_present_nameRule = true && this.isSetNameRule();
    boolean that_present_nameRule = true && that.isSetNameRule();
    if (this_present_nameRule || that_present_nameRule) {
      if (!(this_present_nameRule && that_present_nameRule))
        return false;
      if (!this.nameRule.equals(that.nameRule))
        return false;
    }
    boolean this_present_pageSize = true;
    boolean that_present_pageSize = true;
    if (this_present_pageSize || that_present_pageSize) {
      if (!(this_present_pageSize && that_present_pageSize))
        return false;
      if (this.pageSize != that.pageSize)
        return false;
    }
    boolean this_present_curPage = true;
    boolean that_present_curPage = true;
    if (this_present_curPage || that_present_curPage) {
      if (!(this_present_curPage && that_present_curPage))
        return false;
      if (this.curPage != that.curPage)
        return false;
    }
    boolean this_present_orderByClause = true && this.isSetOrderByClause();
    boolean that_present_orderByClause = true && that.isSetOrderByClause();
    if (this_present_orderByClause || that_present_orderByClause) {
      if (!(this_present_orderByClause && that_present_orderByClause))
        return false;
      if (!this.orderByClause.equals(that.orderByClause))
        return false;
    }
    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }
    boolean this_present_grabState = true;
    boolean that_present_grabState = true;
    if (this_present_grabState || that_present_grabState) {
      if (!(this_present_grabState && that_present_grabState))
        return false;
      if (this.grabState != that.grabState)
        return false;
    }
    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }
    boolean this_present_typeState = true && this.isSetTypeState();
    boolean that_present_typeState = true && that.isSetTypeState();
    if (this_present_typeState || that_present_typeState) {
      if (!(this_present_typeState && that_present_typeState))
        return false;
      if (this.typeState != that.typeState)
        return false;
    }
    boolean this_present_userType = true && this.isSetUserType();
    boolean that_present_userType = true && that.isSetUserType();
    if (this_present_userType || that_present_userType) {
      if (!(this_present_userType && that_present_userType))
        return false;
      if (this.userType != that.userType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);
    boolean present_nameRule = true && (isSetNameRule());
    builder.append(present_nameRule);
    if (present_nameRule)
      builder.append(nameRule);
    boolean present_pageSize = true;
    builder.append(present_pageSize);
    if (present_pageSize)
      builder.append(pageSize);
    boolean present_curPage = true;
    builder.append(present_curPage);
    if (present_curPage)
      builder.append(curPage);
    boolean present_orderByClause = true && (isSetOrderByClause());
    builder.append(present_orderByClause);
    if (present_orderByClause)
      builder.append(orderByClause);
    boolean present_id = true;
    builder.append(present_id);
    if (present_id)
      builder.append(id);
    boolean present_grabState = true;
    builder.append(present_grabState);
    if (present_grabState)
      builder.append(grabState);
    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);
    boolean present_typeState = true && (isSetTypeState());
    builder.append(present_typeState);
    if (present_typeState)
      builder.append(typeState);
    boolean present_userType = true && (isSetUserType());
    builder.append(present_userType);
    if (present_userType)
      builder.append(userType);
    return builder.toHashCode();
  }

  public int compareTo(ExpressQueryConditions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExpressQueryConditions typedOther = (ExpressQueryConditions)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNameRule()).compareTo(typedOther.isSetNameRule());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNameRule()) {
      lastComparison = TBaseHelper.compareTo(this.nameRule, typedOther.nameRule);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPageSize()).compareTo(typedOther.isSetPageSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageSize()) {
      lastComparison = TBaseHelper.compareTo(this.pageSize, typedOther.pageSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurPage()).compareTo(typedOther.isSetCurPage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurPage()) {
      lastComparison = TBaseHelper.compareTo(this.curPage, typedOther.curPage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderByClause()).compareTo(typedOther.isSetOrderByClause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderByClause()) {
      lastComparison = TBaseHelper.compareTo(this.orderByClause, typedOther.orderByClause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrabState()).compareTo(typedOther.isSetGrabState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrabState()) {
      lastComparison = TBaseHelper.compareTo(this.grabState, typedOther.grabState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypeState()).compareTo(typedOther.isSetTypeState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeState()) {
      lastComparison = TBaseHelper.compareTo(this.typeState, typedOther.typeState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserType()).compareTo(typedOther.isSetUserType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserType()) {
      lastComparison = TBaseHelper.compareTo(this.userType, typedOther.userType);
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
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME_RULE
          if (field.type == TType.STRING) {
            this.nameRule = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PAGE_SIZE
          if (field.type == TType.I32) {
            this.pageSize = iprot.readI32();
            setPageSizeIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // CUR_PAGE
          if (field.type == TType.I32) {
            this.curPage = iprot.readI32();
            setCurPageIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // ORDER_BY_CLAUSE
          if (field.type == TType.STRING) {
            this.orderByClause = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // ID
          if (field.type == TType.I32) {
            this.id = iprot.readI32();
            setIdIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // GRAB_STATE
          if (field.type == TType.I32) {
            this.grabState = iprot.readI32();
            setGrabStateIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // STATUS
          if (field.type == TType.I32) {
            this.status = iprot.readI32();
            setStatusIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // TYPE_STATE
          if (field.type == TType.I32) {
            this.typeState = iprot.readI32();
            setTypeStateIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // USER_TYPE
          if (field.type == TType.I32) {
            this.userType = iprot.readI32();
            setUserTypeIsSet(true);
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
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.nameRule != null) {
      oprot.writeFieldBegin(NAME_RULE_FIELD_DESC);
      oprot.writeString(this.nameRule);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
    oprot.writeI32(this.pageSize);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CUR_PAGE_FIELD_DESC);
    oprot.writeI32(this.curPage);
    oprot.writeFieldEnd();
    if (this.orderByClause != null) {
      oprot.writeFieldBegin(ORDER_BY_CLAUSE_FIELD_DESC);
      oprot.writeString(this.orderByClause);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI32(this.id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GRAB_STATE_FIELD_DESC);
    oprot.writeI32(this.grabState);
    oprot.writeFieldEnd();
    if (isSetStatus()) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status);
      oprot.writeFieldEnd();
    }
    if (isSetTypeState()) {
      oprot.writeFieldBegin(TYPE_STATE_FIELD_DESC);
      oprot.writeI32(this.typeState);
      oprot.writeFieldEnd();
    }
    if (isSetUserType()) {
      oprot.writeFieldBegin(USER_TYPE_FIELD_DESC);
      oprot.writeI32(this.userType);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExpressQueryConditions(");
    boolean first = true;
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nameRule:");
    if (this.nameRule == null) {
      sb.append("null");
    } else {
      sb.append(this.nameRule);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageSize:");
    sb.append(this.pageSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("curPage:");
    sb.append(this.curPage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderByClause:");
    if (this.orderByClause == null) {
      sb.append("null");
    } else {
      sb.append(this.orderByClause);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("grabState:");
    sb.append(this.grabState);
    first = false;
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
      first = false;
      }
    if (isSetTypeState()) {
      if (!first) sb.append(", ");
      sb.append("typeState:");
      sb.append(this.typeState);
      first = false;
      }
    if (isSetUserType()) {
      if (!first) sb.append(", ");
      sb.append("userType:");
      sb.append(this.userType);
      first = false;
      }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
