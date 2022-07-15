<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
  	<title>Todos App</title>
</head>
<body>
	<div class="container">
  	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    	<div class="container-fluid">
      	<a class="navbar-brand" href="https://sauraevshing-portfolio.netlify.app"><h3>TO-DO LIST APP</h3></a>
      		<div class="navbar-nav">
      		<li class="nav-item">
      			<a href="/login" class="nav-link active" aria-current="page">Login</a>
      		</li>
      		<li class="nav-item">
      			<a href="/todos" class="nav-link active" aria-current="page">Todos</a>
      		</li>
      		</div>
    </div>
  	</nav>
	</div>
	<div class="container">
	<br />
  	<h5>Todos List</h5>
  	<table class="table table-striped">
  		<thead>
  			<tr>
  				<th>Description</th>
  				<th>Date</th>
  				<th>Completed</th>
  				<th></th>
  				<th></th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach items="${todo}" var="todo">
  			<tr>
  				<td>${todo.description}</td>
  				<td>${todo.date}</td>
  				<td>${todo.isFilled}</td>
  				<td><a href="/todo/update?id=${todo.id}" type="button" class="btn btn-outline-warning">Update</a></td>
  				<td><a href="/todo/delete?id=${todo.id}" type="button" class="btn btn-outline-danger">Delete</a></td>
  			</tr>
  			</c:forEach>
  		</tbody>
  	</table>
  	<div>
  		<a type="button" class="btn btn-outline-primary" href="/addtodo">Add Todo</a>
  	</div>
	</div>  	
  	<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>