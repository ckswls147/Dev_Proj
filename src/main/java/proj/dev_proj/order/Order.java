package proj.dev_proj.order;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter @Setter
@NoArgsConstructor
@Transactional
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @Column
    private String name;

    @Column
    private Long price;

    public Order(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    //
//    public static Order createOrder(Long id, List itemList) {
//        Order order = new Order();
//        order.setId(id);
//        order.setItemList(itemList);
//    }

}
