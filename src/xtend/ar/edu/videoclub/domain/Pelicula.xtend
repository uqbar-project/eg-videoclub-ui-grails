package ar.edu.videoclub.domain

class Pelicula {

	@Property Long id
	@Property String titulo
	@Property Genero genero
	@Property String sinopsis
	@Property String actores
	@Property byte[] tapa
	
	override String toString() {
		titulo
	}
	
}