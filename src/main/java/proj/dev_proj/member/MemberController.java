package proj.dev_proj.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import proj.dev_proj.MemberData;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;


    @GetMapping("/signup")
    public String signup_form() {
        return "basic/member/signup";
    }

//    @PostMapping("/signup")
//    public String signup(@ModelAttribute MemberData memberdata
//    ) {
//        Member member = new Member();
//        member.setUsername(memberdata.getUsername());
//        member.setPassword(memberdata.getPassword());
//        member.setNickname(memberdata.getNickname());
//        String check_pwd = memberdata.getPassword2();
//        member.setId(1L);
//        System.out.println(member);
//        System.out.println(check_pwd);
//        System.out.println(member.getId());
//        memberService.join(member, check_pwd);
//        return "redirect:/";
//    }

    @GetMapping("/login")
    public String login_form() {
        return "basic/member/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberData memberData) {
        return "redirect:/";
    }
}

