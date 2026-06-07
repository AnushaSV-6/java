//Find the first non-repeated character in a string.
import java.util.*;

public class FirstNonRepeated {
    public static char firstNonRepeated(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("aabbcdde"));
    }
}
