package com.example.delivery.events;

import java.time.Instant;
import java.util.UUID;

public record KitchenPreparedEvent(UUID orderId, Instant preparedAt) {}
