package by.it.akulov.lesson05;

import java.util.Scanner;

class Advanced {
    // заполнение массива
    static void arrayFilling(Integer[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
    }

    // сортировка по возрастанию методом "пузырька"
    static void bubbleSortIncrease(Integer[] array) {
        int a = array.length - 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                if (array[j] > array[j + 1]) {
                    // меняем местами array[j] и array[j+1]
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
    }

    // сортировка по убыванию методом "пузырька"
    static void bubbleSortDescending(Integer[] array) {
        int a = array.length - 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                if (array[j] < array[j + 1]) {
                    // меняем местами array[j] и array[j+1]
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
    }

    // печать массива на экран
    static void printArray(Integer[] array) {
        for (int x : array) System.out.println(x);
        System.out.println();
    }

//==========================================================================//
//                  ==========    QUICK SORT    ==========                  //
//==========================================================================//

    /*
    Данная функция принимает последний элемент массива за опорный элемент,
    затем располагает его в корректную позицию в отсортированном массиве и
    располагает меньшие элементы (меньше опорного) слева, а элементы больше
    (больше опорного) справа.
    */

    private static int partition(Integer[] array, int low, int high) {
        int pivot = array[high];
        // индекс наименьшего элемента
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // если текущий элемент меньше либо равен опорному
            if (array[j] >= pivot) {
                i++;
                // меняем местами array[i] и array[j]
                int k = array[i];
                array[i] = array[j];
                array[j] = k;
            }
        }
        // меняем местами arr[i+1] и arr[high] (опорный элемент)
        int k = array[i + 1];
        array[i + 1] = array[high];
        array[high] = k;
        return i + 1;
    }

    static void sort(Integer[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            // рекурсивная сортировка элементов до и после применения функции partition
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }
}
