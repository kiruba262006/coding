import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        System.out.println(str.length());
        sc.close();
    }
}
