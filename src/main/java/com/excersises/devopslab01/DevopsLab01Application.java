package com.excersises.devopslab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsLab01Application {

    public static void main(String[] args) {
        SpringApplication.run(DevopsLab01Application.class, args);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
