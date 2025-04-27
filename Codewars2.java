import java.util.Scanner;

public class Codewars2 {
    public static void main(String[] args) {
        split(1);
        System.out.println("Write your email please.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(emailMaker(scanner.next()));
        split(2);
        System.out.println(calculate(2, '+', 4)); //Should return 6
        System.out.println(calculate(6, '-', 1.5)); //Should return 4.5
        System.out.println(calculate(-4, '*', 8)); //Should return -32
        System.out.println(calculate(49, '/', -7)); //Should return -7
        System.out.println(calculate(8, 'm', 2)); //Should return null
        System.out.println(calculate(4, '/', 0)); //should return null
    }

    public static void split(int task){
        System.out.println("---------------------------" + task + "-------------------------------");
    }

    public static double calculate(double firstNumber, char temp, double secondNumber) {
        double result = 0;
        switch (temp) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
        }
        if (temp == '/' && firstNumber == 0) {
            return 0;
        }
        if (temp == '/' && secondNumber == 0) {
            return 0;
        }
        return result;
    }

    public static String emailMaker(String email) {
        if (email.length() > 1) {
            String result = "";
            for (int i = 0; i < email.length(); i++) {
                char currentChar = email.charAt(i);
                if (currentChar == '@') {
                    result += " [at] ";
                } else if (currentChar == '.') {
                    result += " [dot] ";
                } else {
                    result += currentChar;
                }
            }
            return result;
        } else return "You need to write your email.";
    }
}

