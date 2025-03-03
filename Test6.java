import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入大于等于2的整数:");
        int n = 0;
        int i = 0;

        do {
            n = sc.nextInt();

            if (n < 2) {
                System.out.println("输入错误请重新输入:");
            }

        }while (n < 2);

        do {
            if (i * i <= n){
                i ++;
            }
        }while (i * i <= n);

        System.out.println(n + "的平方分约等于" + (--i));
    }
}
