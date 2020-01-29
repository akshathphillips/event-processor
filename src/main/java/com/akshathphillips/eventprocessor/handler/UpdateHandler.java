package com.akshathphillips.eventprocessor.handler;

import com.akshathphillips.eventprocessor.event.UpdateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateHandler implements Handler<UpdateEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateHandler.class);

    public void onEvent(UpdateEvent event) {
        LOGGER.info("Updated request id <{}>", event.getRequest().getId());
        System.out.println("here");
    }
}
