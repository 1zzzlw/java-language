import java.util.Random;

/*数字加密
某系统的数字密码（大于0），比如1983，采用加密方式进行传输，
规则如下：
首先将每位数字加上5,然后用和除以10的余数代替该数字，
再将第一位和第四位交换，第二位和第三位交换。
按照上述规则进行加密*/
public class Test22 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(7) + 3;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.print("加密前的密码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = 0 ,j = arr.length - 1; i < arr.length; i++) {
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.print("\n加密后的密码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
