package com.spring.basic.controller;

import com.spring.basic.service.HellowService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
    //속성
    private final ApplicationContext applicationContext;
    private final HellowService hellowService;
    //생성자
    public HelloController(ApplicationContext applicationContext,HellowService hellowService) {
     this.applicationContext = applicationContext;
     this.hellowService = hellowService;
    }
    //기능


    @GetMapping()
    public String sayHelloController() {

        //스프링컨테이너에 등록된 빈 목록을 확인하기
//         String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//         for (String beanName : beanDefinitionNames) {
//             System.out.println(beanName);
//         }

        hellowService.method();
        return "hello i am boy";

    }
}
