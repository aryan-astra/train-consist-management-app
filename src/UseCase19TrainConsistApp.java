import java.util.Arrays;

public class UseCase19TrainConsistApp {
    private static int binarySearch(String[] sortedIds, String target) {
        int left = 0;
        int right = sortedIds.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = sortedIds[mid].compareTo(target);

            if (compare == 0) {
                return mid;
            }
            if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] bogieIds = {"BG-100", "BG-101", "BG-102", "BG-103", "BG-104"};
        String target = "BG-103";

        int index = binarySearch(bogieIds, target);

        System.out.println("UC19 - Binary Search By Bogie ID");
        System.out.println("Sorted IDs: " + Arrays.toString(bogieIds));
        System.out.println("Search target: " + target + ", index: " + index);

        System.out.println("\nSample output complete for UC19.");
    }
}
