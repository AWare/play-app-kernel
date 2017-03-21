package controllers

import models.Sweet
import play.api.mvc.{Action, Controller}



class Application extends Controller {
  def helloWorld = Action {
    Ok(views.html.index())
  }

  def list = Action {
    val sweets = List(Sweet("mars", "yum"), Sweet("toblerone", "the triangular chocolate"),Sweet("rolo","one left"),Sweet("twirl","oblig."))
    sweets.map(_.name)
    sweets.map{sweet =>
      sweet.name
    }
    Ok(views.html.list(sweets))
  }

  def maybe = Action {
    Ok(views.html.html(None))
  }

  def m = Action {
    Ok(views.html.m(models.Cat))
  }

}
