package Main;
import org.junit.Assert;

class node_LinkedQueue<T> {
    T item;
    node_LinkedQueue next;

    public node_LinkedQueue(T element) {
        this.item = element;
    }
}

public class LinkedQueue<T> {
    node_LinkedQueue front;
    node_LinkedQueue rear;
    int count;

    public LinkedQueue() {
        this.front = this.rear = null;
        count = 0;
    }

    void enQueue(T element) {
        node_LinkedQueue newNode = new node_LinkedQueue(element);
        if(isEmpty()) {
            this.front = this.rear = newNode;
        }
        else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        count++;
    }
    boolean isEmpty() {
        return this.rear == null;
    }
    void deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty, can not deQueue");
            return;
        }
        else if(count == 1) {   //in this case one node exist
            this.rear = null;
        }
        else {
            this.front = this.front.next;
        }
        count--;
    }
    Object getFront() {
        Assert.assertFalse(isEmpty());
        return this.front.item;
    }
    Object getRear() {
        Assert.assertFalse(isEmpty());
        return this.rear.item;
    }
    void clearQueue () {
        front = rear = null;
        count = 0;
    }
    int getSize() {
        return this.count;
    }
    void display() {
        node_LinkedQueue current = front;
        while(current != null) {                   // or this for (int i = 0; i < count; i++)
            System.out.print(current.item+" ");
            current = current.next;
        }
    }

}
