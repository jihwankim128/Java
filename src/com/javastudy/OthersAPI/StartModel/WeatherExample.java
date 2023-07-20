package com.javastudy.OthersAPI.StartModel;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "a955d2821e353e0bdbdb6de14213f02c";
        String city = "Busan";
        String urlStr = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();

            // getInputStream == byte 단위
            // InputStreamReader == Char 단위로 읽음.
            // BufferedReader == 읽은 Data를 버퍼에 저장 후 한번에 처리
            if(responseCode == 200) {
                BufferedReader in = new BufferedReader(
                                        new InputStreamReader(
                                           connection.getInputStream()
                                        )
                                    );
                String inputLine;
                // BufferedReader에서 읽은 Line으로 구분된 JSON 데이터를
                // StringBuffer에서 한번에 입력 받는다.
                StringBuffer content = new StringBuffer();
                while((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println(content);

                //JsonObect로 Parsing -> 날씨 main Data 추출
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                System.out.println("부산 기온 = " + temp);
                connection.disconnect();
            }
            else {
                // 오류
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
