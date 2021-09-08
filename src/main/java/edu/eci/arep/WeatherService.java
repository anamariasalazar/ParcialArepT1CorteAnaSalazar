package edu.eci.arep;

import edu.eci.arep.exceptions.WeSException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WService {
    public static String getCityWeather(String city) throws WSException {
        try {
            HttpURLConnection connection;
            StringBuffer response;
            BufferedReader in;
            int responseCode;
            String inputLine;
            URL url;

            url = new URL("http://api.openweathermap.org/data/2.5"+"/weather?q="+city+"&appid=e628c368c1c5532a4149b93c361ab853");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            responseCode = connection.getResponseCode();

            if (responseCode==HttpURLConnection.HTTP_OK) {
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                inputLine = in.readLine();
                response = new StringBuffer();

                while (inputLine!=null) {
                    response.append(inputLine);
                    inputLine = in.readLine();
                }

                in.close();
            } else {
                throw new WSException("City not found.");
            }

            return String.valueOf(response);
			
        }
    }
}
