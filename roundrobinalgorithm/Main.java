package linkedlist.roundrobinalgorithm;

public class Main {
    public static void main(String[] args) {
        LinkedList processScheduler = new LinkedList();

        // Adding processes
        processScheduler.addProcess(1, 10, 1);
        processScheduler.addProcess(2, 5, 2);
        processScheduler.addProcess(3, 8, 3);

        // Display all processes
        System.out.println("All processes in the circular queue:");
        processScheduler.displayProcesses();

        // Simulate round-robin CPU scheduling with time quantum of 3 units
        processScheduler.simulateRoundRobin(3);

        // Display remaining processes after scheduling
        System.out.println("Remaining processes in the circular queue after scheduling:");
        processScheduler.displayProcesses();
    }
}
