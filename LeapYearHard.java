package HW13;

public class LeapYearHard {
    public static void main(String[] args) {
        printLeapYear(1999); // не распечатается
        printLeapYear(2000); // распечатается
        printLeapYear(2004); // распечатается
        printLeapYear(2007); // не распечатается
        printLeapYear(2025); // не распечатается
    }


    // Программа проверяет: является год високосным или нет, сложным способом.
    public static void printLeapYear(int year) {
        if (leapYear(year)) System.out.println(year + "- високосный год");
    }

    public static boolean leapYear(int checkYear) {
        if (checkYear % 400 == 0) return true;
        else if (checkYear % 100 == 0) return false;
        else if (checkYear % 4 == 0) return true;
        else return false;
    }
}