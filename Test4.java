import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个整数:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int num = 0;

        while(num + b <= a){
            num += b;
            count ++;
        }

        System.out.println("商是" + count);
        System.out.println("余数是" + (a - num));
    }
}
