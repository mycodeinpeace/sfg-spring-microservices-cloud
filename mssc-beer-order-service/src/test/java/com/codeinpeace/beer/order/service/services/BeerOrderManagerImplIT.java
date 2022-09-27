package com.codeinpeace.beer.order.service.services;

import com.codeinpeace.beer.order.service.domain.BeerOrder;
import com.codeinpeace.beer.order.service.domain.BeerOrderLine;
import com.codeinpeace.beer.order.service.domain.BeerOrderStatusEnum;
import com.codeinpeace.beer.order.service.domain.Customer;
import com.codeinpeace.beer.order.service.repositories.BeerOrderRepository;
import com.codeinpeace.beer.order.service.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BeerOrderManagerImplIT {

    @Autowired
    BeerOrderManager beerOrderManager;

    @Autowired
    BeerOrderRepository beerOrderRepository;

    @Autowired
    CustomerRepository customerRepository;

    Customer testCustomer;

    UUID beerId = UUID.randomUUID();

    @BeforeEach
    void setUp() {
        testCustomer = customerRepository.save(Customer.builder()
                        .customerName("Test Customer")
                        .build());
    }

    @Test
    void testNewToAllocated() {
        BeerOrder beerOrder = createBeerOrder();

        BeerOrder savedBeerOrder = beerOrderManager.newBeerOrder(beerOrder);

        assertNotNull(savedBeerOrder);
        assertEquals(BeerOrderStatusEnum.ALLOCATED, savedBeerOrder.getOrderStatus());
    }

    public BeerOrder createBeerOrder() {
        BeerOrder beerOrder = BeerOrder.builder()
                .customer(testCustomer)
                .build();

        Set<BeerOrderLine> lines = new HashSet<>();
        lines.add(BeerOrderLine.builder()
                        .beerId(beerId)
                        .orderQuantity(1)
                        .beerOrder(beerOrder)
                        .build());

        beerOrder.setBeerOrderLines(lines);

        return beerOrder;
    }
}
