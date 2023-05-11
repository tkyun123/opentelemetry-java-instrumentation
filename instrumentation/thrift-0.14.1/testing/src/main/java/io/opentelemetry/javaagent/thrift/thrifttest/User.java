/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.javaagent.thrift.thrifttest;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(
    value = "Autogenerated by Thrift Compiler (0.18.1)",
    date = "2023-05-08")
public class User
    implements org.apache.thrift.TBase<User, User.Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<User> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("User");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "name", org.apache.thrift.protocol.TType.STRING, (short) 1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "userId", org.apache.thrift.protocol.TType.STRING, (short) 2);
  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC =
      new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I32, (short) 3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
      new UserStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
      new UserTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String userId; // required
  public int age; // required

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short) 1, "name"),
    USER_ID((short) 2, "userId"),
    AGE((short) 3, "age");

    private static final java.util.Map<java.lang.String, Fields> byName =
        new java.util.HashMap<java.lang.String, Fields>();

    static {
      for (Fields field : java.util.EnumSet.allOf(Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /** Find the _Fields constant that matches fieldId, or null if its not found. */
    @org.apache.thrift.annotation.Nullable
    public static Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // USER_ID
          return USER_ID;
        case 3: // AGE
          return AGE;
        default:
          return null;
      }
    }

    /** Find the _Fields constant that matches fieldId, throwing an exception if it is not found. */
    public static Fields findByThriftIdOrThrow(int fieldId) {
      Fields fields = findByThriftId(fieldId);
      if (fields == null) {
        throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      }
      return fields;
    }

    /** Find the _Fields constant that matches name, or null if its not found. */
    @org.apache.thrift.annotation.Nullable
    public static Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short thriftId;
    private final java.lang.String fieldName;

    Fields(short thriftId, java.lang.String fieldName) {
      this.thriftId = thriftId;
      this.fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return fieldName;
    }
  }

  // isset id assignments
  private static final int __AGE_ISSET_ID = 0;
  private byte issetBitfield = 0;
  public static final java.util.Map<Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

  static {
    java.util.Map<Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new java.util.EnumMap<Fields, org.apache.thrift.meta_data.FieldMetaData>(Fields.class);
    tmpMap.put(
        Fields.NAME,
        new org.apache.thrift.meta_data.FieldMetaData(
            "name",
            org.apache.thrift.TFieldRequirementType.REQUIRED,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(
        Fields.USER_ID,
        new org.apache.thrift.meta_data.FieldMetaData(
            "userId",
            org.apache.thrift.TFieldRequirementType.REQUIRED,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(
        Fields.AGE,
        new org.apache.thrift.meta_data.FieldMetaData(
            "age",
            org.apache.thrift.TFieldRequirementType.REQUIRED,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
  }

  public User() {}

  public User(java.lang.String name, java.lang.String userId, int age) {
    this();
    this.name = name;
    this.userId = userId;
    this.age = age;
    setAgeIsSet(true);
  }

  /** Performs a deep copy on <i>other</i>. */
  public User(User other) {
    issetBitfield = other.issetBitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    this.age = other.age;
  }

  @Override
  public User deepCopy() {
    return new User(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.userId = null;
    setAgeIsSet(false);
    this.age = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public User setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUserId() {
    return this.userId;
  }

  public User setUserId(@org.apache.thrift.annotation.Nullable java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public int getAge() {
    return this.age;
  }

  public User setAge(int age) {
    this.age = age;
    setAgeIsSet(true);
    return this;
  }

  public void unsetAge() {
    issetBitfield = org.apache.thrift.EncodingUtils.clearBit(issetBitfield, __AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return org.apache.thrift.EncodingUtils.testBit(issetBitfield, __AGE_ISSET_ID);
  }

  public void setAgeIsSet(boolean value) {
    issetBitfield = org.apache.thrift.EncodingUtils.setBit(issetBitfield, __AGE_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(
      Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
      case NAME:
        if (value == null) {
          unsetName();
        } else {
          setName((java.lang.String) value);
        }
        break;

      case USER_ID:
        if (value == null) {
          unsetUserId();
        } else {
          setUserId((java.lang.String) value);
        }
        break;

      case AGE:
        if (value == null) {
          unsetAge();
        } else {
          setAge((java.lang.Integer) value);
        }
        break;
    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(Fields field) {
    switch (field) {
      case NAME:
        return getName();

      case USER_ID:
        return getUserId();

      case AGE:
        return getAge();
    }
    throw new java.lang.IllegalStateException();
  }

  /**
   * Returns true if field corresponding to fieldID is set (has been assigned a value) and false
   * otherwise
   */
  @Override
  public boolean isSet(Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
      case NAME:
        return isSetName();
      case USER_ID:
        return isSetUserId();
      case AGE:
        return isSetAge();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof User) {
      return this.equals((User) that);
    }
    return false;
  }

  public boolean equals(User that) {
    if (that == null) {
      return false;
    }
    if (this == that) {
      return true;
    }

    boolean thisPresentName = true && this.isSetName();
    boolean thatPresentName = true && that.isSetName();
    if (thisPresentName || thatPresentName) {
      if (!(thisPresentName && thatPresentName)) {
        return false;
      }
      if (!this.name.equals(that.name)) {
        return false;
      }
    }

    boolean thisPresentUserId = true && this.isSetUserId();
    boolean thatPresentUserId = true && that.isSetUserId();
    if (thisPresentUserId || thatPresentUserId) {
      if (!(thisPresentUserId && thatPresentUserId)) {
        return false;
      }
      if (!this.userId.equals(that.userId)) {
        return false;
      }
    }

    boolean thisPresentAge = true;
    boolean thatPresentAge = true;
    if (thisPresentAge || thatPresentAge) {
      if (!(thisPresentAge && thatPresentAge)) {
        return false;
      }
      if (this.age != that.age) {
        return false;
      }
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName()) {
      hashCode = hashCode * 8191 + name.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
    if (isSetUserId()) {
      hashCode = hashCode * 8191 + userId.hashCode();
    }

    hashCode = hashCode * 8191 + age;

    return hashCode;
  }

  @Override
  public int compareTo(User other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUserId(), other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAge(), other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public Fields fieldForId(int fieldId) {
    return Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot)
      throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("User(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("age:");
    sb.append(this.age);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException(
          "Required field 'name' was not present! Struct: " + toString());
    }
    if (userId == null) {
      throw new org.apache.thrift.protocol.TProtocolException(
          "Required field 'userId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'age' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in)
      throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and
      // doesn't call the default constructor.
      issetBitfield = 0;
      read(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public UserStandardScheme getScheme() {
      return new UserStandardScheme();
    }
  }

  private static class UserStandardScheme extends org.apache.thrift.scheme.StandardScheme<User> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, User struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.age = iprot.readI32();
              struct.setAgeIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetAge()) {
        throw new org.apache.thrift.protocol.TProtocolException(
            "Required field 'age' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, User struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGE_FIELD_DESC);
      oprot.writeI32(struct.age);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }

  private static class UserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public UserTupleScheme getScheme() {
      return new UserTupleScheme();
    }
  }

  private static class UserTupleScheme extends org.apache.thrift.scheme.TupleScheme<User> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, User struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeString(struct.userId);
      oprot.writeI32(struct.age);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, User struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.userId = iprot.readString();
      struct.setUserIdIsSet(true);
      struct.age = iprot.readI32();
      struct.setAgeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(
      org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme())
            ? STANDARD_SCHEME_FACTORY
            : TUPLE_SCHEME_FACTORY)
        .getScheme();
  }
}
