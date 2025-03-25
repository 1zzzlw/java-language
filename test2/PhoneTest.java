package test2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为", 998);
        Phone p2 = new Phone("小米", 998);

        //打电话
        p1.Call(p1);
        //听歌
        p2.ListenMusic(p2);
    }
}
