import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;

public class SocketExample {


    public static void main(String[] args) throws IOException {
        System.out.println("Yahoo:" + checkWord("www.yahoo.com", "yahoo"));
        System.out.println("Google:" + checkWord("www.google.com", "lucky"));
    }

    private  static boolean checkWord(String domain, String word) throws IOException {
        StringBuffer sb = new StringBuffer();
        Socket s = new Socket(domain, 80);
        OutputStream out = s.getOutputStream();
        out.write("GET\n\n".getBytes(StandardCharsets.UTF_8));
        InputStream in  = s.getInputStream();
        int x = in.read();
        while (x != -1){
            x = in.read();
            sb.append((char) x);
        }
        s.close();
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sb);
        return matcher.find();
    }
}

