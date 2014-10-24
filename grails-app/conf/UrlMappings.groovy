class UrlMappings {

	static mappings = {
		"/peliculas/$tituloContiene"(controller:"peliculas", action: "getPeliculas")
		
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
