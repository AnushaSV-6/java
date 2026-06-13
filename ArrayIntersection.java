//Find Intersection of Two Arrays

//Return common elements from two arrays.
import java.util.*;

class ArrayIntersection {
    public static List<Integer> intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.println(intersection(a, b));
    }
}
