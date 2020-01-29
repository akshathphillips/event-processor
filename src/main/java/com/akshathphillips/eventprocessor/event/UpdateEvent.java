package com.akshathphillips.eventprocessor.event;

import com.akshathphillips.eventprocessor.domain.Request;

public class UpdateEvent extends BaseEvent {

    private Request request;

    public UpdateEvent(Request request) {
        this.request = request;
    }

    public Request getRequest() {
        return request;
    }

}
