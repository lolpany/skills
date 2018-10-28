package lol.lolpany;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import lol.lolpany.skills.hh.vacancies.Example;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

public class Skills {
    public static void main(String[] args) throws Exception {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        AtomicBoolean isOn = new AtomicBoolean(true);


        for (int i = 0; i < 100000; i++) {

            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.SAME_PROTOCOL)
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(
                            "https://api.hh.ru/vacancies?per_page=100&page=" + i))
                    .timeout(Duration.ofMinutes(1))
//                    .header("Cookie", COOKIE)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
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