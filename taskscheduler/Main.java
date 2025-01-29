package linkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        LinkedList taskScheduler = new LinkedList();

        // Adding tasks
        taskScheduler.addAtEnd(1, "Task1", 2, "2025-01-26");
        taskScheduler.addAtBeginning(2, "Task2", 1, "2025-01-27");
        taskScheduler.addAtPosition(1, 3, "Task3", 3, "2025-01-28");

        // Display all tasks
        System.out.println("All tasks in the scheduler:");
        taskScheduler.displayAllTasks();

        // View current task and move to the next
        System.out.println("Viewing current task:");
        taskScheduler.viewCurrentTask();
        System.out.println("Viewing current task:");
        taskScheduler.viewCurrentTask();

        // Search for tasks by priority
        System.out.println("Tasks with priority 2:");
        taskScheduler.searchByPriority(2);

        // Remove a task by Task ID
        taskScheduler.removeByTaskId(3);
        System.out.println("Tasks after removing Task ID 3:");
        taskScheduler.displayAllTasks();
    }
}

