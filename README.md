# gatlingdemo
Sure, here's a sample README file for a project that includes a Gatling endpoint and a demo test class:

# Project Name

This project provides a sample implementation of a Gatling endpoint and a demo Gatling test class.

## Gatling Endpoint

The Gatling endpoint is implemented as a simple REST API that returns a random number with a random delay. The endpoint can be accessed using the following URL:

```
http://localhost:8080/gatling
```

The response format is JSON and looks like this:

```json
{
  23454
}
```

The `randomNumber` field contains a random integer between 1 and 100000, and the `delayMillis` field contains a random time delay between 100 and 1000 milliseconds.

## Gatling Demo Test Class

The demo Gatling test class is located in the `src/test/scala/com/example/GatlingSimulation.scala` file. It sends 1000 HTTP GET requests to the `/gatling` endpoint and checks that the response status is 200.

To run the demo test, you can use the following command:

```
 mvn gatling:test -Dgatling.skip=false -Dgatling.simulationClass=basic.ApiGatlingSimulationTest

```

This will start the Gatling test runner and execute the demo test. The test results will be displayed in the console and a detailed HTML report will be generated in the `build/reports/gatling` directory.

## Dependencies

This project uses the following dependencies:

- Spring Boot 3.x
- Gatling 3.9.x

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
