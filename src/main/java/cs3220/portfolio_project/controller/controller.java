package cs3220.portfolio_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    public controller() {}

    @GetMapping("/")
    public String index(){
        return "home";}
}
