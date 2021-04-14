package javacourse.calculator;

public class RomeCalc {
    public void foo(String string) {
        String[] array = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "IXL", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLIII", "IL", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "IXC", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "IC", "C"};
        String[] list = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        try {
            String[] minusRome = string.split("-");
            int x = 0;
            int y = 0;
            for (int i = 0; i < list.length; i++) {
                if (minusRome[0].equals(list[i])) {
                    x = i + 1;
                }
            }
            for (int i = 0; i < list.length; i++) {
                if (minusRome[1].equals(list[i])) {
                    y = i + 1;
                }
            }
            if ((x  == 0) || (y == 0)) {
                System.out.println("Вы ввели неверные данные. Работа завершается.");
                System.exit(0);
            }

            System.out.println("Результат вашей операции:" + list[x - y - 1]);


        } catch (Exception p) {
            try {
                String[] plusRome = string.split("\\+");
                int x = 0;
                int y = 0;
                for (int i = 0; i < list.length; i++) {
                    if (plusRome[0].equals(list[i])) {
                        x = i + 1;
                    }
                }
                for (int i = 0; i < list.length; i++) {
                    if (plusRome[1].equals(list[i])) {
                        y = i + 1;
                    }
                }
                if ((x  == 0) || (y == 0)) {
                    System.out.println("Вы ввели неверные данные. Работа завершается.");
                    System.exit(0);
                }
                System.out.println("Результат вашей операции:" + array[x + y]);
            } catch (Exception t) {
                try {
                    String[] umnoshRome = string.split("\\*");
                    int x = 0;
                    int y = 0;
                    for (int i = 0; i < list.length; i++) {
                        if (umnoshRome[0].equals(list[i])) {
                            x = i + 1;
                        }
                    }
                    for (int i = 0; i < list.length; i++) {
                        if (umnoshRome[1].equals(list[i])) {
                            y = i + 1;
                        }
                    }
                    if ((x  == 0) || (y == 0)) {
                        System.out.println("Вы ввели неверные данные. Работа завершается.");
                        System.exit(0);
                    }
                    System.out.println("Результат вашей операции:" + array[x * y]);
                } catch (Exception r) {
                    String[] deliRome = string.split("/");
                    int x = 0;
                    int y = 0;
                    for (int i = 0; i < list.length; i++) {
                        if (deliRome[0].equals(list[i])) {
                            x = i + 1;
                        }
                    }
                    for (int i = 0; i < list.length; i++) {
                        if (deliRome[1].equals(list[i])) {
                            y = i + 1;
                        }
                    }
                    if ((x  == 0) || (y == 0)) {
                        System.out.println("Вы ввели неверные данные. Работа завершается.");
                        System.exit(0);
                    }
                    System.out.println("Результат вашей операции:" + array[x / y]);
                }

            }
        }
    }
}