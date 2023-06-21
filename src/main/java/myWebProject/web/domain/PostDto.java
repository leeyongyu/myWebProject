package myWebProject.web.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@Builder
public class PostDto {

    //@NotBlank(message = "제목은 필수 입력 사항입니다.")
    private String title;
    //@NotBlank(message = "소제목은 필수 입력 사항입니다.")
    private String contentTitle; // 소제목
    //@NotBlank(message = "소제목 내용은 필수 입력 사항입니다.")
    private String content;
    //@NotBlank(message = "조회 콤보명은 필수 입력 사항입니다.")
    private String postComboName; // 콤보명
    //@NotBlank(message = "시작일은 필수 입력 사항입니다.")
    private String startDate; // 시작일
    //@NotBlank(message = "종료일은 필수 입력 사항입니다.")
    private String endDate; // 종료일
}
