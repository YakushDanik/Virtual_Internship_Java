package org.javaguru.travel.insurance.rest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class TravelCalculatePremiumResponse {

    public TravelCalculatePremiumResponse(){}
    public TravelCalculatePremiumResponse(String personFirstName, String personLastName, Date agreementDateFrom, Date agreementDateTo){
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;
    private BigDecimal agreementPrice;


    public String getPersonFirstName() {
        return personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public Date getAgreementDateFrom() {
        return agreementDateFrom;
    }

    public Date getAgreementDateTo() {
        return agreementDateTo;
    }

    public BigDecimal getAgreementPrice() {
        return agreementPrice;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public void setAgreementDateFrom(Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public void setAgreementDateTo(Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }

    public void setAgreementPrice(BigDecimal agreementPrice) {
        this.agreementPrice = agreementPrice;
    }
}
