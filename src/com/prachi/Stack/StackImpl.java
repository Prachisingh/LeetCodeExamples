package com.prachi.Stack;

/**
 * @author prachi
 */
public class StackImpl {

   private int stack[] = new int[10];
   private int top = -1;


    // push operation
    public void push(int element) {
        top = top + 1;
        stack[top] = element;
    }


    // pop operation

    /**
     * it returns the value at top and decrement top pointer by 1
     */
    public int pop() {
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
    public int peep() {

        return stack[top];

    }

    public void displayStack() {

        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);

            }
        }

    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
