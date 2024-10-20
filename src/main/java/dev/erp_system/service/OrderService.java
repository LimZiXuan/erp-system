package dev.erp_system.service;

import dev.erp_system.model.Orders;
import dev.erp_system.model.Product;
import dev.erp_system.repository.OrderRepository;
import dev.erp_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Orders purchaseProduct(int productId, int quantity) throws Exception {
        System.out.println("OrderService: " + productId + " " + quantity);
        // Fetch product by ID
        Optional<Product> productOpt = productRepository.findById(productId);
        if (!productOpt.isPresent()) {
            throw new Exception("Product not found");
        }

        Product product = productOpt.get();

        // // Check if the product has enough stock
        if (product.getStock() < quantity) {
            throw new Exception("Insufficient stock");
        }

        // // Reduce product stock
        product.setStock(product.getStock() - quantity);
        productRepository.save(product); // Save updated stock
        System.out.println(product.getPrice() * quantity);
        // // Create a new order
        Orders order = new Orders();
        order.setProduct(product);
        order.setQuantity(quantity);
        order.setTotalPrice(product.getPrice() * quantity);
        order.setOrderDate(LocalDateTime.now());
        order.setStatus(1);

        // Save the order
        return orderRepository.save(order);
    }
}
