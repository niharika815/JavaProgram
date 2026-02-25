import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    double marks;

    Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class StudentManagementSystem {

    public static double calculateAverage(Student[] students, int count) {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].marks;
        }
        return (count > 0) ? sum / count : 0;
    }

    public static void searchStudent(Student[] students, int count, int roll) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (students[i].rollNumber == roll) {
                students[i].displayStudent();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100]; 
        int count = 0;
        int choice;

        do {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < students.length) {
                        System.out.print("Enter Roll Number: ");
                        int roll = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        students[count] = new Student(roll, name, marks);
                        count++;

                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student limit reached!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students to display.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            students[i].displayStudent();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    searchStudent(students, count, searchRoll);
                    break;

                case 4:
                    double avg = calculateAverage(students, count);
                    System.out.println("Average Marks: " + avg);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
