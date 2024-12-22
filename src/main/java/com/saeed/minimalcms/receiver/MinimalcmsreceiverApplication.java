package com.saeed.minimalcms.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MinimalcmsreceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinimalcmsreceiverApplication.class, args);
    }

}
