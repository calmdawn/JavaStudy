package sub_6_2schedule;

import java.util.Objects;
import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        Scheduler scheduler;
        String command = scan.nextLine();

        if(command.equals("R") || command.equals("r")){
            scheduler = new RoundRobin();
        }else if(command.equals("L") || command.equals("l")){
            scheduler = new LeastJob();
        }else if(command.equals("P") || command.equals("p")){
            scheduler = new PriorityAllocation();
        }else
            scheduler = null;

        if(scheduler != null){
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        }

    }
}
