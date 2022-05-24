package sub_6_2schedule;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println(" 고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다. ");
    }
}
