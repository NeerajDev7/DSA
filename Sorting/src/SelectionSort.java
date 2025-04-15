import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int step = 0; step < arr.length - 1; step++) {
            int minIndex = step;
            for (int i = step + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
