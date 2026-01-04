package string;

public class TheModifiedString {
    public static void main(String[] args) {
        System.out.println(modified("ooooweeedxxxlwxxxxngvvtggggmmzzhhtfmmmeekuuvjjjjjjjjppptfibhlnnbvngcc"));
    }
    public static int modified(String s) {
        int s1 = s.length();
        int count = 0;
        int temp = 1;
        for(int i = 1; i < s1; i++){
            if(s.charAt(i - 1) == s.charAt(i)){
                temp++;
            }else{
                if(2 < temp){
                    count+=(temp - 1)/2;
                }
                temp = 1;
            }

        }
        if(2 < temp){
            count+=(temp - 1)/2;
        }
        return count;

    }
}
