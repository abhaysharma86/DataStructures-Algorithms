package string;

public class NaivePatternSearch {
    public static void main(String[] args) {
        String S = "lkjsdfhaiuehaoewiuraoikdehjakdsfhlsjdkihalieushralkehfailuewhfaklfjsdhfliuewahf";
        String P = "ahf";
        System.out.println(search(P,S));
    }

//    lkjsdfhaiuehaoewiuraoikdehjakdsfhlsjdkihalieushralkehfailuewhfaklfjsdhfliuewahf
//            ahf

    static boolean search(String pat, String txt) {
        int s1 = txt.length();
        int s2 = pat.length();

        if(s1 < s2){
            return false;
        }

        if(pat == txt){
            return true;
        }


        for(int i = 0; i < s1 - (s2 - 1); i++){
            if(txt.substring(i, i + s2).equals(pat)){
                return true;
            }
        }
        return false;
    }
}
