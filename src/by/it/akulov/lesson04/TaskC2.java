package by.it.akulov.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int[] yearMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayNumber;
        //if ((day > 0 && day < 32) && (month > 0 && month < 13)) {
        if (month == yearMonth[0]) {
            dayNumber = day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[1]) {
            //if (day < 29) {
            dayNumber = daysInMonth[0] + day;
            System.out.println(dayNumber);
            //} else System.out.println("2018 год не високосный! В феврале 28 дней.");
        }
        if (month == yearMonth[2]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[3]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[4]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[5]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[6]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] +
                    daysInMonth[5] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[7]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] +
                    daysInMonth[5] + daysInMonth[6] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[8]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] +
                    daysInMonth[5] + daysInMonth[6] + daysInMonth[7] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[9]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] +
                    daysInMonth[5] + daysInMonth[6] + daysInMonth[7] + daysInMonth[8] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[10]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] +
                    daysInMonth[5] + daysInMonth[6] + daysInMonth[7] + daysInMonth[8] + daysInMonth[9] + day;
            System.out.println(dayNumber);
        }
        if (month == yearMonth[11]) {
            dayNumber = daysInMonth[0] + daysInMonth[1] + daysInMonth[2] + daysInMonth[3] + daysInMonth[4] +
                    daysInMonth[5] + daysInMonth[6] + daysInMonth[7] + daysInMonth[8] + daysInMonth[9] + daysInMonth[10] + day;
            System.out.println(dayNumber);
        }
        //} else System.out.println("Введённого Вами месяца либо дня не существует!");
    }
}
