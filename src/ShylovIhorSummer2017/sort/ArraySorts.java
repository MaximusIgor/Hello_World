package ShylovIhorSummer2017.sort;
/*Написать приложение, в котором пользователь вводит 10 случайных целых числел
с клавиатуры. Данные сохраняются в массиве.
При вводе пользователь может совершит ошибку (не число) которую необходимо
корректным образом обработать (сообщить пользователю о ошибке и попросить ввести
данные повторно).
После ввода данных массив необходимо отсортировать (используя алгоритм пузырька - в
порядке возрастания, используя алгоритм выбором - в проядке убывания) и
отобразить на экране.
Пример работы программы:
Введите 10 чисел:
2
1
6
-100
еуые
Ошибка: допускается ввод только целых чисел. Повторите ввод
12
34
87
6
0
10
Введенный массив: [2,1,6, -100, 12, 34, 87, 6, 0, 10]
Сортировка пурзырьком: [-100, 0, 1, 2, 6, 6, 10, 12, 34, 87]
Сортировка выборкой: [87, 34, 12, 10, 6, 6, 2, 1, 0, -100]
Конец программы
*/

import java.util.Scanner;

public class ArraySorts {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int[] arr = new int[array.length];
        int temp;
        String[] sort = {"Сортировка выбором: ", "Пузырьковая сортировка: "};
        Scanner scan = new Scanner(System.in);
        String str;

        System.out.println("Ведите  " + n + " чисел");
        for (int i = 0; i < array.length; i++) {
            if (!scan.hasNextInt()) {
                System.out.println("Ошибка: допускается ввод только целых чисел. " +
                        "Пожалуйста,повторите ввод");
                scan.next();
                i--;
            } else {
                array[i] = scan.nextInt();
            }
        }
        System.out.println();

        for (int s = 0; s < sort.length; s++) {
            System.out.print(sort[s]);
            str = sort[s];
            System.out.println();
            System.out.println();
            System.out.print("Исходный массив: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                arr[i] = array[i];
            }
            System.out.println();

            if (str.equals(sort[0])) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print((i + 1) + "-й проход: " + "\n");
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] < arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                        for (int a = 0; a < arr.length; a++) {
                            System.out.print(arr[a] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                }
            } else if (str.equals(sort[1])) {
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.print((i + 1) + "-й проход: " + "\n");
                    for (int j = 0; j < arr.length - 1 - i; j++) {
                        if (j > 0) {
                            System.out.print("");
                        }
                        if (arr[j] > arr[j + 1]) {
                            int tmp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = tmp;
                        }
                        for (int a = 0; a < arr.length; a++) {
                            System.out.print(arr[a] + " ");
                        }
                        System.out.println();
                    }

                }

            }
        }
        System.out.println();
        System.out.println("Конец программы");
    }
}
