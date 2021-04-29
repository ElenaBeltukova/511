/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileAddress = scanner.nextLine();
        //String fileAddress = "c://users/elena/hello.txt";
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader buff = new BufferedReader(new FileReader(fileAddress));
        String line;
        int num;

        while ((line = buff.readLine()) != null) {
            num = Integer.parseInt(line);
            if (num%2 == 0) {
                list.add(num);
            }
            System.out.println(num);
        }

        Collections.sort(list);

        System.out.println("Четные, отсортированные по возрастанию:");
        for(int counter: list){
            System.out.println(counter);
        }

        buff.close();
    }
}
