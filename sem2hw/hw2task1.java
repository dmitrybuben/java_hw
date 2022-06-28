package sem2hw;

import java.util.Arrays;

public class hw2task1 {
    public static void main(String[] args) {
        int[] array = {12, 2, 3, 56, 38, 41, 59, 62, 2};
        countSort(array);
        System.out.println("Sorted: "+Arrays.toString(array));
        System.out.println("Key index is: "+ binarySearch(array,0, array.length-1, 3));
    }

    public static int findMax(int[]array) {
        Arrays.sort(array);
        int max = array[array.length-1];
        System.out.println("Max value: "+max);
        return (max);
    }

    public static void countSort(int[]array) {
        int[]count = new int[findMax(array)+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]] += 1;
            }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
        }

    public static int binarySearch(int[] array, int min, int max, int key) {
        int searchIndex = 0;
        while (min <= max) {
            int mid = (min+max)/2;
            if (array[mid] < key) {
                min = mid + 1;
            } else if (array[mid] > key) {
                max = mid - 1;
            } else if (key == array[mid]) {
                searchIndex = mid;
                break;
            }
        }
        return searchIndex;
    }
}

