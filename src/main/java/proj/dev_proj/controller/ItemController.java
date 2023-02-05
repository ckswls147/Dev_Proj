package proj.dev_proj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import proj.dev_proj.item.Item;
import proj.dev_proj.item.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;


    @RequestMapping(value = "/{categoryId}")
    public String Thymeleaf(@PathVariable long categoryId, Model model){
        List<Item> itemList = itemRepository.findAllItem();
        List<Item> postItems = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getCategory().equals(categoryId)) {
                postItems.add(item);
            }
        }
        //add data to view
        model.addAttribute("itemList", postItems);
        return "basic/products";
    }


}
