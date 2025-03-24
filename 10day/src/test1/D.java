//身份证的信息查看
package test1;

public class D {
    public static void main(String[] args) {
        String s = "321281202001011234";
        //获取出生年月日
        String year = s.substring(6, 10);
        String month = s.substring(10, 12);
        String day = s.substring(12, 14);

        //人物信息
        System.out.println("人物信息为:");
        System.out.println("出生日期为" + year + "年" + month + "月" + day + "日");
        //获取性别
        //int sex = Integer.parseInt(s.substring(16, 17));
        int sex = s.charAt(16) - '0';

        if (sex % 2 == 0) {
            System.out.println("女");
        } else {
            System.out.println("男");
        }

    }
}
