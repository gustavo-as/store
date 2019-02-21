package br.com.gustavosimoes.storeauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreAuthServerApplication.class, args);
    }

}
