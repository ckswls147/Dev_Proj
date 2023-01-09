package proj.dev_proj.item;

import java.util.List;

public interface ItemRepository {
    Item findById(Long itemId);

    List<Item> findAll();

}
