package com.codeinpeace.msscbeerservice.services;

import com.codeinpeace.msscbeerservice.web.model.BeerDto;
import com.codeinpeace.msscbeerservice.web.model.BeerPagedList;
import com.codeinpeace.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
