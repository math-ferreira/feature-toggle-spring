---

# Feature Toggle with Spring Framework

This backend project serves as a practical demonstration of implementing feature toggles using the Spring Framework, specifically integrating the external library Togglz. Feature toggles, or feature flags, allow dynamic control over the behavior of a software application by enabling or disabling features at runtime.

## Objective

The main goal of this project is to explore and understand the integration of the Togglz library with the Spring Framework. By doing so, we aim to comprehend the necessary configurations and processes involved in creating custom features that can be toggled in real-time, influencing the application's behavior based on boolean values (true or false).

## Features

- Integration with [Togglz library](https://www.togglz.org/).
- Dynamic feature toggling.
- Real-time modification of application behavior.
- Access to the feature toggle console via a web browser.

## Getting Started

Follow these steps to set up and run the project locally:

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/math-ferreira/feature-toggle-spring.git
   ```

2. **Build and Run:**

   ```bash
   cd feature-toggle-spring
   ./mvnw spring-boot:run
   ```

3. **Access the Feature Toggle Console:**

   Open your web browser and navigate to [http://localhost:8080/togglz-console](http://localhost:8080/togglz-console) to access the Togglz console.


## Contributing

Feel free to contribute to this project by submitting issues, feature requests, or pull requests. Your feedback and contributions are highly appreciated.

## License

This project is licensed under the [MIT License](LICENSE).
