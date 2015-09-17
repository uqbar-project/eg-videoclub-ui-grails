package ar.edu.videoclub

import grails.converters.JSON
import ar.edu.videoclub.domain.Pedido
import ar.edu.videoclub.homes.HomePedidos
import ar.edu.videoclub.homes.HomePeliculas

class PedidoController {
	
	def repoPeliculas = HomePeliculas.instance
	def repoPedidos = HomePedidos.instance
	
    def index() { 
		[]
	}
	
	def getPeliculas(params) {
		//throw new RuntimeException("No quiero")
		def result = repoPeliculas.getPeliculas(params.term).collect {
			pelicula -> ["label" : pelicula.titulo, "value": pelicula.titulo, "id": pelicula.id ]
		} as JSON
		render result
	}
	
	def getPelicula(params) {
		//throw new RuntimeException("Ufa")
		def pelicula = repoPeliculas.getPelicula(params.id as Long)
		render (template: "pelicula", model: [pelicula: pelicula, permiteAgregarPelicula: true])
	}
	
	def agregarPelicula(params) {
		//throw new RuntimeException("Y si tira error?")
		def pelicula = repoPeliculas.getPelicula(params.idPelicula as Long)
		def pedido = getPedidoActual(params)
		repoPedidos.agregarPelicula(pedido, pelicula)
		render (template: "peliculas", model: [pedido: pedido])
	}
	
	def eliminarPelicula(params) {
		//throw new RuntimeException("Y si tira error?")
		def pelicula = repoPeliculas.getPelicula(params.idPelicula as Long)
		def pedido = getPedidoActual(params)
		repoPedidos.eliminarPelicula(pedido, pelicula)
		render (template: "peliculas", model: [pedido: pedido])
	}
	
	def getPedidoActual(params) {
		def idPedido = params.idPedido
		if (!idPedido) {
			new Pedido()
		} else {
			repoPedidos.getPedido(idPedido as Long)
		}
	}
}
