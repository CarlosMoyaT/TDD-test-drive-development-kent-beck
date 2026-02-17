import static org.junit.jupiter.api.Assertions.assertEquals; // import para assertEquals

import org.example.Dollar;
import org.junit.jupiter.api.Test;


public class DollarTest {



    @Test
    public void testMultiplicaction() {

        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }



}
