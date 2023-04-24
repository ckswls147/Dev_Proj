package proj.dev_proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import proj.dev_proj.member.Member;

@Controller
public class HomeController {

    @GetMapping("/test")
    public String test() {
        return "basic/test";
    }

    @GetMapping("/")
    public String index() {
        return "basic/index";
    }

    @GetMapping("/about")
    public String about() {
        return "basic/about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "basic/contact";
    }

    @GetMapping("/products")
    public String products(Member member) {
        return "basic/products";
    }


    @GetMapping("/single-product")
    public String single_product() {
        return "basic/single-product";
    }

}
