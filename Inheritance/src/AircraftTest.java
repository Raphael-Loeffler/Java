import java.util.Arrays;
import java.util.List;

public class AircraftTest {
    public static void main(String[] args) {
        List<Aircraft> aircraftList1 = Arrays.asList(new Aircraft("F35"), new Aircraft("F16"), new Aircraft("F16"), new Aircraft("F35"), new Aircraft("F35"));
        List<Aircraft> aircraftList2 = Arrays.asList(new Aircraft("F16"), new Aircraft("F35"), new Aircraft("F16"), new Aircraft("F35"));
        Carrier carrier1 = new Carrier(5000, 5000);
        Carrier carrier2 = new Carrier(3000, 2000);
        for (Aircraft aircraft: aircraftList1) {
            carrier1.add(aircraft);
        }
        for (Aircraft aircraft: aircraftList2) {
            carrier2.add(aircraft);
        }
        carrier1.fill();
        carrier2.fill();
        carrier1.getStatus();
        System.out.println();
        carrier2.getStatus();
        System.out.println();
        carrier1.fight(carrier2);
        carrier2.getStatus();
        carrier1.fight(carrier2);
        carrier2.getStatus();
    }
}
