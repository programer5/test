package chapter2.ch06;

public class Student {

    private int studentNumber;
    private String studentName;
    private int grade;

    public Student() {}
    
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    
    public String showStudentInfo() {

        return studentName + " 학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
