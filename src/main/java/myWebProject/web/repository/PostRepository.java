package myWebProject.web.repository;

import lombok.RequiredArgsConstructor;
import myWebProject.web.domain.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class PostRepository {

    private final EntityManager em;

    public void save(Post post){ em.persist(post); }

}
