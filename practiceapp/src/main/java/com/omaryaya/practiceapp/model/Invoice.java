package com.omaryaya.practiceapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document(collection = "invoices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
    private String id;

    @NotNull
    private String code;

    @NotNull
    private String title;

    private String description;

    @NotNull
    private OffsetDateTime issuedAt;

    @NotNull
    private UUID customerId;

    @NotNull
    private List<InvoicePosition> invoicePositions;

    @NotNull
    private double totalAmount;
}
