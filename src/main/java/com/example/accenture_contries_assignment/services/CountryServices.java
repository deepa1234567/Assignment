package com.example.accenture_contries_assignment.services;

import com.example.accenture_contries_assignment.Repository.CountryRepository;
import com.example.accenture_contries_assignment.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServices {

    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country){
      return countryRepository.save(country);
    }


    public List<Country> getAllContries() {

        return countryRepository.findAll();
    }

    public List<Country> getCountriesSortedByPopulationDensityDES() {
        List<Country> countries = countryRepository.findAll();
        Collections.sort(countries, (c1, c2) -> Double.compare(
                (double) (c2.getPopulation() *1000000 )/ c2.getArea(),
                (double) (c1.getPopulation() * 1000000)/ c1.getArea()));

        return countries;
    }

    public Country getCountryByName(String countryName) {
        return countryRepository.findByCountryName(countryName);
    }

    public List<Country> getCountryWithMostBorderingCountriesFromDifferentRegion(String countryName) {

        List<Country> countryList = countryRepository.findAll();

        Country targetContries = getCountryByName(countryName);

       return targetContries.getBorderingCountries().stream().map(borderingCountryName -> countryList.stream()
                .filter(c -> c.getCountryName().equalsIgnoreCase(borderingCountryName))
                .findFirst()
                .orElse(null))
                .filter(borderingCountry -> borderingCountry != null &&
                        !borderingCountry.getRegion().equalsIgnoreCase(targetContries.getRegion())).collect(Collectors.toList());
    }

}
