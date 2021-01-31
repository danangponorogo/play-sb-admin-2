// @GENERATOR:play-routes-compiler
// @SOURCE:D:/playframework/projects/starter/conf/routes
// @DATE:Sun Jan 31 12:13:07 ICT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def forgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.forgot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgot"})
        }
      """
    )
  
    // @LINE:18
    def charts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.charts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts"})
        }
      """
    )
  
    // @LINE:19
    def tables: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tables",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tables"})
        }
      """
    )
  
    // @LINE:8
    def cards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cards"})
        }
      """
    )
  
    // @LINE:11
    def animations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.animations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "animations"})
        }
      """
    )
  
    // @LINE:7
    def buttons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.buttons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buttons"})
        }
      """
    )
  
    // @LINE:14
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:12
    def others: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.others",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "others"})
        }
      """
    )
  
    // @LINE:10
    def borders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.borders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borders"})
        }
      """
    )
  
    // @LINE:9
    def colors: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.colors",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "colors"})
        }
      """
    )
  
    // @LINE:17
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blank"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:16
    def error: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.error",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error"})
        }
      """
    )
  
    // @LINE:13
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }


}
