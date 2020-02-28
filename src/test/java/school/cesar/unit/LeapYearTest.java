package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test void calculate_LeapYearTrue (){
        Assertions.assertTrue(LeapYear.check("2020"));

    }
}
