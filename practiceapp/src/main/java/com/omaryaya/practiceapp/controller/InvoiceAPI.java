package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.model.CustomerMonthlyTotal;
import com.omaryaya.practiceapp.model.Invoice;
import com.omaryaya.practiceapp.model.InvoiceInput;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/invoice")
public interface InvoiceAPI {

    @Operation(summary = "Create an invoice")
    @ApiResponse(responseCode = "201", description = "Invoice created")
    @ApiResponse(responseCode = "400", description = "Invalid input")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @PostMapping
    ResponseEntity<InvoiceInput> createInvoice(@RequestBody InvoiceInput invoiceInput);

    @Operation(summary = "Get an invoice")
    @ApiResponse(responseCode = "200", description = "Invoice found")
    @ApiResponse(responseCode = "404", description = "Invoice not found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @GetMapping("/{id}")
    ResponseEntity<Invoice> getInvoice(@PathVariable String id);

    @Operation(summary = "Get customer monthly total")
    @ApiResponse(responseCode = "200", description = "Customer monthly total found")
    @ApiResponse(responseCode = "404", description = "Customer monthly total not found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @GetMapping("/customer/{customerId}/monthly-total")
    ResponseEntity<CustomerMonthlyTotal> getCustomerMonthlyTotal(@PathVariable String customerId);
}
