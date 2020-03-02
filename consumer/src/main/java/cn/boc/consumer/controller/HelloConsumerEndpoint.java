package cn.boc.consumer.controller;

import cn.boc.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Hello Endpoint
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloConsumerEndpoint {
    @Autowired
    private HelloService helloService;

    @Autowired
    RestTemplate restTemplate;

    /**
     * Hello 使用feign
     * @return
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name){
        System.out.println("调用");
        return this.helloService.hello(name);
    }

    /**
     * 使用ribbon
     * @param name
     * @return
     */
    @RequestMapping(value = "/ribbon/{name}",method = RequestMethod.GET)
    public String hello2(@PathVariable String name){
        return restTemplate.getForObject("http://HP-SERVICE/hello/"+name, String.class);
    }
}
