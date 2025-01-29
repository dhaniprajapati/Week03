package linkedlist.ticketreservationsystem;

public class Main {
    public static void main(String[] args) {
        LinkedList ticketSystem = new LinkedList();

        // Adding tickets
        ticketSystem.addTicket(1, "Anshu", "DDLJ", "A1", "9:00 AM");
        ticketSystem.addTicket(2, "Shruti", "3 Idiots", "B5", "11:00 PM");
        ticketSystem.addTicket(3, "Shiks", "Avengers", "C10", "5:00 PM");

        // Display all tickets
        System.out.println("All booked tickets:");
        ticketSystem.displayTickets();

        // Searching for a ticket by customer name
        System.out.println("Searching tickets by customer name 'Anshu':");
        ticketSystem.searchByCustomerName("Anshu");

        // Searching for a ticket by movie name
        System.out.println("Searching tickets by movie name '3 Idiots':");
        ticketSystem.searchByMovieName("3 Idiots");

        // Removing a ticket by Ticket ID
        ticketSystem.removeTicket(2);
        System.out.println("Tickets after removing Ticket ID 2:");
        ticketSystem.displayTickets();

        // Calculating the total number of booked tickets
        int totalTickets = ticketSystem.countTotalTickets();
        System.out.println("Total number of booked tickets: " + totalTickets);
    }
}

