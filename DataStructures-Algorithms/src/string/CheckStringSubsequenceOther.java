package string;

public class CheckStringSubsequenceOther {
    public static void main(String[] args) {
        System.out.println(isSubSeq("AXY","YADXCP"));
    }
    public static boolean isSubSeq(String s1, String s2) {
        int j = 0;

        int curr = 0;
        for(int i = 0; i < s2.length(); i++){

            if(j >= s1.length()){
                break;
            }

            if(s1.charAt(j) == s2.charAt(i)){
                j++;
            }
        }

        if(j == s1.length()){
            return true;
        }

        return false;
    }
}
