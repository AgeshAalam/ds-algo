package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={2,53,235,6,-9,6,11,90};
        int target=-9;
        int start=2;
        int end=6;
        System.out.println(search(arr,target,start,end));
    }
    static boolean search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for (int i = start; i < end; i++) {
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
