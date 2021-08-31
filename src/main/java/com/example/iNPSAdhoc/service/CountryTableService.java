package com.example.iNPSAdhoc.service;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import com.example.iNPSAdhoc.domain.CountryTable;
import com.example.iNPSAdhoc.exception.CountryAlreadyExists;
import com.example.iNPSAdhoc.exception.CountryNotFound;
import com.example.iNPSAdhoc.exception.FeedbackAlreadyExistsException;
import com.example.iNPSAdhoc.exception.NoFeedbackFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryTableService {

    public CountryTable saveCountry(CountryTable countryTable) throws CountryAlreadyExists;

    public List<CountryTable> getAllCountryName();

    public CountryTable deleteCountry(String id) throws CountryNotFound;

//    public CountryTable updateCountry(String id) throws CountryNotFound;
}

