package myWebProject.web.service;

import myWebProject.web.domain.Post;
import java.util.List;

public interface IPostService {
    Long createPost();
    Post findPostSpec(Long id);
}
