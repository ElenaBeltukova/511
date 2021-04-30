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
        ArrayList<Persons> family = new ArrayList<>();
        boolean flag = false;
        int i = 0;
        String city = "", surname = "";
        while (true) {
            String scan = scanner.nextLine();

            if (i%2 == 0) {
                city = scan;
            } else {
                surname = scan;

                Persons f = new Persons(surname, city);
                family.add(f);

                surname = "";
                city = "";
            }
            i++;

            if (scan.isEmpty()) {
                break;
            }
        }

        //Read the city
        System.out.println("Введите город: ");
        String citySearch = scanner.nextLine();

        for (Persons f:family) {
            if (f.getCity().equals(citySearch)) {
                System.out.println(f.getSurname());
                flag = true;
            }
        }

        if (!flag) System.out.println("В этом городе никто не живет");

    }
}
