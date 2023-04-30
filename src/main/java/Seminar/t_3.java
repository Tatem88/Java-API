package Seminar;
import java.util.*;


public class t_3 {
        public static void main(String[] args) {
//        arrayVsLinkedLists();
            // string~2
            // java~5
            // print~5 -> java
            // print~2 -> string
            // python~6
            // print~6 -> python
            // print~6 -> (null или ошибка или какое-то информационное сообщение)

            // [null, null, string, null, null, java] // ArrayList []
            // [["string", 2], ["java", 5]]

            // text~2 [null, null, text]
            // java~2
            // print~2 -> java
            Scanner sc = new Scanner(System.in);
            List<List<String>> storage = new ArrayList<>(); // LinkedList
            root: while (true) {
                String command = sc.nextLine();
                if ("exit".equals(command)) {
                    break;
                }

                String[] arguments = command.split("~");
                if (arguments.length != 2) {
                    System.err.println("Некорректный ввод");
                    continue;
                }
                String text = arguments[0];
                String num;
                try {
                    Integer.parseInt(arguments[1]);
                    num = arguments[1];
                } catch (NumberFormatException e) {
                    System.err.println("Некорректный ввод");
                    continue;
                }

                if ("print".equals(text)) {
                    Iterator<List<String>> iterator = storage.iterator();
                    while (iterator.hasNext()) {
                        List<String> pair = iterator.next();
                        if (num.equals(pair.get(1))) { // num
                            System.out.println(pair.get(0)); // text
                            iterator.remove();
                            continue root;
                        }
                    }
                    System.err.println("Не найдено значение с индексом " + num);
                } else {
                    // Пытаемся найти пару, у которой индекс равен num
                    for (List<String> pair: storage) { // pair [text, index]
                        if (num.equals(pair.get(1))) {
                            pair.set(0, text); // нашли пару, меняем значение (text)
                            continue root;
                        }
                    }

                    storage.add(Arrays.asList(text, num));
                }
            }
        }

        /**
         * Реализовать консольное приложение, которое:
         * Принимает от пользователя строку вида text~num
         * <p>
         * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
         * 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         * 3. Если введено exit, то завершаем программу
         */

        private static void arrayVsLinkedLists() {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            System.out.println("ArrayList: " + timer(arrayList));
            System.out.println("LinkedList: " + timer(linkedList));

            // ArrayList -> array[10] [null, null, null, ..., null]
            // [0, 10, 20, null, null, ..., 100, null, null, null, null, null, ..., null]

            // LinkedList
            // first = [0]
            // [0] <-> [1] <-> [2] <-> [3] <-> [4] <-> [5]
            // last = [5]
        }

        private static long timer(List<Integer> list) {
            // Moscow - UTC+3
            long start = System.currentTimeMillis(); // количество милисекунд, прошедших с 1 января 1970 года по UTC-0
            for (int i = 0; i < 100_000; i++) {
                list.add(i);
            }
            long end = System.currentTimeMillis();
            return end - start; // столько милисекунд заняло выполнение куска года
        }

    }

