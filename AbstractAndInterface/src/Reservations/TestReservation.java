package Reservations;

public class TestReservation {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();
        for (int i = 0; i < 10; i++) {
            System.out.println("Booking# " + reservation.getBookingCode() + " for " + reservation.getBookingDow().substring(0, 3));
        }
    }
}
