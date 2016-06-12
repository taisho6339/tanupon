package com.taishonet.tanupon.conf;

import com.taishonet.tanupon.conf.Environments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by taisho6339 on 16/06/12.
 */
@Component
public class EnvReader {
    @Autowired
    private Environments environments;

    public String getChannelId() {
        Map<String, String> env = environments.getLine();
        return env.get("line-channel-id");
    }

    public String getChannelSecret() {
        Map<String, String> env = environments.getLine();
        return env.get("line-channel-secret");
    }

    public String getAcl() {
        Map<String, String> env = environments.getLine();
        return env.get("line-trusted-user-with-acl");
    }
}
