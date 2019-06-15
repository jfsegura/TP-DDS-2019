package Clima;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
public class REST {




    public String TempBsAs() {
        try {

            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id=3435910&units=metric&APPID=59a9c3c0f402ec8f700edebb4ef11191");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            String temp;
            Object obj;
            output = br.readLine();

                 obj = new JSONParser().parse(output);
                JSONObject jo = (JSONObject) obj;


                JSONObject main = (JSONObject) jo.get("main");
                temp = main.get("temp").toString();

                conn.disconnect();
                return temp;

        } catch (Exception e) {
            return "error";
        }

    }
}

