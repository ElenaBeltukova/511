/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }

            names.add(family);
        }

        System.out.println(names);

        Set<String> set = new LinkedHashSet<>(names);

        names.clear();
        names.addAll(set);

        System.out.println(names);

    }
}
