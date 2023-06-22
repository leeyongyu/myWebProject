<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
</head>
<body>
<script type="text/javascript">
    function fnDelete(){
        var id =  "<c:out value="${postId}" />"
         $.ajax({
             type: "DELETE",
             url: "/career/"+ id,
             dataType: "json"
         }).done(function (resp) {
             location.href = "/career";
         }).fail(function (error) {
             location.href = "/career";
         });
    }
    function fnUpdate(){
        var id =  "<c:out value="${postId}" />"
         $.ajax({
             type: "GET",
             url: "/career/editForm/"+ id,
             dataType: "json"
         }).done(function (resp) {
            location.href = "/career/editForm/"+ id;
         }).fail(function (error) {
            location.href = "/career/editForm/"+ id;
         });
    }
</script>
    <article id="mArticle">
        <div class="recruit_detail">
            <h3 class="tit_intro">${postItem.title}</h3>
            <div class="info_desc" >
                <span>${postItem.postSpec.postComboName}</span>
            </div>
            <div class="item_card">2023년 6월 25일 일요일 (오후 11시 59분까지)</div>
            <button class="button" onclick="fnUpdate()">수정</button>
            <button class="button" onclick="fnDelete()">삭제</button>
            <div class="cont_desc">
                <div class="desc_cont">
                    <div class="tit" style="position: absolute; width: 150px; border-top: 1.3px solid rgb(175, 175, 175); padding-top: 23px; text-align: center;">
                        <span style="font-size:16px;">
                            <b>${postItem.postSpec.contentTitle}</b>
                        </span>
                    <div>
                    <div class="cont" style="padding-left: 165px;">
                        <div class="inner_cont cont_wanna" style="border-top: 1.3px solid rgb(175, 175, 175);padding-top: 23px;padding-bottom: 50px;">
                            <div style="list-style-type: none; margin: 0px; padding: 0px; max-width: 700px; word-break: break-all;">
                                <div style="text-align: left; line-height: 1.8;">
                                    <font face="arial">
                                        <span style="font-size: 16px;">
                                            ${postItem.postSpec.content}
                                        </span>
                                    </font>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </article>
</body>