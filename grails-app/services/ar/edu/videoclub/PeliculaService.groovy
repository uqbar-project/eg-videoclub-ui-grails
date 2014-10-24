package ar.edu.videoclub

import org.springframework.transaction.annotation.Transactional

class PeliculaService {
	
	static transactional = false

	static int MAX_RESULTS = 5
	
	@Transactional(readOnly=true)
	def getPeliculas(titulo) {
		getPeliculas(titulo, MAX_RESULTS)
	}
	
	@Transactional(readOnly=true)
	def getPeliculas(titulo, max) {
		Pelicula.createCriteria().list(max: max) {
			ilike("titulo" , "%" + titulo + "%")
		}
	}
	
	@Transactional(readOnly=true)
	def getPelicula(Long id) {
		Pelicula.get(id)
	}

}
