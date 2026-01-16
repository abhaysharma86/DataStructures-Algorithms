package string;

public class StringRotated_Two_Places {
    public static void main(String[] args) {
        System.out.println(isRotated("ma","am"));
    }
    public static boolean isRotated(String s1, String s2) {
        int si = s1.length();
        int sj = s2.length();

        if(si != sj){
            return false;
        }
        if(si == 1 && sj == 1 && !s1.equals(s2)){
            return false;
        }

        if(si == 1 && sj == 1 && s1.equals(s2)){
            return true;
        }
        String ed = s1.substring(si -2, si);
        String st = s1.substring(0, 2);

        String tmp = s1.substring(0,si-2);
        tmp = ed+tmp;
        if(tmp.equals(s2))
        {
            return true;
        }

        tmp = s1.substring(2,sj);
        tmp = tmp+st;
        if(tmp.equals(s2))
        {
            return true;
        }
        return false;
    }
}
