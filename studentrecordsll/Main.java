package linkedlist.studentrecordsll;

public class Main {
    public static void main(String[] args) {
        LinkedList studentList = new LinkedList();

        //creating objects and adding student records
        studentList.addAtEnd(101, "Anshu", 22, "A");
        studentList.addAtEnd(102, "Dhani", 21, "B");
        studentList.addAtBeginning(103, "Princi", 22, "C");
        studentList.addAtPosition(1, 104, "Dhruv", 23, "D");

        //display all records
        studentList.displayRecords();

        //update grade
        studentList.updateGradeByRollNumber(102, "A");

        //delete a student by roll number
        studentList.deleteByRollNumber(103);

        //search for a student by roll number
        Node student = studentList.searchByRollNumber(102);
        if (student != null) {
            System.out.println("Found student: " + student.name);
        } else {
            System.out.println("Student not found");
        }

        //display all records after updates
        System.out.println("Records after update and delete:");
        studentList.displayRecords();
    }
}