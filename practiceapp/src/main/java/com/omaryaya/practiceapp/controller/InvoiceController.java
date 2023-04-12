package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.model.CustomerMonthlyTotal;
import com.omaryaya.practiceapp.model.Invoice;
import com.omaryaya.practiceapp.model.InvoiceInput;
import com.omaryaya.practiceapp.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class InvoiceController implements InvoiceAPI {

    @Autowired
    private InvoiceService invoiceService;


    @Override
    public ResponseEntity<InvoiceInput> createInvoice(InvoiceInput invoiceInput) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<Invoice> getInvoice(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<CustomerMonthlyTotal> getCustomerMonthlyTotal(String customerId) {
        throw new UnsupportedOperationException();
    }
}
