public class Test12 {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //print后面没有了ln说明打印出来的数字不会换行
        }
    }
}
