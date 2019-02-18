package br.com.gustavosimoes.storeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StoreEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreEurekaServerApplication.class, args);
    }

}
