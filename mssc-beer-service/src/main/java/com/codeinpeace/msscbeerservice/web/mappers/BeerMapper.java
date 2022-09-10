package com.codeinpeace.msscbeerservice.web.mappers;

import com.codeinpeace.msscbeerservice.domain.Beer;
import com.codeinpeace.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
