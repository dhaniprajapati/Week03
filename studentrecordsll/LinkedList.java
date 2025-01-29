package linkedlist.studentrecordsll;

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add a new student record at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add a new student record at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add a new student record at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position == 0) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Node newNode = new Node(rollNumber, name, age, grade);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a student record by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        Node current = head;
        Node prev = null;

        if (current != null && current.rollNumber == rollNumber) {
            head = current.next;
            return;
        }

        while (current != null && current.rollNumber != rollNumber) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }

    // Search for a student record by Roll Number
    public Node searchByRollNumber(int rollNumber) {
        Node current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Display all student records
    public void displayRecords() {
        Node current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    // Update a student's grade by Roll Number
    public boolean updateGradeByRollNumber(int rollNumber, String newGrade) {
        Node current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

