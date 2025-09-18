import java.util.Scanner;
public class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {   // check even
                sum += digit;
            }
            num /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
