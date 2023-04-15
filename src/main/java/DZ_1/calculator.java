package DZ_1;

/* Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить */

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите первое число: ");
        int num_1 = iScanner.nextInt();
        System.out.println("Введите оператор: +, -, /, * ");
        char operator = iScanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num_2 = iScanner.nextInt();
        int result = 0;
        switch (operator) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '/':
                result = num_1 / num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
        }
        System.out.printf("%s %s %s = %s", num_1, operator, num_2, result);
        iScanner.close();
    }
}

