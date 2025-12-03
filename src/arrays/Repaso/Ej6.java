package arrays.Repaso;

import java.util.Arrays;

public class Ej6 {
    public static void main(String[] args) {
        int[] a = {3, 3, 3};
        int[] b = a;
        b[0] = 8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] c = {1, 2, 3};
        int[] d = {1, 2, 3};

        System.out.println("== " + (c == d));
        System.out.println("equals " + c.equals(d));
        System.out.println(Arrays.equals(c, d));
    }
}
