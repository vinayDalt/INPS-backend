package com.example.iNPSAdhoc.controller;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import com.example.iNPSAdhoc.exception.FeedbackAlreadyExistsException;
import com.example.iNPSAdhoc.exception.NoFeedbackFoundException;
import com.example.iNPSAdhoc.service.AdhocService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value ="/api/adhoc")
public class AdhocController {

    ResponseEntity responseEntity;
    private AdhocService adhocService;

    @Autowired
   public AdhocController(AdhocService adhocService){
        this.adhocService=adhocService;
    }

    @PostMapping("/new")
    public ResponseEntity<?> saveForm(@RequestBody AdhocFeedback adhocFeedback) throws FeedbackAlreadyExistsException {

        try {
            adhocService.saveFeedback(adhocFeedback);
            responseEntity = new ResponseEntity<AdhocFeedback>(adhocFeedback, HttpStatus.CREATED);
        }
        catch (FeedbackAlreadyExistsException e){
            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);

        }
        return responseEntity;

    }


    @GetMapping("/view")
    public ResponseEntity<?> getAllFeedback(){

        return new ResponseEntity<List<AdhocFeedback>>(adhocService.getAllNPSFeedback(),HttpStatus.OK);

    }


    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> deleteFeedback(@PathVariable("id") String id) throws NoFeedbackFoundException {
        try {
            adhocService.deleteFeedback(id);

            responseEntity = new ResponseEntity<>("deleted", HttpStatus.OK);

        }
        catch (NoFeedbackFoundException e){

            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }

        return responseEntity;
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<?> getFeedbackById(@PathVariable String id) throws NoFeedbackFoundException{
        try{
            return new ResponseEntity<AdhocFeedback>(this.adhocService.getNPSFeedbackById(id),HttpStatus.OK);
        }
        catch (NoFeedbackFoundException e){

            return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
        }


    }

//    @GetMapping("/report/{format}")
//    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
//
//        return adhocService.exportReport(format);
//    }
}
