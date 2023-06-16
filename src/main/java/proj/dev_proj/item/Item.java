package proj.dev_proj.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
public class Item { // 부모 클래스

    public Item() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;
    private Long category;
    private String item_name;
    private Long item_price;

    public Item(String item_name, Long item_price) {
        this.item_name = item_name;
        this.item_price = item_price;
    }
}
