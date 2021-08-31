package com.example.iNPSAdhoc.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

//this annotation is used to create collection named "Adhoc" which will have fields of this pojo
@Document(collection = "Adhoc")
//@Data is lombok annotation which is used to @Data is a convenient shortcut annotation that bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together
@Data
public class AdhocFeedback {

    public String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProc_name() {
        return proc_name;
    }

    public void setProc_name(String proc_name) {
        this.proc_name = proc_name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public int rating;
   public String country;
    public String comments;
    public String proc_name; //procurement name on 10 rating

    public String internet_id ;

    public String getInternet_id() {
        return internet_id;
    }

    public void setInternet_id(String internet_id) {
        this.internet_id = internet_id;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getDivCode() {
        return divCode;
    }

    public void setDivCode(String divCode) {
        this.divCode = divCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String jobRole;
    public String divCode;
    public String orgCode;

    public String orgUnitID;

    public String getOrgUnitID() {
        return orgUnitID;
    }

    public void setOrgUnitID(String orgUnitID) {
        this.orgUnitID = orgUnitID;
    }

    public String getOrgGroup() {
        return orgGroup;
    }

    public void setOrgGroup(String orgGroup) {
        this.orgGroup = orgGroup;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String orgGroup;
    public String divisionName;

    public boolean zeroToSix;

    public boolean isZeroToSix() {
        return zeroToSix;
    }

    public void setZeroToSix(boolean zeroToSix) {
        this.zeroToSix = zeroToSix;
    }

    public boolean isSevenToEight() {
        return sevenToEight;
    }

    public void setSevenToEight(boolean sevenToEight) {
        this.sevenToEight = sevenToEight;
    }

    public boolean isNineToTen() {
        return nineToTen;
    }

    public void setNineToTen(boolean nineToTen) {
        this.nineToTen = nineToTen;
    }

    public boolean sevenToEight;
    public boolean nineToTen;

    @CreatedDate
    public Date createDate;

    @CreatedDate
    public Date feedbackSent;

    public Date getFeedbackSent() {
        return feedbackSent;
    }

    public void setFeedbackSent(Date feedbackSent) {
        this.feedbackSent = feedbackSent;
    }

    public Date getFeedbackTaken() {
        return feedbackTaken;
    }

    public void setFeedbackTaken(Date feedbackTaken) {
        this.feedbackTaken = feedbackTaken;
    }

    @CreatedDate
    public Date feedbackTaken;


    public String sourceID ;
}
