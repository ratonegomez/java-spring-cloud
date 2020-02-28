package jv.spring.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class HelloWordController {

    @Autowired private Environment environment;

    @GetMapping(path = "/hello")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello World. Port number: "+environment.getProperty("server.port"), HttpStatus.OK);
    }
}
