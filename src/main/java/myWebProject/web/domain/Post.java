package myWebProject.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue
    private Long postId;

    @OneToOne(fetch = LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name ="postSpecId")
    private PostSpec postSpec;

    private String title;
    private Long searchCount;
    private Timestamp firstRegTime;
    private String firstRegUser;
    private Timestamp lastRegTime;
    private String lastRegUser;

    public void setPostSpec(PostSpec postSpec){
        this.postSpec = postSpec;
        postSpec.setPost(this);
    }

    public static Post createPost(PostSpec postSpec){
        Post post = new Post();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        post.setFirstRegTime(timestamp);
        post.setFirstRegUser("이용규");
        post.setTitle("제목 테스트1");

        post.setPostSpec(postSpec);

        return post;
    }
}