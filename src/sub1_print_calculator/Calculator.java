package sub1_print_calculator;

public class Calculator {
    private double num1;
    private double num2;
    int num3;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }

    public String div() {
        if (num2 == 0)
            return "0으로 나눌 수 없습니다.";
        return String.valueOf(num1 / num2);
    }

    public double mul() {
        return num1 * num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void printAll() {
        System.out.println("두 수 더하기 : " + add());
        System.out.println("두 수 빼기 : " + sub());
        System.out.println("두 수 나누기 : " + div());
        System.out.println("두 수 곱하기 : " + mul());
    }
}
