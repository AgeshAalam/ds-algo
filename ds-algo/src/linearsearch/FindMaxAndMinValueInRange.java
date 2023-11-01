package linearsearch;

public class FindMaxAndMinValueInRange {

    public static void main(String[] args) {
        int[] arr={2,53,235,6,-9,6,11,90};
        int start=2;
        int end=6;
        System.out.println(search(arr,start,end));

    }
    static int search(int[] arr,int start,int end){
        int min=arr[start];
        if(arr.length==0){
            return -1;
        }
        for (int i = start+1; i < end; i++) {
            if(arr[i]<min){    //minimum value
            //if(arr[i]>max){   //maximum value
                min=arr[i];
            }
        }
        return min;
    }
}
