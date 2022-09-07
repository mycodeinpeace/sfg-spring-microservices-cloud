package com.codeinpeace.msscbreweryclient.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
@Component
public class BreweryClient {

    public final String BEER_PATH_V1 = "/api/v1/beer/";
    private String apihost;

}
