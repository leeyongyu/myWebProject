<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Title</title>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="resources/assets/css/main.css" />
</head>
<body class="is-preload">
    <div id="wrapper">
        <header id="header">
            <tiles:insertAttribute name="header"/>
        </header>
        <div id="main">
            <tiles:insertAttribute name="body"/>
        </div>
        <div class="footer">
            <tiles:insertAttribute name="footer"/>
        </div>
	</div>
</body>
</html>