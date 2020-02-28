package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void verifyYear_isLeapYear_True(){
        Assertions.assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void verify_yearDivisible_4(){
        Assertions.assertTrue(LeapYear.isLeapYear(16));
    }

    @Test
    public void verify_yearDivisible_100(){
        Assertions.assertFalse(LeapYear.isLeapYear(200));
    }

    @Test
    public void verify_yearDivisible_400(){
        Assertions.assertTrue(LeapYear.isLeapYear(800));
    }

}