package linkedlist.ticketreservationsystem;

class Node {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Node next;

    // Constructor to create a new node
    public Node(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;  // next pointer is initialised to null
    }
}
