package myWebProject.web.service;

import myWebProject.web.domain.PostDto;
import myWebProject.web.domain.Post;
import myWebProject.web.domain.PostEdit;

public interface IPostService {
    Long createPost(PostDto dto);
    Post findPostSpec(Long id);
    void edit(Long id, PostEdit postEdit);
    void delete(Long id);
}
