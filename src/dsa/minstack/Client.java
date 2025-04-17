package dsa.minstack;

public class Client {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(10);
        System.out.println(minStack.getMin());
    }
}
