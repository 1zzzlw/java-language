package BinarySearchMethod;

public class BinarySearchRightmost {

    //未考虑返回值
    public static int binarySearchRightmost1(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        //定义候选者
        int candidate = -1;
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (target < arr[mid]) {
                j = mid - 1;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                //记录后选者的位置
                candidate = mid;
                i = mid + 1;
            }
        }
        return candidate;
    }

    //考虑返回值
    //当查找值不在数组中，返回的是比目标值小的最靠右的数的索引
    public static int binarySearchRightmost2(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (target < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return j;
    }

}
