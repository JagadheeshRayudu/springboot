package com.java.spring.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@OpenAPIDefinition(info = @Info(title = "People API", version = "2.0", description = "People Information"))
@SpringBootApplication
@ComponentScan("com.java.spring.swagger")
public class SwaggerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
	/*@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}*/
}
