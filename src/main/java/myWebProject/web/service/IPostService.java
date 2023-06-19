package myWebProject.web.service;

import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostEdit;

import java.util.List;

public interface IPostService {
    Long createPost();
    Post findPostSpec(Long id);
    void edit(Long id, PostEdit postEdit);
}
