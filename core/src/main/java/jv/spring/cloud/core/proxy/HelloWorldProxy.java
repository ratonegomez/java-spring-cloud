package jv.spring.cloud.core.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RibbonClient(name = "eureka-client")
@FeignClient(name = "gateway")
@RequestMapping(value = "/eureka-client/api")
public interface HelloWorldProxy {

    @GetMapping(path = "/hello")
    ResponseEntity<String> hello();
}
