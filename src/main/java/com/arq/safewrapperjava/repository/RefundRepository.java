package com.arq.safewrapperjava.repository;

import com.arq.safewrapperjava.domain.RefundRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class RefundRepository {
    private final Map<String, RefundRecord> storage = new ConcurrentHashMap<>();

    public RefundRepository() {
        storage.put("refund-seed", new RefundRecord("refund-seed", "refund-owner", "eu-central", Instant.now()));
    }

    public Collection<RefundRecord> findAll() {
        return storage.values();
    }
}
