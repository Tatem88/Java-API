package DZ_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task_1 {
    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, завершаем программу
     *
     * Пример:
     * java
     * python
     * c#
     * print > [c#, python, java]
     * revert
     * print > [python, java]
     * kotlin
     * print > [kotlin, python, java]
     * revert
     * revert
     * revert
     * print > []
     * revert > Ошибка!
     * exit -> (Программа завершилась)
     */

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> memory = new ArrayList<>();

            while (true) {
                System.out.println("Введите команду:");
                String command = sc.nextLine();

                if (command.equals("print")) {
                    for (int i = memory.size() - 1; i >= 0; i--) {
                        System.out.println(memory.get(i));
                    }
                } else if (command.equals("revert")) {
                    {
                        System.err.println("Ошибка!");
                    }
                } else if (command.equals("exit")) {
                    break;
                } else {
                    memory.add(command);
                }
            }
        }
    }