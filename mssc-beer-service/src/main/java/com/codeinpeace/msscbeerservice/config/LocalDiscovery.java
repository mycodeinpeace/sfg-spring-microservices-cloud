package com.codeinpeace.msscbeerservice.config;

import com.codeinpeace.msscbeerservice.services.inventory.InventoryServiceFeignClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@EnableDiscoveryClient
@EnableFeignClients(clients = InventoryServiceFeignClient.class)
@Configuration
public class LocalDiscovery {
}
