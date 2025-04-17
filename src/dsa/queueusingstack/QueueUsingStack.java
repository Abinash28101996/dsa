package dsa.queueusingstack;

import java.util.Stack;

public class QueueUsingStack<T> {

    private final Stack<T> stack = new Stack<>();
    private final Stack<T> poppedStack = new Stack<>();

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        if (poppedStack.isEmpty()) {
            while (!stack.isEmpty()) {
                poppedStack.push(stack.pop());
            }
        }
        return poppedStack.pop();
    }

    public T peek() {
        if (poppedStack.isEmpty()) {
            while (!stack.isEmpty()) {
                poppedStack.push(stack.pop());
            }
        }
        return poppedStack.peek();
    }

    public boolean isEmpty() {
        if (stack.isEmpty() && poppedStack.isEmpty()) {
            return true;
        }
        return false;
    }
}
