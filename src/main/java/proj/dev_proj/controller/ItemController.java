package proj.dev_proj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import proj.dev_proj.item.Item;
import proj.dev_proj.item.ItemRepository;
import proj.dev_proj.order.OrderRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;

    @RequestMapping("/{categoryId}")
    public String Product(@PathVariable long categoryId, Model model) {
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

    @GetMapping("/single-product")
    public String Single_Product(@ModelAttribute("item") Item selectitem,
                                 Model model) {
        Item item = itemRepository.findOne(selectitem.getId());
        model.addAttribute("item", item);
        return "basic/single-product";
    }

//    @PostMapping("/add")
//    public String addV3(@ModelAttribute Item item, Model model) {
//        orderRepository.addOrder(item);
//        return "basic/single-product";
//    }
}
