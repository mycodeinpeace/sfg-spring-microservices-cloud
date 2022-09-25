package com.codeinpeace.beer.inventory.service.web.mappers;

import com.codeinpeace.beer.inventory.service.domain.BeerInventory;
import com.codeinpeace.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
