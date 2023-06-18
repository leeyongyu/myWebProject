package myWebProject.web.service;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostSpec;
import myWebProject.web.repository.IPostRepository;
import myWebProject.web.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class PostService implements IPostService {
    private final IPostRepository postRepository;

    @Override
    public Long createPost(){
        PostSpec postSpec = new PostSpec();
        postSpec.setPostSpecCode("01"); // 01:경력사항게시판
        postSpec.setPostComboName("HIGHLIGHT 채용");
        postSpec.setContentTitle("Recruiter Says,");
        postSpec.setContent("카카오뱅크의 서버 개발자는 높은 수준의 트래픽을 가진 대국민 서비스를 직접 개발하고 운영합니다.");
        postSpec.setStartDate("20210101");
        postSpec.setEndDate("20221231");

        Post post = Post.createPost(postSpec);

        postRepository.save(post);

        return post.getPostId();
    }

    @Override
    public Post findPostSpec(Long id){
        return postRepository.findPostSpec(id);
    }

}
