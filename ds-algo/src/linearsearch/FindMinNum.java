package linearsearch;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {45,2,34,234,234,4,2341,-134,0,3};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min=arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
