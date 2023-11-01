package binarysearch;


public class OrderAgnostic {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 2;
        int search = search(arr, target);
        System.out.println(search);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start] < arr[end];
        while (start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end=mid-1;
                    }else
                        start=mid+1;
            }else {
                    if(target>arr[mid]){
                        start=mid+1;
                    }
                    else {
                        end=mid-1;
                    }
                }
        }
            return -1;
    }
}
