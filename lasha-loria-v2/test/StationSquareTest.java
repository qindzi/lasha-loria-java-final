import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StationSquareTest {
    @Test
    public void testStationSquare() {
        Passenger lasha = new Passenger("Lasha", true);
        Passenger miranda = new Passenger("Miranda", false);
        Passenger akaki = new Passenger("Akaki", true);

        Train train = new Train();
        assertEquals(true, train.addPassenger(lasha));
        assertEquals(false, train.addPassenger(miranda));
        assertEquals(true, train.addPassenger(akaki));
    }
}