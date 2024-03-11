package Main;

public class BubbleSort {

    void bubbleSort(int []arr, int size) {
        int flag = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = 1;
                }
            }
            if (flag == 0)   // in this case array already sorted
                break;
        }
    }
}
