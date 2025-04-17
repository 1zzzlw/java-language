package IOTest_14day;
/*需求:写一个登陆小案例。
步骤:
将正确的用户名和密码手动保存在本地的userinfo.txt文件中。保存格式为:username=zhangsan&password=123让用户键盘录入用户名和密码
比较用户录入的和正确的用户名密码是否一致如果一致则打印登陆成功
如果不一致则打印登陆失败
超过三次锁定
*/
import java.io.*;
import java.util.Scanner;
public class test_14_6 {
    public static void main(String[] args) throws IOException {
        File file = new File("IOPractice\\src\\IOTest_14day\\userinfo.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = br.readLine();
        String[] arr = str.split("&");
        String username = arr[0].split("=")[1];
        String password = arr[1].split("=")[1];
        int count = Integer.parseInt(arr[2].split("=")[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String name = sc.nextLine();
        System.out.println("输入密码：");
        String pass = sc.nextLine();
        if (count >= 3) {
            System.out.println("账户锁定");
            System.exit(0);
        }
        if (name.equals(username) && pass.equals(password)) {
            System.out.println("登入成功");
        } else {
            System.out.println("用户名或密码错误");
            count++;
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(arr[0] + "&" + arr[1] + "&count=" + count);
            bw.close();
        }
    }
}
