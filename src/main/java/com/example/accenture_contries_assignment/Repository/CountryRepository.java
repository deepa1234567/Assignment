package com.example.accenture_contries_assignment.Repository;

import com.example.accenture_contries_assignment.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Long> {

    Country findByCountryName(String countryName);
}
