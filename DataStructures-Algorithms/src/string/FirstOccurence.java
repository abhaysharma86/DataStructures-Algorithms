package string;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurence {
    public static void main(String[] args) {
        System.out.println(firstOccurence("abababc","ababc"));
    }

    public static int firstOccurence(String txt, String pat) {
        int size = txt.length();
        int m = pat.length();

        for(int i = 0; i < size; i++){

            int j = 0;

            if(txt.charAt(i) == pat.charAt(j)){
                boolean f = true;
                int x = 0;
                int c = i;
                while(x < m){
                    if(txt.charAt(c) != pat.charAt(j)){
                        f = false;
                        break;
                    }
                    x++;
                    c++;
                    j++;
                }
                if(f)
                    return i;
            }

        }

        return -1;
    }
}
