package com.akshathphillips.eventprocessor.event;

public abstract class BaseEvent implements Event {
    public Class<? extends Event> getType() {
        return getClass();
    }
}
