package com.example.delivery.events;

import java.time.Instant;
import java.util.UUID;

public record DeliveryCompletedEvent(UUID orderId, String driverId, Instant completedAt) {}
