package proj.dev_proj.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
public abstract class Item { // 부모 클래스

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String item_name;
    private int item_price;
    private int item_Quantity;
    private Category category;


}
