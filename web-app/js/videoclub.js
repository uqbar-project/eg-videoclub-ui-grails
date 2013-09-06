//http://jay-chandran.blogspot.com.ar/2011/09/using-grails-with-jquery-autocomplete.html
	
$(document).ready(function() {
 $("#peliculaAutoComplete").autocomplete({
  source: function(request, response){
   $.ajax({
    url: "pedido/getPeliculas", 
    data: request,
    success: function(data) {
    	response(data);
    },
    error: function() { 
    	console.log("error");
//     $.jGrowl("Unable to retrieve Companies", {
//      theme: 'ui-state-error ui-corner-all'   
//     });
    }
   });
  },
  minLength: 2, // triggered only after minimum 2 characters have been entered.
  select: function(event, ui) { // event handler when user selects a film from the list.
   $("#idPelicula").val(ui.item.id); // actualizamos la pelicula

   $.ajax({
	    url: "pedido/getPelicula", 
	    data: { id: ui.item.id },
	    update: "peliculaSeleccionada",
	    success: function(data) {
	    	document.getElementById("peliculaSeleccionada").innerHTML = data; // set the response
	    	$("#botonAgregar").removeClass("disabled");
	    },
	    error: function() { 
	    	alert("error");
	    }
	   });
   
  }
 });
});


function agregarPelicula() {
	cambiarPeliculas("pedido/agregarPelicula", document.getElementById("idPelicula").value);	
}

function eliminarPelicula(idPelicula) {
	cambiarPeliculas("pedido/eliminarPelicula", idPelicula);	
}

function cambiarPeliculas(accion, idPelicula) {
	var idPedido = "" 
	if (document.getElementById("idPedido") != null) {
		idPedido = document.getElementById("idPedido").value
	}
	$.ajax({
	    url: accion, 
	    data: { idPedido: idPedido,
	    	    idPelicula: idPelicula },
	    success: function(data) {
	    	document.getElementById("peliculaSeleccionada").innerHTML = "";
	    	document.getElementById("peliculasAlquiladas").innerHTML = data; 
	    	document.getElementById("idPelicula").value = "";
	    	$("#botonAgregar").addClass("disabled");
	    	document.getElementById("peliculaAutoComplete").value = "";
	    },
	    error: function() { // handle server errors
	    	console.log("error");
	    }
	   });
	
}

function imgError(image) {
    image.onerror = "";
    image.src = "images/pelis/notFound.jpg";
    return true;
}
