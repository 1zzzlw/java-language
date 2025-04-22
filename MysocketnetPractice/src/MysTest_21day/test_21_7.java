package MysTest_21day;
//TCP接受数据

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class test_21_7 {
    public static void main(String[] args) throws IOException {
        //创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接
        Socket socket = ss.accept();

        //从连接通道中读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader str = new InputStreamReader(is);
        int b;
        while ((b = str.read()) != -1) {
            System.out.print((char)b);
        }

        socket.close();
        ss.close();
    }
}
