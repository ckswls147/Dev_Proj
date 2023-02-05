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

//    @RequestMapping(value = "/products/iteration")
//    public String Thymeleaf(Model model){
//        List<Item> itemList = new ArrayList<>();
//        // constructor >> seq, name, price, quantity
//        productList.add(new Product(1,"사과",1000,10));
//        productList.add(new Product(2,"배",2000,16));
//        productList.add(new Product(3,"초콜릿",1000,3));
//        productList.add(new Product(4,"치킨",15000,1));
//        //add data to view
//        model.addAttribute("productList",productList);
//        return "thymeleaf/iteration";
//    }

    @GetMapping("/single-product")
    public String single_product() {
        return "basic/single-product";
    }

}
