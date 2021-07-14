package com.example.firstservice;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/first-service")
@Slf4j
@NoArgsConstructor
public class FirstServiceController {

    @Autowired
    Environment env;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First service.";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info(header);
        return "hi first service";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request){
        log.info("server port=", request.getServerPort());
        return String.format("hi, first server %s", env.getProperty("local.server.port"));
    }
}
