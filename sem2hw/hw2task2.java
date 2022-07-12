package sem2hw;

import java.util.Arrays;

public class hw2task2 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int triNum;
        for (int i = 1; i <=10; i++) {
            triNum = (i * (i + 1)) / 2;
            arr = expandArray(arr, triNum);
        }
        System.out.println("Triangle numbers for n = 10 are: "+Arrays.toString(arr));
    }

    public static int[] expandArray(int[] array, int num) {
        int[]coll = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            coll[i] = array[i];
        }
        coll[coll.length - 1] = num;
        return coll;
    }
}