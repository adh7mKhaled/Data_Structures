package Main;

public class BinarySearch {
    int binarySearch(int[] arr, int low , int high, int element) {  // low => first index , high => last index
        while(low  <= high) {
            int mid = (low  + high) / 2; // middle index
            if (arr[mid] == element)
                return mid;   // return index of key
            else {
                if (arr[mid] < element)
                    low  = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;   // if key not found return -1;
    }
}
