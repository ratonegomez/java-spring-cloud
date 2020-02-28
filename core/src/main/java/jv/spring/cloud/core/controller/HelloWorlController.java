package jv.spring.cloud.core.controller;

import jv.spring.cloud.core.proxy.HelloWorldProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/core")
@Slf4j
public class HelloWorlController {

    @Autowired private HelloWorldProxy helloWorldProxy;

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello(){
        log.info("Call HelloWorldProxy from Core");
        return helloWorldProxy.hello();
    }
}
