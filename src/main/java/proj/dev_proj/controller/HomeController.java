package proj.dev_proj.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import proj.dev_proj.member.Member;
import proj.dev_proj.member.MemberRepository;

@Controller
@RequiredArgsConstructor
public class HomeController {

    MemberRepository memberRepository = new MemberRepository();

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("/list")
    public String memberList() {
        return "basic/list";
    }

    @GetMapping("/info/{memberId}")
    public String member(Long memberId, Model model) {
        Member findMember = memberRepository.findById(memberId);
        model.addAttribute("member", findMember);
        return "basic/info";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "basic/login";
    }

//    @PostMapping("login")
//    public String login(@ModelAttribute Member member) {
//
//    }

    @GetMapping("/signup")
    public String signupForm() {
        return "basic/signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute Member member) {
        memberRepository.save(member);
        return "redirect:/login";
    }
}
