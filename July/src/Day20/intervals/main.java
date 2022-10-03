package Day20.intervals;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int a [][]= {{1,12},{243,45},{42,67}};
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=================");
        System.out.println(Arrays.toString(a));
        System.out.println("=================");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
        System.out.println("==================");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println();
        }
        System.out.println("===================");
        int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};




    }
}
