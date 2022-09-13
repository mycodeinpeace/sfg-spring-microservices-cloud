

package com.codeinpeace.beer.order.service.web.mappers;

import com.codeinpeace.beer.order.service.domain.BeerOrder;
import com.codeinpeace.beer.order.service.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
