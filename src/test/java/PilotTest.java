import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Geoff", Rank.CAPTAIN, "SF1010");
    }

    @Test
    public void canFly(){
        assertEquals("I can Fly!!!", pilot.flyPlane());
    }
}
