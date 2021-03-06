// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: PetPb.proto

package com.typewriter_java.protocolBuffer;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.typewriter_java.annotation.Rewritten;
import com.typewriter_java.annotation.RepeatableTypewriter;
import com.typewriter_java.annotation.Typewriter;
import com.typewriter_java.annotation.TypewriterOption;

import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

@RepeatableTypewriter({
        @Typewriter(generate = "PetPbModel"),
        @Typewriter(inherit = "TypewriterBaseModel"),
        @Typewriter(implement = {"Serializable"}),
        @Typewriter(TypewriterOption.initializerPreprocess),
        @Typewriter(filter = "success"),
        @Typewriter(rewritten = @Rewritten(on = "limbs", type = "UInt32"))
})
public final class PetPb extends Message<PetPb, PetPb.Builder> {
  public static final ProtoAdapter<PetPb> ADAPTER = new ProtoAdapter_PetPb();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_SUCCESS = false;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_LIMBS = "";

  public static final String DEFAULT_COLOR = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean success;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String limbs;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String color;

  public PetPb(Boolean success, String name, String limbs, String color) {
    this(success, name, limbs, color, ByteString.EMPTY);
  }

  public PetPb(Boolean success, String name, String limbs, String color, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.success = success;
    this.name = name;
    this.limbs = limbs;
    this.color = color;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.success = success;
    builder.name = name;
    builder.limbs = limbs;
    builder.color = color;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PetPb)) return false;
    PetPb o = (PetPb) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(success, o.success)
        && Internal.equals(name, o.name)
        && Internal.equals(limbs, o.limbs)
        && Internal.equals(color, o.color);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (success != null ? success.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (limbs != null ? limbs.hashCode() : 0);
      result = result * 37 + (color != null ? color.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (success != null) builder.append(", success=").append(success);
    if (name != null) builder.append(", name=").append(name);
    if (limbs != null) builder.append(", limbs=").append(limbs);
    if (color != null) builder.append(", color=").append(color);
    return builder.replace(0, 2, "PetPb{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<PetPb, Builder> {
    public Boolean success;

    public String name;

    public String limbs;

    public String color;

    public Builder() {
    }

    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder limbs(String limbs) {
      this.limbs = limbs;
      return this;
    }

    public Builder color(String color) {
      this.color = color;
      return this;
    }

    @Override
    public PetPb build() {
      return new PetPb(success, name, limbs, color, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_PetPb extends ProtoAdapter<PetPb> {
    public ProtoAdapter_PetPb() {
      super(FieldEncoding.LENGTH_DELIMITED, PetPb.class);
    }

    @Override
    public int encodedSize(PetPb value) {
      return ProtoAdapter.BOOL.encodedSizeWithTag(1, value.success)
          + ProtoAdapter.STRING.encodedSizeWithTag(2, value.name)
          + ProtoAdapter.STRING.encodedSizeWithTag(3, value.limbs)
          + ProtoAdapter.STRING.encodedSizeWithTag(4, value.color)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, PetPb value) throws IOException {
      ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.success);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.limbs);
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.color);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public PetPb decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.success(ProtoAdapter.BOOL.decode(reader)); break;
          case 2: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.limbs(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.color(ProtoAdapter.STRING.decode(reader)); break;
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
    public PetPb redact(PetPb value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
