import java.util.Scanner;
public class CenterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();   // read as string to easily check length
        int len = num.length();
        if (len % 2 == 0) {
            System.out.println(-1);   // even → no center digit
        } else {
            int mid = len / 2;
            System.out.println(num.charAt(mid));  // print center digit
        }
        sc.close();
    }
}
