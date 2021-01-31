// @GENERATOR:play-routes-compiler
// @SOURCE:D:/playframework/projects/starter/conf/routes
// @DATE:Sun Jan 31 12:13:07 ICT 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def forgot(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forgot")
    }
  
    // @LINE:18
    def charts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "charts")
    }
  
    // @LINE:19
    def tables(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tables")
    }
  
    // @LINE:8
    def cards(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cards")
    }
  
    // @LINE:11
    def animations(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "animations")
    }
  
    // @LINE:7
    def buttons(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "buttons")
    }
  
    // @LINE:14
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:12
    def others(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "others")
    }
  
    // @LINE:10
    def borders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borders")
    }
  
    // @LINE:9
    def colors(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "colors")
    }
  
    // @LINE:17
    def blank(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "blank")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:16
    def error(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "error")
    }
  
    // @LINE:13
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
