package by.it.akulov.lesson05;

/*

Задачка на сортировку2
Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n).

*/

public class TaskC3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[20];
        Advanced.arrayFilling(array);
        int n = array.length - 1;
        Advanced.sort(array, 0, n);
        System.out.println("Sorted array:");
        Advanced.printArray(array);
    }
}
