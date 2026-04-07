package com.arq.safewrapperjava.service;

import com.arq.safewrapperjava.dto.InvoiceResponse;
import com.arq.safewrapperjava.repository.InvoiceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceResponse> summarize() {
        return repository.findAll().stream().map(record -> new InvoiceResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
