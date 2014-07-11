<g:hiddenField name="idPedido" value="${pedido ? pedido.id : ''}"/>
<g:if test="${pedido}">
	<g:set var="peliculas" value="${pedido.peliculas }"/>
	<g:if test="${peliculas}">
		<table class="table table-striped">
			<thead class="success">
				<h3>Pel&iacute;culas a llevar</h3>
			</thead>
			<tbody>
				<g:each in="${peliculas}" status="i" var="pelicula">
					<div class="span8">
						<g:render template="pelicula" model="['pelicula': pelicula, 'i': i]"></g:render>
					</div>
					<div class="span2">
						<a class="btn btn-info" href="javascript:eliminarPelicula(${pelicula.id});"> 
							<i class="icon-minus icon-white"></i>
						</a>
					</div>
				</g:each>
			</tbody>
		</table>
	</g:if>
</g:if>
