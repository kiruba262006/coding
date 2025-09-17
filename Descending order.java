import java.util.*;
public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // Ascending
        for (int i = 3; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
