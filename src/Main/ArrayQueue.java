package Main;
import org.junit.Assert;

public class ArrayQueue<T> {
    int rear, front, count, sizeOfArray;  //count use to count actual no. of elements in arrayQueue
    Object[] arr;

    ArrayQueue(int size) {
        this.sizeOfArray = size;
        this.arr = new Object[this.sizeOfArray];
        this.front = 0;
        this.rear = this.sizeOfArray-1;
        this.count = 0;
    }

    boolean isEmpty() {
        return this.count == 0;
    }
    boolean isFull() {
        return this.count == sizeOfArray;
    }
    void enQueue(Object element) {
        if(isFull()) {
            System.out.println("Queue full can not enqueue");
        }
        else {
            rear = (rear + 1) % this.sizeOfArray;
            arr[rear] = element;
            count++;
        }
    }
    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue empty can not dequeue");
        }
        else {
            front = (front + 1) % this.sizeOfArray;
            count--;
        }
    }

    Object getFront() {
        Assert.assertFalse (isEmpty());     // assertFalse() this methode if condition is false continue if true throws an AssertionError without a message.
        return arr[front];
    }
    Object getRear() {
        Assert.assertFalse(isEmpty());      // assertFalse() this methode if condition is false continue if true throws an AssertionError without a message.
        return arr[rear];
    }

    void print() {
        Assert.assertFalse(isEmpty());
        for (int i = front; i != rear; i = (i+1) % this.sizeOfArray) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(arr[rear]);
    }

    int search(Object element) {
        Assert.assertFalse(isEmpty());
        int position = -1;
        for (int i = front; i != rear; i = (i+1) % this.sizeOfArray) {
            if(arr[i] == element) {
                position = i;
                break;
            }
        }
        if (position == -1) {
            if (arr[rear] == element)
                position = rear;
        }
        return position;
    }
}
