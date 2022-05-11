package sub3_1student_test;

public class Student {
    private static int serialNum = 1000;
    public String studentName;
    public int studentID;

    public Student(){
        serialNum++;
        this.studentID = serialNum;
    }

    public int getSerialNum(){
        return serialNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
