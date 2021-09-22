package chapter2.ch24;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;

    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public void addSubject(String name, int point) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(point);

        subjects.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScorePoint();
            System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
