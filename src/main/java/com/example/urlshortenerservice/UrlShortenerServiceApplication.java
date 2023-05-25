package com.example.urlshortenerservice;



import com.example.urlshortenerservice.rabbitMQ.RabbitConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UrlShortenerServiceApplication implements CommandLineRunner{

    @Autowired
    private RabbitConnection rabbitConnection;

    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        rabbitConnection.startConsuming();
    }
}

