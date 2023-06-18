package myWebProject.web.controller;

import lombok.RequiredArgsConstructor;
import myWebProject.web.repository.MemberRepository;
import myWebProject.web.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final PostService postService;

    @GetMapping
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("test", "테스트");
        return "index";
    }

    @GetMapping("sample")
    public String sample(HttpServletRequest request, Model model) {

        model.addAttribute("test", "테스트");
        return "sample";
    }

    @GetMapping("samplePage")
    public String sample2(HttpServletRequest request, Model model) {

        model.addAttribute("test", "테스트");
        return "samplePage";
    }
}
