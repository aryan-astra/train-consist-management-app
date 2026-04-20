import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistApp {
    public static void main(String[] args) {
        Map<String, Integer> capacityByBogieId = new HashMap<>();
        capacityByBogieId.put("BG-P101", 72);
        capacityByBogieId.put("BG-P102", 68);
        capacityByBogieId.put("BG-C201", 45);

        System.out.println("UC6 - HashMap Capacity Map");
        for (Map.Entry<String, Integer> entry : capacityByBogieId.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nSample output complete for UC6.");
    }
}
