package com.akshathphillips.eventprocessor.event;

public interface Event {
    Class<? extends Event> getType();
}
