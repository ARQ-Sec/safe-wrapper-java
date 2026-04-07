package com.arq.safewrapperjava.service;

import com.arq.safewrapperjava.repository.InvoiceRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class InvoiceServiceTest {
    @Test
    void returnsSeedData() {
        InvoiceService service = new InvoiceService(new InvoiceRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
