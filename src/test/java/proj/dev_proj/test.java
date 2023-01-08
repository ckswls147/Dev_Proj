package proj.dev_proj;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import proj.dev_proj.member.*;

import static org.assertj.core.api.Assertions.*;

public class test {

    MemberService memberService = new MemberServiceImp();
    MemberRepository memberRepository = new MemberRepositoryImpl();

    @Test
    void create() {
        Member member = new Member();
        member.setUsername("asd");
        member.setNickname("nick");
        member.setPassword("1234");
        String pwd_check = "1234";
        Long i = memberService.join(member, pwd_check);
        Member member1 = new Member();
        member1.setUsername("asda");
        member1.setNickname("nicka");
        member1.setPassword("12341");
        String pwd_check1 = "12341";
        Long j = memberService.join(member1, pwd_check1);

        assertThat(2L).isEqualTo(j);

    }
}
