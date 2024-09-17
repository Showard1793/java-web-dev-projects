package org.launchcode;

import java.util.Objects;

public class Student {

    //Fields
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //Constructor
    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //Overloaded Constructors
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    //Constructor that auto-gives ID
    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    //Getters and Setters

        //Name
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        //Student ID
        public int getStudentId() {
            return studentId;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        //Number of Credits
        public int getNumberOfCredits() {
            return numberOfCredits;
        }
        public void setNumberOfCredits(int numberOfCredits) {
            this.numberOfCredits = numberOfCredits;
        }

        //GPA
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

    //Methods
    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    //TODO: Uncomment and complete the getGradeLevel method here

    public String getGradeLevel(int creditsEarned){
        if (creditsEarned <= 29) {
            return "freshman";
        } else if (creditsEarned <= 59) {
            return "sophmore";
        } else if (creditsEarned <= 89){
            return "junior";
        } else {
            return "senior";
        }
    }

    // TODO: Complete the addGrade method.

    public void addGrade(int courseCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    public String toString() {

        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }



    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }


//

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Student stephen = new Student("Stephen", 2, 1,4.0);


        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}