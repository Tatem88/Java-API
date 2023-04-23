package DZ_2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_3 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(task_3.class.getName());

        String currentPath = Paths.get("")
                .toAbsolutePath()
                .toString();

        String logsPath = currentPath + "\\logs.txt";

        FileHandler fh = new FileHandler(logsPath);
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        int[] sortArray = new int[] {12, 10, 4, 5, 3, 1, 2};
        System.out.println(Arrays.toString(sortArray));

        bubbleSort(sortArray, logger);
        System.out.println(Arrays.toString(sortArray));
    }

    public static void bubbleSort(int[] array, Logger logger) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    logger.info(Arrays.toString(array));
                }
            }
        }
    }
}
