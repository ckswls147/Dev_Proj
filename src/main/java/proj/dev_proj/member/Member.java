package proj.dev_proj.member;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id") //pk
    private Long id;

    private String username;

    private String nickname;

    private String password;

    @OneToMany
    @JoinColumn(name = "orders")
    private List<Order> orders = new ArrayList<>();
}
