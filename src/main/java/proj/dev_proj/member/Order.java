package proj.dev_proj.member;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

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

//    private List<Item> itemList = new ArrayList<>();

    private LocalDateTime orderDate; // 주문 시간

//    //==연관 관계 메서드==//
//    public void setMember(Member member) {
//        this.member = member;
//        member.getOrders().add(this);
//    }

}
