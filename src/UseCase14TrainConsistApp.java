public class UseCase14TrainConsistApp {
    private static int validateCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero: " + capacity);
        }
        return capacity;
    }

    public static void main(String[] args) {
        int[] capacities = {72, -10, 60};

        System.out.println("UC14 - Invalid Capacity Handling");
        for (int value : capacities) {
            try {
                int validCapacity = validateCapacity(value);
                System.out.println("Accepted capacity: " + validCapacity);
            } catch (IllegalArgumentException ex) {
                System.out.println("Rejected capacity: " + ex.getMessage());
            }
        }

        System.out.println("\nSample output complete for UC14.");
    }
}
