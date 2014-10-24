package ar.edu.videoclub

import grails.converters.JSON
import ar.edu.videoclub.homes.HomePeliculas

class PeliculasController {

	def repoPeliculas = HomePeliculas.instance

	def getPeliculas(String tituloContiene) {
		render repoPeliculas.getPeliculas(tituloContiene, 10).collect { pelicula ->
			[titulo: pelicula.titulo,
				actores: pelicula.actores,
				genero: [
					id: 1,
					descripcion: pelicula.genero.descripcion
				]
			]
		} as JSON
	}
}
