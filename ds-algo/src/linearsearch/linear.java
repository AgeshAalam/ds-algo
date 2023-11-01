package linearsearch;

public class linear {
    static int searchNum1(int[] arr, int target) {
        if (arr.length == 0) {
             return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
                return index;
            }
        }
        return -1;
    }
    static int searchNum2(int[] arr,int target){
        for(int num:arr){
            if(num==target){
                return num;
            }
        }

        return Integer.MAX_VALUE;
    }


    public static void main(String[] args) {
        int[] arr = {45,2,34,234,234,4,2341,-134,0,3};
        int target = 4;

        //int index = searchNum1(arr, target);
        int index2 = searchNum2(arr, target);
            System.out.println("element found at " + index2 + " index");
    }
}
