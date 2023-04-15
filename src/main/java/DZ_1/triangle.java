package DZ_1;

/*1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Перейти по ссылке, реализовать формулу на Java.*/

import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println(tri(number));
        } else {
            System.out.print("Некорректный ввод");
        }

    }

    public static int tri(int num){
        int a = 1;
        if(num != 1){
           a =  num + (tri(num - 1));
        }
          return a;
    }
}

