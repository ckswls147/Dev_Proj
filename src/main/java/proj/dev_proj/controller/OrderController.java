package proj.dev_proj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import proj.dev_proj.item.Item;
import proj.dev_proj.item.ItemRepository;
import proj.dev_proj.order.Order;
import proj.dev_proj.order.OrderRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;

    @RequestMapping("/add")
    public String add(@ModelAttribute("item") Item item,
                      Model model) {
        Item findItem = itemRepository.findOne(item.getId());
        Order order = new Order(findItem.getItem_name(), findItem.getItem_price());
        orderRepository.save(order);
        return "basic/add";
    }


    @RequestMapping("/cart")
    public String cart(@ModelAttribute("item") Item item,
                       Model model) {
        List<Order> orders = orderRepository.findAll();
        System.out.println(orders.size());
        model.addAttribute("order", orders);
        return "basic/cart";
    }

}
