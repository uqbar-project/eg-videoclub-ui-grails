//http://jay-chandran.blogspot.com.ar/2011/09/using-grails-with-jquery-autocomplete.html
	
$(document).ready(function() {
 $("#peliculaAutoComplete").autocomplete({
  source: function(request, response){
   $.ajax({
    url: "alquiler/getPeliculas", // remote datasource
    data: request,
    success: function(data) {
    	response(data); // set the response
    },
    error: function() { // handle server errors
    	console.log("error");
//     $.jGrowl("Unable to retrieve Companies", {
//      theme: 'ui-state-error ui-corner-all'   
//     });
    }
   });
  },
  minLength: 2, // triggered only after minimum 2 characters have been entered.
  select: function(event, ui) { // event handler when user selects a company from the list.
   $("#pelicula\\.id").val(ui.item.id); // actualizamos la pelicula

   $.ajax({
	    url: "alquiler/getPelicula", // remote datasource
	    data: { id: ui.item.id },
	    update: "peliculaSeleccionada",
	    success: function(data) {
	    	document.getElementById("peliculaSeleccionada").innerHTML = data; // set the response
	    },
	    error: function() { // handle server errors
	    	alert("error");
	    }
	   });
   
  }
 });
});