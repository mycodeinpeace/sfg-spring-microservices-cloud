package com.codeinpeace.msscbrewery.web.mapper;

import com.codeinpeace.msscbrewery.domain.Customer;
import com.codeinpeace.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
