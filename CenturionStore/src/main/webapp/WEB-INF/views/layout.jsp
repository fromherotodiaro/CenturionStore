<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<tiles:insertAttribute name="head" />

</head>
<body>

	<div class="container">
		<header class="row"></header>
		<h1 class="alert alert-success">Online Shopping Mall</h1>
		<nav class="row">
			<tiles:insertAttribute name="menu" />
		</nav>
		<div class="row">
			<article class="col-sm-9">
				<tiles:insertAttribute name="body" />
			</article>
			<aside class="col-sm-3">
				<tiles:insertAttribute name="aside" />
			</aside>

		</div>
		<footer class="row">
			<p class="text-center">&copy;2019.All right reserved.</p>
		</footer>
	</div>

</body>
</html>