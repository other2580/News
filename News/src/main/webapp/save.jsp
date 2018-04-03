<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">
    <table>
       <caption>更新新闻内容</caption>
       <tr>
           <td>新闻编号：</td>
           <td><input type="text" name="id" value="${list.id}"/></td>
        </tr>
        <tr>
           <td>新闻分类：</td>
           <td>
                <select name="categoryid">
                <option value="${list.id}" checked="checked">
						<c:if test="${list.id==1}">军事</c:if>
						<c:if test="${list.id==2}">国际</c:if>
						<c:if test="${list.id==3}">国内</c:if>
					</option>
					<c:forEach var="c" items="${category}">
						<option value="${c.id}">${c.name}</option>
					</c:forEach>
				</select>
           
           </td>
        </tr>
        <tr>
           <td>新闻标题：</td>
           <td><input type="text" name="title" value="${list.title}"/></td>
        </tr>
        <tr>
           <td>新闻摘要</td>
           <td>
              <textarea rows="5" cols="22" name="sumary">${list.sumary}</textarea>
              
           </td>
        </tr>
        <tr>
           <td>作者</td>
           <td><input type="text" name="author" value="${list.author}"/></td>
        </tr>
        <tr>
           <td> </td>
           <td><input type="submit" value="提交"><input type="button" value="返回"></td>
           
        </tr>
    
    </table>
    </form>

</body>
</html>