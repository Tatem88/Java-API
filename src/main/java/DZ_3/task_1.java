package DZ_3;
/*
Реализовать алгоритм сортировки слиянием
 */


import java.util.Arrays;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);
        System.out.println("Сгенерированный список: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Список после слияния: " + Arrays.toString(arr));
    }
    private static void mergeSort(int[]arr)
    {
        int full= arr.length;
        if (full == 1) return;
        int middle = full/2;
        int[]left = new int[middle];
        int[]right = new int[full-middle];
        for (int i = 0; i < middle; i++) left[i] = arr[i];
        for (int i = middle; i < full; i++) right[i- middle] = arr[i];
        mergeSort(left);
        mergeSort(right);
        int counter = 0, i = 0, j = 0;
        while(i<left.length && j < right.length)
            if (left[i] < right[j])
                arr[counter++] = left[i++];
            else
                arr[counter++] = right[j++];

        for (int ii = i; ii < left.length; ii++)
            arr[counter++] = left[ii];
        for (int jj = j; jj < right.length; jj++)
            arr[counter++] = right[jj];
    }
}
