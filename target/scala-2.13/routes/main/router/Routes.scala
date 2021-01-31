// @GENERATOR:play-routes-compiler
// @SOURCE:D:/playframework/projects/starter/conf/routes
// @DATE:Sun Jan 31 12:13:07 ICT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buttons""", """controllers.HomeController.buttons"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cards""", """controllers.HomeController.cards"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """colors""", """controllers.HomeController.colors"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borders""", """controllers.HomeController.borders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """animations""", """controllers.HomeController.animations"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """others""", """controllers.HomeController.others"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgot""", """controllers.HomeController.forgot"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error""", """controllers.HomeController.error"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blank""", """controllers.HomeController.blank"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """charts""", """controllers.HomeController.charts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tables""", """controllers.HomeController.tables"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ List of controller showing a page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_buttons1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buttons")))
  )
  private[this] lazy val controllers_HomeController_buttons1_invoker = createInvoker(
    HomeController_1.buttons,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "buttons",
      Nil,
      "GET",
      this.prefix + """buttons""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_cards2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cards")))
  )
  private[this] lazy val controllers_HomeController_cards2_invoker = createInvoker(
    HomeController_1.cards,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cards",
      Nil,
      "GET",
      this.prefix + """cards""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_colors3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("colors")))
  )
  private[this] lazy val controllers_HomeController_colors3_invoker = createInvoker(
    HomeController_1.colors,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "colors",
      Nil,
      "GET",
      this.prefix + """colors""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_borders4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borders")))
  )
  private[this] lazy val controllers_HomeController_borders4_invoker = createInvoker(
    HomeController_1.borders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "borders",
      Nil,
      "GET",
      this.prefix + """borders""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_animations5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("animations")))
  )
  private[this] lazy val controllers_HomeController_animations5_invoker = createInvoker(
    HomeController_1.animations,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "animations",
      Nil,
      "GET",
      this.prefix + """animations""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_others6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("others")))
  )
  private[this] lazy val controllers_HomeController_others6_invoker = createInvoker(
    HomeController_1.others,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "others",
      Nil,
      "GET",
      this.prefix + """others""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_login7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login7_invoker = createInvoker(
    HomeController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_register8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register8_invoker = createInvoker(
    HomeController_1.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_forgot9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgot")))
  )
  private[this] lazy val controllers_HomeController_forgot9_invoker = createInvoker(
    HomeController_1.forgot,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "forgot",
      Nil,
      "GET",
      this.prefix + """forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_error10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error")))
  )
  private[this] lazy val controllers_HomeController_error10_invoker = createInvoker(
    HomeController_1.error,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "error",
      Nil,
      "GET",
      this.prefix + """error""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_blank11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blank")))
  )
  private[this] lazy val controllers_HomeController_blank11_invoker = createInvoker(
    HomeController_1.blank,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "blank",
      Nil,
      "GET",
      this.prefix + """blank""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_charts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts")))
  )
  private[this] lazy val controllers_HomeController_charts12_invoker = createInvoker(
    HomeController_1.charts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "charts",
      Nil,
      "GET",
      this.prefix + """charts""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_tables13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tables")))
  )
  private[this] lazy val controllers_HomeController_tables13_invoker = createInvoker(
    HomeController_1.tables,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tables",
      Nil,
      "GET",
      this.prefix + """tables""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_buttons1_route(params@_) =>
      call { 
        controllers_HomeController_buttons1_invoker.call(HomeController_1.buttons)
      }
  
    // @LINE:8
    case controllers_HomeController_cards2_route(params@_) =>
      call { 
        controllers_HomeController_cards2_invoker.call(HomeController_1.cards)
      }
  
    // @LINE:9
    case controllers_HomeController_colors3_route(params@_) =>
      call { 
        controllers_HomeController_colors3_invoker.call(HomeController_1.colors)
      }
  
    // @LINE:10
    case controllers_HomeController_borders4_route(params@_) =>
      call { 
        controllers_HomeController_borders4_invoker.call(HomeController_1.borders)
      }
  
    // @LINE:11
    case controllers_HomeController_animations5_route(params@_) =>
      call { 
        controllers_HomeController_animations5_invoker.call(HomeController_1.animations)
      }
  
    // @LINE:12
    case controllers_HomeController_others6_route(params@_) =>
      call { 
        controllers_HomeController_others6_invoker.call(HomeController_1.others)
      }
  
    // @LINE:13
    case controllers_HomeController_login7_route(params@_) =>
      call { 
        controllers_HomeController_login7_invoker.call(HomeController_1.login)
      }
  
    // @LINE:14
    case controllers_HomeController_register8_route(params@_) =>
      call { 
        controllers_HomeController_register8_invoker.call(HomeController_1.register)
      }
  
    // @LINE:15
    case controllers_HomeController_forgot9_route(params@_) =>
      call { 
        controllers_HomeController_forgot9_invoker.call(HomeController_1.forgot)
      }
  
    // @LINE:16
    case controllers_HomeController_error10_route(params@_) =>
      call { 
        controllers_HomeController_error10_invoker.call(HomeController_1.error)
      }
  
    // @LINE:17
    case controllers_HomeController_blank11_route(params@_) =>
      call { 
        controllers_HomeController_blank11_invoker.call(HomeController_1.blank)
      }
  
    // @LINE:18
    case controllers_HomeController_charts12_route(params@_) =>
      call { 
        controllers_HomeController_charts12_invoker.call(HomeController_1.charts)
      }
  
    // @LINE:19
    case controllers_HomeController_tables13_route(params@_) =>
      call { 
        controllers_HomeController_tables13_invoker.call(HomeController_1.tables)
      }
  
    // @LINE:22
    case controllers_Assets_versioned14_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned14_invoker.call(Assets_0.versioned(file))
      }
  }
}
