public class spy {
    public static String checkSpyNumber(int n) {
        int sum = 0;
        int product = 1; 
        while (n > 0) {
            int digit = n % 10; 
            sum += digit;     
            product *= digit;  
            n /= 10;          
        }
        if (sum == product) {
            return "Spy Number";
        }
        return "Not Spy Number";
    }
    public static void main(String[] args) {
        System.out.println(checkSpyNumber(1124));
        System.out.println(checkSpyNumber(123));  
    }
}
