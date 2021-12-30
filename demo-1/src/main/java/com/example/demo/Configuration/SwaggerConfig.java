package com.example.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	 public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
	}
	 private Predicate<String> postPaths() {
	        return or(PathSelectors.regex("/api/posts.*"),PathSelectors.regex("/api/demoboot.*"));
	 }
	 private ApiInfo apiInfo() {
	        return new ApiInfoBuilder().title("My Project API")
	                .description("My Project API reference for developers")
	                .termsOfServiceUrl("http://myproject.com")
	                .contact("sakshimohinia18@gmail.com").license("JavaInUse License")
	                .licenseUrl("javainuse@gmail.com").version("1.0").build();
	    }
}


