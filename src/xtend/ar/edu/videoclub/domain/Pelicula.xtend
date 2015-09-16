package ar.edu.videoclub.domain

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Pelicula {

	Long id
	String titulo
	Genero genero
	String sinopsis
	String actores
	byte[] tapa
	
	override String toString() {
		titulo
	}
	
}