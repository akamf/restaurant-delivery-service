package com.example.delivery.api;

import com.example.delivery.service.DeliveryAssignmentService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deliveries")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryAssignmentService service;

    @PostMapping("/{orderId}/assign")
    public ResponseEntity<Void> assign(@PathVariable("orderId") UUID orderId) {
        service.assignDriverFor(orderId);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/{orderId}/complete")
    public ResponseEntity<Void> complete(@PathVariable("orderId") UUID orderId) {
        service.complete(orderId);
        return ResponseEntity.accepted().build();
    }
}
