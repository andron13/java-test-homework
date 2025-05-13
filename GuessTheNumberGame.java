package HW21;

import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        guessTheNumberGame();
    }

    private static void guessTheNumberGame() {
        Scanner input = new Scanner(System.in);
        int rangeStart, rangeEnd, k = 0;
        System.out.println("Добро пожаловать в игру, где ты сможешь проверить свою интуицию!\n"
                + "Напиши числа, чтобы определить диапазон, в котором тебе предстоит угадать число.");
        rangeStart = input.nextInt();
        rangeEnd = input.nextInt();
        System.out.println("Диапазон загадывания от " + rangeStart + " до " + rangeEnd);
        System.out.println("Далее, напиши количество попыток, которое тебе понадобится.");
        k = input.nextInt();
        System.out.println("Выбранное количество попыток " + k);
        userNumber(rangeStart, rangeEnd, k);

    }

    private static int userNumber(int min, int max, int k) {
        int guessNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int userNumber = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= k; i++) {
            System.out.println("Попытка " + i + ", введите число");
            userNumber = input.nextInt();
            if (userNumber == guessNumber) {
                System.out.println("Ура! Ты отгадал число!");
                break;
            } else if (userNumber > guessNumber) {
                System.out.println("Загаданное число меньше, попробуй снова.");
            } else if (userNumber < guessNumber) {
                System.out.println("Загаданное число больше, попробуй снова.");
            }
        }
        System.out.println("Игра окончена! Возвращайся, чтобы сыграть снова :)");
        return guessNumber;
    }
}
