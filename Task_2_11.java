/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Task_2_11 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 6, 7};
        int sum = 0, maxSum = 10;

        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
           if (sum > maxSum) {
               System.out.println(i+1);
               break;
           }
        }

    }
}
