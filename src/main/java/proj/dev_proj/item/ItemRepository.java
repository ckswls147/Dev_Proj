package proj.dev_proj.item;

import java.util.List;

public interface ItemRepository {

    void save(Item item);

    List<Item> findAllItem();
}
