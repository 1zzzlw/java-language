package Test3;

import java.util.ArrayList;
import java.util.List;

public class test4_6_2 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int index = binarySearch(arr, 127);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (max + min) / 2;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
