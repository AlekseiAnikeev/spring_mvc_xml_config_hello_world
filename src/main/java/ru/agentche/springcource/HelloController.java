package ru.agentche.springcource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 21.12.2022
 */
@Controller
public class HelloController  {
    @GetMapping("/hello_world")
    public String sayHello() {
        return "hello_world";
    }
}
