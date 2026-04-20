import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class UseCase20TrainConsistApp {
    private static int safeSearch(List<String> ids, String target) {
        int index = ids.indexOf(target);
        if (index < 0) {
            throw new NoSuchElementException("Bogie ID not found: " + target);
        }
        return index;
    }

    public static void main(String[] args) {
        List<String> bogieIds = Arrays.asList("BG-200", "BG-201", "BG-202");
        String target = "BG-205";

        System.out.println("UC20 - Exception Handling In Search");
        try {
            int index = safeSearch(bogieIds, target);
            System.out.println("Found at index: " + index);
        } catch (NoSuchElementException ex) {
            System.out.println("Search failed: " + ex.getMessage());
        }

        System.out.println("\nSample output complete for UC20.");
    }
}
