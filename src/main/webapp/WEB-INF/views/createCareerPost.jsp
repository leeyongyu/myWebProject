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
<form action="/career/create" method="post" name="dto" modelAttribute="dto">
    <article id="mArticle">
        <div class="recruit_detail">
            <div class="col-6 col-12-xsmall">
                <input type="text" path="title" placeholder="제목을 입력해주세요."/>
            </div>
            <div class="col-6 col-12-xsmall">
                <input type="text" path="postComboName" placeholder="콤보네임을 입력해주세요."/>
            </div>
            <div class="cont_desc">
                <div class="desc_cont">
                    <div class="tit" style="position: absolute; width: 450px; border-top: 1.3px solid rgb(175, 175, 175); padding-top: 23px; text-align: center;">
                        <span style="font-size:16px;">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" path="contentTitle" placeholder="소제목을 입력해주세요."></input>
                            </div>
                        </span>
                    <div>
                    <div class="cont" style="padding-left: 165px;">
                        <div class="inner_cont cont_wanna" style="border-top: 1.3px solid rgb(175, 175, 175);padding-top: 23px;padding-bottom: 50px;">
                            <div style="list-style-type: none; margin: 0px; padding: 0px; max-width: 700px; word-break: break-all;">
                                <div style="text-align: left; line-height: 1.8;">
                                        <font face="arial">
                                            <div class="col-6 col-12-xsmall">
                                                <textarea type="text" path="content" style="font-size: 16px;" placeholder="소제목 내용을 입력해주세요."></textarea>
                                            </div>
                                            <div class="col-6 col-12-xsmall">
                                                <input type="text" path="startDate" placeholder="시작일을 입력해주세요."></input>
                                            </div>
                                            <div class="col-6 col-12-xsmall">
                                                <input type="text" path="endDate" placeholder="종료일을 입력해주세요."></input>
                                            </div>
                                        </font>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button class="button" type="submit">등록</button>
                </div>
            </div>
        </div>
    </article>
</form>
</body>