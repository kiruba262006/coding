import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextInt();
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : num.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        boolean first = true;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (!first) System.out.print(", ");
            System.out.print(entry.getKey() + "→" + entry.getValue());
            first = false;
        }
    }
}
