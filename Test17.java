import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6, 8, 9};
        int[] arr2 = new int[arr1.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入索引范围:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr2 = copyOfRange(arr1, a, b);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static int[] copyOfRange(int[] arr1, int from, int to) {
        int[] arr2 = new int[to - from];

        for (int i = from; i < to; i++) {

            arr2[i - from] = arr1[i];
        }

        return arr2;
    }
}
