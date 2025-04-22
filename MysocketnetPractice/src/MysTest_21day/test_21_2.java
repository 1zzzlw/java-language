package MysTest_21day;
//UDP发送数据

import java.io.IOException;
import java.net.*;
import java.nio.channels.DatagramChannel;
import java.sql.DatabaseMetaData;

public class test_21_2 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象（快递公司）
        //绑定端口，以后通过这个端口进行发送
        //空参：所有可用的端口中随机一个进行使用
        //有参：指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();

        //打包数据
        String str = "你好";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("10.104.95.94");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,10086);

        //发送数据
        ds.send(dp);

        //释放资源
        ds.close();
    }
}
