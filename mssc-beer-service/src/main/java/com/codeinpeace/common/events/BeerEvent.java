package com.codeinpeace.common.events;

import com.codeinpeace.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -5781515597148163111L;

    private BeerDto beerDto;

}
