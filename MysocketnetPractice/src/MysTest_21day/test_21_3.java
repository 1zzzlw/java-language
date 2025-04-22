package MysTest_21day;
//UDP接收数据

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class test_21_3 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象（快递公司）
        //在接收数据时一定要绑定端口
        //而且绑定的端口要和发出数据的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);

        //接受数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        System.out.println(111);
        ds.receive(dp);
        System.out.println(222);

        //解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println(new String(data, 0, len) + " " + address + " " + port);
    }
}
