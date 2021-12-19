<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lilliput Link</title>
		<link href="../css/home.css" rel="stylesheet" type="text/css"></link>
		<script src="../js/home.js" type="text/javascript"></script>
	</head>
	<body>
		<div>
			<div id="titleDiv">
				<h1 align="center"><b>Lilliput Link</b></h1>
			</div>
			<div id="formDiv">
				<form action="/get" method="post">
					<table>
						<tr>
							<td><input type="text" name="longURL" maxlength="200" size="200" value="${longURL}" placeholder="Original link here.."/></td>
							<td><input type="submit" value="Create Short URL"/></td>
							<td><input type="text" value="${shortURL}" size="50" id="shortURL" placeholder="Shortened link here.."/></td>
							<td><input type="button" value="Copy" id="copy"/></td>
						</tr>
					</table>
				</form>
			</div>
			<div id="descriptionDiv">
				<p>
					<b>
					This project is built using Spring Boot on Java with
					Microservices style architecture. One of the microservice is to
					shorten the given link and the other is to redirect the shortened
					link to original link and both of them are connected with a eureka
					server.
					The core logic for shortening the link is by calculating
					the hash code of the given long link using Murmur hashing
					algorithm from google's guava library. To avoid the chance of collision when same link is
					hashed again, it is concatenated with time of the request before
					hashing.
					Hashcode is persisted into database against the given long link.
					PostgreSQL is used for storing the mappings.
					The UI is an another web application built using Spring Boot on Java and JSP.
					All the services are deployed on Heroku for fun :)
					</b>
				</p>
			</div>
		</div>
	</body>
</html>