package com.omaryaya.practiceapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invoice_positions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoicePosition {

    private String description;
    private double amount;
}
