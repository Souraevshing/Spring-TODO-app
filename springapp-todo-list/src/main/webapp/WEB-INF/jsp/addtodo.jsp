<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
  	<title>Add Todo</title>
</head>
<body>

	<div class="container">
	<h5>Add Todo</h5>
  	<form method="post" >
  		
  		<fieldset class="form-group">
  			<form name="desc">Description</form>
  			<input name="desc" type="text" class="form-control" required="required"/>
  		</fieldset>
  		<br/>
  		<div>
  			<button type="button" class="btn btn-outline-success">Add Todo</button>
  		</div>
  	</form>
  	</div>
  	
  	<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>