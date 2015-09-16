package ar.edu.videoclub.domain

import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Pedido {

	Long id
	List<Pelicula> peliculas
	
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