package com.example.iNPSAdhoc.service;

import com.example.iNPSAdhoc.domain.AdhocFeedback;
import com.example.iNPSAdhoc.exception.FeedbackAlreadyExistsException;
import com.example.iNPSAdhoc.exception.NoFeedbackFoundException;
import com.example.iNPSAdhoc.repository.AdhocRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdhocServiceImpl implements AdhocService {


     AdhocRepository adhocRepository;

     @Autowired
     public AdhocServiceImpl(AdhocRepository adhocRepository){
         this.adhocRepository=adhocRepository;

     }

     @Override
    public AdhocFeedback saveFeedback(AdhocFeedback adhocFeedback) throws FeedbackAlreadyExistsException{
         if(adhocRepository.existsById(adhocFeedback.get_id()))
            throw new FeedbackAlreadyExistsException("Feedback already exists");
         else
        return adhocRepository.save(adhocFeedback);
    }


    @Override
    public List<AdhocFeedback> getAllNPSFeedback(){

         return adhocRepository.findAll();
    }

    @Override
    public AdhocFeedback deleteFeedback(String id) throws NoFeedbackFoundException{
         if(adhocRepository.existsById(id)) {
             AdhocFeedback adhocFeedback = adhocRepository.findById(id).get();
             this.adhocRepository.delete(adhocFeedback);

             return adhocFeedback;
         }
         else
             throw new NoFeedbackFoundException("Feedback not found");

    }

    @Override
    public AdhocFeedback getNPSFeedbackById(String id) throws NoFeedbackFoundException{

         if(adhocRepository.existsById(id))
             return adhocRepository.findById(id).get();
         else
             throw new NoFeedbackFoundException("Feedback not found");

    }

//    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
//
//         String path = "C:\\Users\\VinayGupta\\Desktop\\Carbon-design\\report";
//         List<AdhocFeedback> feedbacks = adhocRepository.findAll();
//        File file = ResourceUtils.getFile("classpath:allFeedback.jrxml");
//        JasperReport jasperReport  = JasperCompileManager.compileReport(file.getAbsolutePath());
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(feedbacks);
//        Map<String,Object> map = new HashMap<>();
//        map.put("created by:","Vinay");
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,map,dataSource);
//
//        if(reportFormat.equalsIgnoreCase("html")){
//            JasperExportManager.exportReportToHtmlFile(jasperPrint,path + "\\allFeedbacks.hmtl");
//        }
//        if(reportFormat.equalsIgnoreCase("pdf")){
//            JasperExportManager.exportReportToPdfFile(jasperPrint,path + "\\allFeedbacks.pdf");
//        }
//
//        return "report generated in:" + path;
//
//    }

}
