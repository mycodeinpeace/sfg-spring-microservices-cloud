package com.codeinpeace.beer.order.service.web.mappers;

import com.codeinpeace.beer.order.service.domain.BeerOrderLine;
import com.codeinpeace.beer.order.service.services.beer.BeerService;
import com.codeinpeace.brewery.model.BeerDto;
import com.codeinpeace.brewery.model.BeerOrderLineDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class BeerOrderLineMapperDecorator implements BeerOrderLineMapper {

    private BeerService beerService;
    private BeerOrderLineMapper beerOrderLineMapper;

    @Autowired
    public void setBeerService(BeerService beerService) {
        this.beerService = beerService;
    }

    @Autowired
    public void setMapper(BeerOrderLineMapper beerOrderLineMapper) {
        this.beerOrderLineMapper = beerOrderLineMapper;
    }

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine beerOrderLine) {
        BeerOrderLineDto beerOrderLineDto = beerOrderLineMapper.beerOrderLineToDto(beerOrderLine);
        Optional<BeerDto> beerDtoOptional = beerService.getBeerByUpc(beerOrderLine.getUpc());

        beerDtoOptional.ifPresent((beerDto -> {
            beerOrderLineDto.setBeerName(beerDto.getBeerName());
            beerOrderLineDto.setBeerStyle(beerDto.getBeerStyle());
            beerOrderLineDto.setPrice(beerDto.getPrice());
            beerOrderLineDto.setBeerId(beerDto.getId());
        }));

        return beerOrderLineDto;
    }
}