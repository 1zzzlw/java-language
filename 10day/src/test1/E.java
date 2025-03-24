//敏感词替换
//用到了 String replace(旧日值,新值)替换
package test1;

public class E {
    public static void main(String[] args) {
        String s = "你玩的真好，以后不要在玩了，TMD";
        //定义敏感词数组
        String[] arr = {"TMD", "SB", "你妈逼"};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            s = s.replace(arr[i], "***");
        }
        System.out.println(s);
    }
}
