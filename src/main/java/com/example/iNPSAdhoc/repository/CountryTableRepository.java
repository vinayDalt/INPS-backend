package com.example.iNPSAdhoc.repository;

import com.example.iNPSAdhoc.domain.CountryTable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryTableRepository extends MongoRepository<CountryTable, String> {
}
