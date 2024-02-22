package Main;

public class LinearSearch {
    int linearSearch(int[] arr, int key, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == key)
                return i;  // if key found, return index of key
        }
        return -1;  // if key not found, return -1
    }
}
