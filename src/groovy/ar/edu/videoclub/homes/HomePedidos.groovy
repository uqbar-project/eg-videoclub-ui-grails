package ar.edu.videoclub.homes

import ar.edu.videoclub.domain.Pedido


class HomePedidos extends BaseHome {

	List<Pedido> pedidos
	static HomePedidos instance
	
	HomePedidos() {
		pedidos = []
	}
	
	static def getInstance() {
		if (!instance) {
			instance = new HomePedidos()
		}
		instance
	}

	def getPedido(Long id) {
		pedidos.find { pedido -> pedido.id == id }
	}

	def agregarPelicula(pedido, pelicula) {
		if (!pedidos.contains(pedido)) {
			pedido.id = getMaximoId(pedidos)
			pedidos.add(pedido)
		}
		pedido.agregarPelicula(pelicula)
	}

	def eliminarPelicula(pedido, pelicula) {
		pedido.eliminarPelicula(pelicula)
	}
	
}
