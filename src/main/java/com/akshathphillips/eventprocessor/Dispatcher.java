package com.akshathphillips.eventprocessor;

import com.akshathphillips.eventprocessor.event.Event;
import com.akshathphillips.eventprocessor.handler.Handler;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    private Map<Class<? extends Event>, Handler<? extends Event>> handlers;

    public Dispatcher() {
        handlers = new HashMap<Class<? extends Event>, Handler<? extends Event>>();
    }

    public <E extends Event> void registerHandler(
            Class<E> eventType,
            Handler<E> handler
    ) {
        handlers.put(eventType, handler);
    }

    public <E extends Event> void dispatch(E event) {
        Handler<E> handler = (Handler<E>) handlers.get(event.getClass());
        if (handler != null) {
            handler.onEvent(event);
        }
    }

}
