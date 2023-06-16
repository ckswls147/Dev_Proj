package proj.dev_proj.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    private final EntityManager em;

    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    public List<Item> findAllItem() {
        return em.createQuery("select m from Item m", Item.class)
                .getResultList();
    }

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }



    public Item findOne(Long id) {
        return em.find(Item.class, id);
    }
    public List<Item> findAll() {
        return em.createQuery("select i from Item i",Item.class).getResultList();
    }
}
