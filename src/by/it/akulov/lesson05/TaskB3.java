package by.it.akulov.lesson05;

/*

Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Ввод:
123 99 88 77 66 5 4 3 0 2

Вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] m = new Integer[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = scan.nextInt();
        }
        int valFirst = m[0];
        int valLast = m[m.length - 1];
        Advanced.bubbleSortIncrease(m);
        System.out.println("Index of first element=" + Arrays.asList(m).indexOf(valFirst));
        System.out.println("Index of last element=" + Arrays.asList(m).indexOf(valLast));
    }
}
