package com.taishonet.tanupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by taisho6339 on 16/06/12.
 */
@Component
public class Batch {

    @Autowired
    EnvReader reader;

    @Scheduled(cron = "30 * * * * *") //TODO どこかで一括管理するようにする
    public void runJob() {
        final String url = "https://trialbot-api.line.me/v1/events";

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Line-ChannelID", reader.getChannelId()); //TODO
        headers.add("X-Line-ChannelSecret", reader.getChannelSecret()); //TODO
        headers.add("X-Line-Trusted-User-With-ACL", reader.getAcl()); //TODO
        headers.add("Content-Type", "application/json; charset=UTF-8");
        HttpEntity<String> request = new HttpEntity<String>(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> model = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
        System.out.println(model.getBody());
    }
}
