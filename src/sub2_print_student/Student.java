package sub2_print_student;

public class Student {
    int studentID;
    String studentName;
    Subject subject;


    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subject = new Subject();
    }

    public void setKorean(String koreaSubject, int koreaScore) {
        subject.setKoreaSubject(koreaSubject);
        subject.setKoreaScore(koreaScore);
    }

    public void setMath(String mathSubject, int mathScore) {
        subject.setMathSubject(mathSubject);
        subject.setMathScore(mathScore);
    }

    public void showStudentInfo() {
        System.out.println("학생 " + studentName + "의 총점은 "
                + (subject.getKoreaScore() + subject.getMathScore()) + " 입니다.");
    }
}
