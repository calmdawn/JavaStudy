package sub1_print_student;

public class
Student {
    private int id;
    private String name;
    private String grade;

    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void printAll(){
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
    }
}
