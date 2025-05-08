package btvnbuoi1_qlvemaybay;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    private static List<Flight> flights = new ArrayList<>();
    private static List<Passenger> passengers = new ArrayList<>();

    public static void main(String[] args) {

        Passenger p1 = new Passenger("001", "Tien");
        Passenger p2 = new Passenger("002", "Linh");
        passengers.add(p1);
        passengers.add(p2);

        Flight f1 = new Flight("1", "Ha Noi", "TP.HCM", LocalDateTime.now().plusDays(1), 2);
        Flight f2 = new Flight("2", "Ha Noi", "TP.HCM", LocalDateTime.now().plusDays(2), 1);
        Flight f3 = new Flight("3", "Da Nang", "Ha Noi", LocalDateTime.now().plusDays(1), 3);
        flights.add(f1);
        flights.add(f2);
        flights.add(f3);

        // dat ve
        bookTicket(p1, f1);
        bookTicket(p2, f1);
        bookTicket(p1, f2);
        bookTicket(p2, f2); // se bi tu choi vi day


        System.out.println("\nchuyen bay cua Tien:");
        getFlightsByPassenger(p1);


        System.out.println("\nhanh khach tren chuyen F001:");
        getPassengersByFlight(f1);


        System.out.println("\n🏆 Chuyến bay nhiều lượt đặt nhất:");
        System.out.println(getMostBookedFlight());


        System.out.println("\nhanh khach bay nhieu nhat:");
        System.out.println(getTopPassenger());


        System.out.println("\ncac chuyen ha noi - tp hcm trong 3 ngay toi:");
        getFlightsFromToIn3Days("Ha Noi", "TP.HCM");
    }

    public static void bookTicket(Passenger passenger, Flight flight) {
        for (Booking b : flight.getBookings()) {
            if (b.getPassenger().equals(passenger)) {
                System.out.println(" " + passenger.getName() + " da dat chuyen " + flight.getFlightId());
                return;
            }
        }

        if (flight.isFull()) {
            System.out.println("chuyen " + flight.getFlightId() + " da day");
            return;
        }

        Booking booking = new Booking(passenger, flight, LocalDateTime.now());
        flight.addBooking(booking);
        System.out.println(" " + passenger.getName() + " da dat ve chuyen " + flight.getFlightId());
    }

    public static void getFlightsByPassenger(Passenger passenger) {
        for (Flight f : flights) {
            for (Booking b : f.getBookings()) {
                if (b.getPassenger().equals(passenger)) {
                    System.out.println(f);
                }
            }
        }
    }

    public static void getPassengersByFlight(Flight flight) {
        for (Booking b : flight.getBookings()) {
            System.out.println(b.getPassenger());
        }
    }

    public static Flight getMostBookedFlight() {
        return Collections.max(flights, Comparator.comparingInt(f -> f.getBookings().size()));
    }

    public static Passenger getTopPassenger() {
        Map<Passenger, Integer> map = new HashMap<>();
        for (Flight f : flights) {
            for (Booking b : f.getBookings()) {
                map.put(b.getPassenger(), map.getOrDefault(b.getPassenger(), 0) + 1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void getFlightsFromToIn3Days(String from, String to) {
        LocalDateTime now = LocalDateTime.now();
        flights.stream()
                .filter(f -> f.getOrigin().equalsIgnoreCase(from)
                        && f.getDestination().equalsIgnoreCase(to)
                        && !f.getDepartureTime().isBefore(now)
                        && f.getDepartureTime().isBefore(now.plusDays(3)))
                .sorted(Comparator.comparing(Flight::getDepartureTime))
                .forEach(System.out::println);
    }
}
