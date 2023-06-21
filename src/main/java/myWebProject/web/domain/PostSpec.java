package myWebProject.web.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "POST_SPEC")
@AllArgsConstructor
public class PostSpec {
    @Id
    @GeneratedValue
    @Column(name = "postSpecId")
    private Long id;

    @OneToOne(mappedBy = "postSpec", fetch = FetchType.LAZY)
    private Post post;

    private String postSpecCode;
    private String postComboName; // 콤보네임
    private String contentTitle; // 소제목
    private String content; // 내용
    private String startDate; // 시작일
    private String endDate; // 종료일

    public PostSpec(){

    }
    public PostSpec(String content, String contentTitle, String postComboName, String postSpecCode, String startDate, String endDate){
        this.content = content;
        this.contentTitle = contentTitle;
        this.postComboName = postComboName;
        this.postSpecCode = postSpecCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
