//Find the duplicate number in an array containing n+1 integers.
import java.util.HashSet;

class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(arr));
    }
}
