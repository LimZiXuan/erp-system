package dev.erp_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import dev.erp_system.model.Orders;
import dev.erp_system.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/purchase")
    public ResponseEntity<?> purchase(@RequestBody Map<String, Integer> request) {
        try {
            Integer productId = request.get("productId");
            Integer quantity = request.get("quantity");
            if (productId == null) {
                return ResponseEntity.badRequest().body("Product ID is required.");
            } // Return the created order
              // Assuming you're purchasing one unit
            Orders order = orderService.purchaseProduct(productId, quantity);
            // Order order = OrderService.purchaseProduct(productId, quantity);
            return ResponseEntity.ok(order); // Return the created order
        } catch (Exception e) {
            // Return an appropriate error response (e.g., 400 Bad Request)
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
