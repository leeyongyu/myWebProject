package myWebProject.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "POST_SPEC")
public class PostSpec {
    @Id
    @GeneratedValue
    @Column(name = "postSpecId")
    private Long id;

    @OneToOne(mappedBy = "postSpec", fetch = FetchType.LAZY)
    private Post post;

    private String postSpecCode;
    private String postComboName;
    private String contentTitle; // 소제목
    private String content; // 내용
    private String startDate;
    private String endDate;
    private Timestamp firstRegTime;
    private String firstRegUser;
    private Timestamp lastRegTime;
    private String lastRegUser;
}
