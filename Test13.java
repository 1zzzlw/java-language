import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
        Random r = new Random();
        int []arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {

            int num = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
