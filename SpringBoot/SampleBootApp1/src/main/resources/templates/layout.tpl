yieldUnescaped '<!DOCTYPE>'

html {
	head {
		meta(charset:"UTF-8")
		title(title)
		link(rel:"stylesheet", type:"text/css",
			href:"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css")
		}
        body{
            h1(class:"display-4", title)
            bodyContents()
            footer(class:"fixed-bottom p-2"){
                hr(class:"m-1")
                p(class:"text-center m-0 p-0", "copyright by SYODA-Tuyano 2023.")
            }
        }
}