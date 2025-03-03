import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重:");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重:");
        int weight2 = sc.nextInt();
        String result = weight1 == weight2 ? "一样重" : "不一样重";
        System.out.println("两只老虎" + result);
    }
}