package com.hasanlo.p6spy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class P6spyApplication {

    public static void main(String[] args) {
        SpringApplication.run(P6spyApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
        };
    }
}
