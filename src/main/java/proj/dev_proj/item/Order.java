package proj.dev_proj.item;


import lombok.Getter;
import lombok.Setter;
import proj.dev_proj.member.Member;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id") // fk 이름 : member_id
    private Member member;

    @OneToMany(fetch = LAZY)
    private List<Item> itemList = new ArrayList<>();

    private LocalDateTime orderDate; // 주문 시간


}
