public class GenericStackDriver {
    public static void main(String[] args) {
        // Create a stack with default size
        GenericStack<Integer> stack = new GenericStack<Integer>();
        System.out.println("Stack 1 (Default Size):");

        stack.push(Integer.valueOf(10));
        stack.push(Integer.valueOf(10));
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Top element: " + stack.peek());

        // Popping elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping elements: " + stack);
        System.out.println("Top element: " + stack.peek());

        // Removing element at specific index
        if (stack instanceof GenericStack<?>) {
            GenericStack<?> genericStack = (GenericStack<?>) stack;
            genericStack.remove(0);
            System.out.println("Stack after removing element at index 0: " + stack);
        }

        // Testing contains method
        System.out.println("Stack contains 30: " + stack.contains(30));
        System.out.println("Stack contains 40: " + stack.contains(40));

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.getTop());
    }
}
