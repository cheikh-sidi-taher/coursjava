package oop;

public class Stack<T> {

    int Size;
    Object[] arryStack;
    int top;

    public Stack(int Size) {
        this.Size = Size;
        arryStack = new Object[this.Size];
        top = -1;

    }

    public void push(Object newItem) {
        if (IsFull()) {
            System.out.println("Stack is full");
            return;
        }

        top = top + 1;
        arryStack[top] = newItem;

    }

    public T pop() {

        if (Isempty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T item = (T) arryStack[top];
        top = top - 1;
        return item;
    }

    public Boolean IsFull() {

        return (top == Size - 1);

    }

    public Boolean Isempty() {

        return (top == -1);

    }

}