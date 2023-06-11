package myWebProject.web.controller;

import lombok.RequiredArgsConstructor;
import myWebProject.web.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/career")
public class CareerController {

    @GetMapping
    public String career(Model model) {
        return "career";
    }
    @GetMapping("/{postId}")
    public String findCareerPost(@PathVariable("postId") String postId){
        //Post post = postService.findPost(postId);
        //model.addAttribute("post",post);
        return "careerPost";
    }

    @PostMapping("/career/new")
    public String createCareerPost(Model model){
        return "redirect:/career";
    }
}
