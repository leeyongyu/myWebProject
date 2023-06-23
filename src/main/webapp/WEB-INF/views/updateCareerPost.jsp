<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <script async src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<script type="text/javascript">
    $(document).ready(function() {
            $('#title').val("<c:out value="${postItem.title}" />");
            $('#postComboName').val("<c:out value="${postItem.postSpec.postComboName}" />");
            $('#contentTitle').val("<c:out value="${postItem.postSpec.contentTitle}" />");
            $('#content').val("<c:out value="${postItem.postSpec.content}" />");
            $('#startDate').val("<c:out value="${postItem.postSpec.startDate}" />");
            $('#endDate').val("<c:out value="${postItem.postSpec.endDate}" />");
    });
    var id =  "<c:out value="${postItem.postId}" />"
    function fnUpdateSend(){
       var param = { "title" : $('#title').val()
                          , "postComboName": $('#postComboName').val()
                          , "contentTitle" : $('#contentTitle').val()
                          , "content" : $('#content').val()
                          , "startDate" : $('#startDate').val()
                          , "endDate" : $('#endDate').val()
                    }
        $.ajax({
                url: "/career/" + id,
                type: "PATCH",
                contentType: "application/json; charset=UTF-8",
                dataType: "json",
                data: JSON.stringify(param),
                success: function(data) {
                    window.location.href = "/career";
                },
                error: function() {
                    window.location.href = "/career";
                }
            });
    }
</script>
    <article id="mArticle">
        <div class="recruit_detail">
            <h3 class="tit_intro">경력사항 게시판 수정</h3>
            <div class="col-6 col-12-xsmall">
                <input type="text" id="title" value="" placeholder="제목을 입력해주세요."></input>
            </div>
            <div class="col-6 col-12-xsmall">
                <input type="text" id="postComboName" value="" placeholder="콤보네임을 입력해주세요."></input>
            </div>
            <div class="cont_desc">
                <div class="desc_cont">
                    <div class="tit" style="position: absolute; width: 450px; border-top: 1.3px solid rgb(175, 175, 175); padding-top: 23px; text-align: center;">
                        <span style="font-size:16px;">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" id="contentTitle" value="" placeholder="소제목을 입력해주세요."></input>
                            </div>
                        </span>
                    <div>
                    <div class="cont" style="padding-left: 165px;">
                        <div class="inner_cont cont_wanna" style="border-top: 1.3px solid rgb(175, 175, 175);padding-top: 23px;padding-bottom: 50px;">
                            <div style="list-style-type: none; margin: 0px; padding: 0px; max-width: 700px; word-break: break-all;">
                                <div style="text-align: left; line-height: 1.8;">
                                        <font face="arial">
                                            <div class="col-6 col-12-xsmall">
                                                <textarea type="text" id="content" style="font-size: 16px;" value="" placeholder="소제목 내용을 입력해주세요."></textarea>
                                            </div>
                                            <div class="col-6 col-12-xsmall">
                                                <input type="text" id="startDate" value="" placeholder="시작일을 입력해주세요."></input>
                                            </div>
                                            <div class="col-6 col-12-xsmall">
                                                <input type="text" id="endDate" value="" placeholder="종료일을 입력해주세요."></input>
                                            </div>
                                        </font>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button class="button" onclick="fnUpdateSend()">변경</button>
                </div>
            </div>
        </div>
    </article>
</body>