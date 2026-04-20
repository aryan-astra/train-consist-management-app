import java.util.Set;
import java.util.TreeSet;

public class UseCase4TrainConsistApp {
    public static void main(String[] args) {
        Set<String> orderedBogieIds = new TreeSet<>();
        orderedBogieIds.add("BG-310");
        orderedBogieIds.add("BG-101");
        orderedBogieIds.add("BG-205");
        orderedBogieIds.add("BG-150");

        System.out.println("UC4 - TreeSet Ordered IDs");
        System.out.println("Ordered IDs: " + orderedBogieIds);

        System.out.println("\nSample output complete for UC4.");
    }
}
