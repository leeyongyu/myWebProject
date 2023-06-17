package myWebProject.web.controller;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Post;
import myWebProject.web.repository.IPostRepository;
import myWebProject.web.repository.PostRepository;
import myWebProject.web.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/career")
public class CareerController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final IPostRepository postRepository;

    @GetMapping
    public String career(Model model) {
        List<Post> postList = postRepository.findAll();
        log.debug("list.size() = {}",postList.size());
        model.addAttribute("postItems",postList);
        return "career";
    }
    @GetMapping("/{postId}")
    public String findCareerPost(@PathVariable("postId") String postId){
        //Post post = postService.findPost(postId);
        //model.addAttribute("post",post);
        return "careerPost";
    }

    @PostMapping("/new")
    public String createCareerPost(Model model){
        return "redirect:/career";
    }
}
