package Clima;


import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class REST2 {




    public String TempBsAs() {
        try {

            URL url = new URL("http://dataservice.accuweather.com/currentconditions/v1/7894?apikey=jPb4M4p2m0qWQojGyLMs1fC3ADCaY66c&language=es-ar HTTP/1.1");//your url i.e fetch data from .
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
                JSONArray ja = (JSONArray) obj;
                JSONObject main = (JSONObject) ja.get(0);
                JSONObject type = (JSONObject) main.get("Temperature");
                JSONObject unit = (JSONObject) type.get("Metric");
                temp = unit.get("Value").toString();

                conn.disconnect();
                return temp;

        } catch (Exception e) {
            return "error";
        }

    }
}

