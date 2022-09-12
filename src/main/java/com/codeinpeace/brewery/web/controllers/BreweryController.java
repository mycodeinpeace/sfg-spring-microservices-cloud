package com.codeinpeace.brewery.web.controllers;

import com.codeinpeace.brewery.domain.Brewery;
import com.codeinpeace.brewery.services.BreweryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("/brewery")
@Controller
public class BreweryController {

    private BreweryService breweryService;
    public BreweryController(BreweryService breweryService) {
        this.breweryService = breweryService;
    }
    @GetMapping({"/breweries", "/breweries/index", "/breweries/index.html", "/breweries.html"})
    public String listBreweries(Model model) {
        model.addAttribute("breweries", breweryService.getAllBreweries());
        return "breweries/index";
    }
    @GetMapping("/api/v1/breweries")
    public @ResponseBody
    List<Brewery> getBreweriesJson(){
        return breweryService.getAllBreweries();
    }
}
