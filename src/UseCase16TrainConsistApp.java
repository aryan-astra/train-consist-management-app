import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase16TrainConsistApp {
    private static class PassengerBogie {
        private final String id;
        private final int capacity;

        private PassengerBogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + "(" + capacity + ")";
        }
    }

    public static void main(String[] args) {
        List<PassengerBogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new PassengerBogie("PB-3", 60));
        passengerBogies.add(new PassengerBogie("PB-1", 72));
        passengerBogies.add(new PassengerBogie("PB-2", 54));

        passengerBogies.sort(Comparator.comparingInt(bogie -> bogie.capacity));

        System.out.println("UC16 - Sort Passenger Bogies By Capacity");
        System.out.println("Sorted: " + passengerBogies);

        System.out.println("\nSample output complete for UC16.");
    }
}
