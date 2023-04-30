package Seminar;
/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class t_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

