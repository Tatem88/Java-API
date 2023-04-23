package DZ_3;

import java.util.ArrayList;
import java.util.Random;

/*
 Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            digits.add(random.nextInt(10));
        System.out.println("Сгенерированный список целых чисел: " + digits);
        for (int i = 0; i < digits.size(); i++)
            if(digits.get(i)%2==0)digits.remove(i--);
        System.out.println("Список после удаления чётных чисел: " + digits);
    }

}
