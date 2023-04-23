package DZ_3;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 15; i++)
            digits.add(random.nextInt(10));
        System.out.println("Сгенерированный список: " + digits);
        int max=digits.get(0),min=max;
        for (Integer digit : digits) {
            if (digit > max) max = digit;
            if (digit < min) min = digit;
        }
        double average=(max+min)/2.0;
        double minDiff=abs(average-digits.get(0));
        int ave = digits.get(0);
        for (Integer digit : digits) {

            if (abs(average - digit) < minDiff) {
                minDiff = abs(average - digit);
                ave = digit;
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + ave);

    }

}
