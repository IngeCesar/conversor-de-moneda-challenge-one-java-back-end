import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultaApi {
    String apiKey = "89ce56122fcca92eb66eb7ca";
    String direccion = "https://v6.exchangerate-api.com/v6/"
            + apiKey + "/latest/";

    public double convertir(String monedaOrigen, String monedaConvertida, double cantidad) {
        try {
            URL url = new URL(direccion + monedaOrigen);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser parser = new JsonParser();
            JsonObject json = parser.parse(new InputStreamReader((request.getInputStream()))).getAsJsonObject();

            double tasa = json.getAsJsonObject("conversion_rates").get(monedaConvertida).getAsDouble();
            return cantidad * tasa;
        } catch (Exception e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
            return -1;
        }

    }
}
