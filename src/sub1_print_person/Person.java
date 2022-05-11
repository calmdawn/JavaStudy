package sub1_print_person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String married;
    private int child;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String isMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public void printAll() {
        System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다.");
        System.out.println("성별은 " + gender + "이며, " + married + "입니다. 자녀는 " + child + "명이 있습니다.");
    }
}
