package by.it.akulov.lesson05;

/*

Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

1 2 3 4 5 6 7 8 9 44 55 11 11 12 14 12 45 38 88 77

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDiv2 = new ArrayList<>();
        ArrayList<Integer> listDiv3 = new ArrayList<>();
        ArrayList<Integer> listOthers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(scan.nextInt());
        }
        for (int i = 0; i < 20; i++) {
            int a = list.get(i);
            if ((a % 2 == 0) && (a % 3 == 0)) {
                listDiv2.add(a);
                listDiv3.add(a);
            } else if (a % 3 == 0) {
                listDiv3.add(a);
            } else if (a % 2 == 0) {
                listDiv2.add(a);
            } else listOthers.add(a);
        }
        printList(listDiv3);
        printList(listDiv2);
        printList(listOthers);
    }
}
