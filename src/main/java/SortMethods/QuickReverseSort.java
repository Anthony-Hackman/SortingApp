// QuickReverseSort.java
// Anthony Hackman

package SortMethods;

public class QuickReverseSort {
    private static long count;

    public static void quickReverseSort(String[] arr) {
        count = 0;
        quickSort(arr, 0, arr.length - 1);
        System.out.println("QuickReverseSort comparison count: " + count);
    }

    private static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1; // index of smaller element
        for (int j = low; j < high; j++) {
            count++;
            if (arr[j].compareTo(pivot) > 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static long getComparisonCount() {
        return count;
    }
}
