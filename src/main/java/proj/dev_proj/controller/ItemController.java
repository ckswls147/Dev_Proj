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
        model.addAttribute("msg", "장바구니 저장");
        return "basic/single-product";
    }

    @PostMapping("/single-product")
    public String Add_Cart(@ModelAttribute("add_item") Item item,
                           Model model) {
        orderRepository.save(item);
        return "basic/single-product";
    }
}
