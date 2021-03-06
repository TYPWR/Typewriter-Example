// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: UserPb.proto

package com.typewriter_java.protocolBuffer;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.typewriter_java.annotation.RepeatableTypewriter;
import com.typewriter_java.annotation.Typewriter;
import com.typewriter_java.annotation.TypewriterOption;
import com.typewriter_java.annotation.Rewritten;

import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Map;
import okio.ByteString;

@RepeatableTypewriter({
        @Typewriter(generate = "UserPbModel"),
        @Typewriter(inherit = "TypewriterBaseModel"),
        @Typewriter(implement = {"Serializable"}),
        @Typewriter(filter = {"success"}),
        @Typewriter(predicateFilter = "SELF CONTAINS %@, result"),
        @Typewriter(TypewriterOption.immutable),
        @Typewriter(rewritten = {@Rewritten(on = "userName", name = "name"),
                @Rewritten(on = "educationEnum", name = "education", type = "EducationLevel"),
                @Rewritten(on = "pet", type = "$ref(PetPb.java)"),
                @Rewritten(on = "ownHouses", name = "houses", type = "$ref(HousePb.java)"),
                @Rewritten(on = "wardrobes", type = "$ref(ClothesPb.java)")})
})
public final class UserPb extends Message<UserPb, UserPb.Builder> {
  public static final ProtoAdapter<UserPb> ADAPTER = new ProtoAdapter_UserPb();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_RESULTMESSAGE = "";

  public static final String DEFAULT_RESULTCODE = "";

  public static final Boolean DEFAULT_SUCCESS = false;

  public static final String DEFAULT_USERNAME = "";

  public static final String DEFAULT_FAVOURITESPORT = "";

  public static final String DEFAULT_FAVOURITEMOVIE = "";

  public static final Boolean DEFAULT_HASMARRIED = false;

  public static final String DEFAULT_EDUCATIONENUM = "";

  public static final Integer DEFAULT_AGE = 0;

