package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TravelCalculatePremiumServiceImplTest {

    private final TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    @Test
    public void deleteMe() {

    }

    @Test
    public void calculatePremiumTest(){
        String firstName = "Danila";
        String lastName = "Yakush";
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(firstName, lastName, dateFrom, dateTo);
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertNotNull(response);
        assertEquals(firstName, response.getPersonFirstName());
        assertEquals(lastName, response.getPersonLastName());
        assertEquals(dateFrom, response.getAgreementDateFrom());
        assertEquals(dateTo, response.getAgreementDateTo());
    }

}