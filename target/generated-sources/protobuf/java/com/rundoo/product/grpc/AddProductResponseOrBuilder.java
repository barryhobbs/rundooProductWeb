// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.rundoo.product.grpc;

public interface AddProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.AddProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .product.Product product = 1;</code>
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   * <code>optional .product.Product product = 1;</code>
   * @return The product.
   */
  com.rundoo.product.grpc.Product getProduct();
  /**
   * <code>optional .product.Product product = 1;</code>
   */
  com.rundoo.product.grpc.ProductOrBuilder getProductOrBuilder();

  /**
   * <code>optional .product.Error error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>optional .product.Error error = 2;</code>
   * @return The error.
   */
  com.rundoo.product.grpc.Error getError();
  /**
   * <code>optional .product.Error error = 2;</code>
   */
  com.rundoo.product.grpc.ErrorOrBuilder getErrorOrBuilder();
}