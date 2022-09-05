package com.codeinpeace.msscbrewery.services;

import com.codeinpeace.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
