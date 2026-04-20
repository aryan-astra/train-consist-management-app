import java.util.Arrays;
import java.util.List;

public class UseCase18TrainConsistApp {
    private static int linearSearch(List<String> ids, String target) {
        for (int i = 0; i < ids.size(); i++) {
            if (ids.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> bogieIds = Arrays.asList("BG-100", "BG-101", "BG-102", "BG-103");
        String target = "BG-102";

        int index = linearSearch(bogieIds, target);

        System.out.println("UC18 - Linear Search By Bogie ID");
        System.out.println("Search target: " + target + ", index: " + index);

        System.out.println("\nSample output complete for UC18.");
    }
}
