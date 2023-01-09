package proj.dev_proj.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRepositoryImpl implements ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //static
    private static long sequence = 0L; //static

    @Override
    public Item findById(Long itemId) {
        return store.get(itemId);
    }

    @Override
    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }
}
