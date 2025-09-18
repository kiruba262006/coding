import java.util.Scanner;
public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();   // read number as string
        int len = num.length();
        if (len == 1) {
            // single digit → no change
            System.out.println(num);
        } else {
            // swap first and last characters
            char[] digits = num.toCharArray();
            char temp = digits[0];
            digits[0] = digits[len - 1];
            digits[len - 1] = temp;
            System.out.println(new String(digits));
        }
        sc.close();
    }
}
