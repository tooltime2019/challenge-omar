package com.omaryaya.practiceapp.service;

import com.omaryaya.practiceapp.model.CustomerMonthlyTotal;
import com.omaryaya.practiceapp.model.Invoice;
import com.omaryaya.practiceapp.model.InvoiceInput;
import org.springframework.stereotype.Service;

@Service
public interface InvoiceService {

    Invoice createInvoice(InvoiceInput invoiceInput);

    Invoice getInvoice(String id);

    CustomerMonthlyTotal getCustomerMonthlyTotal(String customerId);
}
