package com.omaryaya.practiceapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMonthlyTotal {

    private String customerId;
    private double total;

    private String month = OffsetDateTime.now().getMonth().toString();
}
