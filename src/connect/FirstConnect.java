package connect;
import connect.ConnectURI;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddres = koneksisaya.buildURL("https://harber.mimoapps.xyz/api/getaccess.php");
        String response = koneksisaya.getResponseFromHttpurl(myAddres);
        System.out.println(response);
        assert response != null;
        JSONArray responJSON = new JSONArray(response);
        ArrayList <ResponseModel> responseModels = new ArrayList<>();
        for (int i = 0; i<responJSON.length();i++){
            ResponseModel resModel = new ResponseModel();
            JSONObject myJSONObject = responJSON.getJSONObject(i);
            resModel.setMessage(myJSONObject.getString("message"));
            resModel.setStatus(myJSONObject.getString("status"));
            resModel.setComment(myJSONObject.getString("comment"));
            responseModels.add(resModel);
        }
        System.out.println("Response Are");
        for (int index = 0 ; index< responseModels.size();index++){
            System.out.println("Message " + responseModels.get(index).getMessage());
            System.out.println("STATUS " + responseModels.get(index).getStatus() );
            System.out.println("COMMENT " + responseModels.get(index).getComment());
        }
    }
}
