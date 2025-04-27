package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {//모델에 데이터 넘기기
        model.addAttribute("data", "Hello!!!");
        return "hello";
    }
}
