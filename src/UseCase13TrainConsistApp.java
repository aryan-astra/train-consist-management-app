import java.util.ArrayList;
import java.util.List;

public class UseCase13TrainConsistApp {
    public static void main(String[] args) {
        List<Integer> capacities = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            capacities.add(i % 90 + 10);
        }

        long loopStart = System.nanoTime();
        long loopSum = 0;
        for (int value : capacities) {
            loopSum += value;
        }
        long loopDuration = System.nanoTime() - loopStart;

        long streamStart = System.nanoTime();
        long streamSum = capacities.stream().mapToLong(Integer::longValue).sum();
        long streamDuration = System.nanoTime() - streamStart;

        System.out.println("UC13 - Loops vs Streams Performance Compare");
        System.out.println("Loop sum: " + loopSum + ", time(ns): " + loopDuration);
        System.out.println("Stream sum: " + streamSum + ", time(ns): " + streamDuration);

        System.out.println("\nSample output complete for UC13.");
    }
}
