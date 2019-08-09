package Student;

import java.util.Scanner;

public class Student {
    private String studentID;
    private double mediumScore;     // Điểm trung bình
    private int age;
    private String className;

    public Student() {
    }

    public Student(String studentID, double mediumScore, int age, String className) {
        this.studentID = studentID;
        this.mediumScore = mediumScore;
        this.age = age;
        this.className = className;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    public void inputInfo(Scanner input) {
        System.out.print("Student ID: ");
        studentID = input.nextLine();
        System.out.print("Medium Score: ");
        mediumScore = Double.parseDouble(input.nextLine());
        System.out.print("Age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Class Name: ");
        className = input.nextLine();
        System.out.println();
    }
    
    public void showInfo() {
        System.out.println("Student ID: "+studentID);
        System.out.println("Medium Score: "+mediumScore);
        System.out.println("Age: "+age);
        System.out.println("Class Name: "+className);
    }
    
    public boolean scholarship() {
        if(mediumScore > 8)
            return true;
        return false;
    }
}
