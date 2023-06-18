package myWebProject.web.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static myWebProject.web.domain.QPost.post;
import static myWebProject.web.domain.QPostSpec.postSpec;

@Repository
@RequiredArgsConstructor
public class PostRepository implements IPostRepository{
    private final JPAQueryFactory queryFactory;
    private final EntityManager em;

    @Override
    public void save(Post post){ em.persist(post); }

    @Override
    public List<Post> findAll(){
        return queryFactory
                .select(post)
                .from(post)
                .join(post.postSpec, postSpec).fetchJoin()
                .where(post.postSpec.postSpecCode.eq("01")) // 01.경력사항게시판
                .fetch();
    }
    @Override
    public Post findPostSpec(Long id){
        return queryFactory
                .select(post)
                .from(post)
                .join(post.postSpec, postSpec).fetchJoin()
                .where(post.postSpec.postSpecCode.eq("01")
                .and(post.postId.eq(id))).fetchOne();
    }


}
