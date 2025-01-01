package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());
        response.setAgreementPrice(agreementPriceCalculate(request.getAgreementDateFrom(), request.getAgreementDateTo()));
        return response;
    }

    public BigDecimal agreementPriceCalculate(Date agreementDateFrom, Date agreementDateTo){
        long milSec =  agreementDateTo.getTime() - agreementDateFrom.getTime();
        var daysBetween = TimeUnit.DAYS.convert(milSec, TimeUnit.MILLISECONDS);
        return new BigDecimal(daysBetween);
    }
}
