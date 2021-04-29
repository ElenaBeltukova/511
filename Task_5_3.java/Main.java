/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            arrList.add(scanner.nextInt());
        }

        for(Integer s : arrList) {
            if (s > 0 && s < 10) {
                arrList2.add(s);
            }
        }

        System.out.println(arrList);
        System.out.println(arrList2);
    }
}
