package MysTest_21day;
//TCP发送数据

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class test_21_6 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        //在创建的同时会连接服务器，如果连接不上会报错
        Socket socket = new Socket("10.104.95.94",10000);

        //从连接通道中获取输出流
        OutputStream op = socket.getOutputStream();
        //写出数据
        op.write("aaa".getBytes());

        op.close();
        socket.close();
    }
}
