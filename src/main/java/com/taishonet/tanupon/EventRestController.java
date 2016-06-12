package com.taishonet.tanupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by taisho6339 on 16/06/12.
 */
@Controller
@RequestMapping("/event")
public class EventRestController {

    private static final Logger LOG = LoggerFactory.getLogger(EventRestController.class);

    @RequestMapping(value = "/receive", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SendMessage receiveEvent(@RequestBody String json) {
        LOG.error("Receive Request");
        LOG.error(json);
        return new SendMessage();
    }
}
