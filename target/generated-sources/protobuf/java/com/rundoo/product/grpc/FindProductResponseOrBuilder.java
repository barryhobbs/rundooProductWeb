// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.rundoo.product.grpc;

public interface FindProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.FindProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  java.util.List<com.rundoo.product.grpc.Product> 
      getProductsList();
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  com.rundoo.product.grpc.Product getProducts(int index);
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  int getProductsCount();
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  java.util.List<? extends com.rundoo.product.grpc.ProductOrBuilder> 
      getProductsOrBuilderList();
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  com.rundoo.product.grpc.ProductOrBuilder getProductsOrBuilder(
      int index);
}
