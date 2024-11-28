# WeatherApp
<p>Java/Spring application for weather forecasts management, collecting data from external API, created following a three-tier 
architecture: repository, service and controller. The packaging format is JAR. This application uses MySQL database 
with a pre-created data.sql file containing several queries to add initial records to the database.</p>

<p>
All the data from external API are being downloaded automatically during start-up. Automatic forecasts update is scheduled.
</p>

Stack: 
* Java 17
* Spring Boot 3.2.4
* Maven 4.0.0
* MySQL 8.0.28
* Docker (for integration tests)

---

# How to Run
To run the application, follow these steps:
* Clone this repository.
* Make sure you are using JDK 8 and Maven 4.0.0 or higher.
* Create new MySQL database and set its details by editing the application.properties file or setting the environment variables.
* Generate your One Call API 3.0 key on OpenWeather website.
* Paste your One Call API key in WeatherClient class or set it as environment variable.
* Define environment variable named `API_URL` with value `https://api.openweathermap.org/data/3.0` or hardcode it in WeatherClient class.

All environment variables possible to be defined:
```
DATABASE_NAME
DATABASE_USERNAME
DATABASE_PASSWORD
API_URL
EXTERNAL_API_KEY
```

### Build the project
In your terminal navigate to the root directory of the project and run following Maven command:
```
mvn clean install
```

### Run the application
```
mvn spring-boot:run
```

Alternatively, you can run the app in your IDE.

---

# Service
The application is just a simple REST service. You can perform some operations:
* Get city/cities details from database.
* Update city details.
* Get daily/hourly forecast for some location.
* Update forecasts for one or all locations.


## API endpoints
### GET
`/city/all` - get list of all cities with details. <br/><br/>
`/city/{id}` - get the details of city with `id = {id}`.<br/><br/>
`/forecast/{id}/hourly` - get hourly forecast for city with `id = {id}`.<br/><br/>
`/forecast/{id}/daily` - get daily forecast for city with `id = {id}`.

### PUT
`/city/{id}/update` - update the details of city with `id = {id}`.<br/><br/>
`/forecast/update/{id}` - update forecasts for city with `id = {id}` and `JSON` body:<br/>

```
Body example:
{
    "name": "Wroclaw",
    "longitude": 51.11043,
    "latitude": 17.03413
}
```

`/forecast/update/all` - update forecasts for all cities.