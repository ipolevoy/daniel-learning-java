import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketExample {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("www.google.com", 80);
        OutputStream out = s.getOutputStream();
        out.write("GET\n\n".getBytes(StandardCharsets.UTF_8));
        InputStream in  = s.getInputStream();
        int x = in.read();
        while (x != -1){
            System.out.print((char) x);
            x = in.read();
        }
        s.close();
    }
}
