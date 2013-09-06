package ar.edu.videoclub

import org.springframework.transaction.annotation.Transactional;

class PedidoService {

	static transactional = false

	@Transactional(readOnly=true)
	def getPedido(Long id) {
		Pedido.get(id)
	}

	@Transactional
	def agregarPelicula(pedido, pelicula) {
		pedido.addToPeliculas(pelicula)
		pedido.save(failOnError: true, flush: true)
	}

	@Transactional
	def eliminarPelicula(pedido, pelicula) {
		pedido.removeFromPeliculas(pelicula)
		pedido.save(failOnError: true, flush: true)
	}
}
