/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.jfshare.finagle.thrift.subject;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class DisplaySubjectTreeResult implements TBase<DisplaySubjectTreeResult, DisplaySubjectTreeResult._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("DisplaySubjectTreeResult");

  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField DISPLAY_SUBJECT_NODES_FIELD_DESC = new TField("displaySubjectNodes", TType.LIST, (short)2);


  public com.jfshare.finagle.thrift.result.Result result;
  public List<DisplaySubjectNode> displaySubjectNodes;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RESULT((short)1, "result"),
    DISPLAY_SUBJECT_NODES((short)2, "displaySubjectNodes");
  
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
        case 2: // DISPLAY_SUBJECT_NODES
  	return DISPLAY_SUBJECT_NODES;
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
    tmpMap.put(_Fields.DISPLAY_SUBJECT_NODES, new FieldMetaData("displaySubjectNodes", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, DisplaySubjectNode.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(DisplaySubjectTreeResult.class, metaDataMap);
  }


  public DisplaySubjectTreeResult() {
  }

  public DisplaySubjectTreeResult(
    com.jfshare.finagle.thrift.result.Result result,
    List<DisplaySubjectNode> displaySubjectNodes)
  {
    this();
    this.result = result;
    this.displaySubjectNodes = displaySubjectNodes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DisplaySubjectTreeResult(DisplaySubjectTreeResult other) {
    if (other.isSetResult()) {
      this.result = new com.jfshare.finagle.thrift.result.Result(other.result);
    }
    if (other.isSetDisplaySubjectNodes()) {
      List<DisplaySubjectNode> __this__displaySubjectNodes = new ArrayList<DisplaySubjectNode>();
      for (DisplaySubjectNode other_element : other.displaySubjectNodes) {
        __this__displaySubjectNodes.add(new DisplaySubjectNode(other_element));
      }
      this.displaySubjectNodes = __this__displaySubjectNodes;
    }
  }

  public DisplaySubjectTreeResult deepCopy() {
    return new DisplaySubjectTreeResult(this);
  }

  @Override
  public void clear() {
    this.result = null;
    this.displaySubjectNodes = null;
  }

  public com.jfshare.finagle.thrift.result.Result getResult() {
    return this.result;
  }

  public DisplaySubjectTreeResult setResult(com.jfshare.finagle.thrift.result.Result result) {
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

  public int getDisplaySubjectNodesSize() {
    return (this.displaySubjectNodes == null) ? 0 : this.displaySubjectNodes.size();
  }

  public java.util.Iterator<DisplaySubjectNode> getDisplaySubjectNodesIterator() {
    return (this.displaySubjectNodes == null) ? null : this.displaySubjectNodes.iterator();
  }

  public void addToDisplaySubjectNodes(DisplaySubjectNode elem) {
    if (this.displaySubjectNodes == null) {
      this.displaySubjectNodes = new ArrayList<DisplaySubjectNode>();
    }
    this.displaySubjectNodes.add(elem);
  }

  public List<DisplaySubjectNode> getDisplaySubjectNodes() {
    return this.displaySubjectNodes;
  }

  public DisplaySubjectTreeResult setDisplaySubjectNodes(List<DisplaySubjectNode> displaySubjectNodes) {
    this.displaySubjectNodes = displaySubjectNodes;
    
    return this;
  }

  public void unsetDisplaySubjectNodes() {
    this.displaySubjectNodes = null;
  }

  /** Returns true if field displaySubjectNodes is set (has been asigned a value) and false otherwise */
  public boolean isSetDisplaySubjectNodes() {
    return this.displaySubjectNodes != null;
  }

  public void setDisplaySubjectNodesIsSet(boolean value) {
    if (!value) {
      this.displaySubjectNodes = null;
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
    case DISPLAY_SUBJECT_NODES:
      if (value == null) {
        unsetDisplaySubjectNodes();
      } else {
        setDisplaySubjectNodes((List<DisplaySubjectNode>)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();
    case DISPLAY_SUBJECT_NODES:
      return getDisplaySubjectNodes();
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
    case DISPLAY_SUBJECT_NODES:
      return isSetDisplaySubjectNodes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DisplaySubjectTreeResult)
      return this.equals((DisplaySubjectTreeResult)that);
    return false;
  }

  public boolean equals(DisplaySubjectTreeResult that) {
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
    boolean this_present_displaySubjectNodes = true && this.isSetDisplaySubjectNodes();
    boolean that_present_displaySubjectNodes = true && that.isSetDisplaySubjectNodes();
    if (this_present_displaySubjectNodes || that_present_displaySubjectNodes) {
      if (!(this_present_displaySubjectNodes && that_present_displaySubjectNodes))
        return false;
      if (!this.displaySubjectNodes.equals(that.displaySubjectNodes))
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
    boolean present_displaySubjectNodes = true && (isSetDisplaySubjectNodes());
    builder.append(present_displaySubjectNodes);
    if (present_displaySubjectNodes)
      builder.append(displaySubjectNodes);
    return builder.toHashCode();
  }

  public int compareTo(DisplaySubjectTreeResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DisplaySubjectTreeResult typedOther = (DisplaySubjectTreeResult)other;

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
    lastComparison = Boolean.valueOf(isSetDisplaySubjectNodes()).compareTo(typedOther.isSetDisplaySubjectNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplaySubjectNodes()) {
      lastComparison = TBaseHelper.compareTo(this.displaySubjectNodes, typedOther.displaySubjectNodes);
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
        case 2: // DISPLAY_SUBJECT_NODES
          if (field.type == TType.LIST) {
            {
            TList _list24 = iprot.readListBegin();
            this.displaySubjectNodes = new ArrayList<DisplaySubjectNode>(_list24.size);
            for (int _i25 = 0; _i25 < _list24.size; ++_i25)
            {
              DisplaySubjectNode _elem26;
              _elem26 = new DisplaySubjectNode();
              _elem26.read(iprot);
              this.displaySubjectNodes.add(_elem26);
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
    if (this.displaySubjectNodes != null) {
      oprot.writeFieldBegin(DISPLAY_SUBJECT_NODES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.displaySubjectNodes.size()));
        for (DisplaySubjectNode _iter27 : this.displaySubjectNodes)
        {
          _iter27.write(oprot);
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
    StringBuilder sb = new StringBuilder("DisplaySubjectTreeResult(");
    boolean first = true;
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displaySubjectNodes:");
    if (this.displaySubjectNodes == null) {
      sb.append("null");
    } else {
      sb.append(this.displaySubjectNodes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}
