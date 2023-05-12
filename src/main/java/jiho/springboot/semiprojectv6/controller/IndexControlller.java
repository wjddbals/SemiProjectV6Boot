package jiho.springboot.semiprojectv6.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControlller {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/intro")
    public String intro() {
        return "intro.tiles";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin.tiles";
    }

}