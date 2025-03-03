import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数:");
        int num = sc.nextInt();
        String n = Exist(arr, num);
        System.out.println(n);
    }

    public static String Exist(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return "存在";
            }
        }
        return "不存在";
    }
}