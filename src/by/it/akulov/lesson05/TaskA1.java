package by.it.akulov.lesson05;

/*

Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Ввод
1 2 3 4 5 6 7 8 9 0

Вывод
0
9
8
7
6
5
4
3
2
1

*/

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 9; i >= 0; i--) {
            array[i] = sc.nextInt();
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
