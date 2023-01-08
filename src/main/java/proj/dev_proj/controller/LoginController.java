package proj.dev_proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proj.dev_proj.MemberData;
import proj.dev_proj.member.Member;
import proj.dev_proj.member.MemberService;
import proj.dev_proj.member.MemberServiceImp;

import java.lang.reflect.Parameter;

@Controller
public class LoginController {
    MemberService memberService = new MemberServiceImp();


    @GetMapping("/signup")
    public String Signup_form() {
        return "basic/member/signup";
    }

    @PostMapping("/signup")
    public String Signup(@ModelAttribute MemberData memberdata
    ) {

        Member member = new Member();
        member.setUsername(memberdata.getUsername());
        member.setPassword(memberdata.getPassword());
        member.setNickname(memberdata.getNickname());
        String check_pwd = memberdata.getPassword2();
        System.out.println("check_pwd = " + check_pwd);

        memberService.join(member, check_pwd);
        return "redirect:/";
    }

}
