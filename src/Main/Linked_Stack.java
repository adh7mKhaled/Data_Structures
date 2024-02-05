package Main;

class node_LinkedStack<T> {  //this class include to be added
    T item;
    node_LinkedStack next;
}


public class Linked_Stack<T> {
    node_LinkedStack StackTop;

    Linked_Stack () {
        this.StackTop = null;
    }

    void push(T newItem) {
        node_LinkedStack newItemPtr = new node_LinkedStack();
        newItemPtr.item = newItem;
        newItemPtr.next = StackTop;
        StackTop = newItemPtr;
    }

    void pop () {
        if (isEmpty())
            System.out.println("Stack empty on pop");
        else
            StackTop = StackTop.next;
    }

    boolean isEmpty () {
        return StackTop == null;
    }

    void popWithReturnValue () {
        if (isEmpty())
            System.out.println("stack empty on pop");
        else {
            Object stackTop = StackTop.item;
            node_LinkedStack temp = StackTop;
            StackTop = StackTop.next;
            temp.next = null;
            System.out.println("element deleted: "+stackTop);
        }
    }

    void getTop () {
        if (isEmpty())
            System.out.println("stack is empty");
        else {
            System.out.println(StackTop.item);
        }
    }

    void display () {
        System.out.print("Item in stack: [ ");
        while (StackTop != null)
        {
            System.out.print(StackTop.item+" ");
            StackTop = StackTop.next;
        }
        System.out.println("]");
    }

}
