package Reservations;
import java.time.DayOfWeek;

public class Reservation implements Reservable {
    public String getBookingDow() {
        int ran = (int) (Math.random() * 7 + 1);
        return DayOfWeek.of(ran).toString();
    }
    public String getBookingCode() {
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String out = "";
        for (int i = 0; i < 8; i++) {
            out += pool.charAt((int) (Math.random() * pool.length()));
        }
        return out;
    }
}
