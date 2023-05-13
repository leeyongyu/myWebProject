<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Title</title>
	<tiles:insertAttribute name="include"/>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div style="width:100%; height:100%;">
        <div class="header">
            <tiles:insertAttribute name="header"/>
        </div>
        <div class="menu">
            <tiles:insertAttribute name="side"/>
        </div>
        <div class="content">
            <tiles:insertAttribute name="body"/>
        </div>
        <div class="footer">
            <tiles:insertAttribute name="footer"/>
        </div>
	</div>
</body>
</html>