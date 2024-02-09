package Main;

class nodeLinkedList {
    int item;
    nodeLinkedList next;

}

public class LinkedList {
    nodeLinkedList first;   //point to first node in list
    nodeLinkedList last;    //point to last node in list
    int length;

    public LinkedList() {
        this.first = this.last = null;
        this.length = 0;
    }
    boolean isEmpty() {
        return length == 0;
    }
    void insertAtFirst(int element) {
        nodeLinkedList newNode = new nodeLinkedList();
        newNode.item = element;
        if(length == 0) {                   //in this case we add the first node
            last = first = newNode;
            newNode.next = null;
        }
        else {
            newNode.next = this.first;
            this.first = newNode;
        }
        length++;
    }
    void insertAtEnd(int element) {
        nodeLinkedList newNode = new nodeLinkedList();
        newNode.item = element;
        if(length == 0) {                   //in this case we add the first node
            last = first = newNode;
            newNode.next = null;
        }
        else {
            last.next = newNode;
            newNode.next = null;
            last = newNode;
        }
        length++;
    }
    void insertAtPos(int position, int element) {
        nodeLinkedList newNode = new nodeLinkedList();
        newNode.item = element;
        nodeLinkedList cur = first;
        for (int i = 1; i < position; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        length++;
    }
    void removeFirst() {
        if(isEmpty()) {
            System.out.println("LinkedList is Empty can not remove..");
            return;
        }
        else if(length == 1) {
            first.next = null;
            last.next = null;
        }
        else {
            first = first.next;
        }
        length--;
    }
    void removeLast() {
        if(isEmpty()) {
            System.out.println("LinkedList is Empty can not remove..");
            return;
        }
        else if(length == 1) {
            first.next = null;
            last.next = null;
        }
        else {
            nodeLinkedList cur = first.next;
            nodeLinkedList prev = first;
            while(cur != last) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = null;
            last = prev;
        }
        length--;
    }
    void remove(int element) {
        if(isEmpty()) {
            System.out.println("LinkedList is Empty can not remove..");
        }
        else if(first.item == element) {           //in this case element in first node
            first = first.next;
            length--;
        }
        else{
            nodeLinkedList cur = first.next;
            nodeLinkedList prev = first;
            while(cur != null) {
                if(cur.item == element)
                    break;
                prev = cur;
                cur = cur.next;
            }
            if(cur == null)
                System.out.println("element not found");
            else {
                prev.next = cur.next;
                length--;
            }
        }
    }
    void removeAtPos(int position) {
        if(isEmpty()) {
            System.out.println("LinkedList is Empty can not remove..");
            return;
        }
        else if(length == 1) {
            first.next = null;
            last.next = null;
        }
        else {
            nodeLinkedList cur = first.next;
            nodeLinkedList prev = first;
            for (int i = 0; i < position-1; i++) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = cur.next;
        }
        length--;
    }
    void print() {
        nodeLinkedList cur = first;
        for (int i = 0; i < length; i++) {
            System.out.print(cur.item+" ");
            cur = cur.next;
        }
    }
}
