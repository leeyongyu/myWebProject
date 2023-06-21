package myWebProject.web.service;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.PostDto;
import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostEdit;
import myWebProject.web.domain.PostSpec;
import myWebProject.web.repository.IPostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class PostService implements IPostService {
    private final IPostRepository postRepository;

    @Override
    public Long createPost(PostDto dto){
        PostSpec postSpec = new PostSpec(dto.getContent(), dto.getTitle(), dto.getPostComboName(), "01", dto.getStartDate(), dto.getEndDate());

        Post post = Post.builder()
                      .title(dto.getTitle())
                      .postSpec(postSpec)
                      .build();

        postRepository.save(post);

        return post.getPostId();
    }

    @Override
    public Post findPostSpec(Long id){
        return postRepository.findPostSpec(id);
    }

    @Override
    public void edit(Long id, PostEdit postEdit){
        Post post = postRepository.findPostSpec(id);

        post.edit(postEdit);
    }

    @Override
    public void delete(Long id){
        postRepository.deleteById(id);
    }

}
