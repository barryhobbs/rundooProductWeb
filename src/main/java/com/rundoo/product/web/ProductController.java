package com.rundoo.product.web;

import com.rundoo.product.grpc.ProductServiceGrpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.rundoo.product.grpc.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class ProductController {
    public static void main(String[] args){
        SpringApplication.run(ProductController.class, args);
    }

    private final ProductServiceGrpc.ProductServiceBlockingStub productServiceBlockingStub;
    public ProductController(ProductServiceGrpc.ProductServiceBlockingStub productServiceBlockingStub) {
        this.productServiceBlockingStub = productServiceBlockingStub;
    }

    @GetMapping("/search")
    public String searchForProducts(@RequestParam String searchString, Model model) {
        FindProductRequest request = FindProductRequest.newBuilder().setSearchString(searchString).build();
        FindProductResponse response = productServiceBlockingStub.findProduct(request);
        model.addAttribute("products", response.getProductsList());
        model.addAttribute("product", Product.newBuilder().build());
        return "product";
    }

    /**
     * Not sure WHY Thymeleaf doesn't want to use the proto-defined product here, but I had to add a dummy WebProduct class to make it happy.
     * @param product
     * @param model
     * @return
     */
    @PostMapping("/product")
    public String addProduct(@ModelAttribute WebProduct product, Model model) {
        AddProductRequest addProductRequest = AddProductRequest.newBuilder()
                .setCategory(product.getCategory())
                .setName(product.getName())
                .setSkuComponents(SkuComponents.newBuilder().setFullSku(product.getSku()).build()).build();
        AddProductResponse addProductResponse = productServiceBlockingStub.addProduct(addProductRequest);
        model.addAttribute("product", product);
        return "redirect:/";
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("product", Product.newBuilder().build());
        return "product";
    }
}
