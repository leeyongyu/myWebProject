package myWebProject.web.controller;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Member;
import myWebProject.web.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@Transactional
public class MainController {

    private final MemberRepository memberRepository;

    @GetMapping
    public String index(HttpServletRequest request, Model model) {

        model.addAttribute("test", "테스트");
        return "index";
    }

    @GetMapping("dashboard")
    public String dashboard(Model model) {

        Member member = new Member();
        member.setUsername("홍길동");
        memberRepository.save(member);

        model.addAttribute("member",member);

        return "dashboard";
    }
}
