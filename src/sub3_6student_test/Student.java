package sub3_6student_test;

import java.util.ArrayList;

public class Student {
    private int studentNum;
    private String name;
    private ArrayList<Subject> subjectArrayList;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
        this.subjectArrayList = new ArrayList<Subject>();
    }

    public void addSubject(String lecture, int score){
        subjectArrayList.add(new Subject(lecture, score));
    }

    public void showStudentInfo(){
        int sum = 0;
        for(Subject subject : subjectArrayList){
            System.out.println("학생 " + name + "의 " + subject.getLecture() + "성적은 " + subject.getScore() + "입니다.");
            sum = sum + subject.getScore();
        }
        System.out.println("학생 " + name + "의 " + "총점은 " + sum + " 입니다.");
    }

}
