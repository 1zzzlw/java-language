package MysTest_21day;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class test_21_4 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要说的话：");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                break;
            }

            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("10.104.95.94");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            ds.send(dp);

        }

        ds.close();
    }
}
