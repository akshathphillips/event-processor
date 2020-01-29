package com.akshathphillips.eventprocessor;

import com.akshathphillips.eventprocessor.domain.Request;
import com.akshathphillips.eventprocessor.event.UpdateEvent;
import com.akshathphillips.eventprocessor.handler.UpdateHandler;

public class Processor {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.registerHandler(UpdateEvent.class, new UpdateHandler());

        Request request = new Request(1L, "UpdateRequest");
        dispatcher.dispatch(new UpdateEvent(request));
    }
}
