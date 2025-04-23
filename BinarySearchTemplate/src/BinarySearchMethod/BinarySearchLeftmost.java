package BinarySearchMethod;
//查找重复元素返回重复元素最左侧的索引

public class BinarySearchLeftmost {

    //未考虑返回值
    public static int binarySearchLeftmost1(int[] arr, int target) {
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
                j = mid - 1;
            }
        }
        return candidate;
    }

    //考虑返回值
    //当查找值不在数组中，返回的是比目标值大的最靠左的数的索引
    public static int binarySearchLeftmost2(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (target <= arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

}
