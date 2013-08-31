<!DOCTYPE html>
<html lang="es">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="layout" content="main" />
	<title>Blogbuster - Alquiler de pel&iacute;culas</title>
	<r:require modules="jquery, bootstrap, jquery-ui"/>
	<g:javascript src="videoclub.js" />
</head>
<body>
	<div class="body" style="width: 90%; padding: 15pt;">
	<h2>Alquiler de pel&iacute;culas</h2>
		<form method="post">
			<g:hiddenField name="pelicula.id"></g:hiddenField> 
			<g:textField name="peliculaAutoComplete" class="input-medium" placeholder="Escriba el título" style="width: 300px;"/>
			<div id="peliculaSeleccionada"></div>
		</form>
	</div>
</body>
</html>
