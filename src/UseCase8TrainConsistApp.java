import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistApp {
    private static class Bogie {
        private final String id;
        private final String type;

        private Bogie(String id, String type) {
            this.id = id;
            this.type = type;
        }

        @Override
        public String toString() {
            return id + "-" + type;
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
            new Bogie("BG-1", "PASSENGER"),
            new Bogie("BG-2", "CARGO"),
            new Bogie("BG-3", "PASSENGER")
        );

        List<Bogie> passengerBogies = bogies.stream()
            .filter(bogie -> "PASSENGER".equals(bogie.type))
            .collect(Collectors.toList());

        System.out.println("UC8 - Stream Filter Passenger Bogies");
        System.out.println("Passenger bogies: " + passengerBogies);

        System.out.println("\nSample output complete for UC8.");
    }
}
