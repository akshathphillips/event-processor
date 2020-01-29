package com.akshathphillips.eventprocessor.handler;

import com.akshathphillips.eventprocessor.event.Event;

public interface Handler<E extends Event> {
    void onEvent(E event);
}
