<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />

</head>
<body>
<p id="token-result"></p>
<script type="text/javascript">
Kakao.init("66c6a4e2c85a946a49fab573abb08514");
function kakaoLoginOnclick(){
    Kakao.Auth.authorize({
        redirectUri: 'http://localhost:8080/loginPage',
        scope:'profile_nickname, account_email, gender',
    })
    displayToken();
}
function displayToken() {
    var token = getCookie('authorize-access-token');
    console.log(token);
    if(token) {
      console.log(token);
      Kakao.Auth.setAccessToken(token);
      Kakao.Auth.getStatusInfo()
        .then(function(res) {
          if (res.status === 'connected') {
            document.getElementById('token-result').innerText
              = 'login success, token: ' + Kakao.Auth.getAccessToken();
          }
        })
        .catch(function(err) {
          Kakao.Auth.setAccessToken(null);
        });
    }
}

function getCookie(name) {
var parts = document.cookie.split(name + '=');
if (parts.length === 2) { return parts[1].split(';')[0]; }
}
</script>
    <h1><a href="/">LEE YONG GYU</a></h1>
    <nav class="links">
      <ul>
        <li><a href="/career">경력사항</a></li>
        <li><a href="https://github.com/leeyongyu">GitHub</a></li>
        <li><a href="https://achievegoal.tistory.com">TISTORY</a></li>
      </ul>
    </nav>
    <nav class="main">
      <ul>
        <li class="search">
          <a class="btn_login" href="javascript:kakaoLoginOnclick()"/>
          <a class="fa-search" href="#search">Search</a>
          <form id="search" method="get" action="#">
            <input type="text" name="query" placeholder="Search" />
          </form>
        </li>
        <li class="menu">
          <a class="fa-bars" href="#menu">Menu</a>
        </li>
      </ul>
    </nav>
</body>
