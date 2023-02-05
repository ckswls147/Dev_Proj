package proj.dev_proj.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {

    private final EntityManager em;

    @Override
    public void save(Item item) {
        em.persist(item);
    }

    @Override
    public List<Item> findAllItem() {
        return em.createQuery("select m from Item m", Item.class)
                .getResultList();
    }
}
