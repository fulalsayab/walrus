package com.fulPackage.practice;

/**
 * @author Ful Al Sayab
 **/
public class PollQuestion {
    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);
        System.out.println(b);

        int[] x = {1,2,3};
        int[] y;
        y = x;

        x = new int[]{2, 3};
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

    }
}
