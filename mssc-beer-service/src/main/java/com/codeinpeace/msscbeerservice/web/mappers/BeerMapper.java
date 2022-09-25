package com.codeinpeace.msscbeerservice.web.mappers;

import com.codeinpeace.msscbeerservice.domain.Beer;
import com.codeinpeace.brewery.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@DecoratedWith(BeerMapperDecorator.class)
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
