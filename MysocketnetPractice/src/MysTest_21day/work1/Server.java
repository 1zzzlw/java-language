package MysTest_21day.work1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket accept = ss.accept();

        InputStreamReader is = new InputStreamReader(accept.getInputStream());
        int b;
        while ((b = is.read()) != -1) {
            System.out.print    ((char) b);
        }

        accept.close();
        ss.close();
    }
}
