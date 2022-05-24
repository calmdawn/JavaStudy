package sub_6_2schedule;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짦은 대기열을 보유한 상담원에게 배분합니다.");
    }
}
