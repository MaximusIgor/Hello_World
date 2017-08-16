package ShylovIhorSummer2017;

import java.util.Arrays;
// Написать рекурсивную процедуру для вывода на экран цифр натурального числа в обратном порядке.

public class Recursion {
    public static void main(String[]args){
        int [] a={1,2,3};
        int [] b={1,2,3};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reverse(b)));
    }

    private static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length>>1; i++) {
            arr[arr.length-1-i] ^= arr[i] ^= arr[arr.length-1-i];
            arr[i] ^= arr[arr.length-1-i];
        }
        return arr;
    }
}
