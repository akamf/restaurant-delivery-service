package com.example.delivery.events;

import java.time.Instant;
import java.util.UUID;

public record DeliveryAssignedEvent(UUID orderId, String driverId, Instant assignedAt) {}
