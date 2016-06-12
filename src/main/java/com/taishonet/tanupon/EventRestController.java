package com.taishonet.tanupon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by taisho6339 on 16/06/12.
 */
@Controller
@RequestMapping("/event")
public class EventRestController {

    @RequestMapping(value = "/receive", method = RequestMethod.POST)
    public Message receiveEvent(String json) {
        System.out.println();
        System.out.println(json);
        System.out.println();
        return new Message();
    }
}
