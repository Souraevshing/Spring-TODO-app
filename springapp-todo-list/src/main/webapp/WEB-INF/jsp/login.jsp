<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
  	<title>Login</title>
</head>

<body>
	<div class="container-fluid">
		<div class="alert alert-danger d-flex align-items-center" role="alert">
  		<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-exclamation-triangle-fill flex-shrink-0 me-2" viewBox="0 0 16 16" role="img" aria-label="Danger:">
    	<path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
  		</svg>
  	<div>
    	${error}
  	</div>
</div>
  	<form method="post">
  		<div class="row" >
  			<div class="col">
  				Name : <input class="form-control" placeholder="Enter Username" type="text" name="name" />
			</div>
			<div class="col">
				Password : <input class="form-control" type="password" placeholder="Enter Password" name="password" /> 
			</div>
			<input type="submit" class="btn btn-outline-secondary" />
  	</form>
  	</div>
  	
  	<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>

</html>