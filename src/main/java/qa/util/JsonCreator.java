package qa.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JsonCreator {

    public void sendToAPI(String jsonRes){
        URL url;
        {
            try {
                url = new URL("https://api.practitest.com/api/v2/projects/21298/runs.json?api_token=7220a5baf48665f3dc203a49308915ba0a6873ee");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type", "application/json; utf-8");
                con.setRequestProperty("Accept", "application/json");
                con.setDoOutput(true);
                String jsonInputString = jsonRes;

                try (OutputStream os = con.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
                }

                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    System.out.println(response);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public JSONObject jsonRequestCreator(String instance,int status) {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("type", "instances");

        JSONObject attributesObject = new JSONObject();
        attributesObject.put("instance-id", instance);
        attributesObject.put("exit-code", status);
        attributesObject.put("automated-execution-output", "THIS IS MY OUTPUT");
        jsonObject.put("attributes",attributesObject);

        //Creating a json array
        JSONArray array = new JSONArray();
        array.add(jsonObject);


        //Adding array to the json object
        JSONObject mainJsonObject = new JSONObject();
        mainJsonObject.put("data", array);

        System.out.println(mainJsonObject);
        return mainJsonObject;
    }
}