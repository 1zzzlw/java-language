package test2;

import java.util.Scanner;

public class CarsTses {
    public static void main(String[] args) {
        //创建一个数组
        Cars[] arr = new Cars[3];

        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建对象
            Cars car = new Cars();
            //录入数据
            System.out.println("请输入第" + (i + 1) + "辆车的品牌：");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入第" + (i + 1) + "辆车的价格：");
            double price = sc.nextDouble();
            car.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "辆车的颜色：");
            String color = sc.next();
            car.setColor(color);
            //把对象添加到数组中
            arr[i] = car;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Cars car = arr[i];
            System.out.println(car.getBrand() + " " + car.getColor() + " " + car.getPrice());
        }

    }
}
