package ar.edu.videoclub

class Pelicula {

	String titulo
	Genero genero
	String sinopsis
	String actores
	byte[] tapa
	
    static constraints = {
		titulo maxSize: 255
		actores maxSize: 255, nullable: true
		tapa nullable:true, maxSize: 16384 /* 16K */
		sinopsis nullable: true
    }
	
	static mapping = {
		sinopsis type: 'text'
	}
	
	@Override
	String toString() {
		titulo
	}
	
}
