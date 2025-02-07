package stackandqueue;
import java.util.Stack;

public class StackSorting {
    //method to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // if the stack is empty
        if (!stack.isEmpty()) {
            // pop the first element and store it
            int topElement = stack.pop();
            // sort stack recursively
            sortStack(stack);
            // to store the popped element in the correct position
            insertSort(stack, topElement);
        }
    }
    //method to insert an element into a sorted stack
    public static void insertSort(Stack<Integer> stack, int element) {
        // if the stack is empty or the element is greater than the element at the top
        if (stack.isEmpty() || stack.peek() <= element) {
            //push the element back in the stack
            stack.push(element);
            return;
        }
        //pop the first element and store it
        int temp = stack.pop();
        //recursively insert the element in sorted order
        insertSort(stack, element);

        //push the top element back onto the stack
        stack.push(temp);
    }

    public static void main(String[] args) {
        //create stack
        Stack<Integer> stack = new Stack<>();
        //push elements
        stack.push(12);
        stack.push(3);
        stack.push(23);
        stack.push(56);
        stack.push(24);
        stack.push(2);
        stack.push(89);
        stack.push(76);
        //sort stack and print it.
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
