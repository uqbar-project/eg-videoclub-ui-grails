<!DOCTYPE html>
<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>Blogbuster - Alquiler de pel&iacute;culas</title>
<g:javascript src="videoclub.js" />
</head>
<body>
	<div class="body" style="width: 90%; padding: 15pt;">
		<h2>Alquiler de pel&iacute;culas</h2>
		<form method="post">
			<div class="row-fluid">
				<div class="span4">
					<g:textField name="peliculaAutoComplete"
						class="input-medium span12" placeholder="Escriba el título" />
				</div>
				<div class="span2">
					<a class="btn btn-info disabled" href="javascript:agregarPelicula();" id="botonAgregar"> <i
						class="icon-plus icon-white"></i>
					</a>
				</div>
			</div>
			<g:hiddenField name="idPelicula"></g:hiddenField>
			<div class="row-fluid">
				<div class="span8" id="peliculaSeleccionada">
				</div>
			</div>
			<div class="row-fluid" id="peliculasAlquiladas">
			</div>
		</form>
	</div>
</body>
</html>
