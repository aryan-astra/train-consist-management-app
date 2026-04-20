import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistApp {
    public static void main(String[] args) {
        Set<String> insertionOrdered = new LinkedHashSet<>();
        insertionOrdered.add("BG-A1");
        insertionOrdered.add("BG-B1");
        insertionOrdered.add("BG-C1");
        insertionOrdered.add("BG-B1");

        System.out.println("UC5 - LinkedHashSet Insertion Order");
        System.out.println("Insertion-ordered IDs: " + insertionOrdered);

        System.out.println("\nSample output complete for UC5.");
    }
}
