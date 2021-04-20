/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Task_3_5 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 2, 65, 3, 68};
        recursion(arr, arr.length - 1);
    }

    static void recursion( int[] arr, int i) {
        if (i == 0) {
            System.out.println(arr[0]);
        }
        else {
            recursion(arr, i - 1);
            System.out.println(arr[i]);
        }
    }
}
