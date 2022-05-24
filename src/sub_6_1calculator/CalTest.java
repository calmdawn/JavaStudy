package sub_6_1calculator;

public class CalTest {
    public static void main(String[] args){
        ICalc calc = new Calculator();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.subtract(10, 5));
        System.out.println(calc.times(10, 5));
        System.out.println(calc.divide(10, 5));
        System.out.println(calc.PI);
        System.out.println(calc.ERROR);
    }
}
