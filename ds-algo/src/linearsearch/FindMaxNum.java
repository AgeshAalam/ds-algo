package linearsearch;

public class FindMaxNum {
    public static void main(String[] args) {
        int[] arr = {45,2,34,234,234,4,2341,-134,0,3};
        System.out.println(maxvalue(arr));
    }

    //to find maxvalue
    static int maxvalue(int[] arr){
        int max=arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
