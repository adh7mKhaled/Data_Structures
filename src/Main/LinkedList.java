package Main;

class nodeLinkedList {
    int item;
    nodeLinkedList next;

    nodeLinkedList (int element) {
        this.item = element;
    }
}

public class LinkedList {
    nodeLinkedList first;   //point to first node in list
    nodeLinkedList last;    //point to last node in list
    int length;

    public LinkedList() {
        this.first = this.last = null;
        this.length = 0;
    }

    void insertAtFirst(int element) {
        nodeLinkedList newNode = new nodeLinkedList(element);
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
        nodeLinkedList newNode = new nodeLinkedList(element);
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
        nodeLinkedList newNode = new nodeLinkedList(element);
        nodeLinkedList cur = first;
        for (int i = 1; i < position; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        length++;
    }
    void print() {
        nodeLinkedList cur = first;
        for (int i = 0; i < length; i++) {
            System.out.print(cur.item+" ");
            cur = cur.next;
        }
    }
}
