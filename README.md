# Technical Interview - Employee API

REST API for employees

## Pre-requisites
* Java 17
* Maven

## How to run

```
mvn spring-boot:run
```


## How to test
* To get all employees details
```
curl http://localhost:8080/employees
```

* To save a new employee
```
curl http://localhost:8080/employees \
    --include \
    --header "Content-Type: application/json" \
    --request "POST" \
    --data '{"id": "P020", "name": "Smith John", "team": "Payment"}'
```
