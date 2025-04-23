import java.util.Arrays;

import static BinarySearchMethod.BalancedBinarySearch.balancedBinarySearch;
import static BinarySearchMethod.BasicsBinarySearchAlternative.basicsBinarySearchAlternative;
import static BinarySearchMethod.BinarySearchBasics.basicsBinarySearch;
import static BinarySearchMethod.BinarySearchBasicsImprove1.basicsBinarySearchImprove1;
import static BinarySearchMethod.BinarySearchLeftmost.binarySearchLeftmost1;
import static BinarySearchMethod.BinarySearchLeftmost.binarySearchLeftmost2;
import static BinarySearchMethod.BinarySearchRightmost.binarySearchRightmost1;
import static BinarySearchMethod.BinarySearchRightmost.binarySearchRightmost2;

public class TestBinarySearch {
    public static void main(String[] args) {

        int[] arr = {7, 13, 21, 30, 31, 38, 38, 38, 44, 44, 52, 53};
        int index1 = basicsBinarySearch(arr, 13);
        System.out.println(index1); //1

        int index2 = basicsBinarySearchImprove1(arr, 13);
        System.out.println(index2); //1

        int index3 = basicsBinarySearchAlternative(arr, 13);
        System.out.println(index3); //1

        int index4 = balancedBinarySearch(arr, 13);
        System.out.println(index4); //1

        //java中的二分查找
        int index5 = Arrays.binarySearch(arr, 13);
        System.out.println(index5); //1
        //如果查找值不存在则返回插入索引
        int i = Arrays.binarySearch(arr, 8);
        System.out.println(i); //-2 = -插入点 - 1   插入点 = 1

        int index6 = binarySearchLeftmost1(arr, 38);
        System.out.println(index6); //5

        int index7 = binarySearchRightmost1(arr, 38);
        System.out.println(index7); //7

        int index8 = binarySearchLeftmost2(arr, 39);
        System.out.println(index8); //8

        int index9 = binarySearchRightmost2(arr, 39);
        System.out.println(index9); //7
    }
}
