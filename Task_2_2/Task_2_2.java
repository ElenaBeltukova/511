/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */
public class Task_2_2 {
    public static void main(String[] args) {
        int n1 = 10; // до скольки умножать
        int n2 = 10; // сколько цифр по горизонтали
        for (int i = 1; i <= n1; i ++) {
            for (int j = 1; j <= n2; j ++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
