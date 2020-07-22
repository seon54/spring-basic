package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "Hello, world!!");

        // return 이후, viewResolver가 resources/templates 밑의 hello.html을 찾아서 렌더링
        return "hello";
    }
}
