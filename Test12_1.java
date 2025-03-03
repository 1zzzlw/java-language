public class Test12_1 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int temp = 0;

        for (int i = 0,j = arr.length - 1; i < j; i++, j--) {

            if (i < j) {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
