package proj.dev_proj.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import proj.dev_proj.item.Item;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Long add(Item item) {
        orderRepository.save(item);
        System.out.println("add");

        return item.getId();
    }

}
