package com.rundoo.product.web;

import com.rundoo.product.grpc.ProductServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProductServiceGrpc.ProductServiceBlockingStub productServiceBlockingStub(){
        System.out.println("----------==========-----------");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        return ProductServiceGrpc.newBlockingStub(channel);
    }
}
