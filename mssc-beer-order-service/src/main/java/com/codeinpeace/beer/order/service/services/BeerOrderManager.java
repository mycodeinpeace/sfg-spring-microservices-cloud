package com.codeinpeace.beer.order.service.services;

import com.codeinpeace.beer.order.service.domain.BeerOrder;

public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);
}
