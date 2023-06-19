package myWebProject.web.domain;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class PostEdit {
    @NotBlank(message = "제목은 필수 입력 사항입니다.")
    private String title;
    @NotBlank(message = "내용은 필수 입력 사항입니다.")
    private String content;
}
