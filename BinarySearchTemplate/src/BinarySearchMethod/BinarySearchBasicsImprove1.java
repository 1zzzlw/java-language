package BinarySearchMethod;
//二分查找的中间索引值的改进，防止查找较大数据的时候超出int类型的数值范围

public class BinarySearchBasicsImprove1 {

    public static int basicsBinarySearchImprove1(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            //无符号右移
            int mid = (i + j) >>> 1;
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
