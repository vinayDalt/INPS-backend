package com.example.iNPSAdhoc.service;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import com.example.iNPSAdhoc.exception.FeedbackAlreadyExistsException;
import com.example.iNPSAdhoc.exception.NoFeedbackFoundException;
import net.sf.jasperreports.engine.JRException;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public interface AdhocService {

    public AdhocFeedback saveFeedback(AdhocFeedback adhocFeedback) throws FeedbackAlreadyExistsException;

    public List<AdhocFeedback> getAllNPSFeedback();

    public AdhocFeedback deleteFeedback(String id) throws NoFeedbackFoundException;

    public AdhocFeedback getNPSFeedbackById(String id) throws NoFeedbackFoundException;

//    public String exportReport(String reportFormat) throws FileNotFoundException, JRException;

//    public List<AdhocFeedback> getAllNPSDissatFeedback(int rating);
//
//    public List<AdhocFeedback> getAllNPSSatFeedback(int rating);
//
//    public List<AdhocFeedback> getAllNPSNeutralFeedback(int rating);
//
//    public List<AdhocFeedback> getAllNPSNeedToNotifyFeedback(int rating);

}
