package webserver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.StringTokenizer;

public class WebWorker implements Runnable {
    private Socket clientSocket;
    public WebWorker(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

        try{


            InputStream in = clientSocket.getInputStream();

            StringBuffer sb = new StringBuffer();
            int c;
            while ((c = in.read()) != -1) {
                sb.append((char)c);
                if(sb.toString().contains("\r\n\r\n")){
                    break;
                }
                System.out.print((char)c);
            }

            int endOfFirstLine = sb.toString().indexOf("\r\n");

            String firstLine = sb.toString().substring(0, endOfFirstLine);
            StringTokenizer st = new StringTokenizer(firstLine, " ");
            st.nextToken();
            String file =  st.nextToken();

            byte[] fileBytes = getFileBytes(file);




            clientSocket.getOutputStream().write("HTTP/1.0 200 OK\n\n".getBytes());
            clientSocket.getOutputStream().write(fileBytes);
            clientSocket.getOutputStream().write("\n\n".getBytes());
            clientSocket.getOutputStream().flush();
            clientSocket.getOutputStream().close();
            clientSocket.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                clientSocket.close();
            } catch (IOException ignore) {}
        }
    }

    private static byte[] getFileBytes(String fileName) throws IOException {

        StringBuffer sb = new StringBuffer();

        System.out.println("Reading file: " + fileName);

        FileInputStream in = new FileInputStream("src/webserver/" + fileName);

        int c;
        while ((c = in.read()) != -1) {
            sb.append((char) c);
        }

        return sb.toString().getBytes();
    }
}
