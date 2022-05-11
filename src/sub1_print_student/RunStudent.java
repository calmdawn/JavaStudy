package sub1_print_student;

public class RunStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(1001);
        student.setName("홍길동");
        student.setGrade("2학년");
        student.printAll();

        System.out.println(student);
    }
}
