package array;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr={2,53,235,6,-9,6,11,90};

        //swapNum(arr, 0, 4);
        //System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swapNum(arr,start,end);
            start++;
            end--;
        }
    }


    static void swapNum(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
