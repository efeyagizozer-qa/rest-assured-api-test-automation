# REST Assured API Test Automation Framework

REST Assured + Cucumber based API automation framework built with Java and Maven.

This project was created to practice scalable API test automation design, reusable framework structure, and real-world API validation workflows.

---

## Technologies Used

- Java 11
- REST Assured
- Cucumber BDD
- JUnit
- Maven
- Hamcrest

---

## Framework Features

- API request and response validation
- Authentication header management
- Query parameter handling
- Config-driven environment setup
- Reusable step definitions
- JSON response assertions
- Cucumber feature file structure
- Maven-based project management

---

## Project Structure

```bash
src
 └── test
      ├── java
      │     └── com.efeozer
      │            ├── api
      │            ├── pojo
      │            ├── runners
      │            ├── stepdefinitions
      │            └── utilities
      │
      └── resources
             ├── features
             └── schemas
```

---

## Current Test Coverage

### ReqRes Users API

- GET users request
- Status code validation
- Response body validation
- API key authentication handling

---

## Sample Test Scenario

```gherkin
Feature: ReqRes Users API

  Scenario: Get users successfully

    Given user sends GET request to "/api/users"
    Then status code should be 200
    And page number should be 2
```

---

## Sample Request Flow

```java
response = RestAssured
        .given()
        .baseUri(ConfigurationReader.getProperty("base_url"))
        .header("x-api-key",
                ConfigurationReader.getProperty("api_key"))
        .queryParam("page", 2)
        .when()
        .get(endpoint);
```

---

## Goals of This Project

- Build reusable API automation architecture
- Practice REST Assured framework design
- Improve API validation and assertion skills
- Create scalable test structure
- Simulate real-world API automation workflows

---

## Planned Improvements

- POST / PUT / DELETE requests
- Schema validation
- POJO deserialization
- Request / Response specifications
- Reusable API utilities
- Reporting integration
- CI/CD integration
- Docker support
- Jenkins integration

---

## Notes

This repository is part of an ongoing automation engineering portfolio focused on modern QA and API automation practices.
