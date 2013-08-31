package ar.edu.videoclub

class Pelicula {

	String titulo
	Genero genero
	String sinopsis
	String actores
	
    static constraints = {
		titulo maxSize: 255
		actores maxSize: 255
    }
	
	static mapping = {
		sinopsis type: 'text'
	}
	
	@Override
	String toString() {
		titulo
	}
	
}
