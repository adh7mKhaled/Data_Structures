package Main;

public class SelectionSort {

    void selectionSort(int[] arr, int size) {
        int minIndex;                        // 0  1  2  3  4  5
        for (int i = 0; i < size - 1; i++) { // 60 40 50 30 10 20  size = 6
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
