import java.util.Random;

public class Test11{
    public static void main(String[] args) {
        Random r = new Random();
        int []arr = new int [10];
        int sum = 0;
        int arrange = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];
        }

        arrange = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrange) {
                count ++;
            }
        }

        System.out.println("sum=" + sum);
        System.out.println("arrange=" + arrange);
        System.out.println(count);
    }
}
