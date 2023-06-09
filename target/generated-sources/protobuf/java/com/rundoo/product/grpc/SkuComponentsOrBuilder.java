// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.rundoo.product.grpc;

public interface SkuComponentsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.SkuComponents)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string company_id = 1;</code>
   * @return Whether the companyId field is set.
   */
  boolean hasCompanyId();
  /**
   * <code>optional string company_id = 1;</code>
   * @return The companyId.
   */
  java.lang.String getCompanyId();
  /**
   * <code>optional string company_id = 1;</code>
   * @return The bytes for companyId.
   */
  com.google.protobuf.ByteString
      getCompanyIdBytes();

  /**
   * <code>optional int32 category_id = 2;</code>
   * @return Whether the categoryId field is set.
   */
  boolean hasCategoryId();
  /**
   * <code>optional int32 category_id = 2;</code>
   * @return The categoryId.
   */
  int getCategoryId();

  /**
   * <code>optional int32 sequence_id = 3;</code>
   * @return Whether the sequenceId field is set.
   */
  boolean hasSequenceId();
  /**
   * <code>optional int32 sequence_id = 3;</code>
   * @return The sequenceId.
   */
  int getSequenceId();

  /**
   * <code>optional string full_sku = 4;</code>
   * @return Whether the fullSku field is set.
   */
  boolean hasFullSku();
  /**
   * <code>optional string full_sku = 4;</code>
   * @return The fullSku.
   */
  java.lang.String getFullSku();
  /**
   * <code>optional string full_sku = 4;</code>
   * @return The bytes for fullSku.
   */
  com.google.protobuf.ByteString
      getFullSkuBytes();
}
