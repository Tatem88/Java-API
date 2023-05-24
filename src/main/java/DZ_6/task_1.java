package DZ_6;

/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(0, 128, 4,  "Win10", "black", "Asus"));
        laptops.add(new Laptop(1, 254, 8,  "Win11", "black", "Asus"));
        laptops.add(new Laptop(2, 254, 16,  "Win11", "silver", "Asus"));
        laptops.add(new Laptop(3, 512, 16,  "Dos", "black", "Lenovo"));
        laptops.add(new Laptop(4, 768, 16,  "None", "blue", "Acer"));
        laptops.add(new Laptop(5, 1024, 32,  "Win11", "red", "Sony"));
        laptops.add(new Laptop(6, 512, 32,  "Win11", "red", "Xiaomi"));
        laptops.add(new Laptop(7, 768, 64,  "Win11", "white", "Acer"));
        laptops.add(new Laptop(8, 512, 32,  "Win11", "silver", "Sony"));
        Filter(userRequest(), laptops);

    }

    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String ru = "Русский язык";
        System.out.println("Введите параметры для поиска. Параметры, которые не участвуют в поиске,оставьте пустыми:");
        System.out.print("Введите тип ОС:");
        userRequest.put("os_type", scanner.nextLine());
        System.out.print("Введите цвет корпуса:");
        userRequest.put("color", scanner.nextLine());
        System.out.print("Введите производителя:");
        userRequest.put("brand", scanner.nextLine());
        System.out.print("Введите минимальный объем жесткого диска:");
        userRequest.put("ssd_volume", scanner.nextLine());
        System.out.print("Введите минимальный объем оперативной памяти:");
        userRequest.put("ram_volume", scanner.nextLine());
        scanner.close();
        return userRequest;
    }

    public static void Filter(HashMap<String, String> userRequest, HashSet<Laptop> catalog) {
        Boolean noResultsFlag=true;
        for (Laptop nb : catalog) {
            if (userRequest.get("brand").equals(nb.getBrand()) || userRequest.get("brand") == "") {
                if (userRequest.get("color").equals(nb.getBrand()) || userRequest.get("color") == "") {
                    if (userRequest.get("os_type").equals(nb.getBrand()) || userRequest.get("os_type") == "") {
                        if ((nb.getSSDvolume() >= Integer.parseInt(userRequest.get("ssd_volume"))) &&
                                (nb.getRAMvolume() >= Integer.parseInt(userRequest.get("ram_volume")))) {
                            System.out.println(nb);
                            noResultsFlag=false;
                        }
                    }
                }
            }

        }
        if (noResultsFlag){
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}