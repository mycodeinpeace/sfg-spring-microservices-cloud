package com.codeinpeace.msscbrewery.services;

import com.codeinpeace.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeetById(UUID beerId);
}
