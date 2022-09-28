package com.codeinpeace.msscbrewery.web.mapper;

import com.codeinpeace.msscbrewery.domain.Beer;
import com.codeinpeace.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
