package myWebProject.web.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import myWebProject.web.domain.Post;
import myWebProject.web.domain.QPost;

import java.util.List;

public interface IPostRepository {
    void save(Post post);
    List<Post> findAll();
    Post findPostSpec(Long id);
}
