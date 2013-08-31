<div class="well well-small">
	<g:if test="${pelicula}">
		<h4>${pelicula?.titulo}</h4>
		<span class="badge badge-info">${pelicula?.genero}</span>
		<strong>${pelicula?.actores}</strong>
		<p>${pelicula?.sinopsis}</p>
	</g:if>
	<g:else>
		<span class="badge badge-error">La película no existe</span>
	</g:else>
</div>
