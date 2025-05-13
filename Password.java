package HW21;

/*Со звёздочкой. Сделайте генератор паролей. У пользователя компьютер должен спросить
длину пароля и должны ли содержаться только буквы или буквы и цифры.*/

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println(genPass());
    }

    private static String genPass() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите необходимую длину пароля: ");
        int length = input.nextInt();
        System.out.print("Теперь выберите тип пароля, написав 1 или 2, где 1 - пароль содержит только буквы, 2 - пароль содержит буквы и цифры: ");
        int choice = input.nextInt();
        String pass = "";
        if (choice == 1) {
            for (int i = 0; i < length; i++) {
                pass = pass + genString();
            }
        } else if (choice == 2) {
            for (int i = 0; i < length; i++) {
                double random = Math.random();
                if (random < 0.5) pass = pass + genString();
                else if (random >= 0.5) {
                    pass = pass + genDigits();
                }
            }
        }
        return pass;
    }

    private static char genChar() {
        int myRandom = (int) (Math.random() * ((90 - 65) + 1) + 65);
        return (char) myRandom;
    }

    private static String genString() {
        String result = "";
        double random = Math.random();
        if (random < 0.5) result = String.valueOf(genChar()).toLowerCase();
        else result = String.valueOf(genChar()).toUpperCase();
        return result;
    }

    private static int genDigits() {
        int result = (int) (Math.random() * 10);
        return result;
    }
}
