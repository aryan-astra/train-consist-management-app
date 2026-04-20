import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistApp {
    private static class Bogie {
        private final String id;
        private final int capacity;

        private Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + "(" + capacity + ")";
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG-1", 72));
        bogies.add(new Bogie("BG-2", 48));
        bogies.add(new Bogie("BG-3", 90));

        bogies.sort(Comparator.comparingInt(bogie -> bogie.capacity));

        System.out.println("UC7 - Comparator Sort By Capacity");
        System.out.println("Sorted bogies: " + bogies);

        System.out.println("\nSample output complete for UC7.");
    }
}
