public class reverse {
    public static void main(String[] args) { 
        int num1 = 1234;
        int reversed1 = 0;
        int temp1 = num1;
        while (temp1 > 0) {
            int digit = temp1 % 10;
            reversed1 = reversed1 * 10 + digit; 
            temp1 = temp1 / 10; 
        }
        System.out.println(reversed1);
        int num2 = 560;
        int reversed2 = 0;
        int temp2 = num2;
        while (temp2 > 0) {
            int digit = temp2 % 10; 
            reversed2 = reversed2 * 10 + digit; 
            temp2 = temp2 / 10;
        }
        System.out.println(reversed2); 
    }
}
