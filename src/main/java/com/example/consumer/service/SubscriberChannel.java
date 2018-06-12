package com.example.consumer.service;

import com.example.consumer.utils.Event;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by jb on 12/06/2018.
 */
public interface SubscriberChannel {

    @Input(Event.FETCH)
    SubscribableChannel fetch();
}

