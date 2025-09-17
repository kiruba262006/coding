import java.util.Scanner;
public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0, evenSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println(oddSum + " " + evenSum);
        sc.close();
    }
}
