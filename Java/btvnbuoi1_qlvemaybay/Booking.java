package btvnbuoi1_qlvemaybay;

import java.time.LocalDateTime;

public class Booking {
    private Passenger passenger;
    private Flight flight;
    private LocalDateTime bookingTime;

    public Booking(Passenger passenger, Flight flight, LocalDateTime bookingTime) {
        this.passenger = passenger;
        this.flight = flight;
        this.bookingTime = bookingTime;
    }

    public Passenger getPassenger() { return passenger; }
    public Flight getFlight() { return flight; }
    public LocalDateTime getBookingTime() { return bookingTime; }

    @Override
    public String toString() {
        return passenger.getName() + " booked flight " + flight.getFlightId() + " at " + bookingTime;
    }
}
