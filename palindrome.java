
public class palindrome {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int[] inputs = {121, 12321};
        for (int number : inputs) {
            System.out.println("Input: " + number);
            if (isPalindrome(number)) {
                System.out.println("Output: Palindrome");
            } else {
                System.out.println("Output: Not Palindrome");
            }
            System.out.println(); 
        }
    }
}
