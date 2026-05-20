import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testPlatesteBilet() {
        CalatorAbonat calator = new CalatorAbonat("Ionescu");
        calator.setSold(5.5f);
        calator.platesteBilet(1f);

        assertEquals(4.5f, calator.getSold(), 0.001);
    }

    @org.junit.Test
    public void testPlatesteBiletInsuficient(){
        CalatorAbonat calator = new CalatorAbonat("Ionescu");
        calator.setSold(5.5f);
        calator.platesteBilet(10f);

        assertEquals(5.5f, calator.getSold(), 0.001);
    }
}

//right bicep