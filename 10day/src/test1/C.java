//手机号屏蔽
//用到了String substring(int beginindex, int endindex) 截取
package test1;

public class C {
    public static void main(String[] args) {
        String phone = "18539312155";
        String start = phone.substring(0, 3);
        String end = phone.substring(7);
        System.out.println(start + "****" + end);
    }
}
