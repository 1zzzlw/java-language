package MysTest_21day;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class test_21_5 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = dp.getLength();
            String name = dp.getAddress().getHostName();
            String ip = dp.getAddress().getHostAddress();

            System.out.println("ip为：" + ip + "，主机名为：" + name + "的人发送了：" + new String(data, 0, len));
        }

    }
}
