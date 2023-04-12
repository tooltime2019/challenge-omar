package com.omaryaya.practiceapp.service;

import com.omaryaya.practiceapp.model.Invoice;
import com.omaryaya.practiceapp.model.InvoiceInput;
import com.omaryaya.practiceapp.model.InvoicePosition;
import com.omaryaya.practiceapp.model.InvoicePositionInput;
import com.omaryaya.practiceapp.repository.InvoiceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {

    @Mock
    private InvoiceRepository invoiceRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createInvoice() {
        Invoice invoice = new Invoice();
        invoice.setId("ABC");
        invoice.setTitle("test-invoice-1");
        invoice.setDescription("test-invoice-1-description");
        invoice.setCustomerId(new UUID(1,1));
        invoice.setIssuedAt(OffsetDateTime.now());

        List<InvoicePosition> invoicePositions = List.of(
                new InvoicePosition("item-1", 1.0),
                new InvoicePosition("item-2", 2.0)
        );
        invoice.setInvoicePositions(invoicePositions);



        Mockito.when(invoiceRepository.save(Mockito.any())).thenReturn(invoice);
    }

    @Test
    void getInvoice() {
    }

    @Test
    void getCustomerMonthlyTotal() {
    }
}