package sub_6_1calculator;

public class Calculator implements ICalc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
