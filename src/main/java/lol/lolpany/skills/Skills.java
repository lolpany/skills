package lol.lolpany.skills;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lol.lolpany.skills.hh.vacancies.Example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

public class Skills {
    public static void main(String[] args) throws Exception {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        AtomicBoolean isOn = new AtomicBoolean(true);


        for (int i = 0; i < 100000; i++) {

            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(
                            "https://api.hh.ru/vacancies?per_page=100&page=" + i))
                    .timeout(Duration.ofMinutes(1))
//                    .header("Cookie", COOKIE)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Example vacancies = gson.fromJson(response.body(), Example.class);
            i++;

        }

//        int a = 0;
//        while (a != 99) {
//            a = System.in.read();
//        }
//        isOn.set(false);
//        executorService.shutdown();

    }
}
