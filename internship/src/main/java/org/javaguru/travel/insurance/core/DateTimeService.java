package org.javaguru.travel.insurance.core;


import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeService {
    public static BigDecimal agreementPriceCalculate(Date agreementDateFrom, Date agreementDateTo){
        long milSec =  agreementDateTo.getTime() - agreementDateFrom.getTime();
        var daysBetween = TimeUnit.DAYS.convert(milSec, TimeUnit.MILLISECONDS);
        return new BigDecimal(daysBetween);
    }
}
