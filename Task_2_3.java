/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Task_2_3 {
    public static void main(String[] args) {
        int n = 8;
        int s = 10; // размерность треугольника
        for (int i = 0; i <= s; i ++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
