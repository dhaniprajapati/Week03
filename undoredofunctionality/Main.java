package linkedlist.undoredofunctionality;

public class Main {
    public static void main(String[] args) {
        LinkedList editor = new LinkedList(10);  // Limit the history to the last 10 states

        // Simulating text typing/actions
        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! How's your day?");
        editor.addState("Hello, World! How's your day? Good!");

        // Displaying current state
        System.out.println("Current State: " + editor.displayCurrentState());

        // Undo operation
        System.out.println("Undo: " + editor.undo());
        System.out.println("Current State after Undo: " + editor.displayCurrentState());

        // Redo operation
        System.out.println("Redo: " + editor.redo());
        System.out.println("Current State after Redo: " + editor.displayCurrentState());

        // Adding more states
        editor.addState("Hello, World! How's your day? Really good!");
        editor.addState("Hello, World! How's it going?");
        editor.addState("Hey there!");

        // Displaying current state
        System.out.println("Current State: " + editor.displayCurrentState());

        // Undo multiple times
        System.out.println("Undo: " + editor.undo());
        System.out.println("Undo: " + editor.undo());
        System.out.println("Current State after multiple Undos: " + editor.displayCurrentState());

        // Redo multiple times
        System.out.println("Redo: " + editor.redo());
        System.out.println("Redo: " + editor.redo());
        System.out.println("Redo: " + editor.redo());
        System.out.println("Current State after multiple Redos: " + editor.displayCurrentState());
    }
}

