package com.taishonet.tanupon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by taisho6339 on 16/06/12.
 */
public class ReceiveMessage implements Serializable {
    private static final long serialVersionUID = 1L;
//    public ArrayList<Result> result;

//    public class Result {
        public String from;
        public String fromChannel;
        public String toChannel;
        public String eventType;
        public String id;
        public String content;
//    }

//    @Override
//    public String toString() {
//        return "ReceiveMessage{" +
//                "result=" + result +
//                '}';
//    }
}
