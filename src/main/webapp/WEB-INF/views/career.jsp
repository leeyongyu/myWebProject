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
    <article id="mArticle">
        <div class="recruit_intro">
            <h3 class="tit_intro">경력사항</h3>
            <div>
                <form action="/career/createForm" method="get">
                    <button type="submit">등록</button>
                </form>
            </div>
            <div class="main_search">
                <h3 class="screen_out">직무 검색</h3>
                <div class="search_box">
                    <div class="box_form">
                        <form id="searchFaqForm" role="search">
                            <field-set>
                                <legend class="screen_out">직무검색</legend>
                                <input class = "tf_search ui-autocomplete-input" id="jobKeyword" name="keyword" placeholder="직무검색" title="검색어 입력" type="text" value>
                                <button class="btn_search" type="submit">
                                    <span class="ico_search"></span>
                                </button>
                            </field-set>
                        </form>
                    </div>
                </div>
                <div class="search_box">
                    <div class="box_form sel_form">
                        <select class="sel_search">
                            <option value="">전체</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="recruit_list">
                <div class="wrap_tbl">
                    <ul class="list_board">
                        <li>
                            <a class="link_tit" href="/career/3">
                                <div class="recruit_desc">
                                    <strong class="tit_board">
                                        IBK기업은행 복지비시스템 고도화 프로젝트
                                        <span class="tit_date">2022.12.05~2023.07.05</span>
                                    </strong>
                                    <span class="txt_desc">채널계</span>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a class="link_tit" href="/career/2">
                                <div class="recruit_desc">
                                    <strong class="tit_board">
                                        IBK기업은행 운영리스크 시스템 고도화 프로젝트
                                        <span class="tit_date">2022.05.09~2023.09.31</span>
                                    </strong>
                                    <span class="txt_desc">정보계</span>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a class="link_tit" href="/career/2">
                                <div class="recruit_desc">
                                    <strong class="tit_board">
                                        한국수출입은행 대고객 디지털 플랫폼 구축 프로젝트
                                        <span class="tit_date">2021.09.06~2022.05.06</span>
                                    </strong>
                                    <span class="txt_desc">계정계</span>
                                </div>
                            </a>
                        </li>
                        <c:forEach var="list" items="${postItems}">
                        <li>
                            <a class="link_tit" href="/career/${list.postId}">
                                <div class="recruit_desc">
                                    <strong class="tit_board">
                                        ${list.title}
                                        <span class="tit_date">${list.postSpec.startDate}~${list.postSpec.endDate}</span>
                                    </strong>
                                    <span class="txt_desc">${list.postSpec.postComboName}</span>
                                </div>
                            </a>
                        </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </article>
</body>