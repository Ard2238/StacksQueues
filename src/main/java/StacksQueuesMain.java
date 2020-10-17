public class StacksQueuesMain {
    StacksQueues stack;

    public StacksQueuesMain(){
        stack = new StacksQueues();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Stacks and Queues Program");

        StacksQueuesMain sqm = new StacksQueuesMain();
        sqm.stack.pushData(70);
        sqm.stack.pushData(30);
        sqm.stack.pushData(56);
    }
}
