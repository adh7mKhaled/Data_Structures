package Main;

public class Stack_Array {
    private int top;
    private Object[] item;
    private int sizeOfStack;

    Stack_Array(int size) {
        this.sizeOfStack = size;
        top = -1;
        item = new Object[sizeOfStack];
    }

    void push(Object element) {
        if (isFull()){
            System.out.println("Stack is Full on Push");
        }
        else {
            top++;
            item[top] = element;
        }
    }

    boolean isFull() {
            return top == sizeOfStack-1;
    }

    void pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty on pop");
        }
        else {
            top--;
        }
    }

    Object pop(Object element) {      // overload pop methode to save deleted element
        if(isEmpty()) {
            System.out.println("Stack is Empty on pop");
        }
        else {
            element = item[top];
            top--;
        }
        return element;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void getTop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty on pop");
        }
        else {
            System.out.println(item[top]);
        }
    }

    void print() {
        System.out.print("[");
        for (int i = top; i >= 0; i--) {
            System.out.print(item[i]+" ");
        }
        System.out.println("]");
    }

}
