 import java.util.Scanner;
public class CustomerGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int gender = sc.nextInt(); // 1 = Male, 2 = Female
        if (gender == 1) {
            if (age < 25) {
                System.out.println("Group 1");
            } else if (age <= 45) {
                System.out.println("Group 3");
            } else {
                System.out.println("Group 5");
            }
        } else if (gender == 2) {
            if (age < 25) {
                System.out.println("Group 2");
            } else if (age <= 45) {
                System.out.println("Group 4");
            } else {
                System.out.println("Group 5");
            }
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
