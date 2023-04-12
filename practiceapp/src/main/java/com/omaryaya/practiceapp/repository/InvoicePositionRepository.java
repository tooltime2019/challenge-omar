package com.omaryaya.practiceapp.repository;

import com.omaryaya.practiceapp.model.Invoice;
import com.omaryaya.practiceapp.model.InvoicePosition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicePositionRepository extends MongoRepository<InvoicePosition, String> {
}
