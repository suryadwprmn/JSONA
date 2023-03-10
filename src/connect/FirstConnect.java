package connect;
import connect.ConnectURI;
import java.io.IOException;
import java.net.URL;

public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI Myconecction = new ConnectURI();
        URL myAddres = Myconecction.buildURL("https://harber.mimoapps.xyz/api/getaccess.php");
        String response = Myconecction.getResponseFromHttpUrl(myAddres);

        System.out.println(response);
    }
}
