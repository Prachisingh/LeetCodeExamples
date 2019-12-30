package com.prachi;

/**
 * @author prachi
 */
public class StackImplentationFromScratch {

    int stack[] = new int[10];
    int top = -1;

    // push operation
    private void push(int element) {
        top = top + 1;
        stack[top] = element;
    }


    // pop operation

    /**
     * it returns the value at top and decrement top pointer by 1
     */
    private int pop() {
        int topValue = -1;
        if (top >= 0) {
            topValue = stack[top];
            top--;
        } else {
            System.out.println("Sorry !!  Stack is empty");
        }
        return topValue;

    }

    // peep operation
    private int peep() {

        return stack[top];

    }

    private void displayStack() {

        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);

            }
        }

    }

    public static void main(String[] args) {
        StackImplentationFromScratch stack = new StackImplentationFromScratch();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.displayStack();
        System.out.println("Top Element is " + stack.peep());
        System.out.println("Top element which will be removed "+ stack.pop());
        System.out.println("Top element which will be removed "+ stack.pop());
        System.out.println("After popping the top element");
        stack.displayStack();
    }
}
