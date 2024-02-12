package Main;

class nodeDoublyLinkedList {
    int item;
    nodeDoublyLinkedList next;
    nodeDoublyLinkedList prev;
}

public class DoublyLinkedList {
    int length;     // number of node in List
    nodeDoublyLinkedList first;
    nodeDoublyLinkedList last;

    public DoublyLinkedList() {
        length = 0;
        first  = last = null;
    }
    boolean isEmpty() {
        return first == null;
    }
    void insertAtFirst(int element) {
        nodeDoublyLinkedList newNode = new nodeDoublyLinkedList();
        newNode.item = element;
        if(length == 0) {           // in this case we add first node
            first = last = newNode;
            newNode.next = newNode.prev = null;
        }
        else {
            newNode.next = first;
            newNode.prev = null;
            first.prev = newNode;
            first = newNode;
        }
        length++;
    }
    void insertAtEnd(int element) {
        nodeDoublyLinkedList newNode = new nodeDoublyLinkedList();
        newNode.item = element;
        if(length == 0) {           // in this case we add first node
            first = last = newNode;
            newNode.next = newNode.prev = null;
        }
        else {
            newNode.prev = last;
            newNode.next = null;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    void inertAtPos(int position, int element) {
        if (position < 0 || position > length)
            System.out.println("Out of Range");
        else if(position == 0)
            insertAtFirst(element);
        else if(position == length)
            insertAtEnd(element);
        else {
            nodeDoublyLinkedList curr = first;
            nodeDoublyLinkedList newNode = new nodeDoublyLinkedList();
            newNode.item = element;
            for (int i = 1; i < position; i++) {
                curr= curr.next;
            }
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next = newNode;
            curr.next.prev = newNode;
            length++;
        }
    }
    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        else if(length == 1)        // in this case only one node exist in list
            first = last = null;
        else {                      // in this case more than one node exist
            first = first.next;
            first.prev = null;
        }
        length--;
    }
    void removeLast() {
        if(isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        else if(length == 1)        // in this case only one node exist in list
            first = last = null;
        else {                      // in this case more than one node exist
             last = last.prev;
             last.next = null;
        }
        length--;
    }
    void remove(int element) {
        if(isEmpty())
            System.out.println("Empty List, can not remove..");
        else if (first.item == element)
            removeFirst();
        else if (last.item == element)
            removeLast();
        else {
            nodeDoublyLinkedList curr = first.next;
            while (curr != null) {
                if(curr.item == element)
                    break;
                curr = curr.next;
            }
            if (curr == null)  // in this case element not found
                System.out.println("The Item is not Here");
            else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
            length--;
        }
    }
    void display() {
        nodeDoublyLinkedList curr = first;
        System.out.println("Element List : ");
        while(curr != null) {
            System.out.print(curr.item+" ");
            curr = curr.next;
        }
    }
    void reverseDisplay() {
        nodeDoublyLinkedList curr = last;
        System.out.println("Element List After Reverse : ");
        while (curr != null) {
            System.out.print(curr.item + " ");
            curr = curr.prev;
        }
    }

}
