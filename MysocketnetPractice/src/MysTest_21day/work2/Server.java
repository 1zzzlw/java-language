package MysTest_21day.work2;

import javax.sound.midi.SoundbankResource;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        InputStreamReader is = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        String str = "有多开心呢";
        OutputStream op = socket.getOutputStream();
        op.write(str.getBytes());

        socket.close();
        ss.close();
    }
}
