// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.rundoo.product.grpc;

/**
 * Protobuf type {@code product.AddProductRequest}
 */
public final class AddProductRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:product.AddProductRequest)
    AddProductRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddProductRequest.newBuilder() to construct.
  private AddProductRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddProductRequest() {
    name_ = "";
    category_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddProductRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rundoo.product.grpc.ProductOuterClass.internal_static_product_AddProductRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rundoo.product.grpc.ProductOuterClass.internal_static_product_AddProductRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rundoo.product.grpc.AddProductRequest.class, com.rundoo.product.grpc.AddProductRequest.Builder.class);
  }

  public static final int SKU_COMPONENTS_FIELD_NUMBER = 1;
  private com.rundoo.product.grpc.SkuComponents skuComponents_;
  /**
   * <code>.product.SkuComponents sku_components = 1;</code>
   * @return Whether the skuComponents field is set.
   */
  @java.lang.Override
  public boolean hasSkuComponents() {
    return skuComponents_ != null;
  }
  /**
   * <code>.product.SkuComponents sku_components = 1;</code>
   * @return The skuComponents.
   */
  @java.lang.Override
  public com.rundoo.product.grpc.SkuComponents getSkuComponents() {
    return skuComponents_ == null ? com.rundoo.product.grpc.SkuComponents.getDefaultInstance() : skuComponents_;
  }
  /**
   * <code>.product.SkuComponents sku_components = 1;</code>
   */
  @java.lang.Override
  public com.rundoo.product.grpc.SkuComponentsOrBuilder getSkuComponentsOrBuilder() {
    return getSkuComponents();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORY_FIELD_NUMBER = 3;
  private volatile java.lang.Object category_;
  /**
   * <code>string category = 3;</code>
   * @return The category.
   */
  @java.lang.Override
  public java.lang.String getCategory() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      category_ = s;
      return s;
    }
  }
  /**
   * <code>string category = 3;</code>
   * @return The bytes for category.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryBytes() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      category_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (skuComponents_ != null) {
      output.writeMessage(1, getSkuComponents());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(category_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, category_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skuComponents_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSkuComponents());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(category_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, category_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.rundoo.product.grpc.AddProductRequest)) {
      return super.equals(obj);
    }
    com.rundoo.product.grpc.AddProductRequest other = (com.rundoo.product.grpc.AddProductRequest) obj;

    if (hasSkuComponents() != other.hasSkuComponents()) return false;
    if (hasSkuComponents()) {
      if (!getSkuComponents()
          .equals(other.getSkuComponents())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (!getCategory()
        .equals(other.getCategory())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSkuComponents()) {
      hash = (37 * hash) + SKU_COMPONENTS_FIELD_NUMBER;
      hash = (53 * hash) + getSkuComponents().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + getCategory().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rundoo.product.grpc.AddProductRequest parseFrom(
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
  public static Builder newBuilder(com.rundoo.product.grpc.AddProductRequest prototype) {
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
   * Protobuf type {@code product.AddProductRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:product.AddProductRequest)
      com.rundoo.product.grpc.AddProductRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rundoo.product.grpc.ProductOuterClass.internal_static_product_AddProductRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rundoo.product.grpc.ProductOuterClass.internal_static_product_AddProductRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rundoo.product.grpc.AddProductRequest.class, com.rundoo.product.grpc.AddProductRequest.Builder.class);
    }

    // Construct using com.rundoo.product.grpc.AddProductRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (skuComponentsBuilder_ == null) {
        skuComponents_ = null;
      } else {
        skuComponents_ = null;
        skuComponentsBuilder_ = null;
      }
      name_ = "";

      category_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rundoo.product.grpc.ProductOuterClass.internal_static_product_AddProductRequest_descriptor;
    }

    @java.lang.Override
    public com.rundoo.product.grpc.AddProductRequest getDefaultInstanceForType() {
      return com.rundoo.product.grpc.AddProductRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.rundoo.product.grpc.AddProductRequest build() {
      com.rundoo.product.grpc.AddProductRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rundoo.product.grpc.AddProductRequest buildPartial() {
      com.rundoo.product.grpc.AddProductRequest result = new com.rundoo.product.grpc.AddProductRequest(this);
      if (skuComponentsBuilder_ == null) {
        result.skuComponents_ = skuComponents_;
      } else {
        result.skuComponents_ = skuComponentsBuilder_.build();
      }
      result.name_ = name_;
      result.category_ = category_;
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
      if (other instanceof com.rundoo.product.grpc.AddProductRequest) {
        return mergeFrom((com.rundoo.product.grpc.AddProductRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rundoo.product.grpc.AddProductRequest other) {
      if (other == com.rundoo.product.grpc.AddProductRequest.getDefaultInstance()) return this;
      if (other.hasSkuComponents()) {
        mergeSkuComponents(other.getSkuComponents());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCategory().isEmpty()) {
        category_ = other.category_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getSkuComponentsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              category_ = input.readStringRequireUtf8();

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.rundoo.product.grpc.SkuComponents skuComponents_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rundoo.product.grpc.SkuComponents, com.rundoo.product.grpc.SkuComponents.Builder, com.rundoo.product.grpc.SkuComponentsOrBuilder> skuComponentsBuilder_;
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     * @return Whether the skuComponents field is set.
     */
    public boolean hasSkuComponents() {
      return skuComponentsBuilder_ != null || skuComponents_ != null;
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     * @return The skuComponents.
     */
    public com.rundoo.product.grpc.SkuComponents getSkuComponents() {
      if (skuComponentsBuilder_ == null) {
        return skuComponents_ == null ? com.rundoo.product.grpc.SkuComponents.getDefaultInstance() : skuComponents_;
      } else {
        return skuComponentsBuilder_.getMessage();
      }
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    public Builder setSkuComponents(com.rundoo.product.grpc.SkuComponents value) {
      if (skuComponentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skuComponents_ = value;
        onChanged();
      } else {
        skuComponentsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    public Builder setSkuComponents(
        com.rundoo.product.grpc.SkuComponents.Builder builderForValue) {
      if (skuComponentsBuilder_ == null) {
        skuComponents_ = builderForValue.build();
        onChanged();
      } else {
        skuComponentsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    public Builder mergeSkuComponents(com.rundoo.product.grpc.SkuComponents value) {
      if (skuComponentsBuilder_ == null) {
        if (skuComponents_ != null) {
          skuComponents_ =
            com.rundoo.product.grpc.SkuComponents.newBuilder(skuComponents_).mergeFrom(value).buildPartial();
        } else {
          skuComponents_ = value;
        }
        onChanged();
      } else {
        skuComponentsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    public Builder clearSkuComponents() {
      if (skuComponentsBuilder_ == null) {
        skuComponents_ = null;
        onChanged();
      } else {
        skuComponents_ = null;
        skuComponentsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    public com.rundoo.product.grpc.SkuComponents.Builder getSkuComponentsBuilder() {
      
      onChanged();
      return getSkuComponentsFieldBuilder().getBuilder();
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    public com.rundoo.product.grpc.SkuComponentsOrBuilder getSkuComponentsOrBuilder() {
      if (skuComponentsBuilder_ != null) {
        return skuComponentsBuilder_.getMessageOrBuilder();
      } else {
        return skuComponents_ == null ?
            com.rundoo.product.grpc.SkuComponents.getDefaultInstance() : skuComponents_;
      }
    }
    /**
     * <code>.product.SkuComponents sku_components = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rundoo.product.grpc.SkuComponents, com.rundoo.product.grpc.SkuComponents.Builder, com.rundoo.product.grpc.SkuComponentsOrBuilder> 
        getSkuComponentsFieldBuilder() {
      if (skuComponentsBuilder_ == null) {
        skuComponentsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rundoo.product.grpc.SkuComponents, com.rundoo.product.grpc.SkuComponents.Builder, com.rundoo.product.grpc.SkuComponentsOrBuilder>(
                getSkuComponents(),
                getParentForChildren(),
                isClean());
        skuComponents_ = null;
      }
      return skuComponentsBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object category_ = "";
    /**
     * <code>string category = 3;</code>
     * @return The category.
     */
    public java.lang.String getCategory() {
      java.lang.Object ref = category_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        category_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string category = 3;</code>
     * @return The bytes for category.
     */
    public com.google.protobuf.ByteString
        getCategoryBytes() {
      java.lang.Object ref = category_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        category_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string category = 3;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string category = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      
      category_ = getDefaultInstance().getCategory();
      onChanged();
      return this;
    }
    /**
     * <code>string category = 3;</code>
     * @param value The bytes for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      category_ = value;
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


    // @@protoc_insertion_point(builder_scope:product.AddProductRequest)
  }

  // @@protoc_insertion_point(class_scope:product.AddProductRequest)
  private static final com.rundoo.product.grpc.AddProductRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rundoo.product.grpc.AddProductRequest();
  }

  public static com.rundoo.product.grpc.AddProductRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddProductRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddProductRequest>() {
    @java.lang.Override
    public AddProductRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AddProductRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddProductRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rundoo.product.grpc.AddProductRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

