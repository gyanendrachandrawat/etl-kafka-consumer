package com.example.etl_kafka_consumer;


import com.example.etl_kafka_consumer.model.Product;
import com.example.etl_kafka_consumer.model.TransformedProduct;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "etl", groupId = "my-group-id")
    public void listen(String message) {
        Product product = convertJsonToProduct(message);
        TransformedProduct transformedProduct = new TransformedProduct();
        transformedProduct.setTitle(product.getTitle());
        transformedProduct.setUserRating(product.getRating());
        System.out.println(transformedProduct);
    }

    public Product convertJsonToProduct(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = null;
        try {
            product = objectMapper.readValue(jsonString, Product.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return product;
    }
}
