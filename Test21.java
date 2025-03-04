//评委打分
import java.util.Random;

public class Test21 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int sum = 0;
        int arrange = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = max(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = min(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arrange = sum / arr.length;
        }
        System.out.println("评委评分为:" + arrange);
    }

    public static int[] max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return CreatNew(arr, max);
    }

    public static int[] min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return CreatNew(arr, min);
    }

    public static int[] CreatNew(int[] arr, int a) {
        int newArr[] = new int[5];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
