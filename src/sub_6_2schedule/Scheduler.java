package sub_6_2schedule;

public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
    default void dMethod(){
        System.out.println("λν΄νΈμ");
    }
}
