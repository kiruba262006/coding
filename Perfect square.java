import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int root = (int)Math.sqrt(num);
        if (root * root == num) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
        sc.close();
    }
}
