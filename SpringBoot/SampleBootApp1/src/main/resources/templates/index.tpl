yieldUnescaped '<!DOCTYPE html>'

html(lang:'ja'){
	head {
		meta(charset:"UTF-8")
		title(title)
		link(rel:"stylesheet", type:"text/css",
			href:"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css")
		}
		body(class:"container"){
			h1(class:"display-4", title)
			p(msg)
			include template:"content.tpl"
			ul(class:"list-group"){
				data.each{
    				fragment "li(class:'list-group-item', i)", i:it
   				 }
			}
		}
}