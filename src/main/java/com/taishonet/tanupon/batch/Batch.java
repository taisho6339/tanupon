package com.taishonet.tanupon.batch;

import com.taishonet.tanupon.conf.EnvReader;
import com.taishonet.tanupon.repository.WunderListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by taisho6339 on 16/06/12.
 */
@Component
public class Batch {

    @Autowired
    EnvReader reader;

    @Autowired
    WunderListRepository repository; //FIXME

    @Scheduled(cron = "1 * * * * *") //TODO どこかで一括管理するようにする
    public void runJob() {
        repository.getRemainTask();
//        service.scrapeBookingLesson();
//        final String url = "https://trialbot-api.line.me/v1/events";
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("X-Line-ChannelID", reader.getChannelId()); //TODO
//        headers.add("X-Line-ChannelSecret", reader.getChannelSecret()); //TODO
//        headers.add("X-Line-Trusted-User-With-ACL", reader.getAcl()); //TODO
//        headers.add("Content-Type", "application/json; charset=UTF-8");
//        HttpEntity<String> request = new HttpEntity<String>(headers);
//
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> model = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
//        System.out.println(model.getBody());
    }
}
