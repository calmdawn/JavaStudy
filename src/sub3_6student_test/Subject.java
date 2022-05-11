package sub3_6student_test;

public class Subject {
    private String lecture;
    private int score;

    public Subject(String lecture, int score) {
        this.lecture = lecture;
        this.score = score;
    }

    public String getLecture() {
        return lecture;
    }

    public int getScore() {
        return score;
    }
}
