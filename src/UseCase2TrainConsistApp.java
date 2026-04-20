import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistApp {
    public static void main(String[] args) {
        List<String> bogies = new ArrayList<>();
        bogies.add("BG-201-PASSENGER");
        bogies.add("BG-202-PASSENGER");
        bogies.add("BG-301-CARGO");

        System.out.println("UC2 - ArrayList Add Bogies");
        System.out.println("Bogies in consist: " + bogies);
        System.out.println("Total bogies: " + bogies.size());

        System.out.println("\nSample output complete for UC2.");
    }
}
