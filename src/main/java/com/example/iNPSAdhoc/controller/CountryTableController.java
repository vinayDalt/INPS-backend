package com.example.iNPSAdhoc.controller;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import com.example.iNPSAdhoc.domain.CountryTable;
import com.example.iNPSAdhoc.exception.CountryAlreadyExists;
import com.example.iNPSAdhoc.exception.CountryNotFound;
import com.example.iNPSAdhoc.exception.FeedbackAlreadyExistsException;
import com.example.iNPSAdhoc.exception.NoFeedbackFoundException;
import com.example.iNPSAdhoc.service.AdhocService;
import com.example.iNPSAdhoc.service.CountryTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value ="/api/country")
public class CountryTableController {

    ResponseEntity responseEntity;

    private CountryTableService countryTableService;

    @Autowired
    public CountryTableController(CountryTableService countryTableService){
        this.countryTableService=countryTableService;
    }

    @PostMapping("/new")
    public ResponseEntity<?> saveCountry(@RequestBody CountryTable countryTable) throws CountryAlreadyExists {

        try {
            countryTableService.saveCountry(countryTable);
            responseEntity = new ResponseEntity<CountryTable>(countryTable, HttpStatus.CREATED);
        }
        catch (CountryAlreadyExists e){
            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);

        }
        return responseEntity;

    }

    @GetMapping("/view")
    public ResponseEntity<?> getAllCountries(){

        return new ResponseEntity<List<CountryTable>>(countryTableService.getAllCountryName(),HttpStatus.OK);

    }


    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> deleteCountry(@PathVariable("id") String id) throws CountryNotFound {
        try {
            countryTableService.deleteCountry(id);
            responseEntity = new ResponseEntity<>("deleted", HttpStatus.OK);

        }
        catch (CountryNotFound e){
            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }

        return responseEntity;
    }
}
