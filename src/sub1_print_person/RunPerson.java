package sub1_print_person;

public class RunPerson {
    public static void main(String[] args){
        Person person = new Person("제인");

        person.setAge(30);
        person.setGender("여성");
        person.setMarried("기혼자");
        person.setChild(1);
        person.printAll();
    }
}
