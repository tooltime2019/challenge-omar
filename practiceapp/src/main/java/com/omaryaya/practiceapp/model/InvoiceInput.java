package com.omaryaya.practiceapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceInput {


    @NotNull
    private String title;

    private String description;

    @NotNull
    private String customerId;

    @NotNull
    @JsonProperty("positions")
    private List<InvoicePositionInput> invoicePositionInputs;




}
