public class UseCase1TrainConsistApp {
    public static void main(String[] args) {
        String trainId = "TR-1001";
        int passengerBogies = 3;
        int cargoBogies = 2;
        int totalBogies = passengerBogies + cargoBogies;

        System.out.println("Train Initialization Summary");
        System.out.println("Train ID: " + trainId);
        System.out.println("Passenger Bogies: " + passengerBogies);
        System.out.println("Cargo Bogies: " + cargoBogies);
        System.out.println("Total Bogies: " + totalBogies);

        System.out.println("\nSample output complete for UC1.");
    }
}
