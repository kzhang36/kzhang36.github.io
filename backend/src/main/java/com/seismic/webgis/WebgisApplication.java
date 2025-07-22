package com.seismic.webgis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebgisApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebgisApplication.class, args);
    }
}
