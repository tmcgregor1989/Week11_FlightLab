import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Daisy", Rank.FIRSTOFFICER);
    }

    @Test
    public void canMessagePassengers(){
        assertEquals("Fold your fucking tables away!!!", cabinCrew.message());
    }
}
