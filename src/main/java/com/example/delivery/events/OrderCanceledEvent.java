package com.example.delivery.events;

import java.time.Instant;
import java.util.UUID;

public record OrderCanceledEvent(UUID orderId, Instant canceledAt, String reason) {}
