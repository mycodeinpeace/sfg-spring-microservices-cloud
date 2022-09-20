package com.codeinpeace.msscbeerservice.events;

import com.codeinpeace.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {
    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
