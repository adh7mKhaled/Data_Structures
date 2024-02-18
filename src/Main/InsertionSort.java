package Main;

public class InsertionSort {

    void insertionSort (int[] arr, int size) {
        int key, j;
        for (int i = 1; i < size; i++) {  // 80 90 60 30 50 70 40
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)      // For descending order, change arr[j] > key to arr[j] < key.
            {
                arr[j + 1] = arr[j];     // shift elements
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
