package com.example.iNPSAdhoc.repository;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdhocRepository extends MongoRepository<AdhocFeedback,String> {


}
