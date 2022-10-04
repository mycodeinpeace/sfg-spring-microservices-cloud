package com.codeinpeace.beer.order.service.web.mappers;

import com.codeinpeace.beer.order.service.domain.Customer;
import com.codeinpeace.brewery.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}
