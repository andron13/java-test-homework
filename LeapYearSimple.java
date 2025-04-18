package HW13;

public class LeapYearSimple {
    public static void main(String[] args) {
        leapYear(1990, 2150);
    }

    /*Программа находит високосные года в заданном диапазоне - (yearStart, yearEnd).
     * yearStart - начало диапазона, yearEnd - конец диапазона.*/

    public static void leapYear(int yearStart, int yearEnd) {
        for (int i = yearStart; i < yearEnd; i++) {
            if (i % 4 == 0) {
                System.out.println(i + "- високосный год");
            }
        }
    }
}