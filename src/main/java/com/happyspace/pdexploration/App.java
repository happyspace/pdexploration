package com.happyspace.pdexploration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * Create a simple application that will read directories via NFS4J.
 *
 *
 */
@EnableAutoConfiguration
@Component
@ComponentScan
@EnableScheduling
@EnableConfigurationProperties
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
    }

    private static void init() {
        // log.info( "Hello World!" );
    }
}
