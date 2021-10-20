<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style>
    div.container { width: 600px; margin: 50px auto; }
    body { font-family: 굴림체; }
    table { width: 500px;  border-collapse: collapse; }
    table td:nth-child(1) { background-color: #eee; }
    td { padding: 5px; border: 1px solid lightgray; }   
  </style>
</head>
<body>

<div class="container">

<h1>학생</h1>

<table>
  <tr>
    <td>ID</td>
    <td>${ book.id }</td>
  </tr>
  <tr>
    <td>title</td>
    <td>${ book.title }</td>
  </tr>  <tr>
    <td>author</td>
    <td>${ book.author }</td>
  </tr>
  <tr>
    <td>categoryID</td>
    <td>${ book.categoryId }</td>
  </tr>
  <tr>
    <td>price</td>
    <td>${ book.price }</td>
  </tr>
  <tr>
    <td>categoryName</td>
    <td>${ book.categoryName }</td>
  </tr>
</table>
<a href="javascript:window.history.back()">돌아가기</a>
</div>
</body>
</html>
