<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style>
    div.container { width: 600px; margin: 50px auto; }
    input { padding: 5px; font-size: 10pt; }
    button { margin: 10px ; padding: 0.4em 2em; }
    thead th { background-color: #eee; }
    table{ border-collapse: collapse; width: 100%; }
    td, th { padding: 4px; border: 1px solid lightgray; }
    td:nth-child(4) { text-align: center; }
    tr[date-url]:hover { background-color: #ffb; cursor: pointer; }
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.">></script>
</head>
<body>
<div class="container">

  <h1>book list</h1>
  <form>
    <label>title</label>
    <input type="text" name="srchText" value="${ srchText }" placeholder="검색조건" />
    <button type="submit">조회</button>
  </form>
  
  <table class="table table-bordered table-condensed">
    <thead>
      <tr>
      	<th>id</th>
        <th>title</th>
        <th>author</th>
        <th>categoryId</th>
        <th>price</th>
        <th>categoryName</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="book" items="${ books }">
        <tr data-url="detail?id=${book.id }">
          <td>${ book.id }</td>
          <td><a href="detail?id=${ book.id }">${ book.title }</a></td>
          <td>${ book.author}</td>
          <td>${ book.categoryId }</td>
          <td>${ book.price }</td>
          <td>${ book.categoryName }</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
<script>
$("[data-url]").click(function() {
  var url = $(this).attr("data-url");
  location.href = url;
})
</script>

</body>
</html>
