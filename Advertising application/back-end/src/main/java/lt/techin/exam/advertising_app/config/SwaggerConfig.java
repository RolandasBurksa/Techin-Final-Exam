package lt.techin.exam.advertising_app.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Advert and Categories API")
                        .version("1.0.0")
                        .description("API documentation for the Advert API")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .contact(new Contact().name("Rolandas Burksa").email("rolandas.burksa@stud.techin.lt")));
    }
    @Bean
    public GroupedOpenApi organizationApi() {
        return GroupedOpenApi.builder()
                .group("organization-api")
                .pathsToMatch("/api/adverts/**", "/api/categories/**")
                .build();
    }

}
