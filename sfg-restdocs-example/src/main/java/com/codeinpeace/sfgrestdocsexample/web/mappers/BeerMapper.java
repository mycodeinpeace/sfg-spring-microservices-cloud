package com.codeinpeace.sfgrestdocsexample.web.mappers;

import com.codeinpeace.sfgrestdocsexample.domain.Beer;
import com.codeinpeace.sfgrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
