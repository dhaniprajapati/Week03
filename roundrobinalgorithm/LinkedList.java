package linkedlist.roundrobinalgorithm;

class LinkedList {
    Node head;
    Node tail;
    Node current;

    // Constructor to initialise the circular linked list
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Node newNode = new Node(processId, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // point tail's next to head to create the circular structure
        } else {
            tail.next = newNode;  // point tail's next to newNode
            tail = newNode;  // update tail to newNode
            tail.next = head;  // update tail's next to head
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("Process list is empty");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current.processId != processId) {
            if (current.next == head) {
                System.out.println("Process not found");
                return;
            }
            prev = current;
            current = current.next;
        }

        if (current == head) {
            tail.next = head.next;
            head = head.next;
        } else if (current == tail) {
            prev.next = head;
            tail = prev;
        } else {
            prev.next = current.next;
        }

        current.next = null;
    }

    // Simulate round-robin CPU scheduling with a fixed time quantum
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("Process list is empty");
            return;
        }

        Node current = head;
        int time = 0;

        while (head != null) {
            do {
                if (current.burstTime > 0) {
                    if (current.burstTime > timeQuantum) {
                        current.burstTime -= timeQuantum;
                        time += timeQuantum;
                        System.out.println("Process " + current.processId + " executed for " + timeQuantum + " units; remaining burst time: " + current.burstTime);
                    } else {
                        time += current.burstTime;
                        System.out.println("Process " + current.processId + " executed for " + current.burstTime + " units; process completed.");
                        // Keep reference to the next process before removing current process
                        Node nextProcess = current.next;
                        removeProcess(current.processId);
                        current = nextProcess;
                        if (head == null) break; // Break if the list becomes empty
                    }
                }
                current = current.next;
            } while (current != head); // Ensure the loop breaks if head becomes null
        }

        System.out.println("Total time taken: " + time + " units");
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("Process list is empty");
            return;
        }

        Node current = head;
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
}
