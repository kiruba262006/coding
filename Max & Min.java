  import java.util.Scanner;
public class Q6_MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Max=" + a + " Min=" + b);
        } else {
            System.out.println("Max=" + b + " Min=" + a);
        }
        sc.close();
    }
}
