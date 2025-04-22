package MysTest_21day;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;

public class test_21_1 {
    public static void main(String[] args) throws UnknownHostException {
/*      static InetAddress getByName(string host) 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName() 获取此IP地址的主机名
        String getHostAddress() 返回文本显示中的IP地址字符串*/

        InetAddress adress = InetAddress.getByName("LAPTOP-TBJKHT5V");
        System.out.println(adress);

        String name = adress.getHostName();
        System.out.println(name);

        String id = adress.getHostAddress();
        System.out.println(id);

    }
}
