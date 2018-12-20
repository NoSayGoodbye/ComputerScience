package by.it.akulov.lesson05;

/*

Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Ввод:
1 2 3 4 5 6 7 8 9 0

Вывод:
0 9

*/

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[array.length - 1];
        for (int j : array) {
            if (min > j) min = j;
            if (max < j) max = j;
        }
        System.out.println(min + " " + max);
    }
}
