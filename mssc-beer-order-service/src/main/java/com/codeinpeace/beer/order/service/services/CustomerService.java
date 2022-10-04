package com.codeinpeace.beer.order.service.services;

import com.codeinpeace.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);

}