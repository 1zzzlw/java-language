package Test3;
//快速排序

public class test4_6_7 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        //设置递归的出口
        if (start > end) {
            return;
        }

        //定义基准数
        int number = arr[i];

        //利用循环找到要交换的数字
        while (start != end) {
            //利用end从后面开始找，找到比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < number) {
                    break;
                }
                end--;
            }
            //利用start从前面开始找，找到比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > number) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //基准数归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的范围，重复上面的方法
        quickSort(arr, i , start - 1);
        //确定6右边的范围，重复上面的方法
        quickSort(arr, start + 1, j);

    }


}
