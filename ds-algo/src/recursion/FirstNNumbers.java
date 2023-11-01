package recursion;

public class FirstNNumbers {
    public static void main(String[] args) {
        int n=1;
         printNnumbers(n);
    }
    static void printNnumbers(int n){
        if(n==7){
            System.out.println(7);
            return ;
        }
        System.out.println(n);
         printNnumbers(n+1);
    }
}
