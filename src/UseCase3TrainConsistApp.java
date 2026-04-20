import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistApp {
    public static void main(String[] args) {
        Set<String> uniqueBogieIds = new HashSet<>();
        uniqueBogieIds.add("BG-101");
        uniqueBogieIds.add("BG-102");
        uniqueBogieIds.add("BG-101");
        uniqueBogieIds.add("BG-103");

        System.out.println("UC3 - HashSet Unique IDs");
        System.out.println("Unique bogie IDs: " + uniqueBogieIds);
        System.out.println("Unique count: " + uniqueBogieIds.size());

        System.out.println("\nSample output complete for UC3.");
    }
}
