package com.codeinpeace.brewery.services;

import com.codeinpeace.brewery.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);
}
