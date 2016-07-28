package com.taishonet.tanupon.repository;

import com.taishonet.tanupon.conf.EnvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by taisho6339 on 16/06/27.
 */
@Repository
public class WunderListRepository {

    private static final String LIST_API = "https://a.wunderlist.com/api/v1/lists";
    private static final String TASK_API = "https://a.wunderlist.com/api/v1/tasks";
    private static final String KEY_CLIENT_ID = "X-Client-ID";
    private static final String KEY_ACCESS_TOKEN = "X-Access-Token";

    private static final String EMERGENCY_TASKLIST_ID = "254094120";

    public class Task {
        public long id;
        public String title;
    }

    @Autowired
    private EnvReader envReader;

    private String readStream(InputStream in) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        try {
            for (; ; ) {
                String line = reader.readLine();
                if (line == null) break;
                builder.append(line);
                System.out.println(line);
            }
        } finally {
            reader.close();
        }
        return builder.toString();
    }

    public List<String> getRemainTask() {
//        try {
//            String[] commands = new String[]{
//                    "curl",
//                    "-H",
//                    "\"Content-Type: application/json\"",
//                    "-H",
//                    "\"X-Access-Token: 350acf75327a2a97885b32ccdf7df3db74ed9645817ecd8f2bc6289c3d32\"",
//                    "-H",
//                    "\"X-Client-ID: c2af5839ffc4920262b5\"",
//                    "https://a.wunderlist.com/api/v1/tasks?list_id=254094120",
//                    ""
//            };
//
//            Process process = Runtime.getRuntime().exec(commands);
//            try {
//                int ret = process.waitFor();
//                System.out.print(String.valueOf(ret));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            String json = readStream(process.getInputStream());
//            System.out.println(json);
//            String error = readStream(process.getErrorStream());
//            System.out.println(error);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        HttpTransport transport = new ApacheHttpTransport();
//        HttpRequestFactory factory = transport.createRequestFactory();
//        GenericUrl url = new GenericUrl(TASK_API);
//        url.set("list_id", EMERGENCY_TASKLIST_ID);
//        try {
//            HttpRequest httpRequest = factory.buildGetRequest(url);
//            HttpHeaders headers = httpRequest.getHeaders();
//            headers.setContentEncoding();
//            headers.set(KEY_CLIENT_ID, envReader.getWunderClientId());
//            headers.set(KEY_ACCESS_TOKEN, envReader.getWunderAccessToken());
//            httpRequest.setHeaders(headers);
//            HttpResponse response = httpRequest.execute();
//            System.out.println(response.parseAsString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        //Header設定
//        RestTemplate restTemplate = new RestTemplate();
//        //URL生成
//        URI uri = UriComponentsBuilder.fromUriString(TASK_API)
//                .queryParam("list_id", EMERGENCY_TASKLIST_ID)
//                .build()
//                .toUri();
//
//        RequestEntity entity = RequestEntity
//                .get(uri)
//                .header(HttpHeaders.ACCEPT_LANGUAGE, "ja, en;q=0.8")
//                .header(KEY_CLIENT_ID, envReader.getWunderClientId())
//                .header(KEY_ACCESS_TOKEN, envReader.getWunderAccessToken()).build();
//        ResponseEntity<String> res = restTemplate.exchange(entity, String.class);
//        System.out.println(res.getHeaders().get("Content-Type"));
//        List<Object> taskList = Optional.ofNullable(JsonParserFactory.getJsonParser().parseList(res.getBody())).orElseGet(ArrayList::new);
//
//        return taskList.stream().map(o -> {
//            LinkedHashMap<String, String> params = (LinkedHashMap) o;
//            return params.get("title");
//        }).collect(Collectors.toList());
        return null;
    }
}
