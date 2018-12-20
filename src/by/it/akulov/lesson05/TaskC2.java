package by.it.akulov.lesson05;

/*

Задачка на сортировку
Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).

*/

public class TaskC2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[20];
        Advanced.arrayFilling(array);
        Advanced.bubbleSortDescending(array);
        System.out.println("Sorted array:");
        Advanced.printArray(array);
    }
}
