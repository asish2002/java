import java.net.*;

public class clint{
    public static void main(String[] args) throws Exception {
        Socket w=new Socket("192.168.43.25",3456);
        if(w.isConnected()){
            System.out.println("server is connecected");
        }
    }
}