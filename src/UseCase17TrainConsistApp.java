import java.util.Arrays;

public class UseCase17TrainConsistApp {
    public static void main(String[] args) {
        String[] bogieNames = {"Delta", "Alpha", "Charlie", "Bravo"};

        Arrays.sort(bogieNames);

        System.out.println("UC17 - Arrays.sort Bogie Names");
        System.out.println("Sorted names: " + Arrays.toString(bogieNames));

        System.out.println("\nSample output complete for UC17.");
    }
}
