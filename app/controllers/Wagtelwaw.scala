package controllers

import play.api._
import play.api.mvc._

object Wagtelwaw extends Controller {
  
  def index = Action {
    Ok(views.html.index("Who are going to eat lunch where and when?"))
  }
  
}
