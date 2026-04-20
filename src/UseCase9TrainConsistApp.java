import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase9TrainConsistApp {
    private static class Bogie {
        private final String id;
        private final String type;

        private Bogie(String id, String type) {
            this.id = id;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
            new Bogie("BG-1", "PASSENGER"),
            new Bogie("BG-2", "CARGO"),
            new Bogie("BG-3", "PASSENGER"),
            new Bogie("BG-4", "CARGO")
        );

        Map<String, List<Bogie>> groupedByType = bogies.stream()
            .collect(Collectors.groupingBy(bogie -> bogie.type));

        System.out.println("UC9 - Stream Grouping By Type");
        for (Map.Entry<String, List<Bogie>> entry : groupedByType.entrySet()) {
            System.out.println(entry.getKey() + " count: " + entry.getValue().size());
        }

        System.out.println("\nSample output complete for UC9.");
    }
}
