package controllers

import play.api._
import play.api.mvc._

//Selam olsun defterdar.
//Bu uygulamanın ufkumu genişlemtesi,
//bir çocuk edasıyla büyümesi, gelişmesi,
//en az hayalimdeki kadar güzelleşmesi,
//ve bu kodu her açtığımda ilk günkü heveste olmam dileğiyle.
//Haydi bismillah...

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Sa everyone."))
  }
  
}