package proj.dev_proj.order;


import lombok.Getter;
import lombok.Setter;
import proj.dev_proj.item.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @OneToMany(fetch = LAZY)
    private List<Item> itemList = new ArrayList<>();

}
