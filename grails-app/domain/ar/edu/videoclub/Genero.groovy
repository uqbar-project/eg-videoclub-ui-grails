package ar.edu.videoclub

class Genero {

	String descripcion
	
    static constraints = {
		descripcion(maxSize: 100)
    }
	
	@Override
	String toString() {
		descripcion
	}
}
