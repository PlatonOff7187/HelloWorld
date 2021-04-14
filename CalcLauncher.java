package javacourse.calculator;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CalcLauncher {
    public static void main(String[] args) throws Exception {
        System.out.println("В строчку введите арабское либо римское число от 1 до 10 после операция сложения деления вычитания или умножения и после второе число от 1 до 10 либо арабское либо римское");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArabCalc arabCalc = new ArabCalc();
        try {
            arabCalc.foo(string);
        } catch (Exception e) {
            RomeCalc romeCalc = new RomeCalc();
            romeCalc.foo(string);
        }
    }
}