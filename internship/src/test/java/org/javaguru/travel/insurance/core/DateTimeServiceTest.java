package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.javaguru.travel.insurance.core.DateTimeService.agreementPriceCalculate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeServiceTest {

    @Test
    public void agreementPriceCalculateTest(){
        Date dateFrom = new Date();
        Date dateTo = new Date(dateFrom.getTime() + 100000);

        long milSec =  dateTo.getTime() - dateFrom.getTime();
        var daysBetween = TimeUnit.DAYS.convert(milSec, TimeUnit.MILLISECONDS);
        var result =  new BigDecimal(daysBetween);
        agreementPriceCalculate(dateFrom, dateTo);
        assertEquals(agreementPriceCalculate(dateFrom, dateTo), result);
    }

}
