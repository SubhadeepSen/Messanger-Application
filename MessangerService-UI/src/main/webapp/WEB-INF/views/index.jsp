<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<style type="text/css">
table, tr, td, th {
	padding: 2px;
}
</style>
</head>
<body>
	<center>
		<h1>Custom API UI</h1>
		<br> <br>
		<table>
			<tr>
				<td><form action="getusers" method="POST">
						<input type="submit" value="GET USERS">
					</form></td>
				<td><form action="getposts" method="POST">
						<input type="submit" value="GET POSTS">
					</form></td>
				<td><form action="getcomments" method="POST">
						<input type="submit" value="GET COMMENTS">
					</form></td>
			<tr>
		</table>

		<!-- user details -->
		<c:if test="${users ne null and not empty users}">
			<table border="1px solid black">
				<tbody>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Username</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Website</th>
					</tr>
					<c:forEach items="${users}" var="user">
						<tr>
							<td><c:out value="${user.id}"></c:out></td>
							<td><c:out value="${user.name}"></c:out></td>
							<td><c:out value="${user.username}"></c:out></td>
							<td><c:out value="${user.email}"></c:out></td>
							<td><c:out value="${user.phone}"></c:out></td>
							<td><c:out value="${user.website}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		
		<!-- post details -->
		<c:if test="${posts ne null and not empty posts}">
			<table border="1px solid black">
				<tbody>
					<tr>
						<th>ID</th>
						<th>User ID</th>
						<th>Title</th>
						<th>Body</th>
					</tr>
					<c:forEach items="${posts}" var="post">
						<tr>
							<td><c:out value="${post.id}"></c:out></td>
							<td><c:out value="${post.userId}"></c:out></td>
							<td><c:out value="${post.title}"></c:out></td>
							<td><c:out value="${post.body}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		
		<!-- comment details -->
		<c:if test="${comments ne null and not empty comments}">
			<table border="1px solid black">
				<tbody>
					<tr>
						<th>ID</th>
						<th>Post ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Body</th>
					</tr>
					<c:forEach items="${comments}" var="comment">
						<tr>
							<td><c:out value="${comment.id}"></c:out></td>
							<td><c:out value="${comment.postId}"></c:out></td>
							<td><c:out value="${comment.name}"></c:out></td>
							<td><c:out value="${comment.email}"></c:out></td>
							<td><c:out value="${comment.body}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</center>
</body>
</html>