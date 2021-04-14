package javacourse.calculator;

public class ArabCalc {
    public void foo(String string) {
        try {
            String[] znaks = string.split("-");


            int num = Integer.parseInt(znaks[0]);
            int num2 = Integer.parseInt(znaks[1]);
            if (num < 1 || num > 10 || num2 < 1 || num2 > 10) {
                System.exit(0);
            }
            System.out.println("Результат вашей операции:" + (num - num2));

        } catch (Exception e) {
            try {
                String[] umnosh = string.split("\\*");
                int num = Integer.parseInt(umnosh[0]);
                int num2 = Integer.parseInt(umnosh[1]);
                if (num < 1 || num > 10 || num2 < 1 || num2 > 10) {
                    System.exit(0);
                }
                System.out.println("Результат вашей операции:" + (num * num2));
            } catch (Exception a) {
                try {
                    String[] pribav = string.split("\\+");
                    int num = Integer.parseInt(pribav[0]);
                    int num2 = Integer.parseInt(pribav[1]);
                    if (num < 1 || num > 10 || num2 < 1 || num2 > 10) {
                        System.exit(0);
                    }
                    System.out.println("Результат вашей операции:" + (num + num2));
                } catch (Exception b) {
                    String[] dili = string.split("/");
                    int num = Integer.parseInt(dili[0]);
                    int num2 = Integer.parseInt(dili[1]);
                    if (num < 1 || num > 10 || num2 < 1 || num2 > 10) {
                        System.exit(0);
                    }
                    System.out.println("Результат вашей операции:" + (num / num2));
                }

            }
        }
    }
}