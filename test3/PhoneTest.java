package test3;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个数组
        Phone[] arr = new Phone[3];
        //创建三个对象
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 4999, "蓝色");
        Phone p3 = new Phone("魅族", 3999, "红色");
        //将三个对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //计算三个手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        double avg = sum / arr.length;
        System.out.println("平均价格为：" + avg);
    }
}
