package Main;

public class QuickSort {
    int partition (int []arr, int iBegin, int jEnd) {
        int i = iBegin;
        int j = jEnd;
        int pivLocation = i;
        while (true) {
            while (arr[pivLocation] <= arr[j] && pivLocation != j) {
                j--;
            }
            if (pivLocation == j)
                break;
            else if (arr[pivLocation] > arr[j]) {
                int temp = arr[pivLocation];
                arr[pivLocation] = arr[j];
                arr[j] = temp;
                pivLocation = j;
            }
            while (arr[pivLocation] >= arr[i] && pivLocation != i) {
                i++;
            }
            if (pivLocation == i)
                break;
            else if (arr[pivLocation] < arr[i]) {
                int temp = arr[pivLocation];
                arr[pivLocation] = arr[i];
                arr[i] = temp;
                pivLocation = i;
            }
        }
        return pivLocation;
    }
    void quickSort (int []arr, int start, int end) {
        if (start < end) {
            int piv = partition(arr, start, end);
            quickSort(arr, start, piv-1);    // right subArray
            quickSort(arr, piv+1, end);     //  left subArray
        }
    }
}
