<!DOCTYPE html>
<g:javascript>
var app = {
	linkImagenes : "${g.resource(dir: 'images')}",
	linkPedido : "${createLink(controller: 'pedido', action:' ')}"
}
</g:javascript>
<html>
<head>
	<title>Alquiler de pel&iacute;culas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<asset:stylesheet href="application.css"/>
	<asset:javascript src="application.js"/>
	<g:layoutHead/>
</head>
<body>
	<div id="spinner" class="spinner" style="display: none;">
		<img src="${resource(dir:'images',file:'spinner.gif')}" alt="Loading..." />
	</div>
	<g:layoutBody />
</body>
</html>