  public static final Integer DEFAULT_PSYCHOLOGICALAGE = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String resultMessage;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String resultCode;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean success;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String userName;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String favouriteSport;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String favouriteMovie;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean hasMarried;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String educationEnum;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer age;

  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#SINT32"
  )
  public final Integer psychologicalAge;

  @WireField(
      tag = 11,
      adapter = "PetPb#ADAPTER"
  )
  public final PetPb pet;

  @WireField(
      tag = 12,
      adapter = "HousePb#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<HousePb> ownHouses;

  @WireField(
      tag = 13,
      keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
      adapter = "ClothesPb#ADAPTER"
  )
  public final Map<String, ClothesPb> wardrobes;

  public UserPb(String resultMessage, String resultCode, Boolean success, String userName,
      String favouriteSport, String favouriteMovie, Boolean hasMarried, String educationEnum,
      Integer age, Integer psychologicalAge, PetPb pet, List<HousePb> ownHouses,
      Map<String, ClothesPb> wardrobes) {
    this(resultMessage, resultCode, success, userName, favouriteSport, favouriteMovie, hasMarried, educationEnum, age, psychologicalAge, pet, ownHouses, wardrobes, ByteString.EMPTY);
  }

  public UserPb(String resultMessage, String resultCode, Boolean success, String userName,
      String favouriteSport, String favouriteMovie, Boolean hasMarried, String educationEnum,
      Integer age, Integer psychologicalAge, PetPb pet, List<HousePb> ownHouses,
      Map<String, ClothesPb> wardrobes, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.resultMessage = resultMessage;
    this.resultCode = resultCode;
    this.success = success;
    this.userName = userName;
    this.favouriteSport = favouriteSport;
    this.favouriteMovie = favouriteMovie;
    this.hasMarried = hasMarried;
    this.educationEnum = educationEnum;
    this.age = age;
    this.psychologicalAge = psychologicalAge;
    this.pet = pet;
    this.ownHouses = Internal.immutableCopyOf("ownHouses", ownHouses);
    this.wardrobes = Internal.immutableCopyOf("wardrobes", wardrobes);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.resultMessage = resultMessage;
    builder.resultCode = resultCode;
    builder.success = success;
    builder.userName = userName;
    builder.favouriteSport = favouriteSport;
    builder.favouriteMovie = favouriteMovie;
    builder.hasMarried = hasMarried;
    builder.educationEnum = educationEnum;
    builder.age = age;
    builder.psychologicalAge = psychologicalAge;
    builder.pet = pet;
    builder.ownHouses = Internal.copyOf("ownHouses", ownHouses);
    builder.wardrobes = Internal.copyOf("wardrobes", wardrobes);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UserPb)) return false;
    UserPb o = (UserPb) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(resultMessage, o.resultMessage)
        && Internal.equals(resultCode, o.resultCode)
        && Internal.equals(success, o.success)
        && Internal.equals(userName, o.userName)
        && Internal.equals(favouriteSport, o.favouriteSport)
        && Internal.equals(favouriteMovie, o.favouriteMovie)
        && Internal.equals(hasMarried, o.hasMarried)
        && Internal.equals(educationEnum, o.educationEnum)
        && Internal.equals(age, o.age)
        && Internal.equals(psychologicalAge, o.psychologicalAge)
        && Internal.equals(pet, o.pet)
        && ownHouses.equals(o.ownHouses)
        && wardrobes.equals(o.wardrobes);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (resultMessage != null ? resultMessage.hashCode() : 0);
      result = result * 37 + (resultCode != null ? resultCode.hashCode() : 0);
      result = result * 37 + (success != null ? success.hashCode() : 0);
      result = result * 37 + (userName != null ? userName.hashCode() : 0);
      result = result * 37 + (favouriteSport != null ? favouriteSport.hashCode() : 0);
      result = result * 37 + (favouriteMovie != null ? favouriteMovie.hashCode() : 0);
      result = result * 37 + (hasMarried != null ? hasMarried.hashCode() : 0);
      result = result * 37 + (educationEnum != null ? educationEnum.hashCode() : 0);
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (psychologicalAge != null ? psychologicalAge.hashCode() : 0);
      result = result * 37 + (pet != null ? pet.hashCode() : 0);
      result = result * 37 + ownHouses.hashCode();
      result = result * 37 + wardrobes.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (resultMessage != null) builder.append(", resultMessage=").append(resultMessage);
    if (resultCode != null) builder.append(", resultCode=").append(resultCode);
    if (success != null) builder.append(", success=").append(success);
    if (userName != null) builder.append(", userName=").append(userName);
    if (favouriteSport != null) builder.append(", favouriteSport=").append(favouriteSport);
    if (favouriteMovie != null) builder.append(", favouriteMovie=").append(favouriteMovie);
    if (hasMarried != null) builder.append(", hasMarried=").append(hasMarried);
    if (educationEnum != null) builder.append(", educationEnum=").append(educationEnum);
    if (age != null) builder.append(", age=").append(age);
    if (psychologicalAge != null) builder.append(", psychologicalAge=").append(psychologicalAge);
    if (pet != null) builder.append(", pet=").append(pet);
    if (!ownHouses.isEmpty()) builder.append(", ownHouses=").append(ownHouses);
    if (!wardrobes.isEmpty()) builder.append(", wardrobes=").append(wardrobes);
    return builder.replace(0, 2, "UserPb{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UserPb, Builder> {
    public String resultMessage;

    public String resultCode;

    public Boolean success;

    public String userName;

    public String favouriteSport;

    public String favouriteMovie;

    public Boolean hasMarried;

    public String educationEnum;

    public Integer age;

    public Integer psychologicalAge;

    public PetPb pet;

    public List<HousePb> ownHouses;

    public Map<String, ClothesPb> wardrobes;

    public Builder() {
      ownHouses = Internal.newMutableList();
      wardrobes = Internal.newMutableMap();
    }

    public Builder resultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
      return this;
    }

    public Builder resultCode(String resultCode) {
      this.resultCode = resultCode;
      return this;
    }

    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    public Builder favouriteSport(String favouriteSport) {
      this.favouriteSport = favouriteSport;
      return this;
    }

    public Builder favouriteMovie(String favouriteMovie) {
      this.favouriteMovie = favouriteMovie;
      return this;
    }

    public Builder hasMarried(Boolean hasMarried) {
      this.hasMarried = hasMarried;
      return this;
    }

    public Builder educationEnum(String educationEnum) {
      this.educationEnum = educationEnum;
      return this;
    }

    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public Builder psychologicalAge(Integer psychologicalAge) {
      this.psychologicalAge = psychologicalAge;
      return this;
    }

    public Builder pet(PetPb pet) {
      this.pet = pet;
      return this;
    }

    public Builder ownHouses(List<HousePb> ownHouses) {
      Internal.checkElementsNotNull(ownHouses);
      this.ownHouses = ownHouses;
      return this;
    }

    public Builder wardrobes(Map<String, ClothesPb> wardrobes) {
      Internal.checkElementsNotNull(wardrobes);
      this.wardrobes = wardrobes;
      return this;
    }

    @Override
    public UserPb build() {
      return new UserPb(resultMessage, resultCode, success, userName, favouriteSport, favouriteMovie, hasMarried, educationEnum, age, psychologicalAge, pet, ownHouses, wardrobes, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UserPb extends ProtoAdapter<UserPb> {
    private final ProtoAdapter<Map<String, ClothesPb>> wardrobes = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ClothesPb.ADAPTER);

    public ProtoAdapter_UserPb() {
      super(FieldEncoding.LENGTH_DELIMITED, UserPb.class);
    }

    @Override
    public int encodedSize(UserPb value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.resultMessage)
          + ProtoAdapter.STRING.encodedSizeWithTag(2, value.resultCode)
          + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.success)
          + ProtoAdapter.STRING.encodedSizeWithTag(4, value.userName)
          + ProtoAdapter.STRING.encodedSizeWithTag(5, value.favouriteSport)
          + ProtoAdapter.STRING.encodedSizeWithTag(6, value.favouriteMovie)
          + ProtoAdapter.BOOL.encodedSizeWithTag(7, value.hasMarried)
          + ProtoAdapter.STRING.encodedSizeWithTag(8, value.educationEnum)
          + ProtoAdapter.UINT32.encodedSizeWithTag(9, value.age)
          + ProtoAdapter.SINT32.encodedSizeWithTag(10, value.psychologicalAge)
          + PetPb.ADAPTER.encodedSizeWithTag(11, value.pet)
          + HousePb.ADAPTER.asRepeated().encodedSizeWithTag(12, value.ownHouses)
          + wardrobes.encodedSizeWithTag(13, value.wardrobes)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, UserPb value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.resultMessage);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.resultCode);
      ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.success);
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.userName);
      ProtoAdapter.STRING.encodeWithTag(writer, 5, value.favouriteSport);
      ProtoAdapter.STRING.encodeWithTag(writer, 6, value.favouriteMovie);
      ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.hasMarried);
      ProtoAdapter.STRING.encodeWithTag(writer, 8, value.educationEnum);
      ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.age);
      ProtoAdapter.SINT32.encodeWithTag(writer, 10, value.psychologicalAge);
      PetPb.ADAPTER.encodeWithTag(writer, 11, value.pet);
      HousePb.ADAPTER.asRepeated().encodeWithTag(writer, 12, value.ownHouses);
      wardrobes.encodeWithTag(writer, 13, value.wardrobes);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public UserPb decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.resultMessage(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.resultCode(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.success(ProtoAdapter.BOOL.decode(reader)); break;
          case 4: builder.userName(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.favouriteSport(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.favouriteMovie(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.hasMarried(ProtoAdapter.BOOL.decode(reader)); break;
          case 8: builder.educationEnum(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.age(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.psychologicalAge(ProtoAdapter.SINT32.decode(reader)); break;
          case 11: builder.pet(PetPb.ADAPTER.decode(reader)); break;
          case 12: builder.ownHouses.add(HousePb.ADAPTER.decode(reader)); break;
          case 13: builder.wardrobes.putAll(wardrobes.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public UserPb redact(UserPb value) {
      Builder builder = value.newBuilder();
      if (builder.pet != null) builder.pet = PetPb.ADAPTER.redact(builder.pet);
      Internal.redactElements(builder.ownHouses, HousePb.ADAPTER);
      Internal.redactElements(builder.wardrobes, ClothesPb.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
