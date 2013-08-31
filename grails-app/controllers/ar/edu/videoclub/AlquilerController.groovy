package ar.edu.videoclub

import grails.converters.JSON

import org.springframework.transaction.annotation.Transactional

class AlquilerController {

	def peliculaService
	
    def index() { 
		[]
	}
	
	def getPeliculas(params) {
		log.warn "Busco pelis. Titulo: " + params.term
		def result = peliculaService.getPeliculas(params.term).collect {
			pelicula -> ["label" : pelicula.titulo, "value": pelicula.titulo, "id": pelicula.id ]
		} as JSON
		log.warn "getPeliculas | json: " + result
		render result
	}
	
	def getPelicula(params) {
		log.warn "Busco pelicula id: " + params.id
		def pelicula = peliculaService.getPelicula(params.id as Long)
		render (template: "pelicula", model: [pelicula: pelicula])
	}
}
