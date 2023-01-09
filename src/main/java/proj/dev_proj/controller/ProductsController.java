package proj.dev_proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import proj.dev_proj.item.Item;
import proj.dev_proj.item.ItemRepository;
import proj.dev_proj.item.ItemRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    ItemRepository itemRepository = new ItemRepositoryImpl();

    @GetMapping("/{categoryId}")
    public String mens_products(@PathVariable long categoryId, Model model) {
        List<Item> itemList = new ArrayList<>();
        List<Item> postItems = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getCategory().equals(categoryId)) {
                postItems.add(item);
            }
        }
        model.addAttribute("item", itemList);

        return "basic/products";
    }

}
