package com.example.iNPSAdhoc.service;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import com.example.iNPSAdhoc.domain.CountryTable;
import com.example.iNPSAdhoc.exception.CountryAlreadyExists;
import com.example.iNPSAdhoc.exception.CountryNotFound;
import com.example.iNPSAdhoc.repository.CountryTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryTableServiceImpl implements CountryTableService {

    CountryTableRepository countryTableRepository;

    @Autowired
    public CountryTableServiceImpl(CountryTableRepository countryTableRepository){
        this.countryTableRepository=countryTableRepository;

    }

    @Override
    public CountryTable saveCountry(CountryTable countryTable) throws CountryAlreadyExists{
        if(countryTableRepository.existsById(countryTable.getId()))
            throw new CountryAlreadyExists("Feedback already exists");
        else
            return countryTableRepository.save(countryTable);
    }

    @Override
    public List<CountryTable> getAllCountryName(){
        return countryTableRepository.findAll();
    }

    @Override
    public CountryTable deleteCountry(String id) throws CountryNotFound{
        if(countryTableRepository.existsById(id)) {
            CountryTable countryTable = countryTableRepository.findById(id).get();
            this.countryTableRepository.delete(countryTable);

            return countryTable;
        }
        else
            throw new CountryNotFound("Country not found");
    }

//    @Override
//    public CountryTable updateCountry(String id) throws CountryNotFound{
//        if(countryTableRepository.existsById(id)){
//            CountryTable countryTable = countryTableRepository.findById(id).get();
//            this.countryTableRepository.
//        }
//    }

}
