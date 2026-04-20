import java.util.Arrays;
import java.util.List;

public class UseCase10TrainConsistApp {
    public static void main(String[] args) {
        List<Integer> seatCapacities = Arrays.asList(72, 68, 60, 54);

        int totalSeats = seatCapacities.stream()
            .reduce(0, Integer::sum);

        System.out.println("UC10 - Reduce Total Seats");
        System.out.println("Seat capacities: " + seatCapacities);
        System.out.println("Total seats: " + totalSeats);

        System.out.println("\nSample output complete for UC10.");
    }
}
