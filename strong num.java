import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLong()) return;
        long n = sc.nextLong();
        int[] fact = new int[10];
        fact[0]=1;
        for(int i=1;i<10;i++)
        fact[i] = fact[i-1]*i;
        long x = n;
        long sum = 0;
        while(x>0) {
            sum += fact[(int)(x%10)];
            x /= 10;
            if(sum > n) break;
        }
        if(n>0 && sum == n) 
          System.out.println("Strong Number");
        else if(n==0)
          System.out.println("Not Strong Number");
        else System.out.println("Not Strong Number");
        sc.close();
    }
}
