package com.example.accenture_contries_assignment.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    private String countryName;

    private String region;


    private Long population;

    private Long area;

    private List<String> borderingCountries;

    public List<String> getBorderingCountries() {
        return borderingCountries;
    }

    public void setBorderingCountries(List<String> borderingCountries) {
        this.borderingCountries = borderingCountries;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

}
