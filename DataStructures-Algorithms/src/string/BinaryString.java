package string;

public class BinaryString {
    public static void main(String[] args) {

        System.out.println(binarySubstring("01101"));

    }
    public static int binarySubstring(String s) {

        int size = s.length();
        int index = 0;
        int count = 0;
        while(index < size){
            if(s.charAt(index) == '1'){
                count++;
            }
        index++;
        }
        return count *(count - 1)/2;
    }
}
