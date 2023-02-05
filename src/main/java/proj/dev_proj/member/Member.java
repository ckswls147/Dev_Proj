package proj.dev_proj.member;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String username;

    private String nickname;

    private String password;
//
//    @OneToMany
//    @JoinColumn(name = "orders")
//    private List<Order> orders = new ArrayList<>();
}
