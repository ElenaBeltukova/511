/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.*;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList> family = new HashMap<>();

        int i = 0;
        String city = "", name = "";
        while (true) {
            String scan = scanner.nextLine();

            if (i%2 == 0) {
                city = scan;
            } else {
                name = scan;
                List<String> surname = new ArrayList<>();
                surname.add(name);
                if (!family.containsKey(city)) {
                    family.put(city, (ArrayList) surname);
                } else {
                    family.get(city).add(name);
                }
                name = "";
                city = "";
            }
            i++;

            if (scan.isEmpty()) {
                break;
            }
        }

        //System.out.println(family);

        //Read the city
        System.out.println("Введите город: ");
        String citySearch = scanner.nextLine();

        if (family.containsKey(citySearch)) {
            System.out.println(family.get(citySearch));
        } else {
            System.out.println("Такого города нет в списке");
        }
    }
}
