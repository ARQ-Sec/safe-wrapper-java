package com.arq.safewrapperjava.repository;

import com.arq.safewrapperjava.domain.SettlementRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class SettlementRepository {
    private final Map<String, SettlementRecord> storage = new ConcurrentHashMap<>();

    public SettlementRepository() {
        storage.put("settlement-seed", new SettlementRecord("settlement-seed", "settlement-owner", "eu-central", Instant.now()));
    }

    public Collection<SettlementRecord> findAll() {
        return storage.values();
    }
}
