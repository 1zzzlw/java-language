import java.util.Scanner;

//买飞机票
public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int price = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("经济舱请输入1,头等舱请输入2:");
        int kind = sc.nextInt();

        if (month >= 5 && month <= 10) {
            double Endprice = calc(price, kind, 0.85, 0.9);
            System.out.println("旺季机票价格为:" + Endprice);
        } else {
            double Endprice = calc(price, kind, 0.65, 0.7);
            System.out.println("淡季机票价格为:" + Endprice);
        }
    }

    public static double calc(int price, int kind, double v0, double v1) {

        double Endprice = 0;
        if (kind == 1) {
            Endprice = price * v0;
            return Endprice;
        } else {
            Endprice = price * v1;
            return Endprice;
        }
    }

}
