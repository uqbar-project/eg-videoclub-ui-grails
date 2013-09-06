package ar.edu.videoclub

import grails.converters.JSON

class PedidoController {
	
	def peliculaService
	def pedidoService
	
    def index() { 
		[]
	}
	
	def getPeliculas(params) {
		def result = peliculaService.getPeliculas(params.term).collect {
			pelicula -> ["label" : pelicula.titulo, "value": pelicula.titulo, "id": pelicula.id ]
		} as JSON
		render result
	}
	
	def getPelicula(params) {
		def pelicula = peliculaService.getPelicula(params.id as Long)
		render (template: "pelicula", model: [pelicula: pelicula])
	}
	
	def agregarPelicula(params) {
		def pelicula = peliculaService.getPelicula(params.idPelicula as Long)
		def pedido = getPedidoActual(params)
		pedidoService.agregarPelicula(pedido, pelicula)
		render (template: "peliculas", model: [pedido: pedido])
	}
	
	def eliminarPelicula(params) {
		def pelicula = peliculaService.getPelicula(params.idPelicula as Long)
		def pedido = getPedidoActual(params)
		pedidoService.eliminarPelicula(pedido, pelicula)
		render (template: "peliculas", model: [pedido: pedido])
	}
	
	def getPedidoActual(params) {
		def idPedido = params.idPedido
		if (!idPedido) {
			new Pedido()
		} else {
			pedidoService.getPedido(idPedido as Long)
		}
	}
}
