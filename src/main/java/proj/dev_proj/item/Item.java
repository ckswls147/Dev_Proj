package proj.dev_proj.item;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {
    public Item() {
    }

    private Long itemid;
    private String itemname;
    private String category;
    private Long price;

}
