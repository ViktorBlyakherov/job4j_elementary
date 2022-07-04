package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double restOfLoan = amount;
        while (restOfLoan > 0) {
            restOfLoan = restOfLoan + restOfLoan / 100 * percent;
            restOfLoan = restOfLoan - salary;
            year++;
        }
        return year;
    }
}
