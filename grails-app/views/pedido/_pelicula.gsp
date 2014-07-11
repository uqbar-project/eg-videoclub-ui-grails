<g:if test="${pelicula}">
	<div class="span2" style="padding: 10px;">
		<g:set var="imageDir" value="${g.resource(dir: 'images')}"/>
		<img src="${imageDir}/pelis/${pelicula.titulo}.gif" onerror="imgError(this);" />
	</div>
	<div class="well well-small span10">
		<h4>
			${pelicula?.titulo}
		</h4>
		<span class="badge badge-info"> ${pelicula?.genero}
		</span> <strong> ${pelicula?.actores}
		</strong>
		<p>
			${pelicula?.sinopsis}
		</p>
	</div>
</g:if>
<g:else>
	<span class="badge badge-error">La película no existe</span>
</g:else>
