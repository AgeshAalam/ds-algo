package linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String str="agesh";
        char target='s';
       // System.out.println(searchChar( str, target));
        System.out.println(searchChar2( str, target));
    }
    static boolean searchChar2(String word,char target){
        if(word==null){
            return false;
        }
        for (char c:word.toCharArray()) {
            if(target==c){
                return true;
            }
        }
        return false;
    }
    static boolean searchChar(String s,char target){
        if(s==null){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(target==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
