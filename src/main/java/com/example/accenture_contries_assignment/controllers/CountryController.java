package com.example.accenture_contries_assignment.controllers;

import com.example.accenture_contries_assignment.models.Country;
import com.example.accenture_contries_assignment.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/country/")
public class CountryController {

    @Autowired
    public CountryServices countryServices;

    @PostMapping("/saveCountry")
    public Country saveCountry(@RequestBody Country contry){
      return countryServices.saveCountry(contry);
    }

    @GetMapping("/getAllCountries")
    public List<Country> getAllCountries(){
        return countryServices.getAllContries();
    }

    @GetMapping("/sortedByDensityDES")
    public List<Country> getCountriesSortedByPopulationDensityDES() {
        return countryServices.getCountriesSortedByPopulationDensityDES();
    }

    @GetMapping("/mostBorderingCountries/{countryName}")
    public List<Country> getCountryWithMostBorderingCountriesFromDifferentRegion(@PathVariable("countryName") String countryName) {
        return countryServices.getCountryWithMostBorderingCountriesFromDifferentRegion(countryName);
    }
}
