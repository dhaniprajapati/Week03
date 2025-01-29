package linkedlist.roundrobinalgorithm;

class Node {
    int processId;
    int burstTime;
    int priority;
    Node next;

    // Constructor to create a new node
    public Node(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;  // next pointer is initialised to null
    }
}
