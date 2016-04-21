/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.subject;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class SubjectNode implements TBase<SubjectNode, SubjectNode._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SubjectNode");

  private static final TField ID_FIELD_DESC = new TField("id", TType.I32, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField PID_FIELD_DESC = new TField("pid", TType.I32, (short)3);
  private static final TField SORTED_FIELD_DESC = new TField("sorted", TType.I32, (short)4);
  private static final TField IS_LEAF_FIELD_DESC = new TField("isLeaf", TType.I32, (short)5);
  private static final TField DISPLAY_IDS_FIELD_DESC = new TField("displayIds", TType.STRING, (short)6);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)7);


  public int id;
  public String name;
  public int pid;
  public int sorted;
  public int isLeaf;
  public String displayIds;
  public int status;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    PID((short)3, "pid"),
    SORTED((short)4, "sorted"),
    IS_LEAF((short)5, "isLeaf"),
    DISPLAY_IDS((short)6, "displayIds"),
    STATUS((short)7, "status");
  
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
        case 1: // ID
  	return ID;
        case 2: // NAME
  	return NAME;
        case 3: // PID
  	return PID;
        case 4: // SORTED
  	return SORTED;
        case 5: // IS_LEAF
  	return IS_LEAF;
        case 6: // DISPLAY_IDS
  	return DISPLAY_IDS;
        case 7: // STATUS
  	return STATUS;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __PID_ISSET_ID = 1;
  private static final int __SORTED_ISSET_ID = 2;
  private static final int __ISLEAF_ISSET_ID = 3;
  private static final int __STATUS_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PID, new FieldMetaData("pid", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.SORTED, new FieldMetaData("sorted", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.IS_LEAF, new FieldMetaData("isLeaf", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.DISPLAY_IDS, new FieldMetaData("displayIds", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.STATUS, new FieldMetaData("status", TFieldRequirementType.OPTIONAL,
      new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(SubjectNode.class, metaDataMap);
  }


  public SubjectNode() {
  }

  public SubjectNode(
    int id,
    String name,
    int pid,
    int sorted,
    int isLeaf)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.name = name;
    this.pid = pid;
    setPidIsSet(true);
    this.sorted = sorted;
    setSortedIsSet(true);
    this.isLeaf = isLeaf;
    setIsLeafIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubjectNode(SubjectNode other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.pid = other.pid;
    this.sorted = other.sorted;
    this.isLeaf = other.isLeaf;
    if (other.isSetDisplayIds()) {
      this.displayIds = other.displayIds;
    }
    this.status = other.status;
  }

  public SubjectNode deepCopy() {
    return new SubjectNode(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    setPidIsSet(false);
    this.pid = 0;
    setSortedIsSet(false);
    this.sorted = 0;
    setIsLeafIsSet(false);
    this.isLeaf = 0;
    this.displayIds = null;
    setStatusIsSet(false);
    this.status = 0;
  }

  public int getId() {
    return this.id;
  }

  public SubjectNode setId(int id) {
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

  public String getName() {
    return this.name;
  }

  public SubjectNode setName(String name) {
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

  public int getPid() {
    return this.pid;
  }

  public SubjectNode setPid(int pid) {
    this.pid = pid;
    setPidIsSet(true);

    return this;
  }

  public void unsetPid() {
  __isset_bit_vector.clear(__PID_ISSET_ID);
  }

  /** Returns true if field pid is set (has been asigned a value) and false otherwise */
  public boolean isSetPid() {
    return __isset_bit_vector.get(__PID_ISSET_ID);
  }

  public void setPidIsSet(boolean value) {
    __isset_bit_vector.set(__PID_ISSET_ID, value);
  }

  public int getSorted() {
    return this.sorted;
  }

  public SubjectNode setSorted(int sorted) {
    this.sorted = sorted;
    setSortedIsSet(true);

    return this;
  }

  public void unsetSorted() {
  __isset_bit_vector.clear(__SORTED_ISSET_ID);
  }

  /** Returns true if field sorted is set (has been asigned a value) and false otherwise */
  public boolean isSetSorted() {
    return __isset_bit_vector.get(__SORTED_ISSET_ID);
  }

  public void setSortedIsSet(boolean value) {
    __isset_bit_vector.set(__SORTED_ISSET_ID, value);
  }

  public int getIsLeaf() {
    return this.isLeaf;
  }

  public SubjectNode setIsLeaf(int isLeaf) {
    this.isLeaf = isLeaf;
    setIsLeafIsSet(true);

    return this;
  }

  public void unsetIsLeaf() {
  __isset_bit_vector.clear(__ISLEAF_ISSET_ID);
  }

  /** Returns true if field isLeaf is set (has been asigned a value) and false otherwise */
  public boolean isSetIsLeaf() {
    return __isset_bit_vector.get(__ISLEAF_ISSET_ID);
  }

  public void setIsLeafIsSet(boolean value) {
    __isset_bit_vector.set(__ISLEAF_ISSET_ID, value);
  }

  public String getDisplayIds() {
    return this.displayIds;
  }

  public SubjectNode setDisplayIds(String displayIds) {
    this.displayIds = displayIds;
    
    return this;
  }

  public void unsetDisplayIds() {
    this.displayIds = null;
  }

  /** Returns true if field displayIds is set (has been asigned a value) and false otherwise */
  public boolean isSetDisplayIds() {
    return this.displayIds != null;
  }

  public void setDisplayIdsIsSet(boolean value) {
    if (!value) {
      this.displayIds = null;
    }
  }

  public int getStatus() {
    return this.status;
  }

  public SubjectNode setStatus(int status) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;
    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((Integer)value);
      }
      break;
    case SORTED:
      if (value == null) {
        unsetSorted();
      } else {
        setSorted((Integer)value);
      }
      break;
    case IS_LEAF:
      if (value == null) {
        unsetIsLeaf();
      } else {
        setIsLeaf((Integer)value);
      }
      break;
    case DISPLAY_IDS:
      if (value == null) {
        unsetDisplayIds();
      } else {
        setDisplayIds((String)value);
      }
      break;
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return new Integer(getId());
    case NAME:
      return getName();
    case PID:
      return new Integer(getPid());
    case SORTED:
      return new Integer(getSorted());
    case IS_LEAF:
      return new Integer(getIsLeaf());
    case DISPLAY_IDS:
      return getDisplayIds();
    case STATUS:
      return new Integer(getStatus());
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case PID:
      return isSetPid();
    case SORTED:
      return isSetSorted();
    case IS_LEAF:
      return isSetIsLeaf();
    case DISPLAY_IDS:
      return isSetDisplayIds();
    case STATUS:
      return isSetStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubjectNode)
      return this.equals((SubjectNode)that);
    return false;
  }

  public boolean equals(SubjectNode that) {
    if (that == null)
      return false;
    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }
    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }
    boolean this_present_pid = true;
    boolean that_present_pid = true;
    if (this_present_pid || that_present_pid) {
      if (!(this_present_pid && that_present_pid))
        return false;
      if (this.pid != that.pid)
        return false;
    }
    boolean this_present_sorted = true;
    boolean that_present_sorted = true;
    if (this_present_sorted || that_present_sorted) {
      if (!(this_present_sorted && that_present_sorted))
        return false;
      if (this.sorted != that.sorted)
        return false;
    }
    boolean this_present_isLeaf = true;
    boolean that_present_isLeaf = true;
    if (this_present_isLeaf || that_present_isLeaf) {
      if (!(this_present_isLeaf && that_present_isLeaf))
        return false;
      if (this.isLeaf != that.isLeaf)
        return false;
    }
    boolean this_present_displayIds = true && this.isSetDisplayIds();
    boolean that_present_displayIds = true && that.isSetDisplayIds();
    if (this_present_displayIds || that_present_displayIds) {
      if (!(this_present_displayIds && that_present_displayIds))
        return false;
      if (!this.displayIds.equals(that.displayIds))
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

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_id = true;
    builder.append(present_id);
    if (present_id)
      builder.append(id);
    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);
    boolean present_pid = true;
    builder.append(present_pid);
    if (present_pid)
      builder.append(pid);
    boolean present_sorted = true;
    builder.append(present_sorted);
    if (present_sorted)
      builder.append(sorted);
    boolean present_isLeaf = true;
    builder.append(present_isLeaf);
    if (present_isLeaf)
      builder.append(isLeaf);
    boolean present_displayIds = true && (isSetDisplayIds());
    builder.append(present_displayIds);
    if (present_displayIds)
      builder.append(displayIds);
    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);
    return builder.toHashCode();
  }

  public int compareTo(SubjectNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SubjectNode typedOther = (SubjectNode)other;

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
    lastComparison = Boolean.valueOf(isSetPid()).compareTo(typedOther.isSetPid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPid()) {
      lastComparison = TBaseHelper.compareTo(this.pid, typedOther.pid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSorted()).compareTo(typedOther.isSetSorted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSorted()) {
      lastComparison = TBaseHelper.compareTo(this.sorted, typedOther.sorted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsLeaf()).compareTo(typedOther.isSetIsLeaf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsLeaf()) {
      lastComparison = TBaseHelper.compareTo(this.isLeaf, typedOther.isLeaf);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayIds()).compareTo(typedOther.isSetDisplayIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayIds()) {
      lastComparison = TBaseHelper.compareTo(this.displayIds, typedOther.displayIds);
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
        case 1: // ID
          if (field.type == TType.I32) {
            this.id = iprot.readI32();
            setIdIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PID
          if (field.type == TType.I32) {
            this.pid = iprot.readI32();
            setPidIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SORTED
          if (field.type == TType.I32) {
            this.sorted = iprot.readI32();
            setSortedIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // IS_LEAF
          if (field.type == TType.I32) {
            this.isLeaf = iprot.readI32();
            setIsLeafIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DISPLAY_IDS
          if (field.type == TType.STRING) {
            this.displayIds = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // STATUS
          if (field.type == TType.I32) {
            this.status = iprot.readI32();
            setStatusIsSet(true);
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
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI32(this.id);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PID_FIELD_DESC);
    oprot.writeI32(this.pid);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SORTED_FIELD_DESC);
    oprot.writeI32(this.sorted);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IS_LEAF_FIELD_DESC);
    oprot.writeI32(this.isLeaf);
    oprot.writeFieldEnd();
    if (this.displayIds != null) {
      if (isSetDisplayIds()) {
        oprot.writeFieldBegin(DISPLAY_IDS_FIELD_DESC);
        oprot.writeString(this.displayIds);
        oprot.writeFieldEnd();
      }
    }
    if (isSetStatus()) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SubjectNode(");
    boolean first = true;
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pid:");
    sb.append(this.pid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sorted:");
    sb.append(this.sorted);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isLeaf:");
    sb.append(this.isLeaf);
    first = false;
    if (isSetDisplayIds()) {
      if (!first) sb.append(", ");
      sb.append("displayIds:");
      if (this.displayIds == null) {
        sb.append("null");
      } else {
        sb.append(this.displayIds);
      }
      first = false;
      }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
      first = false;
      }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
