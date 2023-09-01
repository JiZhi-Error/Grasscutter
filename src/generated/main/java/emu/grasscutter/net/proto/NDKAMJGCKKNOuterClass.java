// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NDKAMJGCKKN.proto

package emu.grasscutter.net.proto;

public final class NDKAMJGCKKNOuterClass {
  private NDKAMJGCKKNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NDKAMJGCKKNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NDKAMJGCKKN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_finish = 11;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>bool is_open = 14;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 left_time = 10;</code>
     * @return The leftTime.
     */
    int getLeftTime();
  }
  /**
   * Protobuf type {@code NDKAMJGCKKN}
   */
  public static final class NDKAMJGCKKN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NDKAMJGCKKN)
      NDKAMJGCKKNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NDKAMJGCKKN.newBuilder() to construct.
    private NDKAMJGCKKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NDKAMJGCKKN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NDKAMJGCKKN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NDKAMJGCKKN(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              levelId_ = input.readUInt32();
              break;
            }
            case 80: {

              leftTime_ = input.readUInt32();
              break;
            }
            case 88: {

              isFinish_ = input.readBool();
              break;
            }
            case 112: {

              isOpen_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.internal_static_NDKAMJGCKKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.internal_static_NDKAMJGCKKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.class, emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 11;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 11;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 14;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 14;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LEFT_TIME_FIELD_NUMBER = 10;
    private int leftTime_;
    /**
     * <code>uint32 left_time = 10;</code>
     * @return The leftTime.
     */
    @java.lang.Override
    public int getLeftTime() {
      return leftTime_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (leftTime_ != 0) {
        output.writeUInt32(10, leftTime_);
      }
      if (isFinish_ != false) {
        output.writeBool(11, isFinish_);
      }
      if (isOpen_ != false) {
        output.writeBool(14, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (leftTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, leftTime_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isFinish_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isOpen_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN other = (emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLeftTime()
          != other.getLeftTime()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LEFT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLeftTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code NDKAMJGCKKN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NDKAMJGCKKN)
        emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.internal_static_NDKAMJGCKKN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.internal_static_NDKAMJGCKKN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.class, emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        isFinish_ = false;

        isOpen_ = false;

        leftTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.internal_static_NDKAMJGCKKN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN build() {
        emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN buildPartial() {
        emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN result = new emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN(this);
        result.levelId_ = levelId_;
        result.isFinish_ = isFinish_;
        result.isOpen_ = isOpen_;
        result.leftTime_ = leftTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN) {
          return mergeFrom((emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN other) {
        if (other == emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLeftTime() != 0) {
          setLeftTime(other.getLeftTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 11;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 11;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 14;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 14;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int leftTime_ ;
      /**
       * <code>uint32 left_time = 10;</code>
       * @return The leftTime.
       */
      @java.lang.Override
      public int getLeftTime() {
        return leftTime_;
      }
      /**
       * <code>uint32 left_time = 10;</code>
       * @param value The leftTime to set.
       * @return This builder for chaining.
       */
      public Builder setLeftTime(int value) {
        
        leftTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftTime() {
        
        leftTime_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NDKAMJGCKKN)
    }

    // @@protoc_insertion_point(class_scope:NDKAMJGCKKN)
    private static final emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN();
    }

    public static emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NDKAMJGCKKN>
        PARSER = new com.google.protobuf.AbstractParser<NDKAMJGCKKN>() {
      @java.lang.Override
      public NDKAMJGCKKN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NDKAMJGCKKN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NDKAMJGCKKN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NDKAMJGCKKN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NDKAMJGCKKNOuterClass.NDKAMJGCKKN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NDKAMJGCKKN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NDKAMJGCKKN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NDKAMJGCKKN.proto\"V\n\013NDKAMJGCKKN\022\020\n\010le" +
      "vel_id\030\005 \001(\r\022\021\n\tis_finish\030\013 \001(\010\022\017\n\007is_op" +
      "en\030\016 \001(\010\022\021\n\tleft_time\030\n \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NDKAMJGCKKN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NDKAMJGCKKN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NDKAMJGCKKN_descriptor,
        new java.lang.String[] { "LevelId", "IsFinish", "IsOpen", "LeftTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}