package Main;

public class MergeSort {
    void merge(int[] arr, int l, int m, int r) { // l = leftIndex, m = middleIndex, r = rightIndex, m = l+(r-l)/2
        int i, j, k;
        int n1 = m - l + 1;     // n1 size of right subArray
        int n2 = r - m;         // n2 size of left subArray
        int[] rightSubArray = new int[n1];       // left subArray
        int[] leftSubArray = new int[n2];       // right subArray

        for (i = 0; i < n1; i++)        // add elements in left subArray
            rightSubArray[i] = arr[l + i];
        for (j = 0; j < n2; j++)        // add elements in right subArray
            leftSubArray[j] = arr[m + 1 + j];

        i = j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (rightSubArray[i] <= leftSubArray[j]) {
                arr[k] = rightSubArray[i];
                i++;
            }
            else {
                arr[k] = leftSubArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = rightSubArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = leftSubArray[j];
            j++;
            k++;
        }

    }
    void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m ,r);
        }
    }

}
