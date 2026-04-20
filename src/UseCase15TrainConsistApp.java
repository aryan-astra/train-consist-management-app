import java.util.HashMap;
import java.util.Map;

public class UseCase15TrainConsistApp {
    private static int parseCargoWeight(String weightText) {
        return Integer.parseInt(weightText);
    }

    public static void main(String[] args) {
        Map<String, Integer> cargoAssignment = new HashMap<>();
        String bogieId = "CG-12";
        String requestedWeight = "45";

        System.out.println("UC15 - try-catch-finally Safe Cargo Assignment");
        try {
            int weight = parseCargoWeight(requestedWeight);
            if (weight <= 0) {
                throw new IllegalArgumentException("Weight must be positive.");
            }
            cargoAssignment.put(bogieId, weight);
            System.out.println("Assigned cargo to " + bogieId + " weight=" + weight);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid numeric input for cargo weight.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Assignment failed: " + ex.getMessage());
        } finally {
            System.out.println("Final assignment map: " + cargoAssignment);
        }

        System.out.println("\nSample output complete for UC15.");
    }
}
