package DZ_2;
/*
Посчитайте сколько драгоценных камней в куче обычных камней
 Пример:
jewels = “aB”, stones = “aaaAbbbB”
Результат в консоль ”a3B1”

 */
import java.util.Scanner;

public class task_0 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Драгоценных камней ");
        String jewels = iScanner.nextLine();
        System.out.printf("Обычных камней ");
        String stones = iScanner.nextLine();
        System.out.println(countJewels(jewels, stones));
        iScanner.close();
    }

    public static String countJewels(String jewels, String stones) {
        StringBuilder result = new StringBuilder();
        for (char jewel : jewels.toCharArray()) {
            int count = 0;
            for (char stone : stones.toCharArray()) {
                if (stone == jewel) {
                    count++;
                }
            }
            result.append(jewel).append(count);
        }

        return result.toString();
    }

}