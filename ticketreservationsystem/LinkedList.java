package linkedlist.ticketreservationsystem;

class LinkedList {
    Node head;
    Node tail;

    // Constructor to initialise the circular linked list
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a new ticket reservation at the end
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Node newNode = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // point tail's next to head to create the circular structure
        } else {
            tail.next = newNode;  // point tail's next to newNode
            tail = newNode;  // update tail to newNode
            tail.next = head;  // update tail's next to head
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current.ticketId != ticketId) {
            if (current.next == head) {
                System.out.println("Ticket not found");
                return;
            }
            prev = current;
            current = current.next;
        }

        if (current == head) {
            tail.next = head.next;
            head = head.next;
        } else if (current == tail) {
            prev.next = head;  // update prev's next to head
            tail = prev;  // update tail to prev
        } else {
            prev.next = current.next;
        }

        current.next = null;  // clear the next pointer of the removed node
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName + ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name
    public void searchByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node current = head;
        boolean found = false;
        do {
            if (current.customerName.equals(customerName)) {
                System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName + ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No ticket found for customer name: " + customerName);
        }
    }

    // Search for a ticket by Movie Name
    public void searchByMovieName(String movieName) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node current = head;
        boolean found = false;
        do {
            if (current.movieName.equals(movieName)) {
                System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName + ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No ticket found for movie name: " + movieName);
        }
    }

    // Calculate the total number of booked tickets
    public int countTotalTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}

