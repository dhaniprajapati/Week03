package stackandqueue;
//import Stack from utility package
import java.util.Stack;
//create class
public class StockSpan {
    public static void main(String[] args) {
        //initialize an array
        int[] prices= {89,23,45,12,90,70,72,78,80,100};
        //create an array to store calculated spans
        int[] spans = calculateSpan(prices);
        System.out.print("Spans: ");
        //run for loop to store each span
        for (int span : spans) {
            System.out.print( span + " ");
        }
    }
    //method to calculate spans
    public static int[] calculateSpan(int[] prices)
    {
        //create a variable and initialize it with the length of the prices array
        int n= prices.length;
        //array to store spans
        int[] span= new int[n];
        // create stack
        Stack<Integer> stack= new Stack<>();
        //span at index 0 is 1 because there is no value before that
        span[0]=1;
        //push first index at span array
        stack.push(0);

        //run loop to check prices
        for(int i=1;i<n;i++)
        {
            //run loop and pop the prices till the stack is not empty and the current price is greater than equal to the stack top price
            while(!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            //candition: if stack is empty,current index+1 or current index - stack top index
            span[i]=(stack.isEmpty() ? (i + 1) : (i - stack.peek()));
            //push current index in stack
            stack.push(i);
        }
        return span;
    }
}

