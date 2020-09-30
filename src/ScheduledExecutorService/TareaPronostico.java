package ScheduledExecutorService;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TareaPronostico implements Runnable {

    private String objetivo;
    private boolean apagado;

    public TareaPronostico() {
        this.apagado = false;
    }

    public void run() {
        String respuesta, ciudad, pais, clima, descripcion, temp, sensacion, max, min, humedad, velocidad, aux, q;
        OkHttpClient client = new OkHttpClient();
        Scanner a;

        this.setObjetivo();
        if (!this.getObjetivo().equalsIgnoreCase("apagar")) {

            Request request = new Request.Builder()
                    .url("http://api.openweathermap.org/data/2.5/weather?q=" + this.getObjetivo() + "&units=metric&lang=es&appid=e7cc3fe0c57afd09508e97a17a4b50d9")
                    .build();

            try {
                Response response = client.newCall(request).execute();
                respuesta = response.body().string();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("name\":\"(.+)\""));
                ciudad = aux.substring(7, aux.length() - 7);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("country\":\"(.+)sunrise"));
                pais = aux.substring(10, aux.length() - 10);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("main\":\"(.+)desc"));
                clima = aux.substring(7, aux.length() - 7);

                switch (clima) {
                    case "Clouds":
                        clima = "Nublado";
                        break;
                    case "Thunderstorm":
                        clima = "Tormenta electrica";
                        break;
                    case "Drizzle":
                        clima = "Llovizna";
                        break;
                    case "Rain":
                        clima = "Lluvioso";
                        break;
                    case "Snow":
                        clima = "Nevado";
                        break;
                    case "Clear":
                        clima = "Despejado";
                        break;
                    default:
                        clima = "Que dios se apiade de nosotros";
                        break;
                }
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("description\":\"(.+)icon"));
                descripcion = aux.substring(14, aux.length() - 7);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("temp\":(.+)feels"));
                temp = aux.substring(6, aux.length() - 7);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("like\"(.+)min"));
                sensacion = aux.substring(6, aux.length() - 10);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("max\":(.+)pressure"));
                max = aux.substring(5, aux.length() - 10);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("min\":(.+)max"));
                min = aux.substring(5, aux.length() - 10);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("humidity\":(.+)visibility"));
                humedad = aux.substring(10, aux.length() - 13);
                a.close();

                a = new Scanner(respuesta);
                aux = a.findInLine(Pattern.compile("speed\":(.+)deg"));
                velocidad = aux.substring(7, aux.length() - 5);
                a.close();

                System.out.println("Ciudad: " + ciudad + ", " + pais + ".");
                System.out.println("Clima: " + clima + ", Descripcion: " + descripcion + ".");
                System.out.println("Temp.: " + temp + "°C" + ", Sensacion Termica: " + sensacion + "°C" + ".");
                System.out.println("Min.: " + min + "°C" + " Max.: " + max + "°C" + ".");
                System.out.println("Rafagas de: " + velocidad + " km/h" + ".");
                System.out.println("Humedad: " + humedad + "%" + ".");
            } catch (IOException e) {}
        } else {
            this.setApagado();
        }
    }

    public void setObjetivo() {
        System.out.println("\033[36mIngrese la ciudad de que desea ver el Clima:");
        this.objetivo = TecladoIn.readLine();
        
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public boolean getApagado() {
        return this.apagado;
    }

    public void setApagado() {
        this.apagado = true;
    }
}
