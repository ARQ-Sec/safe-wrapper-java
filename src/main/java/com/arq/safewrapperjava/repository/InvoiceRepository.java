package com.arq.safewrapperjava.repository;

import com.arq.safewrapperjava.domain.InvoiceRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepository {
    private final Map<String, InvoiceRecord> storage = new ConcurrentHashMap<>();

    public InvoiceRepository() {
        storage.put("invoice-seed", new InvoiceRecord("invoice-seed", "invoice-owner", "eu-central", Instant.now()));
    }

    public Collection<InvoiceRecord> findAll() {
        return storage.values();
    }
}
