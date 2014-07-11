package ar.edu.videoclub.domain

import java.util.ArrayList
import java.util.List

class Pedido {

	@Property Long id
	@Property List<Pelicula> peliculas
	
	new() {
		peliculas = new ArrayList<Pelicula>
	}
	
	def void agregarPelicula(Pelicula pelicula) {
		peliculas.add(pelicula)
	}
	
	def void eliminarPelicula(Pelicula pelicula) {
		peliculas.remove(pelicula)
	}
	
}