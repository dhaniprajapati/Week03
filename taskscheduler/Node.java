package linkedlist.taskscheduler;

class Node {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Node next;

    // Constructor to create a new node
    public Node(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;  // next pointer is initialised to null
    }
}
