# Country Border Management

This project is a Spring Boot application that manages country and border information, including a feature to retrieve the country with the most bordering countries from different regions.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Service Layer](#service-layer)
- [Docker Integration](#docker-integration)
- [Contributing](#contributing)
- [License](#license)

## Features

- Add and retrieve country information.
- Add and retrieve border information.
- Retrieve the country with the most bordering countries from different regions.

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (for testing)
- Maven
- Docker

## Setup and Installation

### Prerequisites

- Java 17
- Maven
- Docker

### Installation Steps

1. **Clone the repository:**

   ```bash
   git clone https://github.com/deepa1234567/Assignment.git
   cd Assignment

2. **Build the project:**
   ```bash
    mvn clean install

3. **Run the application:**
    ```bash
    mvn spring-boot:run
   
The application will start on http://localhost:8080.

### EndPoints
Below are described the REST endpoints available that you can use to search for countries

# Country API Endpoints

This RESTful API provides endpoints to perform CRUD operations on country data.

## Endpoints

### Save Country
- **URL:** `/v1/api/country/saveCountry`
- **Method:** `POST`
- **Description:** Saves a new country.
- **Request Body:** JSON object representing the country.
  ```json
  {
    "countryName": "Country Name",
    "population": 1000000,
    "area": 10000,
    "region": "Region Name",
    "borderingCountries": ["Bordering Country 1", "Bordering Country 2"],
  }
  
Response: Returns the saved country object.

### Get All Countries
- **URL:** `/v1/api/country/getAllCountries`
- **Method:** 'GET'
- **Description:** Retrieves all countries.
- **Request Body:** Returns a list of all countries.

### Get Countries Sorted by Population Density (Descending)
- **URL:** `/v1/api/country/sortedByDensityDES`
- **Method:** 'GET'
- **Description:** Retrieves countries sorted by population density in descending order.
- **Request Body:** Returns a list of countries sorted by population density in descending order.

### Get Country with Most Bordering Countries from Different Region
- **URL:** `/v1/api/country/mostBorderingCountries/{countryName}`
- **Method:** 'GET'
- **Description:** Retrieves the country with the most bordering countries from a different region.
- **Path Variable:** 
  - **`countryName`:** Name of the country to retrieve.
- **Request Body:** Returns a list of countries with the most bordering countries from a different region.

### Author

Deepika

```bash
Feel free to customize it further according to your needs! Let me know if you need any more assistance.
