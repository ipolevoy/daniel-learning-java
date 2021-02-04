import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;

public class SocketExample2{

    public static void main(String[] args) throws IOException {
	StringBuffer sb = new StringBuffer();
	


	Socket s = new Socket("www.yahoo.com", 80);
        OutputStream out = s.getOutputStream();
        out.write("GET\n\n".getBytes(StandardCharsets.UTF_8));
        InputStream in  = s.getInputStream();
        int x = in.read();
        while (x != -1){
            //System.out.print((char) x);
            x = in.read();
	    sb.append((char) x);
        }
        s.close();
	
	Pattern pattern = Pattern.compile("lucky", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sb);
	
	boolean matchFound = matcher.find();
	if(matchFound) {
		System.out.println("Match found");
	} 
	else {
		System.out.println("Match not found");
	}	
//	System.out.println(sb.toString());
    }
}
