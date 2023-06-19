package myWebProject.web.service;

import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostEdit;
import myWebProject.web.domain.PostSpec;
import myWebProject.web.repository.IPostRepository;
import myWebProject.web.repository.PostRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PostServiceTest {
    @Autowired
    private IPostRepository postRepository;
    @Autowired
    private IPostService postService;

    @Test
    void createPost() throws Exception{
        PostSpec postSpec = new PostSpec();
        postSpec.setPostSpecCode("01"); // 01:경력사항게시판
        postSpec.setPostComboName("HIGHLIGHT 채용");
        postSpec.setContentTitle("Recruiter Says,");
        postSpec.setContent("카카오뱅크의 서버 개발자는 높은 수준의 트래픽을 가진 대국민 서비스를 직접 개발하고 운영합니다.");
        postSpec.setStartDate("20210101");
        postSpec.setEndDate("20221231");

        Post post = new Post();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        post.setFirstRegTime(timestamp);
        post.setFirstRegUser("이용규");
        post.setTitle("서버 개발자 (HIGHLIGHT 채용)");

        post.setPostSpec(postSpec);

        postRepository.save(post);

        Post selPost = postRepository.findPostSpec(post.getPostId());

        assertThat(post).isEqualTo(selPost);
    }

    @Test
    void findPostSpec() throws Exception{
    }

    @Test
    void edit() throws Exception{
        //given
        PostSpec postSpec = new PostSpec();
        postSpec.setPostSpecCode("01"); // 01:경력사항게시판
        postSpec.setPostComboName("HIGHLIGHT 채용");
        postSpec.setContentTitle("Recruiter Says,");
        postSpec.setContent("카카오뱅크의 서버 개발자는 높은 수준의 트래픽을 가진 대국민 서비스를 직접 개발하고 운영합니다.");
        postSpec.setStartDate("20210101");
        postSpec.setEndDate("20221231");

        Post post = new Post();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        post.setFirstRegTime(timestamp);
        post.setFirstRegUser("이용규");
        post.setTitle("서버 개발자 (HIGHLIGHT 채용)");

        post.setPostSpec(postSpec);

        postRepository.save(post);

        PostEdit postEdit = PostEdit.builder()
                .title("수정된 제목")
                .content("수정된 내용")
                .build();
        //when
        postService.edit(post.getPostId(), postEdit);
        //then
        Post UpdatePost = postRepository.findPostSpec(post.getPostId());

        assertEquals(postEdit.getTitle(), UpdatePost.getTitle());
        assertEquals(postEdit.getContent(), UpdatePost.getPostSpec().getContent());
    }
}