  import java.util.Scanner;
public class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
        sc.close();
    }
}
