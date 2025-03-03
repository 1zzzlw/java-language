import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1; //随机数的范围是0~99,但是+1了所以就是1~100
        System.out.println("输入猜测的数字:");
        int x = 0;
        do {
            x = sc.nextInt();
            if (num == x){
                System.out.println("猜对了");
                break;
            }
            else if (num > x){
                System.out.println("猜小了");
                System.out.println("请重新输入:");
            }
            else{
                System.out.println("猜大了");
                System.out.println("请重新输入:");
            }
        }while(x != num);
    }
}
