package com.example.demomicrometer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ApplicationController {

    @GetMapping("/ping")
    String ping() {
        log.info("Got a request");
        return "OK";
    }

}
