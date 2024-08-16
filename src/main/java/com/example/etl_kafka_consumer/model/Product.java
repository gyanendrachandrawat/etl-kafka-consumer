package com.example.etl_kafka_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private int id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private List<String> tags;
    private String brand;
    private String sku;
    private double weight;
    private Dimensions dimensions;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private List<Review> reviews;
    private String returnPolicy;
    private int minimumOrderQuantity;
    private Meta meta;
    private String thumbnail;
    private List<String> images;

    // Getters and Setters


    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Dimensions {
        private double width;
        private double height;
        private double depth;

        // Getters and Setters
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Review {
        private int rating;
        private String comment;
        private String date;
        private String reviewerName;
        private String reviewerEmail;

        // Getters and Setters
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Meta {
        private String createdAt;
        private String updatedAt;
        private String barcode;
        private String qrCode;

        // Getters and Setters
    }

    // Getters and Setters for all fields
}

