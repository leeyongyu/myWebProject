package myWebProject.web.repository;

import myWebProject.web.domain.Post;
import java.util.List;

public interface IMemberRepository {

    List<Post> findAll();
}
