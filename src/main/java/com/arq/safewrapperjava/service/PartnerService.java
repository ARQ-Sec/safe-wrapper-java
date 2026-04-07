package com.arq.safewrapperjava.service;

import com.arq.safewrapperjava.dto.PartnerResponse;
import com.arq.safewrapperjava.repository.PartnerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {
    private final PartnerRepository repository;

    public PartnerService(PartnerRepository repository) {
        this.repository = repository;
    }

    public List<PartnerResponse> summarize() {
        return repository.findAll().stream().map(record -> new PartnerResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
