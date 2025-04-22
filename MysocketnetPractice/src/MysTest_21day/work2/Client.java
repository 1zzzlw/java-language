package MysTest_21day.work2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.104.95.94",10000);

        String str = "见到你很开心";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        socket.shutdownOutput();

        InputStreamReader is = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        socket.close();
    }
}
