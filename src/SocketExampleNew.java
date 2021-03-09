import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;

public class SocketExampleNew {

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();

        Socket s = new Socket("www.google.com", 80);
        OutputStream out = s.getOutputStream();
        out.write("GET\n\n".getBytes(StandardCharsets.UTF_8));
        InputStream in = s.getInputStream();

        System.out.println("InputStream class: " + in.getClass());


        int x = in.read();
        while (x != -1) {
            //System.out.print((char) x);
            x = in.read();
            sb.append((char) x);
        }
        s.close();

        Pattern ptrn = Pattern.compile("lucky", Pattern.CASE_INSENSITIVE);
        Matcher mtcr = ptrn.matcher(sb);

        boolean myLook = mtcr.lookingAt();
        System.out.print(myLook + "\n");
        boolean matchFound = mtcr.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
//	System.out.println(sb.toString());
    }
}
