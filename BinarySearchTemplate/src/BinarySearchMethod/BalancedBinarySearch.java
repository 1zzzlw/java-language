package BinarySearchMethod;
//二分查找平衡版

public class BalancedBinarySearch {

    public static int balancedBinarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length;
        while (1 < j - i) {
            int mid = (i + j) >>> 1;
            if (target < arr[mid]) {
                j = mid;
            } else {
                i = mid;
            }
        }
        if (arr[i] == target) {
            return i;
        } else {
            return -1;
        }
    }
}
