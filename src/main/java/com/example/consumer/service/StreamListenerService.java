package com.example.consumer.service;

import com.example.consumer.utils.Event;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;


/**
 * Created by jb on 12/06/2018.
 */

@Component
public class StreamListenerService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @StreamListener(Event.FETCH)
    public void receive(String string) throws JSONException {
        JSONObject jsonObject = new JSONObject(string);
        log.info(jsonObject.toString());
    }
}
