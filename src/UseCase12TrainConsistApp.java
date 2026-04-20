import java.util.Arrays;
import java.util.List;

public class UseCase12TrainConsistApp {
    private static class GoodsBogie {
        private final String id;
        private final boolean sealed;
        private final boolean hasHazardLabel;

        private GoodsBogie(String id, boolean sealed, boolean hasHazardLabel) {
            this.id = id;
            this.sealed = sealed;
            this.hasHazardLabel = hasHazardLabel;
        }

        private boolean isCompliant() {
            return sealed && hasHazardLabel;
        }
    }

    public static void main(String[] args) {
        List<GoodsBogie> goods = Arrays.asList(
            new GoodsBogie("GB-1", true, true),
            new GoodsBogie("GB-2", true, true),
            new GoodsBogie("GB-3", true, false)
        );

        boolean allCompliant = goods.stream().allMatch(GoodsBogie::isCompliant);

        System.out.println("UC12 - Safety Compliance For Goods");
        System.out.println("All goods bogies compliant: " + allCompliant);

        System.out.println("\nSample output complete for UC12.");
    }
}
