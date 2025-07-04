package mathematic;

public class ConvertCelsiusToFahrenheit {

    /*
    Input: C = 32
    Output: 89.6
    Explanation: Using the conversion formula of celsius to farhenheit , it can be calculated that, for 32 degree celsius, the temperature in Fahrenheit = 89.6
    */

    /*
    Input: C = 50
    Output: 122
    Explanation: Using the conversion formula of celsius to farhenheit, it can be calculated that, for 50 degree C, the temperature in Fahrenheit = 122.

    */
   /*
    Fahrenheit=(25*9/5)+32= ? + 32 = ?F
    */


    public static void main(String[] args) {
        int n = 32;
        double f = (n * 9.0 / 5) + 32;
        System.out.println(f);
    }

}
