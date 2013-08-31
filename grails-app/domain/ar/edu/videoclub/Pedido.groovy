package ar.edu.videoclub

class Pedido {

	List peliculas
	
    static constraints = {
    }
	
	static hasMany = [peliculas: Pelicula]
}
