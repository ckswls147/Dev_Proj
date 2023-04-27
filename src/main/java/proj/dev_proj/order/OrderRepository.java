package proj.dev_proj.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import proj.dev_proj.item.Item;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Item item) {
        em.persist(item);
    }


}
