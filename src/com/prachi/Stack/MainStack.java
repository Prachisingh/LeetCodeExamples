package com.prachi.Stack;

/**
 * @author prachi
 */
public class MainStack {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.displayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.displayStack();
        System.out.println(stack.peep());
        stack.pop();
        stack.pop();
        stack.displayStack();
    }
}
