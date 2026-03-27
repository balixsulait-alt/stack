//java main
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing the Stack API:");
        Stack<Integer> stack = new Stack<>();

        System.out.println("Stack isEmpty? " + stack.isEmpty());

        System.out.println("Pushing 10, 20, 30...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack isEmpty? " + stack.isEmpty());
    }
}
