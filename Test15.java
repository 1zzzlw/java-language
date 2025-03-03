public class Test15{
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        max(arr);
    }

    public static void max(int []arr) {

        int max = arr[1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println(max);
    }
}
