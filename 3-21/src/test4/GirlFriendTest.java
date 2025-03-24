package test4;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建一个数组
        GirlFriend[] arr = new GirlFriend[4];
        //创建四个女朋友对象
        GirlFriend g1 = new GirlFriend("高圆圆",18,'女',"睡觉");
        GirlFriend g2 = new GirlFriend("赵又廷",19,'女',"打游戏");
        GirlFriend g3 = new GirlFriend("小丹丹",20,'女',"学习");
        GirlFriend g4 = new GirlFriend("小诗诗",21,'女',"运动");

        //把四个女朋友对象添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        //遍历数组
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }

        int avg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getGender() + " " + arr[i].getLike());
                count++;
            }
        }
        System.out.println("一共有" + count + "个");
    }
}
