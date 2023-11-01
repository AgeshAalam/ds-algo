package recursion;

public class BSUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int i = binarySearch(arr, 2, 0, arr.length - 1);
        System.out.println(i);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (target == arr[middle]) {
            return middle;
        }
        if (target < arr[middle]) {
            return binarySearch(arr, target, start, middle - 1);
        }
        return binarySearch(arr, target, middle + 1, end);
    }
}
