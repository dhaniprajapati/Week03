package stackandqueue;

//importing Stack from java utility package
import java.util.Stack;
//creating class
public class QueueUsingTwoStacks
{
    //for Enqueue
    Stack<String> fullStack;
    //for Dequeue
    Stack<String> emptyStack;
    //initializing the stacks
    public QueueUsingTwoStacks()
    {
        fullStack= new Stack<>();
        emptyStack= new Stack<>();
    }
    //enqueue operation
    public void enqueue(String str)
    {
        fullStack.push(str);
    }
    //dequeue operation
    public String dequeue() {
        if(emptyStack.isEmpty())
        {
            //transfer elements from fullStack to emptyStack
            while(!fullStack.isEmpty())
            {
                emptyStack.push(fullStack.pop());
            }
        }
        //if emptyStack is still empty
        if(emptyStack.isEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        //return the top element from emptyStack
        return emptyStack.pop();
    }
    //check if the queue is empty
    public boolean isEmpty()
    {
        return fullStack.isEmpty() && emptyStack.isEmpty();
    }
    public static void main(String[] args)
    {
        //create object
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        //Enqueue elements
        queue.enqueue("ans");
        queue.enqueue("dha");
        queue.enqueue("pra");
        queue.enqueue("pri");
        queue.enqueue("shr");

        //Dequeue elements and print them
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //check if the queue is empty
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //check if the queue is empty
        System.out.println(queue.isEmpty());
        //exception as the queue is empty
        System.out.println(queue.dequeue());
    }
}
