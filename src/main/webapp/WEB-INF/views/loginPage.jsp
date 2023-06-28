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
    Kakao.API.request({
      url: '/v2/user/me',
      data: {
        property_keys: ['profile_nickname', 'account_email', 'gender'],
      },
    })
      .then(function(response) {
        console.log(response);
      })
      .catch(function(error) {
        console.log(error);
      });
</script>
    <article id="mArticle" style="margin-left:250px; margin-top:300px;">
        <a>로그인 성공</a>
        <a id="kakao-login-btn" href="javascript:loginWithKakao()">
          <img src="https://k.kakaocdn.net/14/dn/btroDszwNrM/I6efHub1SN5KCJqLm1Ovx1/o.jpg" width="222px"
            alt="카카오 로그인 버튼" />
        </a>
    </article>
</body>