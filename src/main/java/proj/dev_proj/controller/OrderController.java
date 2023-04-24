package proj.dev_proj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import proj.dev_proj.item.Item;
import proj.dev_proj.item.ItemRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final ItemRepository itemRepository;

    @RequestMapping("/cart")
    public String cart(@ModelAttribute("item") Item item,
                       Model model) {
        List<Item> allItem = itemRepository.findAllItem();
        return "basic/cart";
    }

}
