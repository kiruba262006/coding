import java.util.Scanner;
public class center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();  
        int len = num.length();
        if (len % 2 == 0) {
            System.out.println(-1); 
        } else
{
            int mid = len / 2;
            System.out.println(num.charAt(mid));  
        }
        sc.close();
    }
}
