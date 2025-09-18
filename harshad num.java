import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (original % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
