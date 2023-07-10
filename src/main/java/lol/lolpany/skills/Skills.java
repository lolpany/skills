package lol.lolpany.skills;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lol.lolpany.skills.hh.vacancies.Example;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

public class Skills {

    public static void main(String[] args) throws Exception {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        AtomicBoolean isOn = new AtomicBoolean(true);

        String[] skills = gson.fromJson(new FileReader("C:\\all\\projects\\skills\\src\\main\\resources\\skill.json"), String[].class);

        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        SortedSet<Skill> orderedSkills = new TreeSet<>((o1, o2) -> {
            if (o1.count > o2.count) {
                return -1;
            } else if (o1.count < o2.count) {
                return 1;
            } else {
                return o1.name.compareTo(o2.name);
            }
        });
        for (String skill : skills) {
            URI uri = new URI(
                    "https",
                    "api.hh.ru",
                    "/vacancies",
                    "area=1&text=" + skill,
                    null);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri.toString()))
                    .timeout(Duration.ofMinutes(1))
//                    .header("Cookie", COOKIE)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Example vacancies = gson.fromJson(response.body(), Example.class);
            orderedSkills.add(new Skill(skill, vacancies.found));

        }
        System.out.println(gson.toJson(orderedSkills));

    }

    private void old() throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
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
