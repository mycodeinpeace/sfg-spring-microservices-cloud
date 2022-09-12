package com.codeinpeace.brewery.events;

import com.codeinpeace.brewery.domain.Beer;
import org.springframework.context.ApplicationEvent;

public class BrewBeerEvent extends ApplicationEvent {

    public BrewBeerEvent(Beer source) {
        super(source);
    }

    public Beer getBeer(){
        return (Beer) this.source;
    }

}
