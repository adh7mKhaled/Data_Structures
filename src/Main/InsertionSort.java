package Main;

public class InsertionSort {

    void insertionSort (int[] arr, int size) {
        int key, j;
        for (int i = 0; i < size; i++) {  // 80 90 60 30 50 70 40
            key = arr[i];
            j = i - 1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];     // shift elements
                j--;
            }
            // Place key at after the element just smaller than it.
            arr[j + 1] = key;
        }
    }
}
