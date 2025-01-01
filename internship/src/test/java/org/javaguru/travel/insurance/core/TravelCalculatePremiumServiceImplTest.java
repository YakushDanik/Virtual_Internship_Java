package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service;

    @BeforeEach
    public void setUp() {
        service = new TravelCalculatePremiumServiceImpl();
    }

    private TravelCalculatePremiumRequest createRequest(String firstName, String lastName, Date dateFrom, Date dateTo) {
        return new TravelCalculatePremiumRequest(firstName, lastName, dateFrom, dateTo);
    }

    @Test
    public void calculatePremiumNotNullTest() {
        String firstName = "Danila";
        String lastName = "Yakush";
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);
        TravelCalculatePremiumRequest request = createRequest(firstName, lastName, dateFrom, dateTo);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertNotNull(response);
    }

    @Test
    public void calculatePremiumFirstNameTest() {
        String firstName = "Danila";
        String lastName = "Yakush";
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);
        TravelCalculatePremiumRequest request = createRequest(firstName, lastName, dateFrom, dateTo);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(firstName, response.getPersonFirstName());
    }

    @Test
    public void calculatePremiumLastNameTest() {
        String firstName = "Danila";
        String lastName = "Yakush";
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);
        TravelCalculatePremiumRequest request = createRequest(firstName, lastName, dateFrom, dateTo);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(lastName, response.getPersonLastName());
    }

    @Test
    public void calculatePremiumDateFromTest() {
        String firstName = "Danila";
        String lastName = "Yakush";
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);
        TravelCalculatePremiumRequest request = createRequest(firstName, lastName, dateFrom, dateTo);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(dateFrom, response.getAgreementDateFrom());
    }

    @Test
    public void calculatePremiumDateToTest() {
        String firstName = "Danila";
        String lastName = "Yakush";
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);
        TravelCalculatePremiumRequest request = createRequest(firstName, lastName, dateFrom, dateTo);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(dateTo, response.getAgreementDateTo());
    }
}