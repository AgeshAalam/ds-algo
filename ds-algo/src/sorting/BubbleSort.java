package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 6, 5};
        //int[] arr = {1,2,3,4,5};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArray(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
