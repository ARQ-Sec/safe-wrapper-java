package com.arq.safewrapperjava.repository;

import com.arq.safewrapperjava.domain.BalanceRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class BalanceRepository {
    private final Map<String, BalanceRecord> storage = new ConcurrentHashMap<>();

    public BalanceRepository() {
        storage.put("balance-seed", new BalanceRecord("balance-seed", "balance-owner", "eu-central", Instant.now()));
    }

    public Collection<BalanceRecord> findAll() {
        return storage.values();
    }
}
