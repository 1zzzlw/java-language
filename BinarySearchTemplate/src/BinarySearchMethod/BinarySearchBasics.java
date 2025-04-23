package BinarySearchMethod;
//二分查找的基础写法

public class BinarySearchBasics {

    public static int basicsBinarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (target < arr[mid]) {
                j = mid - 1;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
