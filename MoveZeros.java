//Given an array, move all 0s to the end while keeping the order of non-zero elements same.
public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
