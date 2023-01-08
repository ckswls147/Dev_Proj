package proj.dev_proj.member;


import lombok.Getter;
import lombok.Setter;

import java.util.SplittableRandom;


@Getter @Setter
public class Member {
public Member() {
    }
    private long id;
    private String username;
    private String password;
    private String nickname;

}
