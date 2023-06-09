package myWebProject.web.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
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

    public void setEdit(PostEdit postEdit){
        this.title = postEdit.getTitle();
        this.postSpec.setContentTitle(postEdit.getContentTitle());
        this.postSpec.setPostComboName(postEdit.getPostComboName());
        this.postSpec.setContent(postEdit.getContent());
        this.postSpec.setStartDate(postEdit.getStartDate());
        this.postSpec.setEndDate(postEdit.getEndDate());
    }
}
