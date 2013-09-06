package ar.edu.videoclub

import org.springframework.transaction.annotation.Transactional

class PeliculaService {
	static transactional = false
	
	@Transactional(readOnly=true)
	def getPeliculas(titulo) {
		Pelicula.createCriteria().list(max: 5) {
			ilike("titulo" , "%" + titulo + "%")
		}
	}
	
	@Transactional(readOnly=true)
	def getPelicula(Long id) {
		Pelicula.get(id)
	}

}
