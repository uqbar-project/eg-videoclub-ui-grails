package ar.edu.videoclub.homes

import ar.edu.videoclub.domain.Pelicula

class HomePeliculas extends BaseHome {

	static int MAX_RESULTS = 5
	
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
		getPeliculas(titulo, MAX_RESULTS)
	}

	def getPeliculas(titulo, max) {
		peliculas.findAll { pelicula -> pelicula.titulo.toUpperCase().contains((titulo ?: '').toUpperCase()) }.take(max)
	}

	def getPelicula(Long id) {
		peliculas.find { pelicula -> pelicula.id == id }
	}

	def agregarPelicula(pelicula) {
		pelicula.id = getMaximoId(peliculas)
		peliculas.add(pelicula)
	}
}
