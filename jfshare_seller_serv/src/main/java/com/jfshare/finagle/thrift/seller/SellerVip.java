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

public class SellerVip implements TBase<SellerVip, SellerVip._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SellerVip");

  private static final TField FAVIMG_FIELD_DESC = new TField("favimg", TType.STRING, (short)1);
  private static final TField USERNAME_FIELD_DESC = new TField("username", TType.STRING, (short)2);
  private static final TField REGEDATE_FIELD_DESC = new TField("regedate", TType.STRING, (short)3);


  public String favimg;
  public String username;
  public String regedate;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    FAVIMG((short)1, "favimg"),
    USERNAME((short)2, "username"),
    REGEDATE((short)3, "regedate");
  
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
        case 1: // FAVIMG
  	return FAVIMG;
        case 2: // USERNAME
  	return USERNAME;
        case 3: // REGEDATE
  	return REGEDATE;
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
    tmpMap.put(_Fields.FAVIMG, new FieldMetaData("favimg", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.USERNAME, new FieldMetaData("username", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.REGEDATE, new FieldMetaData("regedate", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(SellerVip.class, metaDataMap);
  }


  public SellerVip() {
  }

  public SellerVip(
    String favimg,
    String username,
    String regedate)
  {
    this();
    this.favimg = favimg;
    this.username = username;
    this.regedate = regedate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SellerVip(SellerVip other) {
    if (other.isSetFavimg()) {
      this.favimg = other.favimg;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetRegedate()) {
      this.regedate = other.regedate;
    }
  }

  public SellerVip deepCopy() {
    return new SellerVip(this);
  }

  @Override
  public void clear() {
    this.favimg = null;
    this.username = null;
    this.regedate = null;
  }

  public String getFavimg() {
    return this.favimg;
  }

  public SellerVip setFavimg(String favimg) {
    this.favimg = favimg;
    
    return this;
  }

  public void unsetFavimg() {
    this.favimg = null;
  }

  /** Returns true if field favimg is set (has been asigned a value) and false otherwise */
  public boolean isSetFavimg() {
    return this.favimg != null;
  }

  public void setFavimgIsSet(boolean value) {
    if (!value) {
      this.favimg = null;
    }
  }

  public String getUsername() {
    return this.username;
  }

  public SellerVip setUsername(String username) {
    this.username = username;
    
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been asigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getRegedate() {
    return this.regedate;
  }

  public SellerVip setRegedate(String regedate) {
    this.regedate = regedate;
    
    return this;
  }

  public void unsetRegedate() {
    this.regedate = null;
  }

  /** Returns true if field regedate is set (has been asigned a value) and false otherwise */
  public boolean isSetRegedate() {
    return this.regedate != null;
  }

  public void setRegedateIsSet(boolean value) {
    if (!value) {
      this.regedate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FAVIMG:
      if (value == null) {
        unsetFavimg();
      } else {
        setFavimg((String)value);
      }
      break;
    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;
    case REGEDATE:
      if (value == null) {
        unsetRegedate();
      } else {
        setRegedate((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FAVIMG:
      return getFavimg();
    case USERNAME:
      return getUsername();
    case REGEDATE:
      return getRegedate();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FAVIMG:
      return isSetFavimg();
    case USERNAME:
      return isSetUsername();
    case REGEDATE:
      return isSetRegedate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SellerVip)
      return this.equals((SellerVip)that);
    return false;
  }

  public boolean equals(SellerVip that) {
    if (that == null)
      return false;
    boolean this_present_favimg = true && this.isSetFavimg();
    boolean that_present_favimg = true && that.isSetFavimg();
    if (this_present_favimg || that_present_favimg) {
      if (!(this_present_favimg && that_present_favimg))
        return false;
      if (!this.favimg.equals(that.favimg))
        return false;
    }
    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }
    boolean this_present_regedate = true && this.isSetRegedate();
    boolean that_present_regedate = true && that.isSetRegedate();
    if (this_present_regedate || that_present_regedate) {
      if (!(this_present_regedate && that_present_regedate))
        return false;
      if (!this.regedate.equals(that.regedate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_favimg = true && (isSetFavimg());
    builder.append(present_favimg);
    if (present_favimg)
      builder.append(favimg);
    boolean present_username = true && (isSetUsername());
    builder.append(present_username);
    if (present_username)
      builder.append(username);
    boolean present_regedate = true && (isSetRegedate());
    builder.append(present_regedate);
    if (present_regedate)
      builder.append(regedate);
    return builder.toHashCode();
  }

  public int compareTo(SellerVip other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SellerVip typedOther = (SellerVip)other;

    lastComparison = Boolean.valueOf(isSetFavimg()).compareTo(typedOther.isSetFavimg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFavimg()) {
      lastComparison = TBaseHelper.compareTo(this.favimg, typedOther.favimg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(typedOther.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = TBaseHelper.compareTo(this.username, typedOther.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRegedate()).compareTo(typedOther.isSetRegedate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegedate()) {
      lastComparison = TBaseHelper.compareTo(this.regedate, typedOther.regedate);
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
        case 1: // FAVIMG
          if (field.type == TType.STRING) {
            this.favimg = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // USERNAME
          if (field.type == TType.STRING) {
            this.username = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // REGEDATE
          if (field.type == TType.STRING) {
            this.regedate = iprot.readString();
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
    if (this.favimg != null) {
      oprot.writeFieldBegin(FAVIMG_FIELD_DESC);
      oprot.writeString(this.favimg);
      oprot.writeFieldEnd();
    }
    if (this.username != null) {
      oprot.writeFieldBegin(USERNAME_FIELD_DESC);
      oprot.writeString(this.username);
      oprot.writeFieldEnd();
    }
    if (this.regedate != null) {
      oprot.writeFieldBegin(REGEDATE_FIELD_DESC);
      oprot.writeString(this.regedate);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SellerVip(");
    boolean first = true;
    sb.append("favimg:");
    if (this.favimg == null) {
      sb.append("null");
    } else {
      sb.append(this.favimg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("regedate:");
    if (this.regedate == null) {
      sb.append("null");
    } else {
      sb.append(this.regedate);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}