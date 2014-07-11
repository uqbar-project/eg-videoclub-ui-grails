package ar.edu.videoclub.homes

class BaseHome {

	Long getMaximoId(lista) {
		def maximo = lista.max { it.id }
		if (maximo) {
			return maximo.id + 1 as Long
		} else {
			return 1 as Long
		}
	}
	
}
