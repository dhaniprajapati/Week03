package linkedlist.taskscheduler;

class LinkedList {
    Node head;
    Node tail;
    Node current;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // point tail's next to head to create the circular structure
        } else {
            newNode.next = head;  // point newNode's next to current head
            head = newNode;  // update head to newNode
            tail.next = head;  // update tail's next to new head
        }
    }

    // Add a task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // point tail's next to head to create the circular structure
        } else {
            tail.next = newNode;  // point tail's next to newNode
            tail = newNode;  // update tail to newNode
            tail.next = head;  // update tail's next to head
        }
    }

    // Add a task at a specific position
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position == 0) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == head) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        // If the new node is added at the end, update the tail
        if (newNode.next == head) {
            tail = newNode;
        }
    }

    // Remove a task by Task ID
    public void removeByTaskId(int taskId) {
        Node current = head;
        Node prev = null;
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        while (current.taskId != taskId) {
            if (current.next == head) {
                System.out.println("Task not found");
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
    }

    // View the current task and move to the next task
    public void viewCurrentTask() {
        if (current == null) {
            current = head;
        }
        System.out.println("Current Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
        current = current.next;
    }

    // Display all tasks in the list starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Node current = head;
        do {
            System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Node current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No task with the specified priority found");
        }
    }
}
