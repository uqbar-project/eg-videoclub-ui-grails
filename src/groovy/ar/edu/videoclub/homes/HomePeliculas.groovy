package ar.edu.videoclub.homes

import ar.edu.videoclub.domain.Pelicula

class HomePeliculas extends BaseHome {

	List<Pelicula> peliculas
	static HomePeliculas instance
	
	HomePeliculas() {
		peliculas = []
	}
	
	static def getInstance() {
		if (!instance) {
			instance = new HomePeliculas()
		}
		instance
	} 
	
	def getPeliculas(titulo) {
		peliculas.findAll { pelicula -> pelicula.titulo.toUpperCase().contains(titulo.toUpperCase()) }.take(5)
	}
	
	def getPelicula(Long id) {
		peliculas.find { pelicula -> pelicula.id == id }
	}

	def agregarPelicula(pelicula) {
		pelicula.id = getMaximoId(peliculas)
		peliculas.add(pelicula)
	}
}
