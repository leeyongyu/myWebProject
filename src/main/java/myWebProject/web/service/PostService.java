package myWebProject.web.service;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostSpec;
import myWebProject.web.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Long createPost(){
        PostSpec postSpec = new PostSpec();
        postSpec.setPostSpecCode("01"); // 01:경력사항게시판
        postSpec.setPostComboName("계정계");
        postSpec.setContent("안녕하세요.");
        postSpec.setStartDate("20210101");
        postSpec.setEndDate("20221231");

        Post post = Post.createPost(postSpec);

        postRepository.save(post);

        return post.getPostId();
    }
}
