package cn.boc.consumer.service;

import org.springframework.stereotype.Component;

/**
 * Hello服务降级实现
 *
 */
@Component
public class HelloServiceFallback implements HelloService {
    public String hello(String name) {
        return "Hello, " + name + ", I'm fallback!";
    }
}
