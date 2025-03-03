import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数:");
        int x = sc.nextInt();
        int temp = x;
        int num = 0;

        while (x != 0){
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }

        if (num == temp) {
            System.out.println("是回文数");
        }
    }
}

