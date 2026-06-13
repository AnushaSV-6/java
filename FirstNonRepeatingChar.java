//Find First Non-Repeating Character
import java.util.LinkedHashMap;
import java.util.Map;

class FirstNonRepeatingChar {
    public static char firstNonRepeating(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String str = "swiss";

        System.out.println(firstNonRepeating(str));
    }
}
