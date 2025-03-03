import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数:");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= x / 2; i++){
            if (x % i == 0){
                count ++;
            }
        }
        if (count == 1){
            System.out.println(x + "是质数");
        }
        else {
            System.out.println(x + "不是质数");
        }
    }
}
