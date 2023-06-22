package myWebProject.web.controller;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.PostDto;
import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostEdit;
import myWebProject.web.repository.IPostRepository;
import myWebProject.web.service.IPostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CareerController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final IPostRepository postRepository;
    private final IPostService postService;

    @GetMapping("/career")
    public String career(Model model) {
        List<Post> postList = postRepository.findAll();
        model.addAttribute("postItems",postList);
        return "career";
    }

    @GetMapping("/career/{postId}")
    public String findCareerPost(@PathVariable("postId") Long postId, Model model){
        Post post = postService.findPostSpec(postId);
        model.addAttribute("postItem",post);
        model.addAttribute("postId",post.getPostId());
        return "careerPost";
    }

    @GetMapping("/career/createForm")
    public String createForm(Model model) {
        return "createCareerPost";
    }
    @PostMapping("/career/create")
    public String createCareerPost(Model model , @RequestBody @Valid PostDto dto){
        postService.createPost(dto);
        return "redirect:/career";
    }

    @GetMapping("/career/editForm/{postId}")
    public String editForm(@PathVariable("postId") Long postId, Model model) {
        Post post = postService.findPostSpec(postId);
        model.addAttribute("postItem",post);

        return "updateCareerPost";
    }
    @PatchMapping("/career/{postId}")
    public String edit(@PathVariable Long postId, @RequestBody PostEdit postEdit){
        postService.edit(postId,postEdit);

        return "redirect:/career";
    }

    @DeleteMapping("/career/{postId}")
    public String delete(@PathVariable @Valid Long postId){
        postService.delete(postId);
        return "redirect:/career";
    }

}
