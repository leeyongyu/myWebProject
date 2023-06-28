<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Title</title>
    <meta charset="utf-8" />
    <script async src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://t1.kakaocdn.net/kakao_js_sdk/2.2.0/kakao.min.js"
      integrity="sha384-x+WG2i7pOR+oWb6O5GV5f1KN2Ko6N7PTGPS7UlasYWNxZMKQA63Cj/B2lbUmUfuC" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="/resources/assets/css/main.css" />
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body class="is-preload">
    <div id="wrapper">
        <header id="header">
            <tiles:insertAttribute name="header"/>
        </header>
        <div id="main">
            <section class ="paddingB110">
                <tiles:insertAttribute name="body"/>
            </section>
        </div>
	</div>
    <footer>
        <tiles:insertAttribute name="footer"/>
    </footer>
</body>
</html>