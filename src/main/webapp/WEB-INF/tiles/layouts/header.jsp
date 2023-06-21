<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />

</head>
<body>
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
