import java.util.Scanner;

class Student 
{
    // Private Data Members (Encapsulation)
    private String name;
    private int[] marks;
    private double average;
    private char grade;

    // Constructor
    Student(String name, int[] marks) 
    {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() 
    {
        int sum = 0;

        for(int i = 0; i < marks.length; i++) 
        {
            sum = sum + marks[i];
        }

        average = (double) sum / marks.length;
        return average;
    }

    // Method to assign grade
    public char assignGrade() 
    {
        if(average >= 90)
            grade = 'A';
        else if(average >= 75)
            grade = 'B';
        else if(average >= 60)
            grade = 'C';
        else if(average >= 50)
            grade = 'D';
        else
            grade = 'F';

        return grade;
    }

    // Method to display student details
    public void displayDetails() 
    {
        System.out.println("\nStudent Name: " + name);

        System.out.print("Marks: ");
        for(int mark : marks) 
        {
            System.out.print(mark + " ");
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradingSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Taking student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Taking number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Taking marks input
        System.out.println("Enter marks:");
        for(int i = 0; i < n; i++) 
        {
            marks[i] = sc.nextInt();
        }

        // Creating object
        Student s1 = new Student(name, marks);

        // Calling methods
        s1.calculateAverage();
        s1.assignGrade();
        s1.displayDetails();
    }
}