package com.taishonet.tanupon.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by taisho6339 on 16/06/12.
 */
@Component
@ConfigurationProperties(prefix = "envs")
public class Environments {
    private Map<String, String> line;

    public Map<String, String> getLine() {
        return line;
    }

    public void setLine(Map<String, String> line) {
        this.line = line;
    }
}
