package BinarySearchMethod;
//二分查找改动版

public class BasicsBinarySearchAlternative {

    public static int basicsBinarySearchAlternative(int[] arr, int target) {
        int i = 0;
        int j = arr.length;                     //第一处改动
        while (i < j) {                         //第二处改动
            int mid = (i + j) >>> 1;
            if (target < arr[mid]) {
                j = mid;                        //第三处改动
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
