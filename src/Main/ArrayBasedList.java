package Main;

public class ArrayBasedList {
    int[] arr;
    int maxSize;
    int length;

    public ArrayBasedList(int size) {
        if(size <= 0)
            this.maxSize = 10;   // set initial size
        else
            this.maxSize = size;
        arr = new int[maxSize];
    }

    boolean isEmpty() {
        return length == 0;
    }
    boolean isFull() {
        return length == maxSize;
    }
    int getSize() {
        return length;
    }
    void print() {
        for (int i = 0; i < length; i++)
            System.out.print(arr[i]+" ");
    }
    void insertAtPos(int position, int element) {
        if(isFull())
            System.out.println("The List is full can not insert...");
        else if(position < 0 || position > length)
            System.out.println("Out of Range");
        else {
            for (int i = length; i > position; i--) {     //example: length = 5 arr = {3, 4, 5, 6, 7, } insert into pos = 2, element = 10
                arr[i] = arr[i - 1];                     //this line will shift elements to right => arr = {3, 4,  , 5, 6, 7}
            }
            arr[position] = element;                     //this line will add element(10) in position(2) => arr = {3, 4, 10, 5, 6, 7}
            length++;
        }
    }
    void removeAtPos(int position) {
        if(isEmpty())
            System.out.println("List is empty");
        else if(position < 0 || position > length)
            System.out.println("Out of Range");
        else {
            for (int i = position; i < length; i++) {     //example: length = 6 arr = {3, 4, 10, 5, 6, 7} remove element at position(2)
                arr[i] = arr[i + 1];                     //this line will shift elements to left => arr = {3, 4, 5, 6, 7,  }
        }                                                //=> trace code to understand
            length--;
        }
    }
    void insertAtEnd(int element) {
        if(isFull())
            System.out.println("The List is full can not insert...");
        else {
            arr[length] = element;
            length++;
        }
    }
    int search(int element) {
        for (int i = 0; i < length; i++) {
            if(arr[i] == element)
                return i;
        }
        return -1;    //return -1 if element not exist
    }
    void insertNoDuplicate(int element) {
        if(search(element) == -1)
            insertAtEnd(element);  // use insertAtEnd methode
        else
            System.out.println("The Element is there...");
    }
    void updateAtPos(int position, int element) {      //example: arr = {3, 4, 10, 5, 6, 7} update element at position(2), with element = 30
        if (position < 0 || position >= length)     //  => after update arr = {3, 4, 30, 5, 6, 7}
            System.out.println("index out of Range");
        else
            arr[position] = element;
    }
    int getElement(int position) {
            return arr[position];
    }

}
