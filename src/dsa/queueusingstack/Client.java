package dsa.queueusingstack;

public class Client {
    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        int pop = queue.pop();
//        System.out.println(pop);
        queue.push(5);
        int pop1 = queue.pop();
//        System.out.println(pop1);
        System.out.println(queue.peek());
    }
}
