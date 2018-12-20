package by.it.akulov.lesson05;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Ввод:
ONE
TWO
THREE
FOUR
FIVE
END

Вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (!(str = scanner.nextLine()).equals("END")){
            list.add(str);
        }
        System.out.println(list);
    }
}
