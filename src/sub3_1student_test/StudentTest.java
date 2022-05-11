package sub3_1student_test;

public class StudentTest {
    public static void main(String[] args){
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.getSerialNum());
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.getSerialNum());
        System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);


    }
}
